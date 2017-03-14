package mod.sparkyfox.servermod.entity;

import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import mod.sparkyfox.servermod.init.ModSoundEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class EntityFlowey extends EntityMob implements IRangedAttackMob {

    private static final DataParameter<Integer> FIRST_HEAD_TARGET = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> SECOND_HEAD_TARGET = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> THIRD_HEAD_TARGET = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
    private static final DataParameter<Integer>[] HEAD_TARGETS = new DataParameter[] {FIRST_HEAD_TARGET, SECOND_HEAD_TARGET, THIRD_HEAD_TARGET};
  	private static final DataParameter<Integer> INVULNERABILITY_TIME = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
  	private static final DataParameter<Boolean> ATTACKING = EntityDataManager.<Boolean>createKey(EntityFlowey.class, DataSerializers.BOOLEAN);
  	private static final DataParameter<Boolean> ANGRY = EntityDataManager.<Boolean>createKey(EntityFlowey.class, DataSerializers.BOOLEAN);
    private final float[] xRotationHeads = new float[2];
    private final float[] yRotationHeads = new float[2];
    private final float[] xRotOHeads = new float[2];
    private final float[] yRotOHeads = new float[2];
    private final int[] nextHeadUpdate = new int[2];
    private final int[] idleHeadUpdates = new int[2];
 	private int blockBreakCounter;
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.PURPLE, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
    private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>()
        {
        public boolean apply(@Nullable Entity p_apply_1_)
        {
            return p_apply_1_ instanceof EntityLivingBase && ((EntityLivingBase)p_apply_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && ((EntityLivingBase)p_apply_1_).attackable();
        }
    };

//==============================================================================================================================================================================================\\
	//AGGRESION\\
	public class AIHurtByAggressor extends EntityAIHurtByTarget
        {
            public AIHurtByAggressor(EntityFlowey p_i45828_1_)
            {
                super(p_i45828_1_, true, new Class[0]);
            }

            protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
            {
                super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);

                if (creatureIn instanceof EntityFlowey)
                {
                    ((EntityFlowey)creatureIn).becomeAngryAt(entityLivingBaseIn);
                }
            }
        }

   public class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer>
        {
            public AITargetAggressor(EntityFlowey p_i45829_1_)
            {
                super(p_i45829_1_, EntityPlayer.class, true);
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                return ((EntityFlowey)this.taskOwner).isAngry() && super.shouldExecute();
            }
        }
        
        

//==============================================================================================================================================================================================\\
	//AI and Tasks\\


	private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final AttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new AttributeModifier(ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, 0)).setSaved(false);
    /** Above zero if this Flowey is Angry. */
    private int angerLevel;
    /** A random delay until this Flowey next makes a sound. */
    private int randomSoundDelay;
    private UUID angerTargetUUID;



	public EntityFlowey(World worldIn) {
		super(worldIn);
		this.setHealth(this.getMaxHealth());
        this.isImmuneToFire = true;
        this.experienceValue = 5000;
    }
    
     protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityFlowey.AIDoNothing());
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
        //this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(FIRST_HEAD_TARGET, Integer.valueOf(0));
        this.dataManager.register(SECOND_HEAD_TARGET, Integer.valueOf(0));
        this.dataManager.register(THIRD_HEAD_TARGET, Integer.valueOf(0));
        this.dataManager.register(INVULNERABILITY_TIME, Integer.valueOf(0));
        this.dataManager.register(ATTACKING, Boolean.valueOf(false));
        this.dataManager.register(ANGRY, Boolean.valueOf(false));
    }
        
        protected void applyEntityAI()
    {
        this.targetTasks.addTask(1, new EntityFlowey.AIHurtByAggressor(this));
        this.targetTasks.addTask(2, new EntityFlowey.AITargetAggressor(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3000.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
        
        
        
//==============================================================================================================================================================================================\\
	//ANGER\\
    }

    protected void updateAITasks()
    {
        IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);

        if (this.isAngry())
        {
            if (!this.isChild() && !iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER))
            {
                iattributeinstance.applyModifier(ATTACK_SPEED_BOOST_MODIFIER);
            }

            --this.angerLevel;
        }
        else if (iattributeinstance.hasModifier(ATTACK_SPEED_BOOST_MODIFIER))
        {
            iattributeinstance.removeModifier(ATTACK_SPEED_BOOST_MODIFIER);
        }

        if (this.randomSoundDelay > 3 && --this.randomSoundDelay == 3)
        {
            this.playSound(ModSoundEvent.FloweyIKWYD, this.getSoundVolume() * 2.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.0F + 1.0F) * 1.0F);
        }

        if (this.angerLevel > 0 && this.angerTargetUUID != null && this.getAITarget() == null)
        {
            EntityPlayer entityplayer = this.world.getPlayerEntityByUUID(this.angerTargetUUID);
            this.setRevengeTarget(entityplayer);
            this.attackingPlayer = entityplayer;
            this.recentlyHit = this.getRevengeTimer();
        }

        super.updateAITasks();
    }
	//////////////////////////////////////
	  /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
    }
	//////////////////////////
	/**
     * Causes this Flowey to become angry at the supplied Entity (which will be a player).
     */
    void becomeAngryAt(Entity p_70835_1_)
    {
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);

        if (p_70835_1_ instanceof EntityLivingBase)
        {
            this.setRevengeTarget((EntityLivingBase)p_70835_1_);
        }
    }
    
    public boolean isAngry()
    {
      return this.angerLevel > 0;
        
        // return ((Boolean)this.dataManager.get(ATTACKING)).booleanValue();
    }
  

   public void setInvulnerable(boolean invulnerable) 
   	{
	this.dataManager.set(ANGRY, Boolean.valueOf(invulnerable));
	}
    
    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setShort("Anger", (short)this.angerLevel);

        if (this.angerTargetUUID != null)
        {
            compound.setString("HurtBy", this.angerTargetUUID.toString());
        }
        else
        {
            compound.setString("HurtBy", "");
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.angerLevel = compound.getShort("Anger");
        String s = compound.getString("HurtBy");

        if (!s.isEmpty())
        {
            this.angerTargetUUID = UUID.fromString(s);
            EntityPlayer entityplayer = this.world.getPlayerEntityByUUID(this.angerTargetUUID);
           // this.setRevengeTarget(entityplayer);

           // if (entityplayer != null)
            {
                //this.attackingPlayer = entityplayer;
                //this.recentlyHit = this.getRevengeTimer();
            }
        }
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else
        {
            Entity entity = source.getEntity();

            if (entity instanceof EntityPlayer)
            {
                this.becomeAngryAt(entity);
            }

            return super.attackEntityFrom(source, amount);
        }
    }

   
