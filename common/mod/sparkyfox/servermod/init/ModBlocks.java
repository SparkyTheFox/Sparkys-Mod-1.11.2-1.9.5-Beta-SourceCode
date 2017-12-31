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
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar1;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar2;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar3;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar4;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar5;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar6;
import mod.sparkyfox.servermod.block.adventure.BlockDoorPillar7;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate2;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate3;
import mod.sparkyfox.servermod.block.adventure.BlockPadPressurePlate4;
import mod.sparkyfox.servermod.block.adventure.BlockRedFlowers;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsBlack;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsBridge;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCircle3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsCrackedBlock;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorBottomLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorBottomRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorMiddleLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorMiddleRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar1;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar4;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar5;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar6;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorPillar7;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorTopLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoorTopRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWall;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottom2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottomVentLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottomVentMiddle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallBottomVentRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallCracked;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallTop;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallTopVentLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallTopVentMiddle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsFadedWallTopVentRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsGrey;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsHalfCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsInvertedCircle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsLightGrey;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsMossPurple;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsMossPurple3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPad;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPathFlowerBottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPathFlowerCorner;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPathFlowerSide;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPathItem1;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPathItem2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsPurple4;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsStairs;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsStone;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsTriangle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsTriangle2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWall;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallArrows;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallBottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked2;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallCracked3;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallGapLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallGapMiddle;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallGapRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallMouseHouse;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallSign;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallSignLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallSignRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallText;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWallTop;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWhite;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWindow;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsWindowCorner;
import mod.sparkyfox.servermod.block.adventure.BlockSpikePressurePlate;
import mod.sparkyfox.servermod.block.adventure.BlockSpikePressurePlate2;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch2;
import mod.sparkyfox.servermod.block.adventure.BlockSwitch3;
import mod.sparkyfox.servermod.block.adventure.BlockYellowFlowers;
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
import mod.sparkyfox.servermod.props.adventure.PropBlueButton;
import mod.sparkyfox.servermod.props.adventure.PropGreenButton;
import mod.sparkyfox.servermod.props.adventure.PropRedButton3;
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
	  public static BlockRuinsFadedWallBottom2 RuinsFadedWallBottom2;
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
	  public static BlockRuinsPad RuinsPad;
	  public static BlockRuinsFadedWallBottomVentLeft RuinsFadedWallBottomVentLeft;
	  public static BlockRuinsFadedWallBottomVentMiddle RuinsFadedWallBottomVentMiddle;
	  public static BlockRuinsFadedWallBottomVentRight RuinsFadedWallBottomVentRight;
	  public static BlockRuinsStone RuinsStone;
	  public static BlockRuinsWindow RuinsWindow;
	  public static BlockRuinsWindowCorner RuinsWindowCorner;
	  public static BlockRuinsWallSign RuinsWallSign;
	  public static BlockRuinsWallSignLeft RuinsWallSignLeft;
	  public static BlockRuinsWallSignRight RuinsWallSignRight;
	  public static BlockRuinsWallGapRight RuinsWallGapRight;
	  public static BlockRuinsWallGapMiddle RuinsWallGapMiddle;
	  public static BlockRuinsWallGapLeft RuinsWallGapLeft;
	  public static BlockRuinsWallArrows RuinsWallArrows;
	  public static BlockRuinsWallText RuinsWallText;
	  public static BlockRuinsWallMouseHouse RuinsWallMouseHouse;
	  public static BlockYellowFlowers YellowFlowers;
	  public static BlockRedFlowers RedFlowers;
	  public static BlockRuinsFadedWallTopVentLeft RuinsFadedWallTopVentLeft;
	  public static BlockRuinsFadedWallTopVentMiddle RuinsFadedWallTopVentMiddle;
	  public static BlockRuinsFadedWallTopVentRight RuinsFadedWallTopVentRight;
	  public static BlockRuinsDoorPillar1 RuinsDoorPillar1;
	  public static BlockRuinsDoorPillar2 RuinsDoorPillar2;
	  public static BlockRuinsDoorPillar3 RuinsDoorPillar3;
	  public static BlockRuinsDoorPillar4 RuinsDoorPillar4;
	  public static BlockRuinsDoorPillar5 RuinsDoorPillar5;
	  public static BlockRuinsDoorPillar6 RuinsDoorPillar6;
	  public static BlockRuinsDoorPillar7 RuinsDoorPillar7;
	  public static BlockDoorPillar1 DoorPillar1;
	  public static BlockDoorPillar2 DoorPillar2;
	  public static BlockDoorPillar3 DoorPillar3;
	  public static BlockDoorPillar4 DoorPillar4;
	  public static BlockDoorPillar5 DoorPillar5;
	  public static BlockDoorPillar6 DoorPillar6;
	  public static BlockDoorPillar7 DoorPillar7;
	  public static BlockRuinsPathItem1 RuinsPathItem1;
	  public static BlockRuinsPathItem2 RuinsPathItem2;
	  public static BlockRuinsPathFlowerSide RuinsPathFlowerSide;
	  public static BlockRuinsPathFlowerCorner RuinsPathFlowerCorner;
	  public static BlockRuinsPathFlowerBottom RuinsPathFlowerBottom;
	  public static BlockRuinsMossPurple RuinsMossPurple;
	  public static BlockRuinsMossPurple3 RuinsMossPurple3;
	  
	  public static BlockRuinsDoorTopLeft  RuinsDoorTopLeft;
	  public static BlockRuinsDoorMiddleLeft RuinsDoorMiddleLeft;
	  public static BlockRuinsDoorBottomLeft  RuinsDoorBottomLeft;
	  public static BlockRuinsDoorTopRight RuinsDoorTopRight;
	  public static BlockRuinsDoorMiddleRight  RuinsDoorMiddleRight;
	  public static BlockRuinsDoorBottomRight  RuinsDoorBottomRight;
	  public static BlockRuinsWhite RuinsWhite;
	  public static BlockRuinsLightGrey RuinsLightGrey;
	  public static BlockRuinsGrey RuinsGrey;
	  public static BlockRuinsStairs RuinsStairs;
	  
	  public static PropRedButton3 RedButton3;
	  public static PropBlueButton BlueButton;
	  public static PropGreenButton GreenButton;
	  
	  




	  
	  
	  
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
		  
		  ResourceLocation FadedWallBottom2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallBottom2);
		  RuinsFadedWallBottom2 = new BlockRuinsFadedWallBottom2();
		  RuinsFadedWallBottom2.setRegistryName(FadedWallBottom2);
		  GameRegistry.register(RuinsFadedWallBottom2);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallBottom2), FadedWallBottom2);
		  
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
		  
		  ResourceLocation Pad = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPad);
		  RuinsPad = new BlockRuinsPad();
		  RuinsPad.setRegistryName(Pad);
		  GameRegistry.register(RuinsPad);
		  GameRegistry.register(new ItemBlock(RuinsPad), Pad);
		  
		  ResourceLocation FadedWallBottomVentLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallBottomVentLeft);
		  RuinsFadedWallBottomVentLeft = new BlockRuinsFadedWallBottomVentLeft();
		  RuinsFadedWallBottomVentLeft.setRegistryName(FadedWallBottomVentLeft);
		  GameRegistry.register(RuinsFadedWallBottomVentLeft);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallBottomVentLeft), FadedWallBottomVentLeft);
		  
		  ResourceLocation FadedWallBottomVentMiddle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallBottomVentMiddle);
		  RuinsFadedWallBottomVentMiddle = new BlockRuinsFadedWallBottomVentMiddle();
		  RuinsFadedWallBottomVentMiddle.setRegistryName(FadedWallBottomVentMiddle);
		  GameRegistry.register(RuinsFadedWallBottomVentMiddle);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallBottomVentMiddle), FadedWallBottomVentMiddle);
		  
		  ResourceLocation FadedWallBottomVentRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallBottomVentRight);
		  RuinsFadedWallBottomVentRight = new BlockRuinsFadedWallBottomVentRight();
		  RuinsFadedWallBottomVentRight.setRegistryName(FadedWallBottomVentRight);
		  GameRegistry.register(RuinsFadedWallBottomVentRight);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallBottomVentRight), FadedWallBottomVentRight);
		  
		  ResourceLocation Stone = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsStone);
		  RuinsStone = new BlockRuinsStone();
		  RuinsStone.setRegistryName(Stone);
		  GameRegistry.register(RuinsStone);
		  GameRegistry.register(new ItemBlock(RuinsStone), Stone);
		  
		  ResourceLocation Window = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWindow);
		  RuinsWindow = new BlockRuinsWindow();
		  RuinsWindow.setRegistryName(Window);
		  GameRegistry.register(RuinsWindow);
		  GameRegistry.register(new ItemBlock(RuinsWindow), Window);
		  
		  ResourceLocation WindowCorner = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWindowCorner);
		  RuinsWindowCorner = new BlockRuinsWindowCorner();
		  RuinsWindowCorner.setRegistryName(WindowCorner);
		  GameRegistry.register(RuinsWindowCorner);
		  GameRegistry.register(new ItemBlock(RuinsWindowCorner), WindowCorner);
		  
		  ResourceLocation WallSign = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallSign);
		  RuinsWallSign = new BlockRuinsWallSign();
		  RuinsWallSign.setRegistryName(WallSign);
		  GameRegistry.register(RuinsWallSign);
		  GameRegistry.register(new ItemBlock(RuinsWallSign), WallSign);
		  
		  ResourceLocation WallSignLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallSignLeft);
		  RuinsWallSignLeft = new BlockRuinsWallSignLeft();
		  RuinsWallSignLeft.setRegistryName(WallSignLeft);
		  GameRegistry.register(RuinsWallSignLeft);
		  GameRegistry.register(new ItemBlock(RuinsWallSignLeft), WallSignLeft);
		  
		  ResourceLocation WallSignRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallSignRight);
		  RuinsWallSignRight = new BlockRuinsWallSignRight();
		  RuinsWallSignRight.setRegistryName(WallSignRight);
		  GameRegistry.register(RuinsWallSignRight);
		  GameRegistry.register(new ItemBlock(RuinsWallSignRight), WallSignRight);
		  
		  ResourceLocation WallGapRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallGapRight);
		  RuinsWallGapRight = new BlockRuinsWallGapRight();
		  RuinsWallGapRight.setRegistryName(WallGapRight);
		  GameRegistry.register(RuinsWallGapRight);
		  GameRegistry.register(new ItemBlock(RuinsWallGapRight), WallGapRight);
		  
		  ResourceLocation WallGapMiddle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallGapMiddle);
		  RuinsWallGapMiddle = new BlockRuinsWallGapMiddle();
		  RuinsWallGapMiddle.setRegistryName(WallGapMiddle);
		  GameRegistry.register(RuinsWallGapMiddle);
		  GameRegistry.register(new ItemBlock(RuinsWallGapMiddle), WallGapMiddle);
		  
		  ResourceLocation WallGapLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallGapLeft);
		  RuinsWallGapLeft = new BlockRuinsWallGapLeft();
		  RuinsWallGapLeft.setRegistryName(WallGapLeft);
		  GameRegistry.register(RuinsWallGapLeft);
		  GameRegistry.register(new ItemBlock(RuinsWallGapLeft), WallGapLeft);
		  
		  ResourceLocation WallArrows = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallArrows);
		  RuinsWallArrows = new BlockRuinsWallArrows();
		  RuinsWallArrows.setRegistryName(WallArrows);
		  GameRegistry.register(RuinsWallArrows);
		  GameRegistry.register(new ItemBlock(RuinsWallArrows), WallArrows);
		  
		  ResourceLocation WallText = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallText);
		  RuinsWallText = new BlockRuinsWallText();
		  RuinsWallText.setRegistryName(WallText);
		  GameRegistry.register(RuinsWallText);
		  GameRegistry.register(new ItemBlock(RuinsWallText), WallText);
		  
		  ResourceLocation WallMouseHouse = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWallMouseHouse);
		  RuinsWallMouseHouse = new BlockRuinsWallMouseHouse();
		  RuinsWallMouseHouse.setRegistryName(WallMouseHouse);
		  GameRegistry.register(RuinsWallMouseHouse);
		  GameRegistry.register(new ItemBlock(RuinsWallMouseHouse), WallMouseHouse);
		  
		  ResourceLocation YFlowers = new ResourceLocation(ServerMod.MOD_ID, ModNames.YellowFlowers);
		  YellowFlowers = new BlockYellowFlowers();
		  YellowFlowers.setRegistryName(YFlowers);
		  GameRegistry.register(YellowFlowers);
		  GameRegistry.register(new ItemBlock(YellowFlowers), YFlowers);
		  
		  ResourceLocation RFlowers = new ResourceLocation(ServerMod.MOD_ID, ModNames.RedFlowers);
		  RedFlowers = new BlockRedFlowers();
		  RedFlowers.setRegistryName(RFlowers);
		  GameRegistry.register(RedFlowers);
		  GameRegistry.register(new ItemBlock(RedFlowers), RFlowers);
		  
		  ResourceLocation FadedWallTopVentLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallTopVentLeft);
		  RuinsFadedWallTopVentLeft = new BlockRuinsFadedWallTopVentLeft();
		  RuinsFadedWallTopVentLeft.setRegistryName(FadedWallTopVentLeft);
		  GameRegistry.register(RuinsFadedWallTopVentLeft);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallTopVentLeft), FadedWallTopVentLeft);
		  
		  ResourceLocation FadedWallTopVentMiddle = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallTopVentMiddle);
		  RuinsFadedWallTopVentMiddle = new BlockRuinsFadedWallTopVentMiddle();
		  RuinsFadedWallTopVentMiddle.setRegistryName(FadedWallTopVentMiddle);
		  GameRegistry.register(RuinsFadedWallTopVentMiddle);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallTopVentMiddle), FadedWallTopVentMiddle);
		  
		  ResourceLocation FadedWallTopVentRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsFadedWallTopVentRight);
		  RuinsFadedWallTopVentRight = new BlockRuinsFadedWallTopVentRight();
		  RuinsFadedWallTopVentRight.setRegistryName(FadedWallTopVentRight);
		  GameRegistry.register(RuinsFadedWallTopVentRight);
		  GameRegistry.register(new ItemBlock(RuinsFadedWallTopVentRight), FadedWallTopVentRight);	
		  
		  ResourceLocation RDoorPillar1 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar1);
		  RuinsDoorPillar1 = new BlockRuinsDoorPillar1();
		  RuinsDoorPillar1.setRegistryName(RDoorPillar1);
		  GameRegistry.register(RuinsDoorPillar1);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar1), RDoorPillar1);
		  
		  ResourceLocation RDoorPillar2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar2);
		  RuinsDoorPillar2 = new BlockRuinsDoorPillar2();
		  RuinsDoorPillar2.setRegistryName(RDoorPillar2);
		  GameRegistry.register(RuinsDoorPillar2);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar2), RDoorPillar2);
		  
		  ResourceLocation RDoorPillar3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar3);
		  RuinsDoorPillar3 = new BlockRuinsDoorPillar3();
		  RuinsDoorPillar3.setRegistryName(RDoorPillar3);
		  GameRegistry.register(RuinsDoorPillar3);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar3), RDoorPillar3);
		  
		  ResourceLocation RDoorPillar4 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar4);
		  RuinsDoorPillar4 = new BlockRuinsDoorPillar4();
		  RuinsDoorPillar4.setRegistryName(RDoorPillar4);
		  GameRegistry.register(RuinsDoorPillar4);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar4), RDoorPillar4);
		  
		  ResourceLocation RDoorPillar5 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar5);
		  RuinsDoorPillar5 = new BlockRuinsDoorPillar5();
		  RuinsDoorPillar5.setRegistryName(RDoorPillar5);
		  GameRegistry.register(RuinsDoorPillar5);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar5), RDoorPillar5);
		  
		  ResourceLocation RDoorPillar6 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar6);
		  RuinsDoorPillar6 = new BlockRuinsDoorPillar6();
		  RuinsDoorPillar6.setRegistryName(RDoorPillar6);
		  GameRegistry.register(RuinsDoorPillar6);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar6), RDoorPillar6);
		  
		  ResourceLocation RDoorPillar7 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorPillar7);
		  RuinsDoorPillar7 = new BlockRuinsDoorPillar7();
		  RuinsDoorPillar7.setRegistryName(RDoorPillar7);
		  GameRegistry.register(RuinsDoorPillar7);
		  GameRegistry.register(new ItemBlock(RuinsDoorPillar7), RDoorPillar7);
		  
		  ResourceLocation HallDoorPillar1 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar1);
		  DoorPillar1 = new BlockDoorPillar1();
		  DoorPillar1.setRegistryName(HallDoorPillar1);
		  GameRegistry.register(DoorPillar1);
		  GameRegistry.register(new ItemBlock(DoorPillar1), HallDoorPillar1);
		  
		  ResourceLocation HallDoorPillar2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar2);
		  DoorPillar2 = new BlockDoorPillar2();
		  DoorPillar2.setRegistryName(HallDoorPillar2);
		  GameRegistry.register(DoorPillar2);
		  GameRegistry.register(new ItemBlock(DoorPillar2), HallDoorPillar2);
		  
		  ResourceLocation HallDoorPillar3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar3);
		  DoorPillar3 = new BlockDoorPillar3();
		  DoorPillar3.setRegistryName(HallDoorPillar3);
		  GameRegistry.register(DoorPillar3);
		  GameRegistry.register(new ItemBlock(DoorPillar3), HallDoorPillar3);
		  
		  ResourceLocation HallDoorPillar4 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar4);
		  DoorPillar4 = new BlockDoorPillar4();
		  DoorPillar4.setRegistryName(HallDoorPillar4);
		  GameRegistry.register(DoorPillar4);
		  GameRegistry.register(new ItemBlock(DoorPillar4), HallDoorPillar4);
		  
		  ResourceLocation HallDoorPillar5 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar5);
		  DoorPillar5 = new BlockDoorPillar5();
		  DoorPillar5.setRegistryName(HallDoorPillar5);
		  GameRegistry.register(DoorPillar5);
		  GameRegistry.register(new ItemBlock(DoorPillar5), HallDoorPillar5);
		  
		  ResourceLocation HallDoorPillar6 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar6);
		  DoorPillar6 = new BlockDoorPillar6();
		  DoorPillar6.setRegistryName(HallDoorPillar6);
		  GameRegistry.register(DoorPillar6);
		  GameRegistry.register(new ItemBlock(DoorPillar6), HallDoorPillar6);
		  
		  ResourceLocation HallDoorPillar7 = new ResourceLocation(ServerMod.MOD_ID, ModNames.DoorPillar7);
		  DoorPillar7 = new BlockDoorPillar7();
		  DoorPillar7.setRegistryName(HallDoorPillar7);
		  GameRegistry.register(DoorPillar7);
		  GameRegistry.register(new ItemBlock(DoorPillar7), HallDoorPillar7);
		  
		  ResourceLocation PathItem1 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPathItem1);
		  RuinsPathItem1 = new BlockRuinsPathItem1();
		  RuinsPathItem1.setRegistryName(PathItem1);
		  GameRegistry.register(RuinsPathItem1);
		  GameRegistry.register(new ItemBlock(RuinsPathItem1), PathItem1);
		  
		  ResourceLocation PathItem2 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPathItem2);
		  RuinsPathItem2 = new BlockRuinsPathItem2();
		  RuinsPathItem2.setRegistryName(PathItem2);
		  GameRegistry.register(RuinsPathItem2);
		  GameRegistry.register(new ItemBlock(RuinsPathItem2), PathItem2);
		  
		  ResourceLocation PathFlowerSide = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPathFlowerSide);
		  RuinsPathFlowerSide = new BlockRuinsPathFlowerSide();
		  RuinsPathFlowerSide.setRegistryName(PathFlowerSide);
		  GameRegistry.register(RuinsPathFlowerSide);
		  GameRegistry.register(new ItemBlock(RuinsPathFlowerSide), PathFlowerSide);
		  
		  ResourceLocation PathFlowerCorner = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPathFlowerCorner);
		  RuinsPathFlowerCorner = new BlockRuinsPathFlowerCorner();
		  RuinsPathFlowerCorner.setRegistryName(PathFlowerCorner);
		  GameRegistry.register(RuinsPathFlowerCorner);
		  GameRegistry.register(new ItemBlock(RuinsPathFlowerCorner), PathFlowerCorner);
		  
		  ResourceLocation PathFlowerBottom = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsPathFlowerBottom);
		  RuinsPathFlowerBottom = new BlockRuinsPathFlowerBottom();
		  RuinsPathFlowerBottom.setRegistryName(PathFlowerBottom);
		  GameRegistry.register(RuinsPathFlowerBottom);
		  GameRegistry.register(new ItemBlock(RuinsPathFlowerBottom), PathFlowerBottom);
		  
		  ResourceLocation MossPurple = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsMossPurple);
		  RuinsMossPurple = new BlockRuinsMossPurple();
		  RuinsMossPurple.setRegistryName(MossPurple);
		  GameRegistry.register(RuinsMossPurple);
		  GameRegistry.register(new ItemBlock(RuinsMossPurple), MossPurple);
		  
		  ResourceLocation MossPurple3 = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsMossPurple3);
		  RuinsMossPurple3 = new BlockRuinsMossPurple3();
		  RuinsMossPurple3.setRegistryName(MossPurple3);
		  GameRegistry.register(RuinsMossPurple3);
		  GameRegistry.register(new ItemBlock(RuinsMossPurple3), MossPurple3);
		  
		  ResourceLocation DoorTopRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorTopRight);
		  RuinsDoorTopRight = new BlockRuinsDoorTopRight();
		  RuinsDoorTopRight.setRegistryName(DoorTopRight);
		  GameRegistry.register(RuinsDoorTopRight);
		  GameRegistry.register(new ItemBlock(RuinsDoorTopRight), DoorTopRight);
		  
		  ResourceLocation DoorMiddleRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorMiddleRight);
		  RuinsDoorMiddleRight = new BlockRuinsDoorMiddleRight();
		  RuinsDoorMiddleRight.setRegistryName(DoorMiddleRight);
		  GameRegistry.register(RuinsDoorMiddleRight);
		  GameRegistry.register(new ItemBlock(RuinsDoorMiddleRight), DoorMiddleRight);
		  
		  ResourceLocation DoorBottomRight = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorBottomRight);
		  RuinsDoorBottomRight = new BlockRuinsDoorBottomRight();
		  RuinsDoorBottomRight.setRegistryName(DoorBottomRight);
		  GameRegistry.register(RuinsDoorBottomRight);
		  GameRegistry.register(new ItemBlock(RuinsDoorBottomRight), DoorBottomRight);
		  
		  ResourceLocation DoorTopLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorTopLeft);
		  RuinsDoorTopLeft = new BlockRuinsDoorTopLeft();
		  RuinsDoorTopLeft.setRegistryName(DoorTopLeft);
		  GameRegistry.register(RuinsDoorTopLeft);
		  GameRegistry.register(new ItemBlock(RuinsDoorTopLeft), DoorTopLeft);
		  
		  ResourceLocation DoorMiddleLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorMiddleLeft);
		  RuinsDoorMiddleLeft = new BlockRuinsDoorMiddleLeft();
		  RuinsDoorMiddleLeft.setRegistryName(DoorMiddleLeft);
		  GameRegistry.register(RuinsDoorMiddleLeft);
		  GameRegistry.register(new ItemBlock(RuinsDoorMiddleLeft), DoorMiddleLeft);
		  
		  ResourceLocation DoorBottomLeft = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsDoorBottomLeft);
		  RuinsDoorBottomLeft = new BlockRuinsDoorBottomLeft();
		  RuinsDoorBottomLeft.setRegistryName(DoorBottomLeft);
		  GameRegistry.register(RuinsDoorBottomLeft);
		  GameRegistry.register(new ItemBlock(RuinsDoorBottomLeft), DoorBottomLeft);
		  
		  ResourceLocation Grey = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsGrey);
		  RuinsGrey = new BlockRuinsGrey();
		  RuinsGrey.setRegistryName(Grey);
		  GameRegistry.register(RuinsGrey);
		  GameRegistry.register(new ItemBlock(RuinsGrey), Grey);
		  
		  ResourceLocation LightGrey = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsLightGrey);
		  RuinsLightGrey = new BlockRuinsLightGrey();
		  RuinsLightGrey.setRegistryName(LightGrey);
		  GameRegistry.register(RuinsLightGrey);
		  GameRegistry.register(new ItemBlock(RuinsLightGrey), LightGrey);
		  
		  ResourceLocation White = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsWhite);
		  RuinsWhite = new BlockRuinsWhite();
		  RuinsWhite.setRegistryName(White);
		  GameRegistry.register(RuinsWhite);
		  GameRegistry.register(new ItemBlock(RuinsWhite), White);
		  
		  ResourceLocation Stairs = new ResourceLocation(ServerMod.MOD_ID, ModNames.RuinsStairs);
		  RuinsStairs = new BlockRuinsStairs();
		  RuinsStairs.setRegistryName(Stairs);
		  GameRegistry.register(RuinsStairs);
		  GameRegistry.register(new ItemBlock(RuinsStairs), Stairs);
		  
		  ResourceLocation Red = new ResourceLocation(ServerMod.MOD_ID, ModNames.RedButton3);
		  RedButton3 = new PropRedButton3();
		  RedButton3.setRegistryName(Red);
		  GameRegistry.register(RedButton3);
		  GameRegistry.register(new ItemBlock(RedButton3), Red);
		  
		  ResourceLocation Blue = new ResourceLocation(ServerMod.MOD_ID, ModNames.BlueButton);
		  BlueButton = new PropBlueButton();
		  BlueButton.setRegistryName(Blue);
		  GameRegistry.register(BlueButton);
		  GameRegistry.register(new ItemBlock(BlueButton), Blue);
		  
		  ResourceLocation Green = new ResourceLocation(ServerMod.MOD_ID, ModNames.GreenButton);
		  GreenButton = new PropGreenButton();
		  GreenButton.setRegistryName(Green);
		  GameRegistry.register(GreenButton);
		  GameRegistry.register(new ItemBlock(GreenButton), Green);
		  
		  

		 
		  
		  
		  
		  
		  
		  
		
		  

		  
		  
		  
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
			    
			    //Blocks: RuinsFadedWallBottom2
			    Item itemRuinsFadedWallBottom2 = Item.getItemFromBlock(RuinsFadedWallBottom2);
			    ModelResourceLocation modelRuinsFadedWallBottom2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottom2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallBottom2, modelRuinsFadedWallBottom2);
			    mesher.register(itemRuinsFadedWallBottom2, 0, modelRuinsFadedWallBottom2);{
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
			    
				//Blocks: RuinsPad
			    Item itemRuinsPad = Item.getItemFromBlock(RuinsPad);
			    ModelResourceLocation modelRuinsPad = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPad, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPad, modelRuinsPad);
			    mesher.register(itemRuinsPad, 0, modelRuinsPad);{
	  			}
				
				//Blocks: RuinsFadedWallBottomVentLeft
			    Item itemRuinsFadedWallBottomVentLeft = Item.getItemFromBlock(RuinsFadedWallBottomVentLeft);
			    ModelResourceLocation modelRuinsFadedWallBottomVentLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottomVentLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallBottomVentLeft, modelRuinsFadedWallBottomVentLeft);
			    mesher.register(itemRuinsFadedWallBottomVentLeft, 0, modelRuinsFadedWallBottomVentLeft);{
	  			}
				
				//Blocks: RuinsFadedWallBottomVentMiddle
			    Item itemRuinsFadedWallBottomVentMiddle = Item.getItemFromBlock(RuinsFadedWallBottomVentMiddle);
			    ModelResourceLocation modelRuinsFadedWallBottomVentMiddle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottomVentMiddle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallBottomVentMiddle, modelRuinsFadedWallBottomVentMiddle);
			    mesher.register(itemRuinsFadedWallBottomVentMiddle, 0, modelRuinsFadedWallBottomVentMiddle);{
	  			}
				
				//Blocks: RuinsFadedWallBottomVentRight
			    Item itemRuinsFadedWallBottomVentRight = Item.getItemFromBlock(RuinsFadedWallBottomVentRight);
			    ModelResourceLocation modelRuinsFadedWallBottomVentRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottomVentRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallBottomVentRight, modelRuinsFadedWallBottomVentRight);
			    mesher.register(itemRuinsFadedWallBottomVentRight, 0, modelRuinsFadedWallBottomVentRight);{
	  			}
				
				//Blocks: RuinsStone
			    Item itemRuinsStone = Item.getItemFromBlock(RuinsStone);
			    ModelResourceLocation modelRuinsStone = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsStone, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsStone, modelRuinsStone);
			    mesher.register(itemRuinsStone, 0, modelRuinsStone);{
	  			}
				
				//Blocks: RuinsWindow
			    Item itemRuinsWindow = Item.getItemFromBlock(RuinsWindow);
			    ModelResourceLocation modelRuinsWindow = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWindow, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWindow, modelRuinsWindow);
			    mesher.register(itemRuinsWindow, 0, modelRuinsWindow);{
	  			}
				
				//Blocks: RuinsWindowCorner
			    Item itemRuinsWindowCorner = Item.getItemFromBlock(RuinsWindowCorner);
			    ModelResourceLocation modelRuinsWindowCorner = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWindowCorner, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWindowCorner, modelRuinsWindowCorner);
			    mesher.register(itemRuinsWindowCorner, 0, modelRuinsWindowCorner);{
	  			}
				
				//Blocks: RuinsWallSign
			    Item itemRuinsWallSign = Item.getItemFromBlock(RuinsWallSign);
			    ModelResourceLocation modelRuinsWallSign = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallSign, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallSign, modelRuinsWallSign);
			    mesher.register(itemRuinsWallSign, 0, modelRuinsWallSign);{
	  			}
				
				//Blocks: RuinsWallSignLeft
			    Item itemRuinsWallSignLeft = Item.getItemFromBlock(RuinsWallSignLeft);
			    ModelResourceLocation modelRuinsWallSignLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallSignLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallSignLeft, modelRuinsWallSignLeft);
			    mesher.register(itemRuinsWallSignLeft, 0, modelRuinsWallSignLeft);{
	  			}
				
				//Blocks: RuinsWallSignRight
			    Item itemRuinsWallSignRight = Item.getItemFromBlock(RuinsWallSignRight);
			    ModelResourceLocation modelRuinsWallSignRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallSignRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallSignRight, modelRuinsWallSignRight);
			    mesher.register(itemRuinsWallSignRight, 0, modelRuinsWallSignRight);{
	  			}
				
				//Blocks: RuinsWallGapRight
			    Item itemRuinsWallGapRight = Item.getItemFromBlock(RuinsWallGapRight);
			    ModelResourceLocation modelRuinsWallGapRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallGapRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallGapRight, modelRuinsWallGapRight);
			    mesher.register(itemRuinsWallGapRight, 0, modelRuinsWallGapRight);{
	  			}
				
				//Blocks: RuinsWallGapMiddle
			    Item itemRuinsWallGapMiddle = Item.getItemFromBlock(RuinsWallGapMiddle);
			    ModelResourceLocation modelRuinsWallGapMiddle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallGapMiddle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallGapMiddle, modelRuinsWallGapMiddle);
			    mesher.register(itemRuinsWallGapMiddle, 0, modelRuinsWallGapMiddle);{
	  			}
				
				//Blocks: RuinsWallGapLeft
			    Item itemRuinsWallGapLeft = Item.getItemFromBlock(RuinsWallGapLeft);
			    ModelResourceLocation modelRuinsWallGapLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallGapLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallGapLeft, modelRuinsWallGapLeft);
			    mesher.register(itemRuinsWallGapLeft, 0, modelRuinsWallGapLeft);{
	  			}
			    
			    //Blocks: RuinsWallArrows
			    Item itemRuinsWallArrows = Item.getItemFromBlock(RuinsWallArrows);
			    ModelResourceLocation modelRuinsWallArrows = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallArrows, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallArrows, modelRuinsWallArrows);
			    mesher.register(itemRuinsWallArrows, 0, modelRuinsWallArrows);{
	  			}
				
				//Blocks: RuinsWallText
			    Item itemRuinsWallText = Item.getItemFromBlock(RuinsWallText);
			    ModelResourceLocation modelRuinsWallText = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallText, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallText, modelRuinsWallText);
			    mesher.register(itemRuinsWallText, 0, modelRuinsWallText);{
	  			}
				
				//Blocks: RuinsWallMouseHouse
			    Item itemRuinsWallMouseHouse = Item.getItemFromBlock(RuinsWallMouseHouse);
			    ModelResourceLocation modelRuinsWallMouseHouse = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWallMouseHouse, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWallMouseHouse, modelRuinsWallMouseHouse);
			    mesher.register(itemRuinsWallMouseHouse, 0, modelRuinsWallMouseHouse);{
	  			}
				
				//Blocks: YellowFlowers
			    Item itemYellowFlowers = Item.getItemFromBlock(YellowFlowers);
			    ModelResourceLocation modelYellowFlowers = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.YellowFlowers, "inventory");
			    ModelLoader.registerItemVariants(itemYellowFlowers, modelYellowFlowers);
			    mesher.register(itemYellowFlowers, 0, modelYellowFlowers);{
	  			}
				
				//Blocks: RedFlowers
			    Item itemRedFlowers = Item.getItemFromBlock(RedFlowers);
			    ModelResourceLocation modelRedFlowers = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedFlowers, "inventory");
			    ModelLoader.registerItemVariants(itemRedFlowers, modelRedFlowers);
			    mesher.register(itemRedFlowers, 0, modelRedFlowers);{
	  			}
				
				//Blocks: RuinsFadedWallTopVentLeft
			    Item itemRuinsFadedWallTopVentLeft = Item.getItemFromBlock(RuinsFadedWallTopVentLeft);
			    ModelResourceLocation modelRuinsFadedWallTopVentLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallTopVentLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallTopVentLeft, modelRuinsFadedWallTopVentLeft);
			    mesher.register(itemRuinsFadedWallTopVentLeft, 0, modelRuinsFadedWallTopVentLeft);{
	  			}
				
				//Blocks: RuinsFadedWallTopVentMiddle
			    Item itemRuinsFadedWallTopVentMiddle = Item.getItemFromBlock(RuinsFadedWallTopVentMiddle);
			    ModelResourceLocation modelRuinsFadedWallTopVentMiddle = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallTopVentMiddle, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallTopVentMiddle, modelRuinsFadedWallTopVentMiddle);
			    mesher.register(itemRuinsFadedWallTopVentMiddle, 0, modelRuinsFadedWallTopVentMiddle);{
	  			}
				
				//Blocks: RuinsFadedWallTopVentRight
			    Item itemRuinsFadedWallTopVentRight = Item.getItemFromBlock(RuinsFadedWallTopVentRight);
			    ModelResourceLocation modelRuinsFadedWallTopVentRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallTopVentRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsFadedWallTopVentRight, modelRuinsFadedWallTopVentRight);
			    mesher.register(itemRuinsFadedWallTopVentRight, 0, modelRuinsFadedWallTopVentRight);{
	  			}
			    
				//Blocks: RuinsDoorPillar1
			    Item itemRuinsDoorPillar1 = Item.getItemFromBlock(RuinsDoorPillar1);
			    ModelResourceLocation modelRuinsDoorPillar1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar1, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar1, modelRuinsDoorPillar1);
			    mesher.register(itemRuinsDoorPillar1, 0, modelRuinsDoorPillar1);{
	  			}
				
				//Blocks: RuinsDoorPillar2
			    Item itemRuinsDoorPillar2 = Item.getItemFromBlock(RuinsDoorPillar2);
			    ModelResourceLocation modelRuinsDoorPillar2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar2, modelRuinsDoorPillar2);
			    mesher.register(itemRuinsDoorPillar2, 0, modelRuinsDoorPillar2);{
	  			}
				
				//Blocks: RuinsDoorPillar3
			    Item itemRuinsDoorPillar3 = Item.getItemFromBlock(RuinsDoorPillar3);
			    ModelResourceLocation modelRuinsDoorPillar3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar3, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar3, modelRuinsDoorPillar3);
			    mesher.register(itemRuinsDoorPillar3, 0, modelRuinsDoorPillar3);{
	  			}
				
				//Blocks: RuinsDoorPillar4
			    Item itemRuinsDoorPillar4 = Item.getItemFromBlock(RuinsDoorPillar4);
			    ModelResourceLocation modelRuinsDoorPillar4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar4, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar4, modelRuinsDoorPillar4);
			    mesher.register(itemRuinsDoorPillar4, 0, modelRuinsDoorPillar4);{
	  			}
				
				//Blocks: RuinsDoorPillar5
			    Item itemRuinsDoorPillar5 = Item.getItemFromBlock(RuinsDoorPillar5);
			    ModelResourceLocation modelRuinsDoorPillar5 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar5, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar5, modelRuinsDoorPillar5);
			    mesher.register(itemRuinsDoorPillar5, 0, modelRuinsDoorPillar5);{
	  			}
				
				//Blocks: RuinsDoorPillar6
			    Item itemRuinsDoorPillar6 = Item.getItemFromBlock(RuinsDoorPillar6);
			    ModelResourceLocation modelRuinsDoorPillar6 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar6, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar6, modelRuinsDoorPillar6);
			    mesher.register(itemRuinsDoorPillar6, 0, modelRuinsDoorPillar6);{
	  			}
				
				//Blocks: RuinsDoorPillar7
			    Item itemRuinsDoorPillar7 = Item.getItemFromBlock(RuinsDoorPillar7);
			    ModelResourceLocation modelRuinsDoorPillar7 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorPillar7, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorPillar7, modelRuinsDoorPillar7);
			    mesher.register(itemRuinsDoorPillar7, 0, modelRuinsDoorPillar7);{
	  			}
				
				//Blocks: DoorPillar1
			    Item itemDoorPillar1 = Item.getItemFromBlock(DoorPillar1);
			    ModelResourceLocation modelDoorPillar1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar1, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar1, modelDoorPillar1);
			    mesher.register(itemDoorPillar1, 0, modelDoorPillar1);{
	  			}
				
				//Blocks: DoorPillar2
			    Item itemDoorPillar2 = Item.getItemFromBlock(DoorPillar2);
			    ModelResourceLocation modelDoorPillar2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar2, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar2, modelDoorPillar2);
			    mesher.register(itemDoorPillar2, 0, modelDoorPillar2);{
	  			}
				
				//Blocks: DoorPillar3
			    Item itemDoorPillar3 = Item.getItemFromBlock(DoorPillar3);
			    ModelResourceLocation modelDoorPillar3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar3, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar3, modelDoorPillar3);
			    mesher.register(itemDoorPillar3, 0, modelDoorPillar3);{
	  			}
				
				//Blocks: DoorPillar4
			    Item itemDoorPillar4 = Item.getItemFromBlock(DoorPillar4);
			    ModelResourceLocation modelDoorPillar4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar4, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar4, modelDoorPillar4);
			    mesher.register(itemDoorPillar4, 0, modelDoorPillar4);{
	  			}
				
				//Blocks: DoorPillar5
			    Item itemDoorPillar5 = Item.getItemFromBlock(DoorPillar5);
			    ModelResourceLocation modelDoorPillar5 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar5, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar5, modelDoorPillar5);
			    mesher.register(itemDoorPillar5, 0, modelDoorPillar5);{
	  			}
				
				//Blocks: DoorPillar6
			    Item itemDoorPillar6 = Item.getItemFromBlock(DoorPillar6);
			    ModelResourceLocation modelDoorPillar6 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar6, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar6, modelDoorPillar6);
			    mesher.register(itemDoorPillar6, 0, modelDoorPillar6);{
	  			}
				
				//Blocks: DoorPillar7
			    Item itemDoorPillar7 = Item.getItemFromBlock(DoorPillar7);
			    ModelResourceLocation modelDoorPillar7 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DoorPillar7, "inventory");
			    ModelLoader.registerItemVariants(itemDoorPillar7, modelDoorPillar7);
			    mesher.register(itemDoorPillar7, 0, modelDoorPillar7);{
	  			}
			    
				//Blocks: RuinsPathItem1
			    Item itemRuinsPathItem1 = Item.getItemFromBlock(RuinsPathItem1);
			    ModelResourceLocation modelRuinsPathItem1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPathItem1, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPathItem1, modelRuinsPathItem1);
			    mesher.register(itemRuinsPathItem1, 0, modelRuinsPathItem1);{
	  			}
			    
				//Blocks: RuinsPathItem2
			    Item itemRuinsPathItem2 = Item.getItemFromBlock(RuinsPathItem2);
			    ModelResourceLocation modelRuinsPathItem2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPathItem2, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPathItem2, modelRuinsPathItem2);
			    mesher.register(itemRuinsPathItem2, 0, modelRuinsPathItem2);{
	  			}
			    
				//Blocks: RuinsPathFlowerSide
			    Item itemRuinsPathFlowerSide = Item.getItemFromBlock(RuinsPathFlowerSide);
			    ModelResourceLocation modelRuinsPathFlowerSide = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPathFlowerSide, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPathFlowerSide, modelRuinsPathFlowerSide);
			    mesher.register(itemRuinsPathFlowerSide, 0, modelRuinsPathFlowerSide);{
	  			}
			    
				//Blocks: RuinsPathFlowerCorner
			    Item itemRuinsPathFlowerCorner = Item.getItemFromBlock(RuinsPathFlowerCorner);
			    ModelResourceLocation modelRuinsPathFlowerCorner = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPathFlowerCorner, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPathFlowerCorner, modelRuinsPathFlowerCorner);
			    mesher.register(itemRuinsPathFlowerCorner, 0, modelRuinsPathFlowerCorner);{
	  			}
			    
				//Blocks: RuinsPathFlowerBottom
			    Item itemRuinsPathFlowerBottom = Item.getItemFromBlock(RuinsPathFlowerBottom);
			    ModelResourceLocation modelRuinsPathFlowerBottom = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsPathFlowerBottom, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsPathFlowerBottom, modelRuinsPathFlowerBottom);
			    mesher.register(itemRuinsPathFlowerBottom, 0, modelRuinsPathFlowerBottom);{
	  			}
			    
				//Blocks: RuinsMossPurple
			    Item itemRuinsMossPurple = Item.getItemFromBlock(RuinsMossPurple);
			    ModelResourceLocation modelRuinsMossPurple = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsMossPurple, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsMossPurple, modelRuinsMossPurple);
			    mesher.register(itemRuinsMossPurple, 0, modelRuinsMossPurple);{
	  			}
			    
				//Blocks: RuinsMossPurple3
			    Item itemRuinsMossPurple3 = Item.getItemFromBlock(RuinsMossPurple3);
			    ModelResourceLocation modelRuinsMossPurple3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsMossPurple3, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsMossPurple3, modelRuinsMossPurple3);
			    mesher.register(itemRuinsMossPurple3, 0, modelRuinsMossPurple3);{
	  			}
			    
			    //Blocks: RuinsDoorTopRight
			    Item itemRuinsDoorTopRight = Item.getItemFromBlock(RuinsDoorTopRight);
			    ModelResourceLocation modelRuinsDoorTopRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorTopRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorTopRight, modelRuinsDoorTopRight);
			    mesher.register(itemRuinsDoorTopRight, 0, modelRuinsDoorTopRight);{
	  			}
			    
			    //Blocks: RuinsDoorMiddleRight
			    Item itemRuinsDoorMiddleRight = Item.getItemFromBlock(RuinsDoorMiddleRight);
			    ModelResourceLocation modelRuinsDoorMiddleRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorMiddleRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorMiddleRight, modelRuinsDoorMiddleRight);
			    mesher.register(itemRuinsDoorMiddleRight, 0, modelRuinsDoorMiddleRight);{
	  			}
			    
			    //Blocks: RuinsDoorBottomRight
			    Item itemRuinsDoorBottomRight = Item.getItemFromBlock(RuinsDoorBottomRight);
			    ModelResourceLocation modelRuinsDoorBottomRight = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorBottomRight, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorBottomRight, modelRuinsDoorBottomRight);
			    mesher.register(itemRuinsDoorBottomRight, 0, modelRuinsDoorBottomRight);{
	  			}
			    
			    //Blocks: RuinsDoorTopLeft
			    Item itemRuinsDoorTopLeft = Item.getItemFromBlock(RuinsDoorTopLeft);
			    ModelResourceLocation modelRuinsDoorTopLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorTopLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorTopLeft, modelRuinsDoorTopLeft);
			    mesher.register(itemRuinsDoorTopLeft, 0, modelRuinsDoorTopLeft);{
	  			}
			    
			    //Blocks: RuinsDoorMiddleLeft
			    Item itemRuinsDoorMiddleLeft = Item.getItemFromBlock(RuinsDoorMiddleLeft);
			    ModelResourceLocation modelRuinsDoorMiddleLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorMiddleLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorMiddleLeft, modelRuinsDoorMiddleLeft);
			    mesher.register(itemRuinsDoorMiddleLeft, 0, modelRuinsDoorMiddleLeft);{
	  			}
			    
			    //Blocks: RuinsDoorBottomLeft
			    Item itemRuinsDoorBottomLeft = Item.getItemFromBlock(RuinsDoorBottomLeft);
			    ModelResourceLocation modelRuinsDoorBottomLeft = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsDoorBottomLeft, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsDoorBottomLeft, modelRuinsDoorBottomLeft);
			    mesher.register(itemRuinsDoorBottomLeft, 0, modelRuinsDoorBottomLeft);{
	  			}
			    
			    //Blocks: RuinsGrey
			    Item itemRuinsGrey = Item.getItemFromBlock(RuinsGrey);
			    ModelResourceLocation modelRuinsGrey = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsGrey, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsGrey, modelRuinsGrey);
			    mesher.register(itemRuinsGrey, 0, modelRuinsGrey);{
	  			}
			    
			    //Blocks: RuinsLightGrey
			    Item itemRuinsLightGrey = Item.getItemFromBlock(RuinsLightGrey);
			    ModelResourceLocation modelRuinsLightGrey = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsLightGrey, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsLightGrey, modelRuinsLightGrey);
			    mesher.register(itemRuinsLightGrey, 0, modelRuinsLightGrey);{
	  			}
			    
			    //Blocks: RuinsWhite
			    Item itemRuinsWhite = Item.getItemFromBlock(RuinsWhite);
			    ModelResourceLocation modelRuinsWhite = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsWhite, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsWhite, modelRuinsWhite);
			    mesher.register(itemRuinsWhite, 0, modelRuinsWhite);{
	  			}
			    
			    //Blocks: RuinsStairs
			    Item itemRuinsStairs = Item.getItemFromBlock(RuinsStairs);
			    ModelResourceLocation modelRuinsStairs = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RuinsStairs, "inventory");
			    ModelLoader.registerItemVariants(itemRuinsStairs, modelRuinsStairs);
			    mesher.register(itemRuinsStairs, 0, modelRuinsStairs);{
	  			}
			    
			    //Blocks: RedButton3
			    Item itemRedButton3 = Item.getItemFromBlock(RedButton3);
			    ModelResourceLocation modelRedButton3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedButton3, "inventory");
			    ModelLoader.registerItemVariants(itemRedButton3, modelRedButton3);
			    mesher.register(itemRedButton3, 0, modelRedButton3);{
	  			}
			    
			    //Blocks: BlueButton
			    Item itemBlueButton = Item.getItemFromBlock(BlueButton);
			    ModelResourceLocation modelBlueButton = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BlueButton, "inventory");
			    ModelLoader.registerItemVariants(itemBlueButton, modelBlueButton);
			    mesher.register(itemBlueButton, 0, modelBlueButton);{
	  			}
			    
			    //Blocks: GreenButton
			    Item itemGreenButton = Item.getItemFromBlock(GreenButton);
			    ModelResourceLocation modelGreenButton = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GreenButton, "inventory");
			    ModelLoader.registerItemVariants(itemGreenButton, modelGreenButton);
			    mesher.register(itemGreenButton, 0, modelGreenButton);{
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

