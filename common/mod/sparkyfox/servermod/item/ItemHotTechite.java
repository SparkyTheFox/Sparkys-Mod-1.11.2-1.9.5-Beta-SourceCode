package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHotTechite extends Item {
	
	public ItemHotTechite() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "HotTechite" + ServerMod.RESOURCE_PREFIX + ModNames.HotTechite;
		
		}
	
															//Crafting Recipe\\
	
		public void addRecipes() {
			GameRegistry.addSmelting(ModItems.Techite, new ItemStack(ModItems.HotTechite), 0.75F);
		}
			//GameRegistry.addShapedRecipe(new ItemStack(this), "PPP", "EDG", "PPP", 'P', Items.PAPER, 'E',
				//	new ItemStack (Blocks.EMERALD_BLOCK), 'D', new ItemStack (Blocks.DIAMOND_BLOCK), 'G', new ItemStack (Blocks.GOLD_BLOCK));
	}
//}