//==============================================================================================================================================================================================\\
	//SOUNDS\\
    protected SoundEvent getAmbientSound()
    {
        return this.isAngry() ? ModSoundEvent.FloweyLaugh : this.isAttacking() ? ModSoundEvent.FloweyKOBK : ModSoundEvent.FloweyHowdy;
    }
    
    protected SoundEvent getHurtSound()
    {
        return ModSoundEvent.FloweyHurt;
    }

   	protected SoundEvent getDeathSound()
    {
      return ModSoundEvent.FloweyDeath;
    }
    
  	protected SoundEvent getAngerSound()
    {
      return ModSoundEvent.FloweyKOBK;
    }
    
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 10.0F;
    }
	

//==============================================================================================================================================================================================\\
	//ATTACK\\
	
    @SideOnly(Side.CLIENT)
    public boolean isAttacking()
    {
        return ((Boolean)this.dataManager.get(ATTACKING)).booleanValue();
    }

    public void setAttacking(boolean attacking)
    {
        this.dataManager.set(ATTACKING, Boolean.valueOf(attacking));
    }
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
	
	  this.launchFriendlynessPelletToEntity(0, target);

		
	}private double getHeadX(int p_82214_1_)
    {
        if (p_82214_1_ <= 0)
        {
            return this.posX;
        }
        else
        {
            float f = (this.renderYawOffset + (float)(180 * (p_82214_1_ - 1))) * 0.017453292F;
            float f1 = MathHelper.cos(f);
            return this.posX + (double)f1 * 1.3D;
        }
    }

    private double getHeadY(int p_82208_1_)
    {
        return p_82208_1_ <= 0 ? this.posY + 3.0D : this.posY + 2.2D;
    }

    private double getHeadZ(int p_82213_1_)
    {
        if (p_82213_1_ <= 0)
        {
            return this.posZ;
        }
        else
        {
            float f = (this.renderYawOffset + (float)(180 * (p_82213_1_ - 1))) * 0.017453292F;
            float f1 = MathHelper.sin(f);
            return this.posZ + (double)f1 * 1.3D;
        }
    }

    private float rotlerp(float p_82204_1_, float p_82204_2_, float p_82204_3_)
    {
        float f = MathHelper.wrapDegrees(p_82204_2_ - p_82204_1_);

        if (f > p_82204_3_)
        {
            f = p_82204_3_;
        }

        if (f < -p_82204_3_)
        {
            f = -p_82204_3_;
        }

        return p_82204_1_ + f;
    }
	

	 private void launchFriendlynessPelletToEntity(int p_82216_1_, EntityLivingBase p_82216_2_)
    {
        this.launchFriendlynessPelletToCoords(p_82216_1_, p_82216_2_.posX, p_82216_2_.posY + (double)p_82216_2_.getEyeHeight() * 0.5D, p_82216_2_.posZ, p_82216_1_ == 0 && this.rand.nextFloat() < 0.001F);
    }

    /**
     * Launches a Friendlyness Pellet toward (par2, par4, par6)
     */
    private void launchFriendlynessPelletToCoords(int p_82209_1_, double x, double y, double z, boolean invulnerable)
    {
        this.world.playEvent((EntityPlayer)null, 1024, new BlockPos(this), 0);
        double d0 = this.getHeadX(p_82209_1_);
        double d1 = this.getHeadY(p_82209_1_);
        double d2 = this.getHeadZ(p_82209_1_);
        double d3 = x - d0;
        double d4 = y - d1;
        double d5 = z - d2;
        EntityFriendlynessPellet entityFriendlynessPellet = new EntityFriendlynessPellet(this.world, this, d3, d4, d5);

        if (invulnerable)
        {
            entityFriendlynessPellet.setInvulnerable(true);
        }

        entityFriendlynessPellet.posY = d1;
        entityFriendlynessPellet.posX = d0;
        entityFriendlynessPellet.posZ = d2;
        this.world.spawnEntity(entityFriendlynessPellet);
    }

    
    
