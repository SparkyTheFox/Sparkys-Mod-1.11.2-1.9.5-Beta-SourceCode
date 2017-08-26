package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemKerbalFabric extends Item {
	
	public ItemKerbalFabric() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "KerbalFabric" + ServerMod.RESOURCE_PREFIX + ModNames.KerbalFabric;
		
		}
	
															//Crafting Recipe\\

		public void addRecipes() {
			ItemStack orangeDye = new ItemStack(Items.DYE, 1, 14);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.KerbalFabric), " D ", " L ", "   ", 'D', orangeDye, 'L', new ItemStack (Items.LEATHER)); 

	}
}
/**
	dye dictionary Recipe
	=================================================================================================================================
	|	public void addRecipes() {																									|
	|	ItemStack blueDye = new ItemStack(Items.DYE, 1, 4);																			|
	|	GameRegistry.addShapedRecipe(new ItemStack(ModItems.LapisHelmet), "LLL", "L L", "LLL", 'L', blueDye); 						|
	|	{																															|
	|																																|
	|	}																															|
	=================================================================================================================================
	
	
			 */
