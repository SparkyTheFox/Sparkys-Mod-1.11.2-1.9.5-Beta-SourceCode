package mod.sparkyfox.servermod.entity;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModSoundEvent;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
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
        super.setDamage(4.5D);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    
    }

    @Override
    @Nonnull
    public ItemStack getArrowStack() {
        return new ItemStack(ModItems.SMGRounds);
    }

    @Override
    public void arrowHit(EntityLivingBase living) {
        super.arrowHit(living);
        
        //added by me\\
        this.playSound(ModSoundEvent.impact, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

        this.motionX *= -0.10000000149011612D;
        this.motionY *= -0.10000000149011612D;
        this.motionZ *= -0.10000000149011612D;
        this.rotationYaw += 180.0F;
        this.prevRotationYaw += 180.0F;
        this.ticksInAir = 0;

        if (!this.world.isRemote && this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ < 0.0010000000474974513D)
        {
            if (this.pickupStatus == EntitySMGRounds.PickupStatus.DISALLOWED)
            {
                this.entityDropItem(this.getArrowStack(), 0.1F);
            }

            this.setDead();
        }

    this.playSound(ModSoundEvent.impact, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
  //added by me\\
    
		}
	}
