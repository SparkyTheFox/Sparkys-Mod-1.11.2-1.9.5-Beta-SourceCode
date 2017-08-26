package mod.sparkyfox.servermod.item.tools;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemLapisPickaxe extends ItemPickaxe {

	public ItemLapisPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "LapisPickaxe" + ServerMod.RESOURCE_PREFIX + ModNames.LapisPickaxe;
	}
	

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == ModItems.TitaniumHammer;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(this), "LLL", " S ", " S ", 'L', "dyeBlue", 'S',
				new ItemStack(Items.STICK)));
	}
		
	}
    

