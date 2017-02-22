package mod.sparkyfox.servermod.entity;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntitySMGRounds extends EntityArrow {

    private EnumParticleTypes particle;

    public EntitySMGRounds(World worldIn) {
        super(worldIn);
    }

    public EntitySMGRounds(World worldIn, EntityLivingBase shooter) {
        super(worldIn, shooter);
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

    }

}