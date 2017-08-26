package mod.sparkyfox.servermod.entity;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntitySMGRounds extends EntityArrow {

    private EnumParticleTypes particle;
//added by me\\
    private static final DataParameter<Byte> CRITICAL = EntityDataManager.<Byte>createKey(EntityArrow.class, DataSerializers.BYTE);
    private int xTile;
    private int yTile;
    private int zTile;
    private Block inTile;
    private int inData;
    protected boolean inGround;
    protected int timeInGround;
    /** 1 if the player can pick up the arrow */
    public EntityArrow.PickupStatus pickupStatus;
    /** Seems to be some sort of timer for animating an arrow. */
    public int arrowShake;
    /** The owner of this arrow. */
    public Entity shootingEntity;
    private int ticksInGround;
    private int ticksInAir;
    private double damage;
    /** The amount of knockback an arrow applies when it hits a mob. */
    private int knockbackStrength;
//added by me\\
    
    public EntitySMGRounds(World worldIn) {
        super(worldIn);
        this.pickupStatus = EntitySMGRounds.PickupStatus.DISALLOWED;
        this.setSize(0.5F, 0.5F);
    }
//
    public EntitySMGRounds(World worldIn, EntityLivingBase shooter) {
        super(worldIn, shooter);
        //
        {
            this.shootingEntity = shooter;

            if (shooter instanceof EntityPlayer)
            {
                this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
            }
        }
        //
    }

    public EntitySMGRounds(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
        
    }

    @Override
    public void setDamage(double damageIn) {
        super.setDamage(5.0D);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(MathHelper.atan2(this.motionX, this.motionZ) * (180D / Math.PI));
            this.rotationPitch = (float)(MathHelper.atan2(this.motionY, (double)f) * (180D / Math.PI));
            this.prevRotationYaw = this.rotationYaw;
            this.prevRotationPitch = this.rotationPitch;
        }

        BlockPos blockpos = new BlockPos(this.xTile, this.yTile, this.zTile);
        IBlockState iblockstate = this.world.getBlockState(blockpos);
        Block block = iblockstate.getBlock();

        if (iblockstate.getMaterial() != Material.AIR)
        {
            AxisAlignedBB axisalignedbb = iblockstate.getCollisionBoundingBox(this.world, blockpos);

            if (axisalignedbb != Block.NULL_AABB && axisalignedbb.offset(blockpos).isVecInside(new Vec3d(this.posX, this.posY, this.posZ)))
            {
                this.inGround = true;
            }
    

        if (this.inGround)
        {
            int j = block.getMetaFromState(iblockstate);

            if ((block != this.inTile || j != this.inData) && !this.world.collidesWithAnyBlock(this.getEntityBoundingBox().expandXyz(0.05D)))
            {
                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
            else
            {
                ++this.ticksInGround;

                if (this.ticksInGround >= 1200)
                {
                    this.setDead();
                }
            }

            ++this.timeInGround;

        }
    }
 }

    

    /**
     * Called when the arrow hits a block or an entity
     */
    @Override
    protected void onHit(RayTraceResult raytraceResultIn) {
    		super.onHit(raytraceResultIn);
    	    {
    	        Entity entity = raytraceResultIn.entityHit;

    	        if (entity != null)
    	        {
    	            float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
    	            int i = MathHelper.ceil((double)f * this.damage);

    	            if (this.getIsCritical())
    	            {
    	                i += this.rand.nextInt(i / 2 + 2);
    	            }

    	            DamageSource damagesource;

    	            if (this.shootingEntity == null)
    	            {
    	                damagesource = DamageSource.causeArrowDamage(this, this);
    	            }
    	            else
    	            {
    	                damagesource = DamageSource.causeArrowDamage(this, this.shootingEntity);
    	            }

    	            if (this.isBurning() && !(entity instanceof EntityEnderman))
    	            {
    	                entity.setFire(5);
    	            }

    	            if (entity.attackEntityFrom(damagesource, (float)i))
    	            {
    	                if (entity instanceof EntityLivingBase)
    	                {
    	                    EntityLivingBase entitylivingbase = (EntityLivingBase)entity;

    	                    if (!this.world.isRemote)
    	                    {
    	                        entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1);
    	                    }

    	                    if (this.knockbackStrength > 0)
    	                    {
    	                        float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

    	                        if (f1 > 0.0F)
    	                        {
    	                            entitylivingbase.addVelocity(this.motionX * (double)this.knockbackStrength * 0.6000000238418579D / (double)f1, 0.1D, this.motionZ * (double)this.knockbackStrength * 0.6000000238418579D / (double)f1);
    	                        }
    	                    }

    	                    if (this.shootingEntity instanceof EntityLivingBase)
    	                    {
    	                        EnchantmentHelper.applyThornEnchantments(entitylivingbase, this.shootingEntity);
    	                        EnchantmentHelper.applyArthropodEnchantments((EntityLivingBase)this.shootingEntity, entitylivingbase);
    	                    }

    	                    this.arrowHit(entitylivingbase);

    	                    if (this.shootingEntity != null && entitylivingbase != this.shootingEntity && entitylivingbase instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP)
    	                    {
    	                        ((EntityPlayerMP)this.shootingEntity).connection.sendPacket(new SPacketChangeGameState(6, 0.0F));
    	                    }
    	                }

    	                this.playSound(ModSoundEvents.bloodsplat,  1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
    	                if (!(entity instanceof EntityEnderman))
    	                {
    	                    this.setDead();
    	                }
    	            }
    	            else
    	            {
    	                this.motionX *= -0.10000000149011612D;
    	                this.motionY *= -0.10000000149011612D;
    	                this.motionZ *= -0.10000000149011612D;
    	                this.rotationYaw += 180.0F;
    	                this.prevRotationYaw += 180.0F;
    	                this.ticksInAir = 0;

    	                if (!this.world.isRemote && this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ < 0.0010000000474974513D)
    	                {
    	                    if (this.pickupStatus == EntitySMGRounds.PickupStatus.ALLOWED)
    	                    {
    	                        this.entityDropItem(this.getArrowStack(), 0.1F);
    	                    }

    	                    this.setDead();
    	                }
    	            }
    	        }
    	        else
    	        {	
    	        
    	            BlockPos blockpos = raytraceResultIn.getBlockPos();{ 	
    	            }
    	            super.onHit(raytraceResultIn);
    	            this.xTile = blockpos.getX();
    	            this.yTile = blockpos.getY();
    	            this.zTile = blockpos.getZ();
    	            IBlockState iblockstate = this.world.getBlockState(blockpos);
    	            this.inTile = iblockstate.getBlock();
    	            this.inData = this.inTile.getMetaFromState(iblockstate);
    	            this.motionX = (double)((float)(raytraceResultIn.hitVec.xCoord - this.posX));
    	            this.motionY = (double)((float)(raytraceResultIn.hitVec.yCoord - this.posY));
    	            this.motionZ = (double)((float)(raytraceResultIn.hitVec.zCoord - this.posZ));
    	            float f2 = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
    	            this.posX -= this.motionX / (double)f2 * 0.05000000074505806D;
    	            this.posY -= this.motionY / (double)f2 * 0.05000000074505806D;
    	            this.posZ -= this.motionZ / (double)f2 * 0.05000000074505806D;
    	            this.playSound(ModSoundEvents.impact, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
    	            this.inGround = true;
    	            this.setIsCritical(false);

    	            if (iblockstate.getMaterial() != Material.AIR)
    	            {
    	                this.inTile.onEntityCollidedWithBlock(this.world, blockpos, iblockstate, this);
    	            }
    	        }
    	    }
    }

    

    @Override
    @Nonnull
    public ItemStack getArrowStack() {
        return new ItemStack(ModItems.SMGBulletCasing);//what you pick up after the arrow is shot
    }

    @Override
    public void arrowHit(EntityLivingBase living) {
        super.arrowHit(living);
        this.playSound(ModSoundEvents.bloodsplat,  1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));//sound
 
    }
    @Override
    public void setEnchantmentEffectsFromEntity(EntityLivingBase p_190547_1_, float p_190547_2_){
    	
    
    	super.setEnchantmentEffectsFromEntity(p_190547_1_, p_190547_2_);
    {
        int j = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.POWER, p_190547_1_);
        int k = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.PUNCH, p_190547_1_);
        this.setDamage((double)(p_190547_2_ * 100.0F) + this.rand.nextGaussian() * 100.0D + (double)((float)this.world.getDifficulty().getDifficultyId() * 0.11F));

        if (j > 100)
        {
            this.setDamage(this.getDamage() + (double)j * 100.5D + 100.5D);
        }

        if (j > 100)
        {
            this.setKnockbackStrength(j);
        }

        if (EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.FLAME, p_190547_1_) > 100)
        {
            this.setFire(100);
        }
    }   
}
}    
        
  //added by me\\
    
	