package mod.sparkyfox.servermod.entity;

import java.util.List;
import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityProjectile extends EntityThrowable
{
   private static final DataParameter<Boolean> Gravity = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> Arrow = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> Is3d = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> Glows = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> Rotating = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> Sticks = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.BOOLEAN);
  
   private static final DataParameter<ItemStack> ItemStackThrown = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.OPTIONAL_ITEM_STACK);
   private static final DataParameter<Integer> Velocity = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> Size = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.VARINT);
   private static final DataParameter<Integer> Particle = EntityDataManager.createKey(EntityProjectile.class, DataSerializers.VARINT);
  
   private BlockPos tilePos = BlockPos.ORIGIN;
   private Block inTile;
   protected boolean inGround = false;
   private int inData = 0;
   public int throwableShake = 0;
   public int arrowShake = 0;
   public boolean canBePickedUp = false;
   public boolean destroyedOnEntityHit = true;
   private EntityLivingBase thrower;
   private String throwerName = null;
   private int ticksInGround;
   public int ticksInAir = 0;
   private double accelerationX;
   private double accelerationY;
   private double accelerationZ;
   public float damage = 5.0F;
   public int punch = 0;
   public boolean accelerate = false;
   public boolean explosiveDamage = true;
   public int explosiveRadius = 0;
   public int duration = 5;
   public int amplify = 0;
   public IProjectileCallback callback;
   public EntityProjectile(World par1World)
  {
     super(par1World);
     setSize(0.25F, 0.25F);
  }
  
  protected void entityInit()
  {
     this.dataManager.register(ItemStackThrown, ItemStack.EMPTY);
     this.dataManager.register(Velocity, Integer.valueOf(10));
     this.dataManager.register(Size, Integer.valueOf(10));
     this.dataManager.register(Particle, Integer.valueOf(0));
    
     this.dataManager.register(Gravity, Boolean.valueOf(false));
     this.dataManager.register(Glows, Boolean.valueOf(false));
     this.dataManager.register(Arrow, Boolean.valueOf(false));
     this.dataManager.register(Is3d, Boolean.valueOf(false));
     this.dataManager.register(Rotating, Boolean.valueOf(false));
     this.dataManager.register(Sticks, Boolean.valueOf(false));
  }
  





  @SideOnly(Side.CLIENT)
  public boolean isInRangeToRenderDist(double par1)
  {
     double d1 = getEntityBoundingBox().getAverageEdgeLength() * 4.0D;
     d1 *= 64.0D;
     return par1 < d1 * d1;
  }
  
   
   
   public EntityProjectile(World par1World, EntityLivingBase par2EntityLiving, ItemStack item) {
     super(par1World);
     this.thrower = par2EntityLiving;
     if (this.thrower != null)
       this.throwerName = this.thrower.getUniqueID().toString();
     setThrownItem(item);
     this.dataManager.set(Arrow, Boolean.valueOf(getItem() == Items.ARROW));
     setSize(getSize() / 16.0F, getSize() / 16.0F);
     setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY + par2EntityLiving.getEyeHeight(), par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
     Vec3d dir = par2EntityLiving.getLook(0.0F);
     this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.1F;
     this.posY -= 0.10000000149011612D;
     this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.1F;
     setPosition(this.posX, this.posY, this.posZ);
   }
  
  public void setThrownItem(ItemStack item) {
     this.dataManager.set(ItemStackThrown, item);
  }
  
  public int getSize() {
     return ((Integer)this.dataManager.get(Size)).intValue();
  }
  




  public void setThrowableHeading(double par1, double par3, double par5, float par7, float par8)
  {
     float f2 = MathHelper.sqrt(par1 * par1 + par3 * par3 + par5 * par5);
     float f3 = MathHelper.sqrt(par1 * par1 + par5 * par5);
     float yaw = (float)(Math.atan2(par1, par5) * 180.0D / 3.141592653589793D);
     float pitch = hasGravity() ? par7 : (float)(Math.atan2(par3, f3) * 180.0D / 3.141592653589793D);
     this.prevRotationYaw = (this.rotationYaw = yaw);
     this.prevRotationPitch = (this.rotationPitch = pitch);
     this.motionX = (MathHelper.sin(yaw / 180.0F * 3.1415927F) * MathHelper.cos(pitch / 180.0F * 3.1415927F));
     this.motionZ = (MathHelper.cos(yaw / 180.0F * 3.1415927F) * MathHelper.cos(pitch / 180.0F * 3.1415927F));
     this.motionY = MathHelper.sin((pitch + 1.0F) / 180.0F * 3.1415927F);
     this.motionX += this.rand.nextGaussian() * 0.007499999832361937D * par8;
     this.motionZ += this.rand.nextGaussian() * 0.007499999832361937D * par8;
     this.motionY += this.rand.nextGaussian() * 0.007499999832361937D * par8;
     this.motionX *= getSpeed();
     this.motionZ *= getSpeed();
     this.motionY *= getSpeed();
     this.accelerationX = (par1 / f2 * 0.1D);
     this.accelerationY = (par3 / f2 * 0.1D);
     this.accelerationZ = (par5 / f2 * 0.1D);
     this.ticksInGround = 0;
  }
  



  public float getAngleForXYZ(double varX, double varY, double varZ, double horiDist, boolean arc)
  {
     float g = getGravityVelocity();
     float var1 = getSpeed() * getSpeed();
     double var2 = g * horiDist;
     double var3 = g * horiDist * horiDist + 2.0D * varY * var1;
     double var4 = var1 * var1 - g * var3;
     if (var4 < 0.0D) return 30.0F;
     float var6 = arc ? var1 + MathHelper.sqrt(var4) : var1 - MathHelper.sqrt(var4);
     float var7 = (float)(Math.atan2(var6, var2) * 180.0D / 3.141592653589793D);
     return var7;
  }
  
  public void shoot(float speed) {
     double varX = -MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F);
     double varZ = MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F);
     double varY = -MathHelper.sin(this.rotationPitch / 180.0F * 3.1415927F);
     setThrowableHeading(varX, varY, varZ, -this.rotationPitch, speed);
     
  }
  
  @SideOnly(Side.CLIENT)
  public void setPositionAndRotationDirect(double par1, double par3, double par5, float par7, float par8, int par9, boolean bo)
  {
     if ((this.world.isRemote) && (this.inGround))
       return;
     setPosition(par1, par3, par5);
     setRotation(par7, par8);
  }
  
  public void onUpdate()
  {
     super.onEntityUpdate();
     IBlockState state = this.world.getBlockState(this.tilePos);
     Block block = state.getBlock();
    
     if (((isArrow()) || (sticksToWalls())) && (this.tilePos != BlockPos.ORIGIN)) {
       AxisAlignedBB axisalignedbb = state.getCollisionBoundingBox(this.world, this.tilePos);
      
       if ((axisalignedbb != null) && (((List) axisalignedbb).contains(new Vec3d(this.posX, this.posY, this.posZ))))
      {
         this.inGround = true;
      }
    }
    
     if (this.arrowShake > 0) {
       this.arrowShake -= 1;
    }
    
     if (this.inGround) {
       int j = block.getMetaFromState(state);
       if ((block == this.inTile) && (j == this.inData)) {
         this.ticksInGround += 1;
        
         if (this.ticksInGround == 1200) {
           setDead();
        }
      }
      else {
         this.inGround = false;
         this.motionX *= this.rand.nextFloat() * 0.2F;
         this.motionY *= this.rand.nextFloat() * 0.2F;
         this.motionZ *= this.rand.nextFloat() * 0.2F;
         this.ticksInGround = 0;
         this.ticksInAir = 0;
      }
    }
    else {
       this.ticksInAir += 1;
      
       if (this.ticksInAir == 1200) {
         setDead();
      }
       Vec3d vec3 = new Vec3d(this.posX, this.posY, this.posZ);
       Vec3d vec31 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
       RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec3, vec31, false, true, false);
       vec3 = new Vec3d(this.posX, this.posY, this.posZ);
       vec31 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      
       if (movingobjectposition != null) {
         vec31 = new Vec3d(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
      }
       if (!this.world.isRemote) {
         Entity entity = null;
         List list = this.world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ));
         double d0 = 0.0D;
         EntityLivingBase entityliving = getThrower();
        
         for (int k = 0; k < list.size(); k++)
        {
           Entity entity1 = (Entity)list.get(k);
           if ((entity1.canBeCollidedWith()) && ((!entity1.isEntityEqual(this.thrower)) || (this.ticksInAir >= 25))) {
             float f = 0.3F;
             AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox();
             RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);
            
             if (movingobjectposition1 != null)
            {
               double d1 = vec3.distanceTo(movingobjectposition1.hitVec);
              
               if ((d1 < d0) || (d0 == 0.0D))
              {
                 entity = entity1;
                 d0 = d1;
              }
            }
          }
        }
        
         if (entity != null)
        {
           movingobjectposition = new RayTraceResult(entity);
        }
        
         if ((movingobjectposition != null) && (movingobjectposition.entityHit != null))
        {
           if ((movingobjectposition.entityHit instanceof EntityPlayer)) {
             EntityPlayer entityplayer = (EntityPlayer)movingobjectposition.entityHit;
             if ((entityplayer.capabilities.disableDamage) || (((this.thrower instanceof EntityPlayer)) && 
               (!((EntityPlayer)this.thrower).canAttackPlayer(entityplayer)))) {
               movingobjectposition = null;
            }
          }
        }
      }
      
       if (movingobjectposition != null)
      {
         if ((movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK) && (this.world.getBlockState(movingobjectposition.getBlockPos()).getBlock() == net.minecraft.init.Blocks.PORTAL))
        {
           setPortal(movingobjectposition.getBlockPos());
        }
        else
        {
           this.dataManager.set(Rotating, Boolean.valueOf(false));
           onImpact(movingobjectposition);
        }
      }
      
       this.posX += this.motionX;
       this.posY += this.motionY;
       this.posZ += this.motionZ;
       float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
       this.rotationYaw = ((float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.141592653589793D));
      
       for (this.rotationPitch = ((float)(Math.atan2(this.motionY, f1) * 180.0D / 3.141592653589793D)); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {}
      



       while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
      {
         this.prevRotationPitch += 360.0F;
      }
      
       while (this.rotationYaw - this.prevRotationYaw < -180.0F)
      {
         this.prevRotationYaw -= 360.0F;
      }
      
       while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
      {
         this.prevRotationYaw += 360.0F;
      }
      
       this.rotationPitch = (this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch));
       this.rotationYaw = (this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw));
       if (isRotating()) {
         int spin = isBlock() ? 10 : 20;
         this.rotationPitch -= this.ticksInAir % 15 * spin * getSpeed();
      }
       float f2 = getMotionFactor();
       float f3 = getGravityVelocity();
      
       if (isInWater())
      {
         if (this.world.isRemote) {
           for (int k = 0; k < 4; k++)
          {
             float f4 = 0.25F;
             this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * f4, this.posY - this.motionY * f4, this.posZ - this.motionZ * f4, this.motionX, this.motionY, this.motionZ, new int[0]);
          }
        }
        
         f2 = 0.8F;
      }
      
       this.motionX *= f2;
       this.motionY *= f2;
       this.motionZ *= f2;
      
       if (hasGravity()) {
         this.motionY -= f3;
      }
       if (this.accelerate)
      {
         this.motionX += this.accelerationX;
         this.motionY += this.accelerationY;
         this.motionZ += this.accelerationZ;
      }
      
       setPosition(this.posX, this.posY, this.posZ);
       doBlockCollisions();
    }
  }
  
   public boolean isBlock() { ItemStack item = getItemDisplay();
     if (item.isEmpty())
       return false;
     return item.getItem() instanceof ItemBlock;
  }
  
  private Item getItem() {
     ItemStack item = getItemDisplay();
     if (item.isEmpty())
       return Items.AIR;
     return item.getItem();
  }
  
  protected float getMotionFactor()
  {
     return this.accelerate ? 0.95F : 1.0F;
  }
  /**
   * 		if(movingobjectposition.getBlockPos() != null)
		{
			BlockPos pos = movingobjectposition.getBlockPos();
			IBlockState state1 = world.getBlockState(pos);
			Block block1 = state1.getBlock();
			if((block1 instanceof BlockBreakable || block1 instanceof BlockPane) && state1.getMaterial() == Material.GLASS)
			{
				world.destroyBlock(movingobjectposition.getBlockPos(), false);
			}
   */




  protected void onImpact(RayTraceResult movingobjectposition)
  {
     if (this.callback != null) {
       BlockPos pos = null;
       if (movingobjectposition.entityHit != null) {
         pos = movingobjectposition.entityHit.getPosition();
      } else
         pos = movingobjectposition.getBlockPos();
       if (pos == BlockPos.ORIGIN)
         pos = new BlockPos(movingobjectposition.hitVec);
       if (this.callback.onImpact(this, pos, movingobjectposition.entityHit)) {
         return;
      }
    }
     if (movingobjectposition.entityHit != null)
    {
       float damage = this.damage;
       if (damage == 0.0F) {
         damage = 0.001F;
      }
       if (movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage))
      {
         if (((movingobjectposition.entityHit instanceof EntityLivingBase)) && ((isArrow()) || (sticksToWalls())))
        {
           EntityLivingBase entityliving = (EntityLivingBase)movingobjectposition.entityHit;
          
           if (!this.world.isRemote)
          {
             entityliving.setArrowCountInEntity(entityliving.getArrowCountInEntity() + 1);
          }
          
           if ((this.destroyedOnEntityHit) && (!(movingobjectposition.entityHit instanceof EntityEnderman)))
          {
             setDead();
          }
        }
        
         if (isBlock())
        {
           this.world.playEvent((EntityPlayer)null, 2001, movingobjectposition.entityHit.getPosition(), Item.getIdFromItem(getItem()));
        }
         else if ((!isArrow()) && (!sticksToWalls())) {
           int[] intArr = { Item.getIdFromItem(getItem()) };
           if (getItem().getHasSubtypes())
             intArr = new int[] { Item.getIdFromItem(getItem()), getItemDisplay().getMetadata() };
           for (int i = 0; i < 8; i++) {
             this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, this.posX, this.posY, this.posZ, this.rand.nextGaussian() * 0.15D, this.rand.nextGaussian() * 0.2D, this.rand.nextGaussian() * 0.15D, intArr);
          }
        }
        
         if (this.punch > 0)
        {
           float f3 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
          
           if (f3 > 0.0F)
          {
             movingobjectposition.entityHit.addVelocity(this.motionX * this.punch * 0.6000000238418579D / f3, 0.1D, this.motionZ * this.punch * 0.6000000238418579D / f3);
          }
        }
      }
       else if ((hasGravity()) && ((isArrow()) || (sticksToWalls())))
      {
         this.motionX *= -0.10000000149011612D;
         this.motionY *= -0.10000000149011612D;
         this.motionZ *= -0.10000000149011612D;
         this.rotationYaw += 180.0F;
         this.prevRotationYaw += 180.0F;
         this.ticksInAir = 0;
      }
      

    }
     else if ((isArrow()) || (sticksToWalls()))
    {




       this.tilePos = movingobjectposition.getBlockPos();
       IBlockState state = this.world.getBlockState(this.tilePos);
       this.inTile = state.getBlock();
       this.inData = this.inTile.getMetaFromState(state);
       this.motionX = ((float)(movingobjectposition.hitVec.xCoord - this.posX));
       this.motionY = ((float)(movingobjectposition.hitVec.yCoord - this.posY));
       this.motionZ = ((float)(movingobjectposition.hitVec.zCoord - this.posZ));
       float f2 = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
       this.posX -= this.motionX / f2 * 0.05000000074505806D;
       this.posY -= this.motionY / f2 * 0.05000000074505806D;
       this.posZ -= this.motionZ / f2 * 0.05000000074505806D;
       this.inGround = true;
       this.arrowShake = 7;
      
       if (!hasGravity()) {
         this.dataManager.set(Gravity, Boolean.valueOf(true));
      }
      
       if (this.inTile != null)
      {
         this.inTile.onEntityCollidedWithBlock(this.world, this.tilePos, state, this);
      }
      

    }
     else if (isBlock())
    {
       this.world.playEvent((EntityPlayer)null, 2001, getPosition(), Item.getIdFromItem(getItem()));
    }
    else
    {
       int[] intArr = { Item.getIdFromItem(getItem()) };
       if (getItem().getHasSubtypes())
         intArr = new int[] { Item.getIdFromItem(getItem()), getItemDisplay().getMetadata() };
       for (int i = 0; i < 8; i++) {
         this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, this.posX, this.posY, this.posZ, this.rand.nextGaussian() * 0.15D, this.rand.nextGaussian() * 0.2D, this.rand.nextGaussian() * 0.15D, intArr);
      }
    }
    
     		if(movingobjectposition.getBlockPos() != null)
  		{
  			BlockPos pos = movingobjectposition.getBlockPos();
  			IBlockState state1 = world.getBlockState(pos);
  			Block block1 = state1.getBlock();
  			if((block1 instanceof BlockBreakable || block1 instanceof BlockPane) && state1.getMaterial() == Material.GLASS)
  			{
  				world.destroyBlock(movingobjectposition.getBlockPos(), false);
  			}

  		}
     if (this.explosiveRadius > 0) {
       boolean terraindamage = (this.world.getGameRules().getBoolean("mobGriefing")) && (this.explosiveDamage);
       this.world.newExplosion(getThrower() == null ? this : getThrower(), this.posX, this.posY, this.posZ, this.explosiveRadius, false, terraindamage);
      
       setDead();
    }
    
     if ((!this.world.isRemote) && (!isArrow()) && (!sticksToWalls())) {
       setDead();
    }
  }
  

  private void blockParticles() {}
  

  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
  {
     par1NBTTagCompound.setShort("xTile", (short)this.tilePos.getX());
     par1NBTTagCompound.setShort("yTile", (short)this.tilePos.getY());
     par1NBTTagCompound.setShort("zTile", (short)this.tilePos.getZ());
     par1NBTTagCompound.setByte("inTile", (byte)Block.getIdFromBlock(this.inTile));
     par1NBTTagCompound.setByte("inData", (byte)this.inData);
     par1NBTTagCompound.setByte("shake", (byte)this.throwableShake);
     par1NBTTagCompound.setBoolean("inGround", this.inGround);
     par1NBTTagCompound.setBoolean("isArrow", isArrow());
     par1NBTTagCompound.setTag("direction", newDoubleNBTList(new double[] { this.motionX, this.motionY, this.motionZ }));
     par1NBTTagCompound.setBoolean("canBePickedUp", this.canBePickedUp);
    
     if (((this.throwerName == null) || (this.throwerName.length() == 0)) && (this.thrower != null) && ((this.thrower instanceof EntityPlayer)))
    {
       this.throwerName = this.thrower.getUniqueID().toString();
    }
    
     par1NBTTagCompound.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
     par1NBTTagCompound.setTag("Item", getItemDisplay().writeToNBT(new NBTTagCompound()));
    
     par1NBTTagCompound.setFloat("damagev2", this.damage);
     par1NBTTagCompound.setInteger("punch", this.punch);
     par1NBTTagCompound.setInteger("size", ((Integer)this.dataManager.get(Size)).intValue());
     par1NBTTagCompound.setInteger("velocity", ((Integer)this.dataManager.get(Velocity)).intValue());
     par1NBTTagCompound.setInteger("explosiveRadius", this.explosiveRadius);
     par1NBTTagCompound.setInteger("effectDuration", this.duration);
     par1NBTTagCompound.setBoolean("gravity", hasGravity());
     par1NBTTagCompound.setBoolean("accelerate", this.accelerate);
     par1NBTTagCompound.setBoolean("glows", ((Boolean)this.dataManager.get(Glows)).booleanValue());
     par1NBTTagCompound.setInteger("trailenum", ((Integer)this.dataManager.get(Particle)).intValue());
     par1NBTTagCompound.setBoolean("Render3D", ((Boolean)this.dataManager.get(Is3d)).booleanValue());
     par1NBTTagCompound.setBoolean("Spins", ((Boolean)this.dataManager.get(Rotating)).booleanValue());
     par1NBTTagCompound.setBoolean("Sticks", ((Boolean)this.dataManager.get(Sticks)).booleanValue());
  }
  



  public void readEntityFromNBT(NBTTagCompound compound)
  {
     this.tilePos = new BlockPos(compound.getShort("xTile"), compound.getShort("yTile"), compound.getShort("zTile"));
     this.inTile = Block.getBlockById(compound.getByte("inTile") & 0xFF);
     this.inData = (compound.getByte("inData") & 0xFF);
     this.throwableShake = (compound.getByte("shake") & 0xFF);
     this.inGround = (compound.getByte("inGround") == 1);
     this.dataManager.set(Arrow, Boolean.valueOf(compound.getBoolean("isArrow")));
     this.throwerName = compound.getString("ownerName");
     this.canBePickedUp = compound.getBoolean("canBePickedUp");
    
     this.damage = compound.getFloat("damagev2");
     this.punch = compound.getInteger("punch");
     this.explosiveRadius = compound.getInteger("explosiveRadius");
     this.duration = compound.getInteger("effectDuration");
     this.accelerate = compound.getBoolean("accelerate");
     this.dataManager.set(Particle, Integer.valueOf(compound.getInteger("trailenum")));
     this.dataManager.set(Size, Integer.valueOf(compound.getInteger("size")));
     this.dataManager.set(Glows, Boolean.valueOf(compound.getBoolean("glows")));
     this.dataManager.set(Velocity, Integer.valueOf(compound.getInteger("velocity")));
     this.dataManager.set(Gravity, Boolean.valueOf(compound.getBoolean("gravity")));
     this.dataManager.set(Is3d, Boolean.valueOf(compound.getBoolean("Render3D")));
     this.dataManager.set(Rotating, Boolean.valueOf(compound.getBoolean("Spins")));
     this.dataManager.set(Sticks, Boolean.valueOf(compound.getBoolean("Sticks")));
    
     if ((this.throwerName != null) && (this.throwerName.length() == 0))
    {
       this.throwerName = null;
    }
     if (compound.hasKey("direction"))
    {
       NBTTagList nbttaglist = compound.getTagList("direction", 6);
       this.motionX = nbttaglist.getDoubleAt(0);
       this.motionY = nbttaglist.getDoubleAt(1);
       this.motionZ = nbttaglist.getDoubleAt(2);
    }
    
     NBTTagCompound var2 = compound.getCompoundTag("Item");
     ItemStack item = new ItemStack(var2);
    
     if (item.isEmpty()) {
       setDead();
    } else {
       this.dataManager.set(ItemStackThrown, item);
    }
  }
  
  public EntityLivingBase getThrower()
  {
     if ((this.throwerName == null) || (this.throwerName.isEmpty()))
       return null;
    try {
       UUID uuid = UUID.fromString(this.throwerName);
       if ((this.thrower == null) && (uuid != null)) {
         this.thrower = this.world.getPlayerEntityByUUID(uuid);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
    

     return this.thrower;
  }
  
  public void setParticleEffect(int type) {
     this.dataManager.set(Particle, Integer.valueOf(type));
  }
  
  public void setHasGravity(boolean bo) {
     this.dataManager.set(Gravity, Boolean.valueOf(bo));
  }
  
  public void setIs3D(boolean bo) {
     this.dataManager.set(Is3d, Boolean.valueOf(bo));
  }
  
  public void setStickInWall(boolean bo) {
     this.dataManager.set(Sticks, Boolean.valueOf(bo));
  }
  
  public ItemStack getItemDisplay() {
     return (ItemStack)this.dataManager.get(ItemStackThrown);
  }
  
  public float getBrightness(float par1)
  {
     return ((Boolean)this.dataManager.get(Glows)).booleanValue() ? 1.0F : super.getBrightness(par1);
  }
  
  @SideOnly(Side.CLIENT)
  public int getBrightnessForRender(float par1)
  {
     return ((Boolean)this.dataManager.get(Glows)).booleanValue() ? 15728880 : super.getBrightnessForRender(par1);
  }
  
  public boolean hasGravity() {
     return ((Boolean)this.dataManager.get(Gravity)).booleanValue();
  }
  
  public void setSpeed(int speed) {
     this.dataManager.set(Velocity, Integer.valueOf(speed));
  }
  
  public float getSpeed() {
     return ((Integer)this.dataManager.get(Velocity)).intValue() / 10.0F;
  }
  
  public boolean isArrow() {
     return ((Boolean)this.dataManager.get(Arrow)).booleanValue();
  }
  
  public void setRotating(boolean bo) {
     this.dataManager.set(Rotating, Boolean.valueOf(bo));
  }
  
  public boolean isRotating() {
     return ((Boolean)this.dataManager.get(Rotating)).booleanValue();
  }
  
  public boolean glows() {
     return ((Boolean)this.dataManager.get(Glows)).booleanValue();
  }
  
  public boolean is3D() {
     return (((Boolean)this.dataManager.get(Is3d)).booleanValue()) || (isBlock());
  }
  
  public boolean sticksToWalls() {
     return (is3D()) && (((Boolean)this.dataManager.get(Sticks)).booleanValue());
  }
  

  public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
  {
     if ((this.world.isRemote) || (!this.canBePickedUp) || (!this.inGround) || (this.arrowShake > 0))
       return;
     if (par1EntityPlayer.inventory.addItemStackToInventory(getItemDisplay())) {
       this.inGround = false;
       playSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.2F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
       par1EntityPlayer.onItemPickup(this, 1);
       setDead();
    }
  }
  


  protected boolean canTriggerWalking()
  {
     return false;
  }
  

  public ITextComponent getDisplayName()
  {
     if (!getItemDisplay().isEmpty())
       return new TextComponentTranslation(getItemDisplay().getDisplayName(), new Object[0]);
     return super.getDisplayName();
  }
  
  public static abstract interface IProjectileCallback
  {
    public abstract boolean onImpact(EntityProjectile paramEntityProjectile, BlockPos paramBlockPos, Entity paramEntity);
  }
}
