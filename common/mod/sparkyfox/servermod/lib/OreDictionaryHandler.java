package mod.sparkyfox.servermod.lib;

import java.util.HashMap;
import java.util.Map;

import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModStairs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		
//===========================================================================================================================================================================================\\
																								//Material\\
		 
		/**Titanium*/
	//	OreDictionary.registerOre("Titanium", ModItems.TitaniumIngot);
    //	OreDictionary.registerOre("Titanium", ModItems.TitaniumNugget);
	//	OreDictionary.registerOre("Titanium", ModBlocks.TitaniumBlock);
	//	OreDictionary.registerOre("Titanium", ModBlocks.TitaniumOre);

		
		
		/**Cobalt*/
	//	OreDictionary.registerOre("Cobalt", ModItems.CobaltIngot);
	//	OreDictionary.registerOre("Cobalt", ModBlocks.CobaltBlock);
	//	OreDictionary.registerOre("Cobalt", ModBlocks.CobaltOre);
		
		
		

		/**Silicon*/
	//	OreDictionary.registerOre("Silicon", ModItems.SiliconIngot);
	//	OreDictionary.registerOre("Silicon", ModBlocks.SiliconBlock);
	//	OreDictionary.registerOre("Silicon", ModBlocks.SiliconOre);
		
		
		
		
		
		/**Nickel*/
	//	OreDictionary.registerOre("nickel", ModItems.NickelIngot);
	//	OreDictionary.registerOre("nickel", ModBlocks.NickelBlock);
	//	OreDictionary.registerOre("nickel", ModBlocks.NickelOre);
		
	//	OreDictionary.registerOre("Nickel", ModItems.NickelIngot);
	//	OreDictionary.registerOre("Nickel", ModBlocks.NickelBlock);
	//	OreDictionary.registerOre("Nickel", ModBlocks.NickelOre);
		
		
		//integrate(TinkerFluids.nickel, "Nickel").toolforge();
		//integrate(ModItems.NickelIngot, "Nickel").toolforge();
		
		
		
		/**Brass*/
	//	OreDictionary.registerOre("Alubrass", ModItems.BrassIngot);
	//	OreDictionary.registerOre("Alubrass", ModBlocks.BrassBlock);
	//	OreDictionary.registerOre("Alubrass", ModBlocks.BrassOre);
		
		
//===========================================================================================================================================================================================\\
																								//Ingots\\
		
		OreDictionary.registerOre("ingotTitanium", ModItems.TitaniumIngot);
		OreDictionary.registerOre("ingotCobalt", ModItems.CobaltIngot);
		OreDictionary.registerOre("ingotSilicon", ModItems.SiliconIngot);
		OreDictionary.registerOre("ingotNickel", ModItems.NickelIngot);
		OreDictionary.registerOre("ingotAlubrass", ModItems.BrassIngot);
		OreDictionary.registerOre("ingotBrass", ModItems.BrassIngot);
		//Object titaniumIngot = ConfigManagerCore.recipesRequireGCAdvancedMetals ? new ItemStack(AsteroidsItems.basicItem, 1, 0) : "ingotTitanium";
		//CompressorRecipes.addShapelessRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), titaniumIngot, titaniumIngot);
		
//===========================================================================================================================================================================================\\
																								//Blocks\\
		
		OreDictionary.registerOre("blockTitanium", ModBlocks.TitaniumBlock);
		OreDictionary.registerOre("blockCobalt", ModBlocks.CobaltBlock);
		OreDictionary.registerOre("blockSilicon", ModBlocks.SiliconBlock);
		OreDictionary.registerOre("blockNickel", ModBlocks.NickelBlock);
		OreDictionary.registerOre("blockAlubrass", ModBlocks.BrassBlock);
		OreDictionary.registerOre("blockBrass", ModBlocks.BrassBlock);
		
		OreDictionary.registerOre("blockDiamond", ModStairs.StairsDiamond);
		OreDictionary.registerOre("blockGold", ModStairs.StairsGold);
		OreDictionary.registerOre("blockIron", ModStairs.StairsIron);
		
//===========================================================================================================================================================================================\\
																								//Ores\\
		
		OreDictionary.registerOre("oreTitanium", ModBlocks.TitaniumOre);
		OreDictionary.registerOre("oreIlmenite", ModBlocks.TitaniumOre);
		OreDictionary.registerOre("oreCobalt", ModBlocks.CobaltOre);
		OreDictionary.registerOre("oreSilicon", ModBlocks.SiliconOre);
		OreDictionary.registerOre("oreNickel", ModBlocks.NickelOre);
		OreDictionary.registerOre("oreAlubrass", ModBlocks.BrassOre);
		OreDictionary.registerOre("oreBrass", ModBlocks.BrassOre);
		
		
//===========================================================================================================================================================================================\\
																								//Nuggets\\
		
		OreDictionary.registerOre("nuggetTitanium", ModItems.TitaniumNugget);
		
//===========================================================================================================================================================================================\\
																								//Items\\
		
		OreDictionary.registerOre("itemTitanium", ModItems.TitaniumIngot);
		OreDictionary.registerOre("itemUranium", ModItems.UraniumIngot);
		OreDictionary.registerOre("itemPlatinum", ModItems.PlatinumIngot);
		OreDictionary.registerOre("itemSilicon", ModItems.SiliconIngot);
		OreDictionary.registerOre("itemMagnesium", ModItems.MagnesiumIngot);
		OreDictionary.registerOre("itemCobalt", ModItems.CobaltIngot);
		OreDictionary.registerOre("itemNickel", ModItems.NickelIngot);
		OreDictionary.registerOre("itemBrass", ModItems.BrassIngot);


