package mod.sparkyfox.servermod.entity;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.MobEffects;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFriendlynessPellet extends EntityFireball {
	private static final DataParameter<Boolean> INVULNERABLE = EntityDataManager.<Boolean>createKey(EntityFriendlynessPellet.class, DataSerializers.BOOLEAN);

	public EntityFriendlynessPellet(World worldIn) {
		super(worldIn);
		this.setSize(0.3125F, 0.3125F);
	}

	public EntityFriendlynessPellet(World worldIn, EntityLivingBase shooter, double accelX, double accelY,
			double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
		this.setSize(0.3125F, 0.3125F);
	}

	public static void registerFixesFriendlynessPellet(DataFixer fixer) {
		EntityFireball.registerFixesFireball(fixer, "FriendlynessPellet");//fireball?
	}

	/**
	 * Return the motion factor for this projectile. The factor is multiplied by
	 * the original motion.
	 */
	protected float getMotionFactor() {
		return this.isInvulnerable() ? 0.73F : super.getMotionFactor();
	}

	@SideOnly(Side.CLIENT)
	public EntityFriendlynessPellet(World worldIn, double x, double y, double z, double accelX, double accelY,
			double accelZ) {
		super(worldIn, x, y, z, accelX, accelY, accelZ);
		this.setSize(0.3125F, 0.3125F);
	}

	/**
	 * Returns true if the entity is on fire. Used by render to add the fire
	 * effect on rendering.
	 */
	public boolean isBurning() {
		return false;
	}

	/**
	 * Explosion resistance of a block relative to this entity
	 */
	public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {
		float f = super.getExplosionResistance(explosionIn, worldIn, pos, blockStateIn);
		Block block = blockStateIn.getBlock();

		if (this.isInvulnerable() && block.canEntityDestroy(blockStateIn, worldIn, pos, this)) {
			f = Math.min(0.8F, f);
		}

		return f;
	}

	/**
	 * Called when this EntityFireball hits a block or entity.
	 */
	protected void onImpact(RayTraceResult result) {
		if (!this.world.isRemote) {
			if (result.entityHit != null) {
				if (this.shootingEntity != null) {
					if (result.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.shootingEntity), 8.0F)) {//here
						if (result.entityHit.isEntityAlive()) {
							this.applyEnchantments(this.shootingEntity, result.entityHit);
						} else {
							this.shootingEntity.heal(100.0F);//here
						}
					}
				} else {
					result.entityHit.attackEntityFrom(DamageSource.MAGIC, 5.0F);
				}

				if (result.entityHit instanceof EntityLivingBase) {
					int i = 0;

					if (this.world.getDifficulty() == EnumDifficulty.NORMAL) {
						i = 10;
					} else if (this.world.getDifficulty() == EnumDifficulty.HARD) {
						i = 40;
					}

					if (i > 3) {//0
						((EntityLivingBase) result.entityHit)
								.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80 * i, 3));//here
						//addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80(40 seconds) * i, 3(slowness IV)
					}
				}
			}

			this.world.newExplosion(this, this.posX, this.posY, this.posZ, 3.0F, false,//here
					this.world.getGameRules().getBoolean("mobGriefing"));
			this.setDead();
		}
	}

	/**
	 * Returns true if other Entities should be prevented from moving through
	 * this Entity.
	 */
	public boolean canBeCollidedWith() {
		return false;
	}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return false;
	}

	protected void entityInit() {
		this.dataManager.register(INVULNERABLE, Boolean.valueOf(false));
	}

	/**
	 * Return whether this FriendlynessPellet comes from an invulnerable (aura)
	 * wither boss.
	 */
	public boolean isInvulnerable() {
		return ((Boolean) this.dataManager.get(INVULNERABLE)).booleanValue();
	}

	/**
	 * Set whether this FriendlynessPellet comes from an invulnerable (aura)
	 * wither boss.
	 */
	public void setInvulnerable(boolean invulnerable) {
		this.dataManager.set(INVULNERABLE, Boolean.valueOf(invulnerable));
	}

	protected boolean isFireballFiery() {
		return false;
	}
}