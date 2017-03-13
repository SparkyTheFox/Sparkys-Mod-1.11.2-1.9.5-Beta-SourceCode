package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.block.BlockBrassBlock;
import mod.sparkyfox.servermod.block.BlockBrassOre;
import mod.sparkyfox.servermod.block.BlockCobaltBlock;
import mod.sparkyfox.servermod.block.BlockCobaltOre;
import mod.sparkyfox.servermod.block.BlockMagnesiumBlock;
import mod.sparkyfox.servermod.block.BlockMagnesiumOre;
import mod.sparkyfox.servermod.block.BlockNickelBlock;
import mod.sparkyfox.servermod.block.BlockNickelOre;
import mod.sparkyfox.servermod.block.BlockPlatinumBlock;
import mod.sparkyfox.servermod.block.BlockPlatinumOre;
import mod.sparkyfox.servermod.block.BlockSiliconBlock;
import mod.sparkyfox.servermod.block.BlockSiliconOre;
import mod.sparkyfox.servermod.block.BlockTitaniumBlock;
import mod.sparkyfox.servermod.block.BlockTitaniumOre;
import mod.sparkyfox.servermod.block.BlockUraniumBlock;
import mod.sparkyfox.servermod.block.BlockUraniumOre;
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
	  public static BlockNickelOre NickelOre;
	  public static BlockCobaltOre CobaltOre;
	  public static BlockMagnesiumOre MagnesiumOre;
	  public static BlockSiliconOre SiliconOre;
	  public static BlockPlatinumOre PlatinumOre;
	  public static BlockUraniumOre UraniumOre;
//===============================================================================================================================================================================================\\
	  																								//Block Registry\\
	  
	  public static BlockTitaniumBlock TitaniumBlock;
	  public static BlockBrassBlock BrassBlock;
	  public static BlockNickelBlock NickelBlock;
	  public static BlockCobaltBlock CobaltBlock;
	  public static BlockMagnesiumBlock MagnesiumBlock;
	  public static BlockSiliconBlock SiliconBlock;
	  public static BlockPlatinumBlock PlatinumBlock;
	  public static BlockUraniumBlock UraniumBlock;
	  
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
			  
		  //Nickel Ore\\
		  ResourceLocation location2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.NickelOre);
		  NickelOre = new BlockNickelOre();
		  NickelOre.setRegistryName(location2);
		  GameRegistry.register(NickelOre);
		  GameRegistry.register(new ItemBlock(NickelOre), location2);
	  	  
	  	  //Cobalt Ore\\
		  ResourceLocation location3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.CobaltOre);
		  CobaltOre = new BlockCobaltOre();
		  CobaltOre.setRegistryName(location3);
		  GameRegistry.register(CobaltOre);
		  GameRegistry.register(new ItemBlock(CobaltOre), location3);
	  
		  //Magnesium Ore\\
		  ResourceLocation location4 = new ResourceLocation(ServerMod.MOD_ID, ModNames.MagnesiumOre);
		  MagnesiumOre = new BlockMagnesiumOre();
		  MagnesiumOre.setRegistryName(location4);
		  GameRegistry.register(MagnesiumOre);
		  GameRegistry.register(new ItemBlock(MagnesiumOre), location4);
	  
		  //Silicon Ore\\
		  ResourceLocation location5 = new ResourceLocation(ServerMod.MOD_ID, ModNames.SiliconOre);
		  SiliconOre = new BlockSiliconOre();
		  SiliconOre.setRegistryName(location5);
		  GameRegistry.register(SiliconOre);
		  GameRegistry.register(new ItemBlock(SiliconOre), location5);
	  
		  //Platinum Ore\\
		  ResourceLocation location6 = new ResourceLocation(ServerMod.MOD_ID, ModNames.PlatinumOre);
		  PlatinumOre = new BlockPlatinumOre();
		  PlatinumOre.setRegistryName(location6);
		  GameRegistry.register(PlatinumOre);
		  GameRegistry.register(new ItemBlock(PlatinumOre), location6);
		    
		  //Uranium Ore\\
	  	  ResourceLocation location7 = new ResourceLocation(ServerMod.MOD_ID, ModNames.UraniumOre);
	  	  UraniumOre = new BlockUraniumOre();
	  	  UraniumOre.setRegistryName(location7);
	  	  GameRegistry.register(UraniumOre);
	  	  GameRegistry.register(new ItemBlock(UraniumOre), location7);
			 
			  {
				  
			  }
		  }
			
		  
