package mod.sparkyfox.servermod.item.guns;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSMGBulletCasing extends Item {
	
	public ItemSMGBulletCasing() {
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(63);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "SMGBulletCasing" + ServerMod.RESOURCE_PREFIX + ModNames.SMGBulletCasing;
		
		}
		
															//Crafting Recipe\\ 
		
	public void addRecipes() {
	GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " B ", " B ", 'B', ModItems.BrassIngot);
	
	
	}
}
	
/**		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " I ", " L ", 'I', Items.field_191525_da, 'L',
new ItemStack(Items.LEATHER));*/

//GameRegistry.addShapelessRecipe(new ItemStack(this), Items.field_191525_da, 
//new ItemStack(Items.LEATHER));