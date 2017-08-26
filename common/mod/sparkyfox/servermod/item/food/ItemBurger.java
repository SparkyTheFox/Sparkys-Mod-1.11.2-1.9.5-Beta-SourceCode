package mod.sparkyfox.servermod.item.food;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBurger extends ItemFood {


	public ItemBurger(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
	}
																					//Name Registry\\
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "Burger" + ServerMod.RESOURCE_PREFIX + ModNames.Burger;
		
	}
		
       																				//Crafting Recipe\\ 
		
		public void addRecipes() {

			GameRegistry.addShapedRecipe(new ItemStack(this), " b ", " s ", " b ", 'b', Items.BREAD, 's',
					new ItemStack(Items.COOKED_BEEF));
	}
}
