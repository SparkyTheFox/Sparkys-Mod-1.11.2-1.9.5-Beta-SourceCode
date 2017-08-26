package mod.sparkyfox.servermod.item.tools;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "EmeraldPickaxe" + ServerMod.RESOURCE_PREFIX + ModNames.EmeraldPickaxe;
	}
	

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == Items.EMERALD;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), "EEE", " S ", " S ", 'S', Items.STICK, 'E',
				new ItemStack(Items.EMERALD));
	}
		
	}
    