//===============================================================================================================================================================================================\\
																									//Initialise: BLOCKS\\	  
		  
		  //Titanium Block\\
		  ResourceLocation location8 = new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumBlock);
		  TitaniumBlock = new BlockTitaniumBlock();
		  TitaniumBlock.setRegistryName(location8);
		  GameRegistry.register(TitaniumBlock);
		  GameRegistry.register(new ItemBlock(TitaniumBlock), location8);
	  
		  //Brass Block\\
		  ResourceLocation location9 = new ResourceLocation(ServerMod.MOD_ID, ModNames.BrassBlock);
		  BrassBlock = new BlockBrassBlock();
		  BrassBlock.setRegistryName(location9);
		  GameRegistry.register(BrassBlock);
		  GameRegistry.register(new ItemBlock(BrassBlock), location9);
		  
		  //Nickel Block\\		  
		  ResourceLocation location10 = new ResourceLocation(ServerMod.MOD_ID, ModNames.NickelBlock);
		  NickelBlock = new BlockNickelBlock();
		  NickelBlock.setRegistryName(location10);
		  GameRegistry.register(NickelBlock);
		  GameRegistry.register(new ItemBlock(NickelBlock), location10);
		  
		  //Cobalt Block\\
		  ResourceLocation location11 = new ResourceLocation(ServerMod.MOD_ID, ModNames.CobaltBlock);
		  CobaltBlock = new BlockCobaltBlock();
		  CobaltBlock.setRegistryName(location11);
		  GameRegistry.register(CobaltBlock);
		  GameRegistry.register(new ItemBlock(CobaltBlock), location11);
		  
		  //Magnesium Block\\
		  ResourceLocation location12 = new ResourceLocation(ServerMod.MOD_ID, ModNames.MagnesiumBlock);
		  MagnesiumBlock = new BlockMagnesiumBlock();
		  MagnesiumBlock.setRegistryName(location12);
		  GameRegistry.register(MagnesiumBlock);
		  GameRegistry.register(new ItemBlock(MagnesiumBlock), location12);
		  
		  //Silicon Block\\
		  ResourceLocation location13 = new ResourceLocation(ServerMod.MOD_ID, ModNames.SiliconBlock);
		  SiliconBlock = new BlockSiliconBlock();
		  SiliconBlock.setRegistryName(location13);
		  GameRegistry.register(SiliconBlock);
		  GameRegistry.register(new ItemBlock(SiliconBlock), location13);
		  
		  //Platinum Block\\
		  ResourceLocation location14 = new ResourceLocation(ServerMod.MOD_ID, ModNames.PlatinumBlock);
		  PlatinumBlock = new BlockPlatinumBlock();
		  PlatinumBlock.setRegistryName(location14);
		  GameRegistry.register(PlatinumBlock);
		  GameRegistry.register(new ItemBlock(PlatinumBlock), location14);
		  
		  //Uranium Block\\
		  ResourceLocation location15 = new ResourceLocation(ServerMod.MOD_ID, ModNames.UraniumBlock);
		  UraniumBlock = new BlockUraniumBlock();
		  UraniumBlock.setRegistryName(location15);
		  GameRegistry.register(UraniumBlock);
		  GameRegistry.register(new ItemBlock(UraniumBlock), location15);
		  
	  }
	  
//===============================================================================================================================================================================================\\
	  																									//Model Meshes: ORES\\
	  
	  @SideOnly(Side.CLIENT)
	  public static void initClient(ItemModelMesher mesher) {
	
	
		  	//Ores: Titanium
		    Item item = Item.getItemFromBlock(TitaniumOre);
		    ModelResourceLocation model = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumOre, "inventory");
		    ModelLoader.registerItemVariants(item, model);
		    mesher.register(item, 0, model);{
		    }
		    
		    //Ores: Brass
		    Item item1 = Item.getItemFromBlock(BrassOre);
		    ModelResourceLocation model1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassOre, "inventory");
		    ModelLoader.registerItemVariants(item1, model1);
		    mesher.register(item1, 0, model1);{	
		    }
		    
		    //Ores: Nickel
		  	Item item2 = Item.getItemFromBlock(NickelOre);
		    ModelResourceLocation model2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.NickelOre, "inventory");
		    ModelLoader.registerItemVariants(item2, model2);
		    mesher.register(item2, 0, model2);{
		    }
			
			//Ores: Cobalt
			Item item3 = Item.getItemFromBlock(CobaltOre);
		    ModelResourceLocation model3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CobaltOre, "inventory");
		    ModelLoader.registerItemVariants(item3, model3);
		    mesher.register(item3, 0, model3);{
		    }
			
			//Ores: Magnesium
			Item item4 = Item.getItemFromBlock(MagnesiumOre);
		    ModelResourceLocation model4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.MagnesiumOre, "inventory");
		    ModelLoader.registerItemVariants(item4, model4);
		    mesher.register(item4, 0, model4);{
		    }
			
			//Ores: Silicon
			Item item5 = Item.getItemFromBlock(SiliconOre);
		    ModelResourceLocation model5 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SiliconOre, "inventory");
		    ModelLoader.registerItemVariants(item5, model5);
		    mesher.register(item5, 0, model5);{
		    }
			
			//Ores: Platinum
			Item item6 = Item.getItemFromBlock(PlatinumOre);
		    ModelResourceLocation model6 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PlatinumOre, "inventory");
		    ModelLoader.registerItemVariants(item6, model6);
		    mesher.register(item6, 0, model6);{
		    }
			
			//Ores: Uranium
			Item item7 = Item.getItemFromBlock(UraniumOre);
		    ModelResourceLocation model7 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.UraniumOre, "inventory");
		    ModelLoader.registerItemVariants(item7, model7);
		    mesher.register(item7, 0, model7);{
		    }
		    
