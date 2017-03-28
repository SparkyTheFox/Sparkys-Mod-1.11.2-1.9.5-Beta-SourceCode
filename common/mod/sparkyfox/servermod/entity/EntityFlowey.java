/**
package mod.sparkyfox.servermod.entity;

import java.util.UUID;

import com.google.common.base.Predicate;

import mod.sparkyfox.servermod.init.ModSoundEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.storage.loot.LootTableList;


public class EntityFlowey extends EntityMob implements IRangedAttackMob {
	
public class AIDoNothing extends EntityAIBase {

	@Override
	public boolean shouldExecute() {
		// TODO Auto-generated method stub
		return EntityFlowey.this.getInvulTime() > 0;
	}
	
	}

	//==============================================================================================================================================================================================\\
		//STUFF\\
	private static final DataParameter<Integer> FIRST_HEAD_TARGET = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
    private static final DataParameter<Integer>[] HEAD_TARGETS = new DataParameter[] {FIRST_HEAD_TARGET};
    private static final DataParameter<Integer> INVULNERABILITY_TIME = EntityDataManager.<Integer>createKey(EntityFlowey.class, DataSerializers.VARINT);
    private static final UUID ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final AttributeModifier ATTACK_SPEED_BOOST_MODIFIER = (new AttributeModifier(ATTACK_SPEED_BOOST_MODIFIER_UUID, "Attacking speed boost", 0.05D, 0)).setSaved(false);
    private final float[] xRotationHeads = new float[2];
    private final float[] yRotationHeads = new float[2];
    private final float[] xRotOHeads = new float[2];
    private final float[] yRotOHeads = new float[2];
    private final int[] nextHeadUpdate = new int[2];
    private final int[] idleHeadUpdates = new int[2];
    
     Above zero if this PigZombie is Angry. 
    private int angerLevel;
     A random delay until this PigZombie next makes a sound. 
    private int randomSoundDelay;
    private UUID angerTargetUUID;
    
     Time before the Flowey tries to break blocks 
    private int blockBreakCounter;
    private final BossInfoServer bossInfo = (BossInfoServer)(new BossInfoServer(this.getDisplayName(), BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS)).setDarkenSky(true);
    private static final Predicate<Entity> NOT_UNDEAD = new Predicate<Entity>()
    {
        public boolean apply(@Nullable Entity p_apply_1_)
        {
            return p_apply_1_ instanceof EntityLivingBase && ((EntityLivingBase)p_apply_1_).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && ((EntityLivingBase)p_apply_1_).attackable();
        }
    };
    

    
//==============================================================================================================================================================================================\\
	//AGGRESION\\
	
        
        

//==============================================================================================================================================================================================\\
	//AI and Tasks\\

    
    //World\\
	public EntityFlowey(World worldIn) {
		super(worldIn);
		 this.isImmuneToFire = true;
	        this.setHealth(this.getMaxHealth());
	        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
	        this.experienceValue = 5000;

    }
   
	//InitAI\\
     protected void initEntityAI()
    {
         
         this.tasks.addTask(0, new EntityFlowey.AIDoNothing());
         this.tasks.addTask(1, new EntityAISwimming(this));
         this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
         this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, false, NOT_UNDEAD));
         this.tasks.addTask(2, new EntityAIAttackRanged(this, 1.0D, 40, 20.0F));
         this.tasks.addTask(3, new EntityAIWanderAvoidWater(this, 1.0D));
         this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
         this.tasks.addTask(5, new EntityAILookIdle(this));
         this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
         this.tasks.addTask(6, new EntityAILookIdle(this));
    }
     
     //EntityInit\\
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(FIRST_HEAD_TARGET, Integer.valueOf(0));
        this.dataManager.register(INVULNERABILITY_TIME, Integer.valueOf(0));

    }
        //ApplyAI\\
        protected void applyEntityAI()
    {
       // this.targetTasks.addTask(1, new EntityFlowey.AIHurtByAggressor(this));
        //this.targetTasks.addTask(2, new EntityFlowey.AITargetAggressor(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(900.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }
//==============================================================================================================================================================================================\\
        
    	//REGISTER FIXES\\
        
        public static void registerFixesFlowey(DataFixer fixer)
        {
            EntityLiving.registerFixesMob(fixer, EntityFlowey.class);
        }

  
        public void writeEntityToNBT(NBTTagCompound compound)
        {
            super.writeEntityToNBT(compound);
            compound.setInteger("Invul", this.getInvulTime());
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

    
        public void readEntityFromNBT(NBTTagCompound compound)
        {
            super.readEntityFromNBT(compound);
            this.setInvulTime(compound.getInteger("Invul"));

            if (this.hasCustomName())
            {
                this.bossInfo.setName(this.getDisplayName());
            }
        }

  
        public void setCustomNameTag(String name)
        {
            super.setCustomNameTag(name);
            this.bossInfo.setName(this.getDisplayName());
        }

        
//==============================================================================================================================================================================================\\
	//ANGER\\
   

//==============================================================================================================================================================================================\\
  	//BOSS Stuff\\
  	
  	

  
//==============================================================================================================================================================================================\\
	//SOUNDS\\
    
    protected SoundEvent getAmbientSound()
    {
        return this.isAngry() ? ModSoundEvents.FloweyLaugh : this.isAttacking() ? ModSoundEvents.FloweyKOBK : ModSoundEvents.FloweyHowdy;
    }
    
    public boolean isAngry() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAttacking() {
		// TODO Auto-generated method stub
		return false;
	}

	protected SoundEvent getHurtSound()
    {
        return ModSoundEvents.FloweyHurt;
    }

   	protected SoundEvent getDeathSound()
    {
      return ModSoundEvents.FloweyDeath;
    }
    
  	protected SoundEvent getAngerSound()
    {
      return ModSoundEvents.FloweyKOBK;
    }
    
 
    protected float getSoundVolume()
    {
        return 10.0F;
    }
	

//==============================================================================================================================================================================================\\
	//ATTACK\\
	
    private void launchFriendlynessPelletToEntity(int p_82216_1_, EntityLivingBase p_82216_2_)
    {
        this.launchFriendlynessPelletToCoords(p_82216_1_, p_82216_2_.posX, p_82216_2_.posY + (double)p_82216_2_.getEyeHeight() * 0.5D, p_82216_2_.posZ, p_82216_1_ == 0 && this.rand.nextFloat() < 0.001F);
    }

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


    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor)
    {
        this.launchFriendlynessPelletToEntity(0, target);
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isEntityInvulnerable(source))
        {
            return false;
        }
        else if (source != DamageSource.DROWN && !(source.getEntity() instanceof EntityFlowey))
        {
            if (this.getInvulTime() > 0 && source != DamageSource.OUT_OF_WORLD)
            {
                return false;
            }
            else
            {
                if (this.isArmored())
                {
                    Entity entity = source.getSourceOfDamage();

                    if (entity instanceof EntityArrow)
                    {
                        return false;
                    }
                }

                Entity entity1 = source.getEntity();

                if (entity1 != null && !(entity1 instanceof EntityPlayer) && entity1 instanceof 
                		EntityLivingBase && ((EntityLivingBase)entity1).getCreatureAttribute() == this.getCreatureAttribute())
                {
                    return false;
                }
                else
                {
                    if (this.blockBreakCounter <= 0)
                    {
                        this.blockBreakCounter = 20;
                    }

                    for (int i = 0; i < this.idleHeadUpdates.length; ++i)
                    {
                        this.idleHeadUpdates[i] += 3;
                    }

                    return super.attackEntityFrom(source, amount);
                }
            }
        }
        else
        {
            return false;
        }
    }
    

    
    
//==============================================================================================================================================================================================\\
    //MISC\\
    
     public void onLivingUpdate()
    {
    this.motionY *= 0.6000000238418579D;

        if (!this.world.isRemote && this.getWatchedTargetId(0) > 0)
        {
            Entity entity = this.world.getEntityByID(this.getWatchedTargetId(0));

            if (entity != null)
            {
                if (this.posY < entity.posY || !this.isArmored() && this.posY < entity.posY + 5.0D)
                {
                    if (this.motionY < 0.0D)
                    {
                        this.motionY = 0.0D;
                    }

                    this.motionY += (0.5D - this.motionY) * 0.6000000238418579D;
                }

                double d0 = entity.posX - this.posX;
                double d1 = entity.posZ - this.posZ;
                double d3 = d0 * d0 + d1 * d1;

                if (d3 > 9.0D)
                {
                    double d5 = (double)MathHelper.sqrt(d3);
                    this.motionX += (d0 / d5 * 0.5D - this.motionX) * 0.6000000238418579D;
                    this.motionZ += (d1 / d5 * 0.5D - this.motionZ) * 0.6000000238418579D;
                }
            }
        }

        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 0.05000000074505806D)
        {
            this.rotationYaw = (float)MathHelper.atan2(this.motionZ, this.motionX) * (180F / (float)Math.PI) - 90.0F;
        }

        super.onLivingUpdate();

        for (int i = 0; i < 2; ++i)
        {
            this.yRotOHeads[i] = this.yRotationHeads[i];
            this.xRotOHeads[i] = this.xRotationHeads[i];
        }

        for (int j = 0; j < 2; ++j)
        {
            int k = this.getWatchedTargetId(j + 1);
            Entity entity1 = null;

            if (k > 0)
            {
                entity1 = this.world.getEntityByID(k);
            }

            if (entity1 != null)
            {
                double d11 = this.getHeadX(j + 1);
                double d12 = this.getHeadY(j + 1);
                double d13 = this.getHeadZ(j + 1);
                double d6 = entity1.posX - d11;
                double d7 = entity1.posY + (double)entity1.getEyeHeight() - d12;
                double d8 = entity1.posZ - d13;
                double d9 = (double)MathHelper.sqrt(d6 * d6 + d8 * d8);
                float f = (float)(MathHelper.atan2(d8, d6) * (180D / Math.PI)) - 90.0F;
                float f1 = (float)(-(MathHelper.atan2(d7, d9) * (180D / Math.PI)));
                this.xRotationHeads[j] = this.rotlerp(this.xRotationHeads[j], f1, 40.0F);
                this.yRotationHeads[j] = this.rotlerp(this.yRotationHeads[j], f, 10.0F);
            }
            else
            {
                this.yRotationHeads[j] = this.rotlerp(this.yRotationHeads[j], this.renderYawOffset, 10.0F);
            }
        }

        boolean flag = this.isArmored();

        for (int l = 0; l < 3; ++l)
        {
            double d10 = this.getHeadX(l);
            double d2 = this.getHeadY(l);
            double d4 = this.getHeadZ(l);
            this.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d10 + this.rand.nextGaussian() * 0.30000001192092896D, d2 + this.rand.nextGaussian() * 0.30000001192092896D, d4 + this.rand.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D, new int[0]);

            if (flag && this.world.rand.nextInt(4) == 0)
            {
                this.world.spawnParticle(EnumParticleTypes.SPELL_MOB, d10 + this.rand.nextGaussian() * 0.30000001192092896D, d2 + this.rand.nextGaussian() * 0.30000001192092896D, d4 + this.rand.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D, new int[0]);
            }
        }

        if (this.getInvulTime() > 0)
        {
            for (int i1 = 0; i1 < 3; ++i1)
            {
                this.world.spawnParticle(EnumParticleTypes.SPELL_MOB, this.posX + this.rand.nextGaussian(), this.posY + (double)(this.rand.nextFloat() * 3.3F), this.posZ + this.rand.nextGaussian(), 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D, new int[0]);
            }
        }
    }

    private int getWatchedTargetId(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	protected void updateAITasks()
    {
        if (this.getInvulTime() > 0)
        {
            int j1 = this.getInvulTime() - 1;

            if (j1 <= 0)
            {
                this.world.newExplosion(this, this.posX, this.posY + (double)this.getEyeHeight(), this.posZ, 7.0F, false, this.world.getGameRules().getBoolean("mobGriefing"));
                this.world.playBroadcastSound(1023, new BlockPos(this), 0);
            }

            this.setInvulTime(j1);

            if (this.ticksExisted % 10 == 0)
            {
                this.heal(10.0F);
            }
        }
        else
        {
            super.updateAITasks();

            for (int i = 1; i < 3; ++i)
            {
                if (this.ticksExisted >= this.nextHeadUpdate[i - 1])
                {
                    this.nextHeadUpdate[i - 1] = this.ticksExisted + 10 + this.rand.nextInt(10);

                    if (this.world.getDifficulty() == EnumDifficulty.NORMAL || this.world.getDifficulty() == EnumDifficulty.HARD)
                    {
                        int j3 = i - 1;
                        int k3 = this.idleHeadUpdates[i - 1];
                        this.idleHeadUpdates[j3] = this.idleHeadUpdates[i - 1] + 1;

                        if (k3 > 15)
                        {
                            float f = 10.0F;
                            float f1 = 5.0F;
                            double d0 = MathHelper.nextDouble(this.rand, this.posX - 10.0D, this.posX + 10.0D);
                            double d1 = MathHelper.nextDouble(this.rand, this.posY - 5.0D, this.posY + 5.0D);
                            double d2 = MathHelper.nextDouble(this.rand, this.posZ - 10.0D, this.posZ + 10.0D);
                            //this.launchWitherSkullToCoords(i + 1, d0, d1, d2, true);
                            this.idleHeadUpdates[i - 1] = 0;
                        }
                    }

                    int k1 = this.getWatchedTargetId(i);

                    if (k1 > 0)
                    {
                        Entity entity = this.world.getEntityByID(k1);

                        if (entity != null && entity.isEntityAlive() && this.getDistanceSqToEntity(entity) <= 900.0D && this.canEntityBeSeen(entity))
                        {
                            if (entity instanceof EntityPlayer && ((EntityPlayer)entity).capabilities.disableDamage)
                            {
                                this.updateWatchedTargetId(i, 0);
                            }
                            else
                            {
                                //this.launchWitherSkullToEntity(i + 1, (EntityLivingBase)entity);
                                this.nextHeadUpdate[i - 1] = this.ticksExisted + 40 + this.rand.nextInt(20);
                                this.idleHeadUpdates[i - 1] = 0;
                            }
                        }
                        else
                        {
                            this.updateWatchedTargetId(i, 0);
                        }
                    }
                    else
                    {
                        List<EntityLivingBase> list = this.world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand(20.0D, 8.0D, 20.0D), Predicates.<EntityLivingBase>and(NOT_UNDEAD, EntitySelectors.NOT_SPECTATING));

                        for (int j2 = 0; j2 < 10 && !list.isEmpty(); ++j2)
                        {
                            EntityLivingBase entitylivingbase = (EntityLivingBase)list.get(this.rand.nextInt(list.size()));

                            if (entitylivingbase != this && entitylivingbase.isEntityAlive() && this.canEntityBeSeen(entitylivingbase))
                            {
                                if (entitylivingbase instanceof EntityPlayer)
                                {
                                    if (!((EntityPlayer)entitylivingbase).capabilities.disableDamage)
                                    {
                                        this.updateWatchedTargetId(i, entitylivingbase.getEntityId());
                                    }
                                }
                                else
                                {
                                    this.updateWatchedTargetId(i, entitylivingbase.getEntityId());
                                }

                                break;
                            }

                            list.remove(entitylivingbase);
                        }
                    }
                }
            }

            if (this.getAttackTarget() != null)
            {
                this.updateWatchedTargetId(0, this.getAttackTarget().getEntityId());
            }
            else
            {
                this.updateWatchedTargetId(0, 0);
            }

            if (this.blockBreakCounter > 0)
            {
                --this.blockBreakCounter;

                if (this.blockBreakCounter == 0 && this.world.getGameRules().getBoolean("mobGriefing"))
                {
                    int i1 = MathHelper.floor(this.posY);
                    int l1 = MathHelper.floor(this.posX);
                    int i2 = MathHelper.floor(this.posZ);
                    boolean flag = false;

                    for (int k2 = -1; k2 <= 1; ++k2)
                    {
                        for (int l2 = -1; l2 <= 1; ++l2)
                        {
                            for (int j = 0; j <= 3; ++j)
                            {
                                int i3 = l1 + k2;
                                int k = i1 + j;
                                int l = i2 + l2;
                                BlockPos blockpos = new BlockPos(i3, k, l);
                                IBlockState iblockstate = this.world.getBlockState(blockpos);
                                Block block = iblockstate.getBlock();

                                if (!block.isAir(iblockstate, this.world, blockpos) && block.canEntityDestroy(iblockstate, world, blockpos, this))
                                {
                                    flag = this.world.destroyBlock(blockpos, true) || flag;
                                }
                            }
                        }
                    }

                    if (flag)
                    {
                        this.world.playEvent((EntityPlayer)null, 1022, new BlockPos(this), 0);
                    }
                }
            }

            if (this.ticksExisted % 20 == 0)
            {
                this.heal(1.0F);
            }

            this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
        }
    }
  
    private void updateWatchedTargetId(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private boolean isArmored() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean canDestroyBlock(Block blockIn)
    {
        return blockIn != Blocks.BEDROCK && blockIn != Blocks.END_PORTAL && blockIn != Blocks.END_PORTAL_FRAME && blockIn != Blocks.COMMAND_BLOCK && blockIn != Blocks.REPEATING_COMMAND_BLOCK && blockIn != Blocks.CHAIN_COMMAND_BLOCK && blockIn != Blocks.BARRIER && blockIn != Blocks.STRUCTURE_BLOCK && blockIn != Blocks.STRUCTURE_VOID;
    }


    public void ignite()
    {
        this.setInvulTime(220);
        this.setHealth(this.getMaxHealth() / 300.0F);
    }


    public void setInWeb()
    {
    }


    public void addTrackingPlayer(EntityPlayerMP player)
    {
        super.addTrackingPlayer(player);
        this.bossInfo.addPlayer(player);
    }


    public void removeTrackingPlayer(EntityPlayerMP player)
    {
        super.removeTrackingPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    private double getHeadX(int p_82214_1_)
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

   
   
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier)
    {
        EntityItem entityitem = this.dropItem(Items.NETHER_STAR, 6);

        if (entityitem != null)
        {
            entityitem.setNoDespawn();
        }

        if (!this.world.isRemote)
        {
            for (EntityPlayer entityplayer : this.world.getEntitiesWithinAABB(EntityPlayer.class, this.getEntityBoundingBox().expand(50.0D, 100.0D, 50.0D)))
            {
                entityplayer.addStat(AchievementList.KILL_WITHER);
            }
        }
    }

 
    protected void despawnEntity()
    {
        this.entityAge = 0;
    }

    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float partialTicks)
    {
        return 15728880;
    }

    public void fall(float distance, float damageMultiplier)
    {
    }

  
    public void addPotionEffect(PotionEffect potioneffectIn)
    {
    }
    
//==============================================================================================================================================================================================\\
    //Abilities\\
    
    
     public int getInvulTime()
    {
        return ((Integer)this.dataManager.get(INVULNERABILITY_TIME)).intValue();
    }

    public void setInvulTime(int time)
    {
        this.dataManager.set(INVULNERABILITY_TIME, Integer.valueOf(time));
    }
    }
    */
    