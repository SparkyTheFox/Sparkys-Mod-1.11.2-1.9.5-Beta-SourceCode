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
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate2;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate3;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate4;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsBlack;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsBridge;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCrackedBlock;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWall;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallCracked;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallTop;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsHalfCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsInvertedCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple4;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsTriangle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsTriangle2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWall;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallBottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallTop;
import mod.sparkyfox.servermod.block.adventure.BlockSpikePressurePlate;
import mod.sparkyfox.servermod.block.adventure.BlockSpikePressurePlate2;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch2;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch3;
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
//import mod.sparkyfox.servermod.fluid.FluidTitanium;
//import mod.sparkyfox.servermod.fluid.FluidTitaniumBlock;
import mod.sparkyfox.servermod.industrialFreezer.TileEntityIndustrialFreezer;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockPressurePlate.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
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
	  //public static FluidTitanium FluidTitanium;
	
	  
//===============================================================================================================================================================================================\\
																								//Adventure Registry\\
	  
	  public static BlockRuinsWall RuinsWall;
	  public static BlockRuinsWallTop RuinsWallTop;
	  public static BlockRuinsWallBottom RuinsWallBottom;
	  public static BlockRuinsWallCracked RuinsWallCracked;
	  public static BlockRuinsWallCracked2 RuinsWallCracked2;
	  public static BlockRuinsWallCracked3 RuinsWallCracked3;
	  public static BlockRuinsFadedWall RuinsFadedWall;
	  public static BlockRuinsFadedWallTop RuinsFadedWallTop;
	  public static BlockRuinsFadedWallBottom RuinsFadedWallBottom;
	  public static BlockRuinsFadedWallCracked RuinsFadedWallCracked;
	  public static BlockRuinsPurple RuinsPurple;
	  public static BlockRuinsPurple2 RuinsPurple2;
	  public static BlockRuinsPurple3 RuinsPurple3;
	  public static BlockRuinsPurple4 RuinsPurple4;
	  public static BlockRuinsCrackedBlock RuinsCrackedBlock;
	  public static BlockRuinsBlack RuinsBlack;
	  public static BlockSpikePressurePlate SpikePressurePlate;
	  public static BlockSpikePressurePlate2 SpikePressurePlate2;
	  public static BlockPadPressurePlate PadPressurePlate;
	  public static BlockPadPressurePlate2 PadPressurePlate2;
	  public static BlockPadPressurePlate3 PadPressurePlate3;
	  public static BlockPadPressurePlate4 PadPressurePlate4;
	  public static BlockSwitch WallSwitch;
	  public static BlockSwitch2 WallSwitch2;
	  public static BlockSwitch3 WallSwitch3;
	  public static BlockRuinsTriangle RuinsTriangle;
	  public static BlockRuinsTriangle2 RuinsTriangle2;
	  public static BlockRuinsCircle RuinsCircle;
	  public static BlockRuinsCircle2 RuinsCircle2;
	  public static BlockRuinsCircle3 RuinsCircle3;
	  public static BlockRuinsHalfCircle RuinsHalfCircle ;
	  public static BlockRuinsInvertedCircle RuinsInvertedCircle;
	  public static BlockRuinsBridge RuinsBridge;
	  
	
		

	  
	  
	  
	  //Stairs
	  
	  
	  
	  
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
		  
