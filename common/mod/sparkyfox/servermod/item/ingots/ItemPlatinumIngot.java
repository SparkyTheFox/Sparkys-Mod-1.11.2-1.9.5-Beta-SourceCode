package mod.sparkyfox.servermod.item.ingots;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPlatinumIngot extends Item {
	
	public ItemPlatinumIngot() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "PlatinumIngot" + ServerMod.RESOURCE_PREFIX + ModNames.PlatinumIngot;
		
	}
															//Crafting Recipe\\
	
			public void addRecipes() {
			GameRegistry.addShapelessRecipe(new ItemStack(this, 9), ModBlocks.PlatinumBlock); 
	}
}
