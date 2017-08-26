package mod.sparkyfox.servermod.item.tools;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTitaniumPickaxe extends ItemPickaxe {

	public ItemTitaniumPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "TitaniumPickaxe" + ServerMod.RESOURCE_PREFIX + ModNames.TitaniumPickaxe;
	}
	

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == ModItems.TitaniumIngot;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), "TTT", " S ", " S ", 'T', ModItems.TitaniumIngot, 'S',
				new ItemStack(Items.STICK));
	}
		
	}
    