//===============================================================================================================================================================================================\\
																										//Initialise: Adventure\\
		  
		  ResourceLocation Wall = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWall);
		  RuinsWall = new BlockRuinsWall();
		  RuinsWall.setRegistryName(Wall);
		  GameRegistry.register(RuinsWall);
		  GameRegistry.register(new ItemBlock(RuinsWall), Wall);
		  
		  ResourceLocation WallTop = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallTop);
		  RuinsWallTop = new BlockRuinsWallTop();
		  RuinsWallTop.setRegistryName(WallTop);
		  GameRegistry.register(RuinsWallTop);
		  GameRegistry.register(new ItemBlock(RuinsWallTop), WallTop);
		  
		  ResourceLocation WallBottom = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallBottom);
		  RuinsWallBottom = new BlockRuinsWallBottom();
		  RuinsWallBottom.setRegistryName(WallBottom);
		  GameRegistry.register(RuinsWallBottom);
		  GameRegistry.register(new ItemBlock(RuinsWallBottom), WallBottom);
		  
		  ResourceLocation WallCracked = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallCracked);
		  RuinsWallCracked = new BlockRuinsWallCracked();
		  RuinsWallCracked.setRegistryName(WallCracked);
		  GameRegistry.register(RuinsWallCracked);
		  GameRegistry.register(new ItemBlock(RuinsWallCracked), WallCracked);
		  
		  ResourceLocation WallCracked2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallCracked2);
		  RuinsWallCracked2 = new BlockRuinsWallCracked2();
		  RuinsWallCracked2.setRegistryName(WallCracked2);
		  GameRegistry.register(RuinsWallCracked2);
		  GameRegistry.register(new ItemBlock(RuinsWallCracked2), WallCracked2);
		  
		  ResourceLocation WallCracked3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallCracked3);
		  RuinsWallCracked3 = new BlockRuinsWallCracked3();
		  RuinsWallCracked3.setRegistryName(WallCracked3);
		  GameRegistry.register(RuinsWallCracked3);
		  GameRegistry.register(new ItemBlock(RuinsWallCracked3), WallCracked3);
		  
		  ResourceLocation FadedWall = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWall);
		  RuinsFadedWall = new BlockRuinsFadedWall();
		  RuinsFadedWall.setRegistryName(FadedWall);
		  GameRegistry.register(RuinsFadedWall);
		  GameRegistry.register(new ItemBlock(RuinsFadedWall), FadedWall);
		  
		  ResourceLocation FadedWallTop = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallTop);
		  RuinsFadedWallTop = new BlockRuinsFadedWallTop();
		  RuinsFadedWallTop.setRegistryName(FadedWallTop);
		  GameRegistry.register(RuinsFadedWallTop);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallTop), FadedWallTop);
		  
		  ResourceLocation FadedWallBottom = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallBottom);
		  RuinsFadedWallBottom = new BlockRuinsFadedWallBottom();
		  RuinsFadedWallBottom.setRegistryName(FadedWallBottom);
		  GameRegistry.register(RuinsFadedWallBottom);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallBottom), FadedWallBottom);
		  
		  ResourceLocation FadedWallCracked = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallCracked);
		  RuinsFadedWallCracked = new BlockRuinsFadedWallCracked();
		  RuinsFadedWallCracked.setRegistryName(FadedWallCracked);
		  GameRegistry.register(RuinsFadedWallCracked);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallCracked), FadedWallCracked);
		  
		  ResourceLocation Purple = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPurple);
		  RuinsPurple = new BlockRuinsPurple();
		  RuinsPurple.setRegistryName(Purple);
		  GameRegistry.register(RuinsPurple);
		  GameRegistry.register(new ItemBlock(RuinsPurple), Purple);
		  
		  ResourceLocation Purple2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPurple2);
		  RuinsPurple2 = new BlockRuinsPurple2();
		  RuinsPurple2.setRegistryName(Purple2);
		  GameRegistry.register(RuinsPurple2);
		  GameRegistry.register(new ItemBlock(RuinsPurple2), Purple2);
		  
		  ResourceLocation Purple3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPurple3);
		  RuinsPurple3 = new BlockRuinsPurple3();
		  RuinsPurple3.setRegistryName(Purple3);
		  GameRegistry.register(RuinsPurple3);
		  GameRegistry.register(new ItemBlock(RuinsPurple3), Purple3);
		  
		  ResourceLocation Purple4 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPurple4);
		  RuinsPurple4 = new BlockRuinsPurple4();
		  RuinsPurple4.setRegistryName(Purple4);
		  GameRegistry.register(RuinsPurple4);
		  GameRegistry.register(new ItemBlock(RuinsPurple4), Purple4);
		  
		  ResourceLocation Black = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsBlack);
		  RuinsBlack = new BlockRuinsBlack();
		  RuinsBlack.setRegistryName(Black);
		  GameRegistry.register(RuinsBlack);
		  GameRegistry.register(new ItemBlock(RuinsBlack), Black);
		  
		  ResourceLocation RuinsCracked = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsCrackedBlock);
		  RuinsCrackedBlock = new BlockRuinsCrackedBlock();
		  RuinsCrackedBlock.setRegistryName(RuinsCracked);
		  GameRegistry.register(RuinsCrackedBlock);
		  GameRegistry.register(new ItemBlock(RuinsCrackedBlock), RuinsCracked);
		  
		  ResourceLocation SpikePlate = new ResourceLocation(ServerMod.MOD_ID, ModNames.SpikePressurePlate);
		  SpikePressurePlate = new BlockSpikePressurePlate(Material.IRON, Sensitivity.MOBS);
		  SpikePressurePlate.setRegistryName(SpikePlate);
		  GameRegistry.register(SpikePressurePlate);
		  GameRegistry.register(new ItemBlock(SpikePressurePlate), SpikePlate);
		  
		  ResourceLocation PadPlate = new ResourceLocation(ServerMod.MOD_ID, ModNames.PadPressurePlate);
		  PadPressurePlate = new BlockPadPressurePlate(Material.IRON, Sensitivity.MOBS);
		  PadPressurePlate.setRegistryName(PadPlate);
		  GameRegistry.register(PadPressurePlate);
		  GameRegistry.register(new ItemBlock(PadPressurePlate), PadPlate);
		  
		  ResourceLocation PadPlate2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.PadPressurePlate2);
		  PadPressurePlate2 = new BlockPadPressurePlate2(Material.IRON, Sensitivity.MOBS);
		  PadPressurePlate2.setRegistryName(PadPlate2);
		  GameRegistry.register(PadPressurePlate2);
		  GameRegistry.register(new ItemBlock(PadPressurePlate2), PadPlate2);
		  
		  ResourceLocation PadPlate3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.PadPressurePlate3);
		  PadPressurePlate3 = new BlockPadPressurePlate3(Material.IRON, Sensitivity.MOBS);
		  PadPressurePlate3.setRegistryName(PadPlate3);
		  GameRegistry.register(PadPressurePlate3);
		  GameRegistry.register(new ItemBlock(PadPressurePlate3), PadPlate3);
		  
		  ResourceLocation PadPlate4 = new ResourceLocation(ServerMod.MOD_ID, ModNames.PadPressurePlate4);
		  PadPressurePlate4 = new BlockPadPressurePlate4(Material.IRON, Sensitivity.MOBS);
		  PadPressurePlate4.setRegistryName(PadPlate4);
		  GameRegistry.register(PadPressurePlate4);
		  GameRegistry.register(new ItemBlock(PadPressurePlate4), PadPlate4);
		  
		  ResourceLocation SpikePlate2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.SpikePressurePlate2);
		  SpikePressurePlate2 = new BlockSpikePressurePlate2(Material.IRON, Sensitivity.MOBS);
		  SpikePressurePlate2.setRegistryName(SpikePlate2);
		  GameRegistry.register(SpikePressurePlate2);
		  GameRegistry.register(new ItemBlock(SpikePressurePlate2), SpikePlate2);
		  
		  ResourceLocation Switch = new ResourceLocation(ServerMod.MOD_ID, ModNames.Switch);
		  WallSwitch = new BlockSwitch();
		  WallSwitch.setRegistryName(Switch);
		  GameRegistry.register(WallSwitch);
		  GameRegistry.register(new ItemBlock(WallSwitch), Switch);
		  
		  ResourceLocation Switch2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.Switch2);
		  WallSwitch2 = new BlockSwitch2();
		  WallSwitch2.setRegistryName(Switch2);
		  GameRegistry.register(WallSwitch2);
		  GameRegistry.register(new ItemBlock(WallSwitch2), Switch2);
		  
		  ResourceLocation Switch3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.Switch3);
		  WallSwitch3 = new BlockSwitch3();
		  WallSwitch3.setRegistryName(Switch3);
		  GameRegistry.register(WallSwitch3);
		  GameRegistry.register(new ItemBlock(WallSwitch3), Switch3);
		  
		  ResourceLocation Triangle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsTriangle);
		  RuinsTriangle = new BlockRuinsTriangle();
		  RuinsTriangle.setRegistryName(Triangle);
		  GameRegistry.register(RuinsTriangle);
		  GameRegistry.register(new ItemBlock(RuinsTriangle), Triangle);
		  
		  ResourceLocation Triangle2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsTriangle2);
		  RuinsTriangle2 = new BlockRuinsTriangle2();
		  RuinsTriangle2.setRegistryName(Triangle2);
		  GameRegistry.register(RuinsTriangle2);
		  GameRegistry.register(new ItemBlock(RuinsTriangle2), Triangle2);
		  
		  ResourceLocation Circle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsCircle);
		  RuinsCircle = new BlockRuinsCircle();
		  RuinsCircle.setRegistryName(Circle);
		  GameRegistry.register(RuinsCircle);
		  GameRegistry.register(new ItemBlock(RuinsCircle), Circle);
		  
		  ResourceLocation Circle2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsCircle2);
		  RuinsCircle2 = new BlockRuinsCircle2();
		  RuinsCircle2.setRegistryName(Circle2);
		  GameRegistry.register(RuinsCircle2);
		  GameRegistry.register(new ItemBlock(RuinsCircle2), Circle2);
		  
		  ResourceLocation Circle3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsCircle3);
		  RuinsCircle3 = new BlockRuinsCircle3();
		  RuinsCircle3.setRegistryName(Circle3);
		  GameRegistry.register(RuinsCircle3);
		  GameRegistry.register(new ItemBlock(RuinsCircle3), Circle3);
		  
		  ResourceLocation HalfCircle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsHalfCircle);
		  RuinsHalfCircle = new BlockRuinsHalfCircle();
		  RuinsHalfCircle.setRegistryName(HalfCircle);
		  GameRegistry.register(RuinsHalfCircle);
		  GameRegistry.register(new ItemBlock(RuinsHalfCircle), HalfCircle);
		  
		  ResourceLocation InvertedCircle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsInvertedCircle);
		  RuinsInvertedCircle = new BlockRuinsInvertedCircle();
		  RuinsInvertedCircle.setRegistryName(InvertedCircle);
		  GameRegistry.register(RuinsInvertedCircle);
		  GameRegistry.register(new ItemBlock(RuinsInvertedCircle), InvertedCircle);
		  
		  ResourceLocation Bridge = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsBridge);
		  RuinsBridge = new BlockRuinsBridge();
		  RuinsBridge.setRegistryName(Bridge);
		  GameRegistry.register(RuinsBridge);
		  GameRegistry.register(new ItemBlock(RuinsBridge), Bridge);
		  
		  
		  
		
		  

		  
		  
		  
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
				
