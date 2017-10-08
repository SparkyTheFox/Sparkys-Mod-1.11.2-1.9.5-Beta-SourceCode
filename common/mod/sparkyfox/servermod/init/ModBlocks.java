package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.block.BlockBrassBlock;
import mod.sparkyfox.servermod.block.BlockCobaltBlock;
import mod.sparkyfox.servermod.block.BlockIndustrialFreezer;
import mod.sparkyfox.servermod.block.BlockMagnesiumBlock;
import mod.sparkyfox.servermod.block.BlockNickelBlock;
import mod.sparkyfox.servermod.block.BlockPlatinumBlock;
import mod.sparkyfox.servermod.block.BlockRedButton;
import mod.sparkyfox.servermod.block.BlockRedButton2;
import mod.sparkyfox.servermod.block.BlockSiliconBlock;
import mod.sparkyfox.servermod.block.BlockTitaniumBlock;
import mod.sparkyfox.servermod.block.BlockUraniumBlock;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierButton;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierPDiorite;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierPressurePlate;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierRedClay;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierTitanium;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierWhiteClay;
import mod.sparkyfox.servermod.block.barriers.BlockBarrierWood;
import mod.sparkyfox.servermod.block.ores.BlockBrassOre;
import mod.sparkyfox.servermod.block.ores.BlockCobaltOre;
import mod.sparkyfox.servermod.block.ores.BlockMagnesiumOre;
import mod.sparkyfox.servermod.block.ores.BlockNickelOre;
import mod.sparkyfox.servermod.block.ores.BlockPlatinumOre;
import mod.sparkyfox.servermod.block.ores.BlockSiliconOre;
import mod.sparkyfox.servermod.block.ores.BlockTechiteOre;
import mod.sparkyfox.servermod.block.ores.BlockTitaniumOre;
import mod.sparkyfox.servermod.block.ores.BlockUraniumOre;
import mod.sparkyfox.servermod.industrialFreezer.TileEntityIndustrialFreezer;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockPressurePlate.Sensitivity;
import net.minecraft.block.material.Material;
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
	  public static BlockTechiteOre TechiteOre;
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
	  public static BlockBarrierPressurePlate BarrierPressurePlate;
	  public static BlockBarrierWood BarrierWood;
	  public static BlockBarrierTitanium BarrierTitanium;
	  public static BlockBarrierPDiorite BarrierPDiorite;
	  public static BlockBarrierRedClay BarrierRedClay;
	  public static BlockBarrierWhiteClay BarrierWhiteClay;
	  public static BlockBarrierButton BarrierButton;
	  public static BlockRedButton RedButton;
	  public static BlockRedButton2 RedButton2;
	//===============================================================================================================================================================================================\\
																									//Logic Registry\\
	  
	  public static BlockIndustrialFreezer IndustrialFreezer;
	
	  
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
	  	  
		  //Techite Ore\\
	  	  ResourceLocation location7a = new ResourceLocation(ServerMod.MOD_ID, ModNames.TechiteOre);
	  	  TechiteOre = new BlockTechiteOre();
	  	  TechiteOre.setRegistryName(location7a);
	  	  GameRegistry.register(TechiteOre);
	  	  GameRegistry.register(new ItemBlock(TechiteOre), location7a);
			 
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
		  
		  //Uranium Block\\
		  ResourceLocation location16 = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierPressurePlate);
		  BarrierPressurePlate = new BlockBarrierPressurePlate(Material.IRON, Sensitivity.MOBS);
		  BarrierPressurePlate.setRegistryName(location16);
		  GameRegistry.register(BarrierPressurePlate);
		  GameRegistry.register(new ItemBlock(BarrierPressurePlate), location16);
		  
		  //Uranium Block\\
		  ResourceLocation location16a = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierWood);
		  BarrierWood = new BlockBarrierWood();
		  BarrierWood.setRegistryName(location16a);
		  GameRegistry.register(BarrierWood);
		  GameRegistry.register(new ItemBlock(BarrierWood), location16a);
		  
		  ResourceLocation location16b = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierTitanium);
		  BarrierTitanium = new BlockBarrierTitanium();
		  BarrierTitanium.setRegistryName(location16b);
		  GameRegistry.register(BarrierTitanium);
		  GameRegistry.register(new ItemBlock(BarrierTitanium), location16b);
		  
		  ResourceLocation location16c = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierPDiorite);
		  BarrierPDiorite = new BlockBarrierPDiorite();
		  BarrierPDiorite.setRegistryName(location16c);
		  GameRegistry.register(BarrierPDiorite);
		  GameRegistry.register(new ItemBlock(BarrierPDiorite), location16c);
		  
		  ResourceLocation location16d = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierRedClay);
		  BarrierRedClay = new BlockBarrierRedClay();
		  BarrierRedClay.setRegistryName(location16d);
		  GameRegistry.register(BarrierRedClay);
		  GameRegistry.register(new ItemBlock(BarrierRedClay), location16d);
		  
		  ResourceLocation location16e = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierWhiteClay);
		  BarrierWhiteClay = new BlockBarrierWhiteClay();
		  BarrierWhiteClay.setRegistryName(location16e);
		  GameRegistry.register(BarrierWhiteClay);
		  GameRegistry.register(new ItemBlock(BarrierWhiteClay), location16e);
		  
		  ResourceLocation location16f = new ResourceLocation(ServerMod.MOD_ID, ModNames.BarrierButton);
		  BarrierButton = new BlockBarrierButton();
		  BarrierButton.setRegistryName(location16f);
		  GameRegistry.register(BarrierButton);
		  GameRegistry.register(new ItemBlock(BarrierButton), location16f);

		  ResourceLocation location16g = new ResourceLocation(ServerMod.MOD_ID, ModNames.RedButton);
		  RedButton = new BlockRedButton();
		  RedButton.setRegistryName(location16g);
		  GameRegistry.register(RedButton);
		  GameRegistry.register(new ItemBlock(RedButton), location16g);
		  
		  ResourceLocation location16h = new ResourceLocation(ServerMod.MOD_ID, ModNames.RedButton2);
		  RedButton2 = new BlockRedButton2();
		  RedButton2.setRegistryName(location16h);
		  GameRegistry.register(RedButton2);
		  GameRegistry.register(new ItemBlock(RedButton2), location16h);
		  
