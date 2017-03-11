package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.block.BlockBrassBlock;
import mod.sparkyfox.servermod.block.BlockBrassOre;
import mod.sparkyfox.servermod.block.BlockTitaniumBlock;
import mod.sparkyfox.servermod.block.BlockTitaniumOre;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

  public class ModBlocks {
//===========================================================================================================================================================================================\\
	  																								//Ore Registry\\
	  
	  public static BlockTitaniumOre TitaniumOre;
	  public static BlockBrassOre BrassOre;
	  
//===============================================================================================================================================================================================\\
	  																								//Block Registry\\
	  
	  public static BlockTitaniumBlock TitaniumBlock;
	  public static BlockBrassBlock BrassBlock;
	  
//===============================================================================================================================================================================================\\
	  																								//Initialise: ORES\\
	  public static void init() {
		  
		  //Titanium Ore\\
		  ResourceLocation location = new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumOre);
		  TitaniumOre = new BlockTitaniumOre();
		  TitaniumOre.setRegistryName(location);
		  GameRegistry.register(TitaniumOre);
		  GameRegistry.register(new ItemBlock(TitaniumOre), location);
		
		  //Brass Ore\\
		  ResourceLocation location1 = new ResourceLocation(ServerMod.MOD_ID, ModNames.BrassOre);
		  BrassOre = new BlockBrassOre();
		  BrassOre.setRegistryName(location1);
		  GameRegistry.register(BrassOre);
		  GameRegistry.register(new ItemBlock(BrassOre), location1);{  
			 
			  {
				  
			  }
		  }
			
		  
//===============================================================================================================================================================================================\\
																									//Initialise: BLOCKS\\	  
		  
		  //Titanium Block\\
		  ResourceLocation location2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumBlock);
		  TitaniumBlock = new BlockTitaniumBlock();
		  TitaniumBlock.setRegistryName(location2);
		  GameRegistry.register(TitaniumBlock);
		  GameRegistry.register(new ItemBlock(TitaniumBlock), location2);
	  
		  //Brass Block\\
		  ResourceLocation location3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.BrassBlock);
		  BrassBlock = new BlockBrassBlock();
		  BrassBlock.setRegistryName(location3);
		  GameRegistry.register(BrassBlock);
		  GameRegistry.register(new ItemBlock(BrassBlock), location3);
	  }
	  
//===============================================================================================================================================================================================\\
	  																									//Model Meshes: ORES\\
	  
	  @SideOnly(Side.CLIENT)
	  public static void initClient(ItemModelMesher mesher) {
	
		  
		    Item item = Item.getItemFromBlock(TitaniumOre);
		    ModelResourceLocation model = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumOre, "inventory");
		    ModelLoader.registerItemVariants(item, model);
		    mesher.register(item, 0, model);{
		    }
		    
		    Item item3 = Item.getItemFromBlock(BrassOre);
		    ModelResourceLocation model3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassOre, "inventory");
		    ModelLoader.registerItemVariants(item3, model3);
		    mesher.register(item3, 0, model3);{	
		    }
		    
//===============================================================================================================================================================================================\\
																											//Model Meshes: BLOCKS\\
		    
		    //Blocks: Titanium
		    Item item1 = Item.getItemFromBlock(TitaniumBlock);
		    ModelResourceLocation model1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumBlock, "inventory");
		    ModelLoader.registerItemVariants(item1, model1);
		    mesher.register(item1, 0, model1);{
  			}
		    
		    //Blocks: Brass
		    Item item2 = Item.getItemFromBlock(BrassBlock);
		    ModelResourceLocation model2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassBlock, "inventory");
		    ModelLoader.registerItemVariants(item2, model2);
		    mesher.register(item2, 0, model2);{
		    }
	  }
//===============================================================================================================================================================================================\\
																											//Recipe Initialisation\\	  
	  
	  public static void initRecipes() {
			TitaniumOre.addRecipes();
			TitaniumBlock.addRecipes();
			BrassOre.addRecipes();
			BrassBlock.addRecipes();
	  }
	  
//===============================================================================================================================================================================================\\
	  
  }

