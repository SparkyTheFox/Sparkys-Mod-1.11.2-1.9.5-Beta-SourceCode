package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMagnesiumIngot extends Item {
	
	public ItemMagnesiumIngot() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "MagnesiumIngot" + ServerMod.RESOURCE_PREFIX + ModNames.MagnesiumIngot;
		
		}

															//Smelting Recipe\\ 
		
	public void addRecipes() {
		GameRegistry.addSmelting(Blocks.ANVIL, new ItemStack(ModItems.MagnesiumIngot), 0.75F);
	
															//Crafting Recipe\\
	

			GameRegistry.addShapelessRecipe(new ItemStack(this, 9), ModBlocks.MagnesiumBlock); 
	}
}
/**		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " I ", " L ", 'I', Items.field_191525_da, 'L',
new ItemStack(Items.LEATHER));*/