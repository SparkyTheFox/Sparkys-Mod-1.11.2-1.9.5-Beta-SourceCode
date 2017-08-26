package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTitaniumNugget extends Item {
	
	public ItemTitaniumNugget() {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "TitaniumNugget" + ServerMod.RESOURCE_PREFIX + ModNames.TitaniumNugget;
		
		}

															//Smelting Recipe\\ 
		
		public void addRecipes() {
			GameRegistry.addSmelting(ModItems.TitaniumPickaxe, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumAxe, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumHammer, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumShovel, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumHoe, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumSword, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumIngot, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumHelmet, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumChestplate, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumLeggings, new ItemStack(ModItems.TitaniumNugget), 0.75F);
			GameRegistry.addSmelting(ModItems.TitaniumBoots, new ItemStack(ModItems.TitaniumNugget), 0.75F);
	
															//Crafting Recipe\\
	
		
			GameRegistry.addShapelessRecipe(new ItemStack(this, 9), ModItems.TitaniumIngot); 
	}
}
/**		GameRegistry.addShapedRecipe(new ItemStack(this), "   ", " I ", " L ", 'I', Items.field_191525_da, 'L',
new ItemStack(Items.LEATHER));*/