package mod.sparkyfox.servermod.item.tools;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTitaniumShovel extends ItemSpade {

	public ItemTitaniumShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "TitaniumShovel" + ServerMod.RESOURCE_PREFIX + ModNames.TitaniumShovel;
	}
	

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == ModItems.TitaniumIngot;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), " T ", " S ", " S ", 'T', ModItems.TitaniumIngot, 'S',
				new ItemStack(Items.STICK));
	}
		
	}
    

