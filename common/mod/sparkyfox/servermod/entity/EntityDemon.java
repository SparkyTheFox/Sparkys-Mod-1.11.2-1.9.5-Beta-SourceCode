package mod.sparkyfox.servermod.entity;

import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import mod.sparkyfox.servermod.init.ModSoundEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;


public class EntityDemon extends EntityMob implements IRangedAttackMob
{   
	public class AIDoNothing extends EntityAIBase {

		@Override
		public boolean shouldExecute() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
    /** Time before Demon tries to break blocks */
    private int blockBreakCounter;
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
    private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>()
    {
        public boolean apply(@Nullable Entity p_apply_1_)
        {
            return p_apply_1_ instanceof EntityLivingBase && ((EntityLivingBase)p_apply_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && ((EntityLivingBase)p_apply_1_).attackable();
        }
    };

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
		// TODO Auto-generated method stub
		
	}



//==============================================================================================================================================================================================\\
	//FACES\\
    
    private static final DataParameter<Integer> ATTACKING = EntityDataManager.<Integer>createKey(EntityDemon.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> ANGER = EntityDataManager.<Integer>createKey(EntityDemon.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> INVULNERABILITY = EntityDataManager.<Integer>createKey(EntityDemon.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> HURT = EntityDataManager.<Integer>createKey(EntityDemon.class, DataSerializers.VARINT);
    
    
    //
    public int getInvulTime()
    {
        return ((Integer)this.dataManager.get(INVULNERABILITY)).intValue();
    }

    public void setInvulTime(int time)
    {
        this.dataManager.set(INVULNERABILITY, Integer.valueOf(time));
    }
	
	//
    public int getHurtTime()
    {
        return ((Integer)this.dataManager.get(HURT)).intValue();
    }

    public void setHurtTime(int time)
    {
        this.dataManager.set(HURT, Integer.valueOf(time));
    }
    
    //
    public int getAngerTime()
    {
        return ((Integer)this.dataManager.get(ANGER)).intValue();
    }

    public void setAngerTime(int time)
    {
        this.dataManager.set(ANGER, Integer.valueOf(time));
    }
    
    //
    public int getAttackTime()
    {
        return ((Integer)this.dataManager.get(ATTACKING)).intValue();
    }

    public void Attack(int time)
    {
        this.dataManager.set(ATTACKING, Integer.valueOf(time));
    }

//==============================================================================================================================================================================================\\
	//ATTACK DAMAGE\\

	/** The explosion radius of spawned Friendliness Pellets. */
	private int explosionStrength = 3;
	{
		
	}

//==============================================================================================================================================================================================\\
	//AGGRESION\\
	
        
        

//==============================================================================================================================================================================================\\
	//!!AI and Tasks!!\\
	
    public EntityDemon(World worldIn)
    {
        super(worldIn);
        this.setHealth(this.getMaxHealth());
        this.isImmuneToFire = true;
        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
        this.experienceValue = 5000;
    }

    
	//World\\
        
	//InitAI\\
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityDemon.AIDoNothing());
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        //this.tasks.addTask(7, new EntityDemon.AIFireballAttack(this));
        //this.tasks.addTask(7, new EntityDemon.AILookAround(this));
        //this.targetTasks.addTask(1, new EntityDemon.AIFindPlayer(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));//Cows?\\
    }
	//EntityInit\\
    protected void entityInit()
    {
    	super.entityInit();
        this.dataManager.register(INVULNERABILITY, Integer.valueOf(0));
        this.dataManager.register(HURT, Integer.valueOf(0));
        this.dataManager.register(ANGER, Integer.valueOf(0));
        this.dataManager.register(ATTACKING, Integer.valueOf(0));
    }
    public static void registerFixesWither(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityWither.class);
    }
    
    
    
	//ApplyAI\\
    protected void applyEntityAI()
    {
        this.targetTasks.addTask(1, new EntityDemon.AIHurtByAggressor(this));
        this.targetTasks.addTask(2, new EntityDemon.AITargetAggressor(this));
    }
    
    //ApplyAttributes\\
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(900.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }
    
