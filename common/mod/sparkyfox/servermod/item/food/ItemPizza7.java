package mod.sparkyfox.servermod.item.food;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPizza7 extends ItemFood {


	public ItemPizza7(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setMaxStackSize(1);
		this.setCreativeTab(null);

	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
		
	}
	
    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(ModItems.Pizza8);
        
    }   
																					//Name Registry\\
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "Pizza7" + ServerMod.RESOURCE_PREFIX + ModNames.Pizza7;
		
	}
		
       																				//Crafting Recipe\\ 

}
