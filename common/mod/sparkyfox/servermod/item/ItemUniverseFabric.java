package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUniverseFabric extends Item {
	
	public ItemUniverseFabric() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "UniverseFabric" + ServerMod.RESOURCE_PREFIX + ModNames.UniverseFabric;
		
		}
	
															//Crafting Recipe\\

		public void addRecipes() {
			ItemStack cyanDye = new ItemStack(Items.DYE, 1, 6);
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.UniverseFabric), " D ", " L ", "   ", 'D', cyanDye, 'L', new ItemStack (Items.LEATHER));
	}
}