    //Updated AI Tasks\\
    protected void updateAITasks()
    {
    	/** Boss Bar Update */
    	this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
    
    	/** The explosion radius of spawned Friendliness Pellets. */
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

            if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0)
            {
                this.playSound(ModSoundEvents.DemonLaugh, this.getSoundVolume() * 2.0F, this.getSoundPitch() * 1.0F);
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
    	}
        /**
         * Checks if the entity's current position is a valid location to spawn this entity.
         */
        public boolean getCanSpawnHere()
        {
            return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
        }

        /**
         * Checks that the entity is not colliding with any blocks / liquids
         */
        public boolean isNotColliding()
        {
            return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this) && this.world.getCollisionBoxes(this, this.getEntityBoundingBox()).isEmpty() && !this.world.containsAnyLiquid(this.getEntityBoundingBox());
        }

        public static void registerFixesDemon(DataFixer fixer)
        {
            EntityLiving.registerFixesMob(fixer, EntityDemon.class);
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
                this.setRevengeTarget(entityplayer);

                if (entityplayer != null)
                {
                    this.attackingPlayer = entityplayer;
                    this.recentlyHit = this.getRevengeTimer();
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

        /**
         * Causes this Demon to become angry at the supplied Entity (which will be a player).
         */
        private void becomeAngryAt(Entity p_70835_1_)
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
        }

//==============================================================================================================================================================================================\\
	//REGISTER FIXES\\
        


        
//==============================================================================================================================================================================================\\
	//ANGER\\
    
    private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final AttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new AttributeModifier(ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, 0)).setSaved(false);
    
    /** Above zero if Demon is Angry. */
    private int angerLevel;
    
    /** A random delay until Demon next makes a sound. */
    private int randomSoundDelay;
    private UUID angerTargetUUID;
    
    public void setRevengeTarget(@Nullable EntityLivingBase livingBase)
    {
        super.setRevengeTarget(livingBase);

        if (livingBase != null)
        {
            this.angerTargetUUID = livingBase.getUniqueID();
        }
    }


//==============================================================================================================================================================================================\\
	//BOSS Stuff\\
  	
    /**
     * Add the given player to the list of players tracking this entity. For instance, a player may track a boss in
     * order to view its associated boss bar.
     */
    public void addTrackingPlayer(EntityPlayerMP player)
    {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    /**
     * Removes the given player from the list of players tracking this entity. See {@link Entity#addTrackingPlayer} for
     * more information on tracking.
     */
    public void removeTrackingPlayer(EntityPlayerMP player)
    {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }

  	

  
//==============================================================================================================================================================================================\\
	//SOUNDS\\
    
	protected SoundEvent getAmbientSound()
	{
    return ModSoundEvents.DemonHowdy;
	}

	protected SoundEvent isAttacking() 
	{
		
	return ModSoundEvents.DemonLaugh;
	}

	protected SoundEvent getHurtSound()
	{
		return ModSoundEvents.DemonHurt;
	}

	protected SoundEvent getDeathSound()
	{
		return ModSoundEvents.DemonDeath;
	}

	protected SoundEvent getAngerSound()
	{
		return ModSoundEvents.DemonKOBK;
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
	
    

    
    
//==============================================================================================================================================================================================\\
	//MISC\\

	
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
	    return false;
	}
	
	/**
	 * Gives armor or weapon for entity based on given DifficultyInstance
	 */
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
	{
	    this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
	}
	
	protected ItemStack getSkullDrop()
	{
	    return ItemStack.EMPTY;
	}
	
	static class AIHurtByAggressor extends EntityAIHurtByTarget
	    {
	        public AIHurtByAggressor(EntityDemon p_i45828_1_)
	        {
	            super(p_i45828_1_, true, new Class[0]);
	        }
	
	        protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
	        {
	            super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);
	
	            if (creatureIn instanceof EntityDemon)
	            {
	                ((EntityDemon)creatureIn).becomeAngryAt(entityLivingBaseIn);
	            }
	        }
	    }
	
	static class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer>
	    {
	        public AITargetAggressor(EntityDemon p_i45829_1_)
	        {
	            super(p_i45829_1_, EntityPlayer.class, true);
	        }
	
	        /**
	         * Returns whether the EntityAIBase should begin execution.
	         */
	        public boolean shouldExecute()
	        {
	            return ((EntityDemon)this.taskOwner).isAngry() && super.shouldExecute();
	        }
	    }
	}
    
//==============================================================================================================================================================================================\\
	//Abilities\\