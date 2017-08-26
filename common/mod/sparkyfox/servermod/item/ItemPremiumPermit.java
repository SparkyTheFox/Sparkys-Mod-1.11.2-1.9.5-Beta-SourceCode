package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPremiumPermit extends Item {
	
	public ItemPremiumPermit() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(1);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "PremiumPermit" + ServerMod.RESOURCE_PREFIX + ModNames.PremiumPermit;
		
		}			
	
															//Crafting Recipe\\
	
		//public void addRecipes() {
			//GameRegistry.addShapedRecipe(new ItemStack(this), "PPP", "EDG", "PPP", 'P', Items.PAPER, 'E',
					//new ItemStack (Blocks.EMERALD_BLOCK), 'D', new ItemStack (Blocks.DIAMOND_BLOCK), 'G', new ItemStack (Blocks.GOLD_BLOCK));
	}
//}
