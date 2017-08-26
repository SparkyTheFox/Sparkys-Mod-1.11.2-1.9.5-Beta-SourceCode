package mod.sparkyfox.servermod.item.tools;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemEmeraldShovel extends ItemSpade {

	public ItemEmeraldShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.TOOLS);
    }
    
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "EmeraldShovel" + ServerMod.RESOURCE_PREFIX + ModNames.EmeraldShovel;
	}
	

																								//Anvil Repair\\


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		return repair.getItem() == Items.EMERALD;
	}

																							//Crafting Recipe//


	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), " E ", " S ", " S ", 'S', Items.STICK, 'E',
				new ItemStack(Items.EMERALD));
	}
		
	}
    

