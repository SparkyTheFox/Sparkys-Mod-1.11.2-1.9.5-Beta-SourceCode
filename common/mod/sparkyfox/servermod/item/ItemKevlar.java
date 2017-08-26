package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemKevlar extends Item {
	
	public ItemKevlar() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "Kevlar" + ServerMod.RESOURCE_PREFIX + ModNames.Kevlar;
		
		}
		
															//Crafting Recipe\\ 
		
	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this), Items.field_191525_da, 
				new ItemStack(Items.LEATHER));
	}
		
	}

/**		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " I ", " L ", 'I', Items.field_191525_da, 'L',
new ItemStack(Items.LEATHER));*/