package mod.sparkyfox.servermod.item.guns;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSMGBullet extends Item {
	
	public ItemSMGBullet() {
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(63);
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "SMGBullet" + ServerMod.RESOURCE_PREFIX + ModNames.SMGBullet;
		
		}
		
															//Crafting Recipe\\ 
		
	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), " I ", " S ", 'I', Items.field_191525_da, 'S',
				new ItemStack(ModItems.SMGBulletCasing));
	}
		
}
/**		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " I ", " L ", 'I', Items.field_191525_da, 'L',
new ItemStack(Items.LEATHER));*/