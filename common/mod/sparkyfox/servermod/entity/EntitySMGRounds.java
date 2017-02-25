package mod.sparkyfox.servermod.entity;

import io.netty.buffer.ByteBuf;
import mod.sparkyfox.servermod.damage.DamageSourceSMGRounds;
import mod.sparkyfox.servermod.init.ModSoundEvent;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntitySMGRounds extends EntityArrow implements IProjectile, IEntityAdditionalSpawnData{

	private static final Predicate<Entity> ARROW_TARGETS = Predicates.and(
			new Predicate[] {
					EntitySelectors.NOT_SPECTATING, EntitySelectors.IS_ALIVE, new Predicate<Entity>(){
						public boolean apply(@Nullable Entity p_apply_1_){
							return p_apply_1_.canBeCollidedWith();
						}
					}
			}
		);
	private int xTile;
	private int yTile;
	private int zTile;
	private Block inTile;
	private int inData;
	protected boolean inGround;
	protected int timeInGround;
	/** Seems to be some sort of timer for animating an arrow. */
	public int arrowShake;
	/** The owner of this arrow. */
	public Entity shootingEntity;
	private int ticksInGround;
	private int ticksInAir;
	private double damage;
	/** The amount of knockback an arrow applies when it hits a mob. */
	private int knockbackStrength;
	
    private double speed = 0.3D;
    private float range = 0.4F;

    public EntitySMGRounds(World worldIn){
    	super(worldIn);
    	this.xTile = -1;
    	this.yTile = -1;
    	this.zTile = -1;
    	this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
    	this.damage = 2.0D;
    	this.setSize(0.5F, 0.5F);
    }
    
    public EntitySMGRounds(World worldIn, EntityLivingBase shooter, float p_i1756_3_){
    	super(worldIn);
    	this.shootingEntity = shooter;	
    	
    	this.setLocationAndAngles(shooter.posX, shooter.posY + (double)shooter.getEyeHeight(), shooter.posZ, shooter.rotationYaw, shooter.rotationPitch);
    	this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
    	this.posY -= 0.10000000149011612D;
    	this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
    	this.setPosition(this.posX, this.posY, this.posZ);
    	this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
    	this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
    	this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
    	this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, p_i1756_3_ * 1.5F, 1.0F);
    }
    
    @Override
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeDouble(posX);
		buffer.writeDouble(posY);
		buffer.writeDouble(posZ);
	}

	@Override
	public void readSpawnData(ByteBuf additionalData) {
		this.setPosition(additionalData.readDouble(), additionalData.readDouble(), additionalData.readDouble());
	}

	@Override
	protected void entityInit(){
		
	}
	
	/**
	 * Called to update the entity's position/logic.
	 */
    @Override
	public void onUpdate(){
		//super.onUpdate();
		
		
		if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F){
			float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
			this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f) * 180.0D / Math.PI);
		}
		
		BlockPos blockpos = new BlockPos(this.xTile, this.yTile, this.zTile);
		IBlockState iblockstate = this.world.getBlockState(blockpos);
		Block block = iblockstate.getBlock();
		
		if(iblockstate.getMaterial() != Material.AIR){//check if hit block
			AxisAlignedBB axisalignedbb = iblockstate.getCollisionBoundingBox(this.world, blockpos);
			if (axisalignedbb != Block.NULL_AABB && axisalignedbb.offset(blockpos).isVecInside(new Vec3d(this.posX, this.posY, this.posZ))){	
				this.inGround = true;
			}
		}
		
		if (this.arrowShake > 0){
			--this.arrowShake;
		}
		
		if (this.inGround){//inGround stuff, kills the entity here
			int j = block.getMetaFromState(iblockstate);
			
			if (block == this.inTile && j == this.inData){
				++this.ticksInGround;
				
				if (this.ticksInGround == 1200){
					this.setDead();
				}
			}else{
				this.inGround = false;
				this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
				this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
				this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
				this.ticksInGround = 0;
				this.ticksInAir = 0;
			}
			++this.timeInGround;
			this.setDead();
		}else{ //Traveling
			this.timeInGround = 0;
			++this.ticksInAir;
			Vec3d vec3d1 = new Vec3d(this.posX, this.posY, this.posZ);
			Vec3d vec3d = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			RayTraceResult raytraceresult = this.world.rayTraceBlocks(vec3d1, vec3d, false, true, false);
			vec3d1 = new Vec3d(this.posX, this.posY, this.posZ);
			vec3d = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			
			if(raytraceresult != null){
				vec3d = new Vec3d(raytraceresult.hitVec.xCoord, raytraceresult.hitVec.yCoord, raytraceresult.hitVec.zCoord);
			}
			
			Entity entity = this.findEntityOnPath(vec3d1, vec3d);
			
			if (entity != null){
				raytraceresult = new RayTraceResult(entity);
			}
			
			if (raytraceresult != null && raytraceresult.entityHit != null && raytraceresult.entityHit instanceof EntityPlayer){
				EntityPlayer entityplayer = (EntityPlayer)raytraceresult.entityHit;
				
				if (this.shootingEntity instanceof EntityPlayer && !((EntityPlayer)this.shootingEntity).canAttackPlayer(entityplayer)){
					raytraceresult = null;
				}
			}
			
			if (raytraceresult != null){
                this.onHit(raytraceresult);
            }

			if (this.getIsCritical()){
				for (int k = 0; k < 4; ++k){
					this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX + this.motionX * (double)k / 4.0D, this.posY + this.motionY * (double)k / 4.0D, this.posZ + this.motionZ * (double)k / 4.0D, -this.motionX, -this.motionY + 0.2D, -this.motionZ, new int[0]);
				}
			}

			this.posX += this.motionX * speed;
            this.posY += this.motionY * speed;
            this.posZ += this.motionZ * speed;
            float f4 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

            for (this.rotationPitch = (float)(MathHelper.atan2(this.motionY, (double)f4) * (180D / Math.PI)); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F){
                ;
            }
            
            while (this.rotationPitch - this.prevRotationPitch >= 180.0F){
            	this.prevRotationPitch += 360.0F;
            }
            
            while (this.rotationYaw - this.prevRotationYaw < -180.0F){
            	this.prevRotationYaw -= 360.0F;
            }
            
            while (this.rotationYaw - this.prevRotationYaw >= 180.0F){
            	this.prevRotationYaw += 360.0F;
            }
            
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            float f1 = 0.99F;
            float f2 = range;
            
            if (this.isInWater()){
            	for (int l = 0; l < 4; ++l){
            		f4 = 0.25F;
            		this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
            	}
            	f1 = 0.8F;
            }
            
            if (this.isWet()){
            	this.extinguish();
            }

            this.motionX *= (double)f1;
            this.motionY *= (double)f1;
            this.motionZ *= (double)f1;
            this.motionY -= (double)f2;
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
		}
		

    }
	
	@Override
	protected void onHit(RayTraceResult raytraceResultIn){	
		Entity entity = raytraceResultIn.entityHit;
		
		if (entity != null){
			float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
			int i = MathHelper.ceil((double)f * this.damage);
			
			if (this.getIsCritical()){
				i += this.rand.nextInt(i / 2 + 2);
			}

            DamageSource damagesource = new DamageSourceSMGRounds();
			
			if (this.isBurning() && !(entity instanceof EntityEnderman)){
				entity.setFire(5);
			}
			
			if (entity.attackEntityFrom(damagesource, (float)i)){
				if (entity instanceof EntityLivingBase){
					EntityLivingBase entitylivingbase = (EntityLivingBase)entity;
					
					if (!this.world.isRemote){
						entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1);
					}
					
					if (this.knockbackStrength > 0){
						float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
						
						if (f1 > 0.0F){
							entitylivingbase.addVelocity(this.motionX * (double)this.knockbackStrength * 0.6000000238418579D / (double)f1, 0.1D, this.motionZ * (double)this.knockbackStrength * 0.6000000238418579D / (double)f1);
						}
					}
					
					if (this.shootingEntity instanceof EntityLivingBase){
						//EnchantmentHelper.applyThornEnchantments(entitylivingbase, this.shootingEntity);
						//EnchantmentHelper.applyArthropodEnchantments((EntityLivingBase)this.shootingEntity, entitylivingbase);
					}
					
					this.arrowHit(entitylivingbase);
					
					if (this.shootingEntity != null && entitylivingbase != this.shootingEntity && entitylivingbase instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP){
						((EntityPlayerMP)this.shootingEntity).connection.sendPacket(new SPacketChangeGameState(6, 0.0F));
					}
				}
				
				this.playSound(ModSoundEvent.impact, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
				
				if (!(entity instanceof EntityEnderman)){
					this.setDead();
				}
			}else{
				this.motionX *= -0.10000000149011612D;
				this.motionY *= -0.10000000149011612D;
				this.motionZ *= -0.10000000149011612D;
				this.rotationYaw += 180.0F;
				this.prevRotationYaw += 180.0F;
				this.ticksInAir = 0;
				
				if (!this.world.isRemote && this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ < 0.0010000000474974513D){
					if (this.pickupStatus == EntityArrow.PickupStatus.ALLOWED){
						this.entityDropItem(this.getArrowStack(), 0.1F);
					}
					
					this.setDead();
				}
			}
		}else{
			BlockPos blockpos = raytraceResultIn.getBlockPos();
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
			this.playSound(ModSoundEvent.impact, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
			this.inGround = true;
			this.arrowShake = 7;
			this.setIsCritical(false);
			
			if (iblockstate.getMaterial() != Material.AIR){
				this.inTile.onEntityCollidedWithBlock(this.world, blockpos, iblockstate, this);
			}
		}
	}
    


    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound compound){
    	compound.setInteger("xTile", this.xTile);
    	compound.setInteger("yTile", this.yTile);
    	compound.setInteger("zTile", this.zTile);
    	compound.setShort("life", (short)this.ticksInGround);
    	ResourceLocation resourcelocation = (ResourceLocation)Block.REGISTRY.getNameForObject(this.inTile);
    	compound.setString("inTile", resourcelocation == null ? "" : resourcelocation.toString());
    	compound.setByte("inData", (byte)this.inData);
    	compound.setByte("shake", (byte)this.arrowShake);
    	compound.setByte("inGround", (byte)(this.inGround ? 1 : 0));
    	compound.setByte("pickup", (byte)this.pickupStatus.ordinal());
    	compound.setDouble("damage", this.damage);
    }
    
    

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound compound){
    	this.xTile = compound.getInteger("xTile");
    	this.yTile = compound.getInteger("yTile");
    	this.zTile = compound.getInteger("zTile");
    	this.ticksInGround = compound.getShort("life");
    	
    	if (compound.hasKey("inTile", 8)){
    		this.inTile = Block.getBlockFromName(compound.getString("inTile"));
    	}else{
    		this.inTile = Block.getBlockById(compound.getByte("inTile") & 255);
    	}
    	
    	this.inData = compound.getByte("inData") & 255;
    	this.arrowShake = compound.getByte("shake") & 255;
    	this.inGround = compound.getByte("inGround") == 1;	
    	
    	if (compound.hasKey("damage", 99)){
    		this.damage = compound.getDouble("damage");
    	}
    	
    	if (compound.hasKey("pickup", 99)){
    		this.pickupStatus = EntityArrow.PickupStatus.getByOrdinal(compound.getByte("pickup"));
    	}else if (compound.hasKey("player", 99)){
    		this.pickupStatus = compound.getBoolean("player") ? EntityArrow.PickupStatus.ALLOWED : EntityArrow.PickupStatus.DISALLOWED;
    	}
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    @Override
    public void onCollideWithPlayer(EntityPlayer p_70100_1_){
    	
    }
    
    public void setDamageRangeSpeed(double d, float r, double s){
    	damage = d;
    	range = r;
    	speed = s;
    }

	@Override
	protected ItemStack getArrowStack() {
		return ItemStack.EMPTY;
	}
}
