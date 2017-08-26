package mod.sparkyfox.servermod.item.ingots;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBrassIngot extends Item {
	
	public ItemBrassIngot() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "BrassIngot" + ServerMod.RESOURCE_PREFIX + ModNames.BrassIngot;
		
		}
	
															//Crafting Recipe\\
	
			public void addRecipes() {
			GameRegistry.addShapelessRecipe(new ItemStack(this, 9), ModBlocks.BrassBlock); 
	}
}