//===========================================================================================================================================================================================\\
																								//Fluids\\
		
		
//===========================================================================================================================================================================================\\
																						//My Ore Dictionary Names\\
	
    // Build our list of items to replace with ore tags
    Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();
    
    
//===========================================================================================================================================================================================\\
																								//Material\\
    
	/**Titanium*/
	//replacements.put(new ItemStack(ModItems.TitaniumIngot), "Titanium");
	//replacements.put(new ItemStack(ModItems.TitaniumNugget), "Titanium");
	//replacements.put(new ItemStack(ModBlocks.TitaniumBlock), "Titanium");
	//replacements.put(new ItemStack(ModBlocks.TitaniumOre), "Titanium");
    /*Dont do this, because if someone does:*/
    /**GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.aluminumblock), new Object[] { "T  ", "TT ", "TTT", 'T', " @Titanium" }));*/
    /*Anything named*/ /**@Titanium*/ /*will drag whatever is named titanium into their recipe
     *e.g: 9 titanium ore/titanium nuggget/titanium Block/titanium ingot,  will craft that persons titanium whatever*/
    
    
//===========================================================================================================================================================================================\\
																								//Ingots\\


	replacements.put(new ItemStack(ModItems.TitaniumIngot), "ingotTitanium");
    replacements.put(new ItemStack(ModItems.UraniumIngot), "ingotUranium");
    replacements.put(new ItemStack(ModItems.PlatinumIngot), "ingotPlatinum");
    replacements.put(new ItemStack(ModItems.SiliconIngot), "ingotSilicon");
    replacements.put(new ItemStack(ModItems.MagnesiumIngot), "ingotMagnesium");
    replacements.put(new ItemStack(ModItems.CobaltIngot), "ingotCobalt");
    replacements.put(new ItemStack(ModItems.NickelIngot), "ingotNickel");
    replacements.put(new ItemStack(ModItems.BrassIngot), "ingotBrass");
	
    
//===========================================================================================================================================================================================\\
																								//Nuggets\\ 
    
    
	replacements.put(new ItemStack(ModItems.TitaniumNugget), "nuggetTitanium");
    
//===========================================================================================================================================================================================\\
																								//Blocks\\
 

    replacements.put(new ItemStack(ModBlocks.TitaniumBlock), "blockTitanium");
    replacements.put(new ItemStack(ModBlocks.UraniumBlock), "blockUranium");
    replacements.put(new ItemStack(ModBlocks.PlatinumBlock), "blockPlatinum");
    replacements.put(new ItemStack(ModBlocks.SiliconBlock), "blockSilicon");
    replacements.put(new ItemStack(ModBlocks.MagnesiumBlock), "blockMagnesium");
    replacements.put(new ItemStack(ModBlocks.CobaltBlock), "blockCobalt");
    replacements.put(new ItemStack(ModBlocks.NickelBlock), "blockNickel");
    replacements.put(new ItemStack(ModBlocks.BrassBlock), "blockBrass");
    
    replacements.put(new ItemStack(ModStairs.StairsDiamond), "blockDiamond");
    replacements.put(new ItemStack(ModStairs.StairsGold), "blockGold");
    replacements.put(new ItemStack(ModStairs.StairsIron), "blockIron");

    
//===========================================================================================================================================================================================\\
																								//Ores\\
 

    replacements.put(new ItemStack(ModBlocks.TitaniumOre), "oreTitanium");
    replacements.put(new ItemStack(ModBlocks.UraniumOre), "oreUranium");
    replacements.put(new ItemStack(ModBlocks.PlatinumOre), "orePlatinum");
    replacements.put(new ItemStack(ModBlocks.SiliconOre), "oreSilicon");
    replacements.put(new ItemStack(ModBlocks.MagnesiumOre), "oreMagnesium");
    replacements.put(new ItemStack(ModBlocks.CobaltOre), "oreCobalt");
    replacements.put(new ItemStack(ModBlocks.NickelOre), "oreNickel");
    replacements.put(new ItemStack(ModBlocks.BrassOre), "oreBrass");
    
//===========================================================================================================================================================================================\\
																								//Items\\


    replacements.put(new ItemStack(ModItems.Kevlar), "itemKevlar");
    replacements.put(new ItemStack(ModItems.KerbalFabric), "itemKerbalFabric");
    replacements.put(new ItemStack(ModItems.NasaFabric), "itemNasaFabric");
    replacements.put(new ItemStack(ModItems.CommieFabric), "itemCommieFabric");
    replacements.put(new ItemStack(ModItems.UniverseFabric), "itemUniverseFabric");
    replacements.put(new ItemStack(ModItems.TitaniumIngot), "itemTitanium");
    replacements.put(new ItemStack(ModItems.UraniumIngot), "itemUranium");
    replacements.put(new ItemStack(ModItems.PlatinumIngot), "itemPlatinum");
    replacements.put(new ItemStack(ModItems.SiliconIngot), "itemSilicon");
    replacements.put(new ItemStack(ModItems.MagnesiumIngot), "itemMagnesium");
    replacements.put(new ItemStack(ModItems.CobaltIngot), "itemCobalt");
    replacements.put(new ItemStack(ModItems.NickelIngot), "itemNickel");
    replacements.put(new ItemStack(ModItems.BrassIngot), "itemBrass");



		
	}
}