//===============================================================================================================================================================================================\\
																										//Model Meshes: Adventrue\\
				
			    //Blocks: RuinsWall
			    Item itemRuinsWall = Item.getItemFromBlock(RuinsWall);
			    ModelResourceLocation modelRuinsWall = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWall, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWall, modelRuinsWall);
			    mesher.register(itemRuinsWall, 0, modelRuinsWall);{
	  			}
			    
			    //Blocks: RuinsWallTop
			    Item itemRuinsWallTop = Item.getItemFromBlock(RuinsWallTop);
			    ModelResourceLocation modelRuinsWallTop = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallTop, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallTop, modelRuinsWallTop);
			    mesher.register(itemRuinsWallTop, 0, modelRuinsWallTop);{
	  			}
			    
			    //Blocks: RuinsWallBottom
			    Item itemRuinsWallBottom = Item.getItemFromBlock(RuinsWallBottom);
			    ModelResourceLocation modelRuinsWallBottom = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallBottom, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallBottom, modelRuinsWallBottom);
			    mesher.register(itemRuinsWallBottom, 0, modelRuinsWallBottom);{
	  			}
			    
			    //Blocks: RuinsWallCracked
			    Item itemRuinsWallCracked = Item.getItemFromBlock(RuinsWallCracked);
			    ModelResourceLocation modelRuinsWallCracked = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallCracked, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallCracked, modelRuinsWallCracked);
			    mesher.register(itemRuinsWallCracked, 0, modelRuinsWallCracked);{
	  			}
			    
			    //Blocks: RuinsWallCracked2
			    Item itemRuinsWallCracked2 = Item.getItemFromBlock(RuinsWallCracked2);
			    ModelResourceLocation modelRuinsWallCracked2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallCracked2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallCracked2, modelRuinsWallCracked2);
			    mesher.register(itemRuinsWallCracked2, 0, modelRuinsWallCracked2);{
	  			}
			    
			    //Blocks: RuinsWallCracked3
			    Item itemRuinsWallCracked3 = Item.getItemFromBlock(RuinsWallCracked3);
			    ModelResourceLocation modelRuinsWallCracked3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallCracked3, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallCracked3, modelRuinsWallCracked3);
			    mesher.register(itemRuinsWallCracked3, 0, modelRuinsWallCracked3);{
	  			}
			    
			    //Blocks: RuinsFadedWall
			    Item itemRuinsFadedWall = Item.getItemFromBlock(RuinsFadedWall);
			    ModelResourceLocation modelRuinsFadedWall = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWall, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWall, modelRuinsFadedWall);
			    mesher.register(itemRuinsFadedWall, 0, modelRuinsFadedWall);{
	  			}
			    
			    //Blocks: RuinsFadedWallTop
			    Item itemRuinsFadedWallTop = Item.getItemFromBlock(RuinsFadedWallTop);
			    ModelResourceLocation modelRuinsFadedWallTop = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallTop, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallTop, modelRuinsFadedWallTop);
			    mesher.register(itemRuinsFadedWallTop, 0, modelRuinsFadedWallTop);{
	  			}
			    
			    //Blocks: RuinsFadedWallBottom
			    Item itemRuinsFadedWallBottom = Item.getItemFromBlock(RuinsFadedWallBottom);
			    ModelResourceLocation modelRuinsFadedWallBottom = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottom, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallBottom, modelRuinsFadedWallBottom);
			    mesher.register(itemRuinsFadedWallBottom, 0, modelRuinsFadedWallBottom);{
	  			}
			    
			    //Blocks: RuinsFadedWallCracked
			    Item itemRuinsFadedWallCracked = Item.getItemFromBlock(RuinsFadedWallCracked);
			    ModelResourceLocation modelRuinsFadedWallCracked = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallCracked, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallCracked, modelRuinsFadedWallCracked);
			    mesher.register(itemRuinsFadedWallCracked, 0, modelRuinsFadedWallCracked);{
	  			}
			    
			    //Blocks: RuinsPurple
			    Item itemRuinsPurple = Item.getItemFromBlock(RuinsPurple);
			    ModelResourceLocation modelRuinsPurple = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPurple, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPurple, modelRuinsPurple);
			    mesher.register(itemRuinsPurple, 0, modelRuinsPurple);{
	  			}
			    
			    //Blocks: RuinsPurple2
			    Item itemRuinsPurple2 = Item.getItemFromBlock(RuinsPurple2);
			    ModelResourceLocation modelRuinsPurple2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPurple2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPurple2, modelRuinsPurple2);
			    mesher.register(itemRuinsPurple2, 0, modelRuinsPurple2);{
	  			}
			    
			    //Blocks: RuinsPurple3
			    Item itemRuinsPurple3 = Item.getItemFromBlock(RuinsPurple3);
			    ModelResourceLocation modelRuinsPurple3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPurple3, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPurple3, modelRuinsPurple3);
			    mesher.register(itemRuinsPurple3, 0, modelRuinsPurple3);{
	  			}
			    
			    //Blocks: RuinsPurple4
			    Item itemRuinsPurple4 = Item.getItemFromBlock(RuinsPurple4);
			    ModelResourceLocation modelRuinsPurple4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPurple4, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPurple4, modelRuinsPurple4);
			    mesher.register(itemRuinsPurple4, 0, modelRuinsPurple4);{
	  			}
			    
			    //Blocks: RuinsBlack
			    Item itemRuinsBlack = Item.getItemFromBlock(RuinsBlack);
			    ModelResourceLocation modelRuinsBlack = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsBlack, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsBlack, modelRuinsBlack);
			    mesher.register(itemRuinsBlack, 0, modelRuinsBlack);{
	  			}
			    
			    //Blocks: RuinsCrackedBlock
			    Item itemRuinsCrackedBlock = Item.getItemFromBlock(RuinsCrackedBlock);
			    ModelResourceLocation modelRuinsCrackedBlock = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsCrackedBlock, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsCrackedBlock, modelRuinsCrackedBlock);
			    mesher.register(itemRuinsCrackedBlock, 0, modelRuinsCrackedBlock);{
	  			}
			    
			    Item itemSpike = Item.getItemFromBlock(SpikePressurePlate);
			    ModelResourceLocation modelSpike = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpikePressurePlate, "inventory");
			    ModelLoader.registerItemVariants(itemSpike, modelSpike);
			    mesher.register(itemSpike, 0, modelSpike);{
			    }
			    
			    Item itemPad = Item.getItemFromBlock(PadPressurePlate);
			    ModelResourceLocation modelPad = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PadPressurePlate, "inventory");
			    ModelLoader.registerItemVariants(itemPad, modelPad);
			    mesher.register(itemPad, 0, modelPad);{
			    }
			    
			    Item itemPad2 = Item.getItemFromBlock(PadPressurePlate2);
			    ModelResourceLocation modelPad2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PadPressurePlate2, "inventory");
			    ModelLoader.registerItemVariants(itemPad2, modelPad2);
			    mesher.register(itemPad2, 0, modelPad2);{
			    }
			    
			    Item itemPad3 = Item.getItemFromBlock(PadPressurePlate3);
			    ModelResourceLocation modelPad3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PadPressurePlate3, "inventory");
			    ModelLoader.registerItemVariants(itemPad3, modelPad3);
			    mesher.register(itemPad3, 0, modelPad3);{
			    }
			    
			    Item itemPad4 = Item.getItemFromBlock(PadPressurePlate4);
			    ModelResourceLocation modelPad4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PadPressurePlate4, "inventory");
			    ModelLoader.registerItemVariants(itemPad4, modelPad4);
			    mesher.register(itemPad4, 0, modelPad4);{
			    }
			    
			    Item itemSpike2 = Item.getItemFromBlock(SpikePressurePlate2);
			    ModelResourceLocation modelSpike2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpikePressurePlate2, "inventory");
			    ModelLoader.registerItemVariants(itemSpike2, modelSpike2);
			    mesher.register(itemSpike2, 0, modelSpike2);{
			    }
			    
			    Item itemSwitch = Item.getItemFromBlock(WallSwitch);
			    ModelResourceLocation modelSwitch = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Switch, "inventory");
			    ModelLoader.registerItemVariants(itemSwitch, modelSwitch);
			    mesher.register(itemSwitch, 0, modelSwitch);{
			    }
			    
			    Item itemSwitch2 = Item.getItemFromBlock(WallSwitch2);
			    ModelResourceLocation modelSwitch2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Switch2, "inventory");
			    ModelLoader.registerItemVariants(itemSwitch2, modelSwitch2);
			    mesher.register(itemSwitch2, 0, modelSwitch2);{
			    }
			    
			    Item itemSwitch3 = Item.getItemFromBlock(WallSwitch3);
			    ModelResourceLocation modelSwitch3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Switch3, "inventory");
			    ModelLoader.registerItemVariants(itemSwitch3, modelSwitch3);
			    mesher.register(itemSwitch3, 0, modelSwitch3);{
			    }
			    
			    //Blocks: RuinsTriangle
			    Item itemRuinsTriangle = Item.getItemFromBlock(RuinsTriangle);
			    ModelResourceLocation modelRuinsTriangle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsTriangle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsTriangle, modelRuinsTriangle);
			    mesher.register(itemRuinsTriangle, 0, modelRuinsTriangle);{
	  			}
				
				//Blocks: RuinsTriangle2
			    Item itemRuinsTriangle2 = Item.getItemFromBlock(RuinsTriangle2);
			    ModelResourceLocation modelRuinsTriangle2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsTriangle2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsTriangle2, modelRuinsTriangle2);
			    mesher.register(itemRuinsTriangle2, 0, modelRuinsTriangle2);{
	  			}
				
				//Blocks: RuinsCircle
			    Item itemRuinsCircle = Item.getItemFromBlock(RuinsCircle);
			    ModelResourceLocation modelRuinsCircle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsCircle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsCircle, modelRuinsCircle);
			    mesher.register(itemRuinsCircle, 0, modelRuinsCircle);{
	  			}
				
				//Blocks: RuinsCircle2
			    Item itemRuinsCircle2 = Item.getItemFromBlock(RuinsCircle2);
			    ModelResourceLocation modelRuinsCircle2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsCircle2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsCircle2, modelRuinsCircle2);
			    mesher.register(itemRuinsCircle2, 0, modelRuinsCircle2);{
	  			}
				
				//Blocks: RuinsCircle3
			    Item itemRuinsCircle3 = Item.getItemFromBlock(RuinsCircle3);
			    ModelResourceLocation modelRuinsCircle3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsCircle3, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsCircle3, modelRuinsCircle3);
			    mesher.register(itemRuinsCircle3, 0, modelRuinsCircle3);{
	  			}
				
				//Blocks: RuinsHalfCircle
			    Item itemRuinsHalfCircle = Item.getItemFromBlock(RuinsHalfCircle);
			    ModelResourceLocation modelRuinsHalfCircle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsHalfCircle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsHalfCircle, modelRuinsHalfCircle);
			    mesher.register(itemRuinsHalfCircle, 0, modelRuinsHalfCircle);{
	  			}
				
				//Blocks: RuinsInvertedCircle
			    Item itemRuinsInvertedCircle = Item.getItemFromBlock(RuinsInvertedCircle);
			    ModelResourceLocation modelRuinsInvertedCircle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsInvertedCircle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsInvertedCircle, modelRuinsInvertedCircle);
			    mesher.register(itemRuinsInvertedCircle, 0, modelRuinsInvertedCircle);{
	  			}
			    
				//Blocks: RuinsBridge
			    Item itemRuinsBridge = Item.getItemFromBlock(RuinsBridge);
			    ModelResourceLocation modelRuinsBridge = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsBridge, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsBridge, modelRuinsBridge);
			    mesher.register(itemRuinsBridge, 0, modelRuinsBridge);{
	  			}


			    
			    

				

	  		
			

				
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

