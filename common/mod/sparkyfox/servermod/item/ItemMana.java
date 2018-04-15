package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModWeapons;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMana extends ItemBasic {
	
	public ItemMana() {
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(64);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "Mana" + ServerMod.RESOURCE_PREFIX + ModNames.Mana;
		
		}
	
															//Crafting Recipe\\
	
		public void addRecipes() {
			GameRegistry.addSmelting(Items.EXPERIENCE_BOTTLE, new ItemStack(ModWeapons.mana), 0.75F);
	}
}
