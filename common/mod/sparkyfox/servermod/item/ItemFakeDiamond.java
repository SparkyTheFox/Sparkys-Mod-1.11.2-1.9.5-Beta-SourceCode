package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFakeDiamond extends Item {
	
	public ItemFakeDiamond() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "FakeDiamond" + ServerMod.RESOURCE_PREFIX + ModNames.FakeDiamond;
		
		}
	

}