//==============================================================================================================================================================================================\\

    /**
     * Returns the target entity ID if present, or -1 if not @param par1 The target offset, should be from 0-2
     */
    public int getWatchedTargetId(int head)
    {
        return ((Integer)this.dataManager.get(HEAD_TARGETS[head])).intValue();
    }

    /**
     * Updates the target entity ID
     */
    public void updateWatchedTargetId(int targetOffset, int newId)
    {
        this.dataManager.set(HEAD_TARGETS[targetOffset], Integer.valueOf(newId));
    }

    /**
     * Returns whether Flowey is armored with its boss armor or not by checking whether its health is below half of
     * its maximum.
     */
    public boolean isArmored()
    {
        return this.getHealth() <= this.getMaxHealth() / 2.0F;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    protected boolean canBeRidden(Entity entityIn)
    {
        return false;
    }

    /**
     * Returns false if this Entity is a boss, true otherwise.
     */
    public boolean isNonBoss()
    {
        return false;
    }

    class AIDoNothing extends EntityAIBase
    {
        public AIDoNothing()
        {
            this.setMutexBits(7);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            return EntityFlowey.this.getInvulTime() > 0;
        }
  }

public int getInvulTime()
    {
        return ((Integer)this.dataManager.get(INVULNERABILITY_TIME)).intValue();
    }

    public void setInvulTime(int time)
    {
        this.dataManager.set(INVULNERABILITY_TIME, Integer.valueOf(time));
    }
    }