//===============================================================================================================================================================================================\\
																										//Initialise: Logic\\
		  
		  ResourceLocation industrialfreezer = new ResourceLocation(ServerMod.MOD_ID, ModNames.IndustrialFreezer);
		  IndustrialFreezer = new BlockIndustrialFreezer(false);
		  IndustrialFreezer.setRegistryName(industrialfreezer);
		  GameRegistry.register(IndustrialFreezer);
		  GameRegistry.register(new ItemBlock(IndustrialFreezer), industrialfreezer);
		  GameRegistry.registerTileEntity(TileEntityIndustrialFreezer.class, "industrialfreezer_tile_entity");
		  
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
		    
			//Ores: Techite
			Item item7a = Item.getItemFromBlock(TechiteOre);
		    ModelResourceLocation model7a = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TechiteOre, "inventory");
		    ModelLoader.registerItemVariants(item7a, model7a);
		    mesher.register(item7a, 0, model7a);{
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
		    Item item16 = Item.getItemFromBlock(BarrierPressurePlate);
		    ModelResourceLocation model16 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierPressurePlate, "inventory");
		    ModelLoader.registerItemVariants(item16, model16);
		    mesher.register(item16, 0, model16);{
  			}
		    Item item16a = Item.getItemFromBlock(BarrierWood);
		    ModelResourceLocation model16a = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierWood, "inventory");
		    ModelLoader.registerItemVariants(item16a, model16a);
		    mesher.register(item16a, 0, model16a);{
  			}
		    Item item16b = Item.getItemFromBlock(BarrierTitanium);
		    ModelResourceLocation model16b = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierTitanium, "inventory");
		    ModelLoader.registerItemVariants(item16b, model16b);
		    mesher.register(item16b, 0, model16b);{
		    }
		    Item item16c = Item.getItemFromBlock(BarrierPDiorite);
			ModelResourceLocation model16c = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierPDiorite, "inventory");
			ModelLoader.registerItemVariants(item16c, model16c);
			mesher.register(item16c, 0, model16c);{
				
		    }
		    Item item16d = Item.getItemFromBlock(BarrierRedClay);
			ModelResourceLocation model16d = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierRedClay, "inventory");
			ModelLoader.registerItemVariants(item16d, model16d);
			mesher.register(item16d, 0, model16d);{
				
		    }
		    Item item16e = Item.getItemFromBlock(BarrierWhiteClay);
			ModelResourceLocation model16e = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierWhiteClay, "inventory");
			ModelLoader.registerItemVariants(item16e, model16e);
			mesher.register(item16e, 0, model16e);{
				
			}
		    Item item16f = Item.getItemFromBlock(BarrierButton);
			ModelResourceLocation model16f = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BarrierButton, "inventory");
			ModelLoader.registerItemVariants(item16f, model16f);
			mesher.register(item16f, 0, model16f);{
				
			}
		    Item item16g = Item.getItemFromBlock(RedButton);
			ModelResourceLocation model16g = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedButton, "inventory");
			ModelLoader.registerItemVariants(item16g, model16g);
			mesher.register(item16g, 0, model16g);{
			
			}
			Item item16h = Item.getItemFromBlock(RedButton2);
			ModelResourceLocation model16h = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedButton2, "inventory");
			ModelLoader.registerItemVariants(item16h, model16h);
			mesher.register(item16h, 0, model16h);{	
				
			}
			Item itemindustrialfreezer = Item.getItemFromBlock(IndustrialFreezer);
			ModelResourceLocation industrialfreezer = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IndustrialFreezer, "inventory");
			ModelLoader.registerItemVariants(itemindustrialfreezer, industrialfreezer);
			mesher.register(itemindustrialfreezer, 0, industrialfreezer);{	
					
				
			//Slabs

				
				
				
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
			RedButton.addRecipes();
			RedButton2.addRecipes();
			IndustrialFreezer.addRecipes();
	  }
	  
//===============================================================================================================================================================================================\\
	  
  }

