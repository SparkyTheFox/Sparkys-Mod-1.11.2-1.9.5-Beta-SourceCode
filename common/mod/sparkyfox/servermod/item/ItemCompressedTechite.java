package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCompressedTechite extends Item {
	
	public ItemCompressedTechite() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "CompressedTechite" + ServerMod.RESOURCE_PREFIX + ModNames.CompressedTechite;
		
		}
	
															//Crafting Recipe\\
	
		public void addRecipes() {
			GameRegistry.addShapedRecipe(new ItemStack(this), "MHM", "EEE", " T ", 'M', ModItems.TitaniumHammer, 'H',
					new ItemStack (ModItems.CraftingHammer), 'E', new ItemStack (Items.EMERALD), 'T', new ItemStack (ModItems.Techite));
	}
}

