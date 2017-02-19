package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.Entityx23mmRounds;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Itemx23mmRounds extends ItemArrow
{
    public Itemx23mmRounds()
    {
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "x23mmRoundst" + ServerMod.RESOURCE_PREFIX + ModNames.x23mmRounds;
		
	}

		

	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		return null;
		

    }

    public boolean isInfinite(ItemStack stack, ItemStack SMG, net.minecraft.entity.player.EntityPlayer player)
    {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, SMG);
        return enchant <= 0 ? false : this.getClass() == Itemx23mmRounds.class;
    }



	public Entityx23mmRounds createx23mmRound(World worldIn, ItemStack itemstack, EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return null;
	}
}