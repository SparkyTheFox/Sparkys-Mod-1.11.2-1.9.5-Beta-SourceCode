package mod.sparkyfox.servermod.item.food;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFries extends ItemFood {

	
	public ItemFries(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setMaxStackSize(16);

	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
	}
	
																				//Name Registry\\
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "Fries" + ServerMod.RESOURCE_PREFIX + ModNames.Fries;

	}
	
																				//Crafting Recipe\\
	
	public void addRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(this), "pcp", "pcp", " p ", 'p', Items.PAPER, 'c',
				new ItemStack(Items.POTATO));

	}

}
