package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemNasaFabric extends Item {
	
	public ItemNasaFabric() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "NasaFabric" + ServerMod.RESOURCE_PREFIX + ModNames.NasaFabric;
		
		}
	
															//Crafting Recipe\\
	
		public void addRecipes() {
			ItemStack whiteDye = new ItemStack(Items.DYE, 1, 15);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.NasaFabric), " D ", " L ", "   ", 'D', whiteDye, 'L', new ItemStack (Items.LEATHER));
	}
}
