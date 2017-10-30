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

public class ItemPizza8 extends ItemFood {


	public ItemPizza8(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setMaxStackSize(1);
		this.setCreativeTab(null);

	}
  
																					//Name Registry\\
	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return "Pizza8" + ServerMod.RESOURCE_PREFIX + ModNames.Pizza8;
		
	}
		
       																				//Crafting Recipe\\ 
		
	}

