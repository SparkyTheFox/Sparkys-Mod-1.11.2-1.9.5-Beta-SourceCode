package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSMGRounds extends ItemArrow
{
    public ItemSMGRounds()
    {
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "SMGRounds" + ServerMod.RESOURCE_PREFIX + ModNames.SMGRounds;
		
	}

		

	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		return null;
		

    }

    public boolean isInfinite(ItemStack stack, ItemStack SMG, net.minecraft.entity.player.EntityPlayer player)
    {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, SMG);
        return enchant <= 0 ? false : this.getClass() == ItemSMGRounds.class;
    }



	public EntitySMGRounds createx23mmRound(World worldIn, ItemStack itemstack, EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return null;
	}
}