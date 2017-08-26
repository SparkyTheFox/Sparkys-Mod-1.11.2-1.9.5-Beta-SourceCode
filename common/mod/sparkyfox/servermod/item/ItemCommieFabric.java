package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCommieFabric extends Item {
	
	public ItemCommieFabric() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "CommieFabric" + ServerMod.RESOURCE_PREFIX + ModNames.CommieFabric;
		
		}
	
															//Crafting Recipe\\

		public void addRecipes() {
			ItemStack grayDye = new ItemStack(Items.DYE, 1, 8);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.CommieFabric), " D ", " L ", "   ", 'D', grayDye, 'L', new ItemStack (Items.LEATHER));
	}
}