//===============================================================================================================================================================================================\\
																											//Model Meshes: BLOCKS\\
		    
		    //Blocks: Titanium
		    Item item8 = Item.getItemFromBlock(TitaniumBlock);
		    ModelResourceLocation model8 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumBlock, "inventory");
		    ModelLoader.registerItemVariants(item8, model8);
		    mesher.register(item8, 0, model8);{
  			}
		    
		    //Blocks: Brass
		    Item item9 = Item.getItemFromBlock(BrassBlock);
		    ModelResourceLocation model9 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassBlock, "inventory");
		    ModelLoader.registerItemVariants(item9, model9);
		    mesher.register(item9, 0, model9);{
		    }
		    
		    			//Blocks: Nickel
		    Item item10 = Item.getItemFromBlock(NickelBlock);
		    ModelResourceLocation model10 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.NickelBlock, "inventory");
		    ModelLoader.registerItemVariants(item10, model10);
		    mesher.register(item10, 0, model10);{
  			}
			
			//Blocks: Cobalt
		    Item item11 = Item.getItemFromBlock(CobaltBlock);
		    ModelResourceLocation model11 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CobaltBlock, "inventory");
		    ModelLoader.registerItemVariants(item11, model11);
		    mesher.register(item11, 0, model11);{
  			}
			
			//Blocks: Magnesium
		    Item item12 = Item.getItemFromBlock(MagnesiumBlock);
		    ModelResourceLocation model12 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.MagnesiumBlock, "inventory");
		    ModelLoader.registerItemVariants(item12, model12);
		    mesher.register(item12, 0, model12);{
  			}
			
			//Blocks: Silicon
		    Item item13 = Item.getItemFromBlock(SiliconBlock);
		    ModelResourceLocation model13 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SiliconBlock, "inventory");
		    ModelLoader.registerItemVariants(item13, model13);
		    mesher.register(item13, 0, model13);{
  			}
			
			//Blocks: Platinum
		    Item item14 = Item.getItemFromBlock(PlatinumBlock);
		    ModelResourceLocation model14 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PlatinumBlock, "inventory");
		    ModelLoader.registerItemVariants(item14, model14);
		    mesher.register(item14, 0, model14);{
  			}
			
			//Blocks: Uranium
		    Item item15 = Item.getItemFromBlock(UraniumBlock);
		    ModelResourceLocation model15 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.UraniumBlock, "inventory");
		    ModelLoader.registerItemVariants(item15, model15);
		    mesher.register(item15, 0, model15);{
  			}
  		}
	  
//===============================================================================================================================================================================================\\
																											//Recipe Initialisation\\	  
	  
	  public static void initRecipes() {
			TitaniumOre.addRecipes();
			TitaniumBlock.addRecipes();
			BrassOre.addRecipes();
			BrassBlock.addRecipes();
			NickelOre.addRecipes();
			NickelBlock.addRecipes();
			CobaltOre.addRecipes();
			CobaltBlock.addRecipes();
			MagnesiumOre.addRecipes();
			MagnesiumBlock.addRecipes();
			SiliconOre.addRecipes();
			SiliconBlock.addRecipes();
			PlatinumOre.addRecipes();
			PlatinumBlock.addRecipes();
			UraniumOre.addRecipes();
			UraniumBlock.addRecipes();
	  }
	  
//===============================================================================================================================================================================================\\
	  
  }

