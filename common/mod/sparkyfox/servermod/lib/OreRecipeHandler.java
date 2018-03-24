package mod.sparkyfox.servermod.lib;


import mod.sparkyfox.servermod.Utils;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModStairs;
import mod.sparkyfox.servermod.init.ModTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * This class handles all of our mods block and item recipes
 * @author Sparky
 *
 */
public class OreRecipeHandler {
	
	/**
	 * Register the crafting reciepes
	 */
	public static void registerCraftingRecipes() {
		
		/**@Titanium*/
		registerToolRecipe(ModItems.TitaniumIngot, ModItems.TitaniumPickaxe, ModItems.TitaniumAxe, ModItems.TitaniumShovel, ModItems.TitaniumHoe, ModItems.TitaniumSword);
		registerArmourRecipe("ingotTitanium", ModItems.TitaniumHelmet, ModItems.TitaniumChestplate, ModItems.TitaniumLeggings, ModItems.TitaniumBoots);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.TitaniumBlock), new Object[] { "TTT", "TTT", "TTT", 'T', ModItems.TitaniumIngot });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TitaniumIngot, 9), new Object[] { ModBlocks.TitaniumBlock });
		GameRegistry.addRecipe(new ItemStack(ModItems.TitaniumIngot), new Object[] { "NNN", "NNN", "NNN", 'N', ModItems.TitaniumNugget });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TitaniumNugget, 9), new Object[] { ModItems.TitaniumIngot });
		
		/**@Titanium*/
		registerToolRecipe(ModItems.TitaniumIngot, ModItems.TitaniumPickaxe, ModItems.TitaniumAxe, ModItems.TitaniumShovel, ModItems.TitaniumHoe, ModItems.TitaniumSword);
		registerArmourRecipe("ingotTitanium", ModItems.TitaniumHelmet, ModItems.TitaniumChestplate, ModItems.TitaniumLeggings, ModItems.TitaniumBoots);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.TitaniumBlock), new Object[] { "TTT", "TTT", "TTT", 'T', ModItems.TitaniumIngot });		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TitaniumIngot, 9), new Object[] { ModBlocks.TitaniumBlock });
		GameRegistry.addRecipe(new ItemStack(ModItems.TitaniumIngot), new Object[] { "NNN", "NNN", "NNN", 'N', ModItems.TitaniumNugget });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TitaniumNugget, 9), new Object[] { ModItems.TitaniumIngot });
		
	    
		/**@Stairs*/
		GameRegistry.addRecipe(new ItemStack(ModStairs.StairsDiamond), new Object[] { "D  ", "DD ", "DDD", 'D', Blocks.DIAMOND_BLOCK });
		GameRegistry.addRecipe(new ItemStack(ModStairs.StairsGold), new Object[] { "G  ", "GG ", "GGG", 'G', Blocks.GOLD_BLOCK });
		GameRegistry.addRecipe(new ItemStack(ModStairs.StairsIron), new Object[] { "I  ", "II ", "III", 'I', Blocks.IRON_BLOCK });
		
		/**Titanium Tools*/
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumPickaxe, new Object[] { "III", " A ", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumAxe, new Object[] { "II ", "IA ", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumHoe, new Object[] { "II ", " A ", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumShovel, new Object[] { " I ", " A ", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumHammer, new Object[] { "III", "III", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.TitaniumSword, new Object[] { " I ", " I ", " A ", 'I', "ingotTitanium", 'A', Items.STICK }));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.CraftingHammer, new Object[] { "  I", " A ", "A  ", 'I', "ingotTitanium", 'A', Items.STICK }));

		GameRegistry.addRecipe(new ShapedOreRecipe(ModTools.AstroHammer, new Object[] { "BSB", "BS ", " S ", 'B', "NetherStar", 'S', Items.NETHER_STAR }));
		 
		
		//Uranium: Ore, Block, Ingot
		//Platinum: Ore, Block, Ingot
		//Silicon: Ore, Block, Ingot
		//Magnesium: Ore, Block, Ingot
		//Cobalt: Ore, Block, Ingot
		//Nickel: Ore, Block, Ingot
		//Brass: Ore, Block, Ingot
		
		
		
		
	//	GameRegistry.addRecipe(new ItemStack(ModItems.infinityFlame), new Object[] { "CCC", "CDC", "CCC", 'C', Blocks.COAL_BLOCK, 'D', Blocks.DIAMOND_BLOCK });
	//	GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.niceBiscuit, 4), new Object[] { "cropWheat", "cropWheat" }));
		
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chip, 1, 0), new Object[] { "TRT", "RGR", "TRT", 'T', "ingotTitanium", 'R', "dustRedstone", 'G', "dyeGreen" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chip, 1, 1), new Object[] { "TRT", "RCR", "TRT", 'T', "ingotTitanium", 'R', "dustRedstone", 'C', "chipBasic" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.machineFrame, 1, 0), new Object[] { "TRT", "TCT", "RIR", 'R', "dustRedstone", 'T', "ingotTitanium", 'C', "chipBasic", 'I', Blocks.IRON_BLOCK }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.machineFrame, 1, 1), new Object[] { "TRT", "TCT", "RIR", 'R', "dustRedstone", 'T', "ingotTitanium", 'C', "chipAdvanced", 'I', Blocks.IRON_BLOCK }));
		
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.breaker, 1, 0), new Object[] { " P ", "RMR", "TTT", 'P', Items.IRON_PICKAXE, 'R', "dustRedstone", 'M', new ItemStack(ModBlocks.machineFrame, 1, 0), 'T', "ingotTitanium" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.breaker, 1, 1), new Object[] { " P ", "RMR", "TTT", 'P', Items.IRON_PICKAXE, 'R', "dustRedstone", 'M', new ItemStack(ModBlocks.machineFrame, 1, 1), 'T', "ingotTitanium" }));
		
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TitaniumSlabHalf, 2), new Object[] { "   ", "TTT", "   ", 'T', "ingotTitanium" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TitaniumSlabHalf, 2), new Object[] { "TTT", "   ", "   ", 'T', "ingotTitanium" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TitaniumSlabHalf, 2), new Object[] { "   ", "   ", "TTT", 'T', "ingotTitanium" }));
	//	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.TitaniumStairs, 4), new Object[] { "T  ", "TT ", "TTT", 'T', "ingotTitanium" }));
		Utils.getLogger().info("Registered Crafting Recipes!");
	}
	
	/**
	 * Register the furnace recipes
	 */
	public static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(ModBlocks.TitaniumOre, new ItemStack(ModItems.TitaniumIngot), 0.7f);
		Utils.getLogger().info("Registered Furnace Recipes!");
	}
	
	/**
	 * Registers a tool using the ingot
	 * @param ingot The ingot
	 * @param pickaxe The pickaxe
	 * @param axe The axe
	 * @param shovel The shovel
	 * @param hoe The hoe
	 * @param sword The sword
	 */
	private static void registerToolRecipe(Item ingot, Item pickaxe, Item axe, Item shovel, Item hoe, Item sword) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] { "III", " S ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II ", "IS ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { " II", " SI", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { " I ", " S ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { " II", " S ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { "II ", " S ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { " I ", " I ", " S ", 'I', ingot, 'S', Items.STICK });
	}
	
	/**
	 * Registers a tool using the ingot from the {@link OreDictionary}
	 * @param ingotOD The ingot from the {@link OreDictionary}
	 * @param pickaxe The pickaxe
	 * @param axe The axe
	 * @param shovel The shovel
	 * @param hoe The hoe
	 * @param sword The sword
	 * @param stickOD The stick from the {@link OreDictionary}
	 */
	private static void registerToolRecipe(String ingotOD, Item pickaxe, Item axe, Item shovel, Item hoe, Item sword, String stickOD) {
		GameRegistry.addRecipe(new ShapedOreRecipe(pickaxe, new Object[] { "III", " S ", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(axe, new Object[] { "II ", "IS ", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(axe, new Object[] { " II", " SI", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(shovel, new Object[] { " I ", " S ", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(hoe, new Object[] { " II", " S ", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(hoe, new Object[] { "II ", " S ", " S ", 'I', ingotOD, 'S', stickOD }));
		GameRegistry.addRecipe(new ShapedOreRecipe(sword, new Object[] { " I ", " I ", " S ", 'I', ingotOD, 'S', stickOD }));
	}
	
	/**
	 * Registers armour using the ingot
	 * @param ingot The ingot
	 * @param helmet The helmet
	 * @param chestplate The chestplate
	 * @param leggings The leggings
	 * @param boots The boots
	 */
	public static void registerArmourRecipe(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots) {
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
	}
	
	/**
	 * Registers armour using the ingot from the {@link OreDictionary}
	 * @param ingotOD The ingot from the {@link OreDictionary}
	 * @param helmet The helmet
	 * @param chestplate The chestplate
	 * @param leggings The leggings
	 * @param boots The boots
	 */
	public static void registerArmourRecipe(String ingotOD, Item helmet, Item chestplate, Item leggings, Item boots) {
		GameRegistry.addRecipe(new ShapedOreRecipe(helmet, new Object[] { "III","I I","   ",'I',ingotOD}));
		GameRegistry.addRecipe(new ShapedOreRecipe(helmet, new Object[] { "   ","III","I I",'I',ingotOD}));
		GameRegistry.addRecipe(new ShapedOreRecipe(chestplate, new Object[] { "I I","III","III",'I',ingotOD}));
		GameRegistry.addRecipe(new ShapedOreRecipe(leggings, new Object[] { "III","I I","I I",'I',ingotOD}));
		GameRegistry.addRecipe(new ShapedOreRecipe(boots, new Object[] { "I I","I I","   ",'I',ingotOD}));
		GameRegistry.addRecipe(new ShapedOreRecipe(boots, new Object[] { "   ","I I","I I",'I',ingotOD}));
	}

}
