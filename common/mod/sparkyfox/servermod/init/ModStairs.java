package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.Utils;
import mod.sparkyfox.servermod.block.stairs.StairsDiamond;
import mod.sparkyfox.servermod.block.stairs.StairsGold;
import mod.sparkyfox.servermod.block.stairs.StairsGrass;
import mod.sparkyfox.servermod.block.stairs.StairsIron;
import mod.sparkyfox.servermod.props.adventure.PropPillarBottom;
import mod.sparkyfox.servermod.props.adventure.PropPillarMiddle;
import mod.sparkyfox.servermod.stair.adventure.CustomIngotBlock;
import mod.sparkyfox.servermod.stair.adventure.WindowCorner;
import mod.sparkyfox.servermod.stair.adventure.WindowCorner2;
import mod.sparkyfox.servermod.stair.adventure.WindowCorner3;
import mod.sparkyfox.servermod.stair.adventure.WindowCorner4;
import mod.sparkyfox.servermod.stair.adventure.WindowCorner5;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class handles the registration of our blocks and also the rendering of
 * them
 * 
 * @author Sparky
 *
 */
public class ModStairs {

	/**
	 * State our blocks
	 */
	
	//Vanilla\\
	public static StairsIron StairsIron;
	public static StairsGold StairsGold;
	public static StairsDiamond StairsDiamond;
	public static StairsGrass StairsGrass;
	
	//Adventure\\
	public static Block tutorial_block;
	public static WindowCorner WindowCorner;
	public static WindowCorner2 WindowCorner2;
	public static WindowCorner3 WindowCorner3;
	public static WindowCorner4 WindowCorner4;
	public static WindowCorner5 WindowCorner5;
	public static WindowCorner5 WindowCorner6;
	public static PropPillarBottom pillar_bottom;
	public static PropPillarMiddle pillar_middle;

	


	/**
	 * Initialize the blocks
	 */
	public static void init() {
		
	//Vanilla\\
	StairsIron = new StairsIron("stairs_iron", Blocks.IRON_BLOCK.getDefaultState());
	StairsGold = new StairsGold("stairs_gold", Blocks.IRON_BLOCK.getDefaultState());
	StairsDiamond = new StairsDiamond("stairs_diamond", Blocks.DIAMOND_BLOCK.getDefaultState());
	StairsGrass = new StairsGrass("stairs_grass", Blocks.GRASS.getDefaultState());
//	StairsWool = new StairsDiamond("stairs_wool", Blocks.WOOL.getDefaultState());
//	StairsOrangeWool = new StairsDiamond("stairs_orange_wool", Blocks.WOOL.getDefaultState());
//	StairsMagentaWool = new StairsDiamond("stairs_magenta_wool", Blocks.WOOL.getDefaultState());
//	StairsLightBlueWool = new StairsDiamond("stairs_light_blue_wool", Blocks.WOOL.getDefaultState());
//	StairsYellowWool = new StairsDiamond("stairs_yellow_wool", Blocks.WOOL.getDefaultState());
//	StairsPinkWool = new StairsDiamond("stairs_pink_wool", Blocks.WOOL.getDefaultState());
//	StairsGrayWool = new StairsDiamond("stairs_gray_wool", Blocks.WOOL.getDefaultState());
//	StairsSilverWool = new StairsDiamond("stairs_silver_wool", Blocks.WOOL.getDefaultState());
//	StairsCyanWool = new StairsDiamond("stairs_cyan_wool", Blocks.WOOL.getDefaultState());
//	StairsPurpleWool = new StairsDiamond("stairs_purple_wool", Blocks.WOOL.getDefaultState());
//	StairsBlueWool = new StairsDiamond("stairs_blue_wool", Blocks.WOOL.getDefaultState());
//	StairsBrownWool = new StairsDiamond("stairs_brown_wool", Blocks.WOOL.getDefaultState());
//	StairsGreenWool = new StairsDiamond("stairs_green_wool", Blocks.WOOL.getDefaultState());
//	StairsRedWool = new StairsDiamond("stairs_red_wool", Blocks.WOOL.getDefaultState());
//	StairsBlackWool = new StairsDiamond("stairs_black_wool", Blocks.WOOL.getDefaultState());

	
	//Adventure\\
	tutorial_block = new CustomIngotBlock("tutorial_block");
	WindowCorner = new WindowCorner("tutorial_stairs", tutorial_block.getDefaultState());
	WindowCorner2 = new WindowCorner2("tutorial_stairs2", tutorial_block.getDefaultState());
	WindowCorner3 = new WindowCorner3("tutorial_stairs3", tutorial_block.getDefaultState());
	WindowCorner4 = new WindowCorner4("tutorial_stairs4", tutorial_block.getDefaultState());
	WindowCorner5 = new WindowCorner5("tutorial_stairs5", tutorial_block.getDefaultState());
	WindowCorner6 = new WindowCorner5("tutorial_stairs6", tutorial_block.getDefaultState());
	pillar_bottom = new PropPillarBottom("pillar_bottom", tutorial_block.getDefaultState());
	pillar_middle = new PropPillarMiddle("pillar_middle", tutorial_block.getDefaultState());

	
	
	
	
	
    }

    @SideOnly(Side.CLIENT)
    public static void regColours()
    {
        FMLClientHandler.instance().getClient().getBlockColors().registerBlockColorHandler(
                (state, worldIn, pos, tintIndex) ->
                        worldIn != null && pos != null ? BiomeColorHelper.getGrassColorAtPos(worldIn, pos) : ColorizerGrass.getGrassColor(0.5D, 1.0D),
                        		StairsGrass);
        FMLClientHandler.instance().getClient().getItemColors().registerItemColorHandler(
                (stack, tintIndex) ->
                        ColorizerGrass.getGrassColor(0.5D, 1.0D),
                StairsGrass);
    
	
	
	



	}

	/**
	 * Register the blocks
	 */
	public static void register() {
		
		//Vanilla\\
	
		registerBlock(StairsIron);
		registerBlock(StairsGold);
		registerBlock(StairsDiamond);
		registerBlock(StairsGrass);
		//Adventure\\
		registerBlock(tutorial_block);
		registerBlock(WindowCorner);
		registerBlock(WindowCorner2);
		registerBlock(WindowCorner3);
		registerBlock(WindowCorner4);
		registerBlock(WindowCorner5);
		registerBlock(WindowCorner6);
		registerBlock(pillar_bottom);
		registerBlock(pillar_middle);


	}

	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {
		
		//Vanilla\\
		registerRender(StairsIron);
		registerRender(StairsGold);
		registerRender(StairsDiamond);
		registerRender(StairsGrass);
		
		//Adventure\\
		registerRender(tutorial_block);
		registerRender(WindowCorner);
		registerRender(WindowCorner2);
		registerRender(WindowCorner3);
		registerRender(WindowCorner4);
		registerRender(WindowCorner5);
		registerRender(WindowCorner6);
		registerRender(pillar_bottom);
		registerRender(pillar_middle);

		
	}




		


	


	/**
	 * Registers the block
	 * 
	 * @param block
	 *            The block to register
	 */
	public static void registerBlock(Block block) {

		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the block with a custom {@link ItemBlock}
	 * 
	 * @param block
	 *            The block
	 * @param itemBlock
	 *            The {@link ItemBlock}
	 */
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the blocks renders
	 * 
	 * @param block
	 *            The block
	 */
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
				new ResourceLocation(ServerMod.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the blocks renders even if it has meta data
	 * 
	 * @param block
	 *            The block
	 * @param meta
	 *            The blocks meta data
	 * @param fileName
	 *            The file name
	 */
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(ServerMod.MOD_ID, fileName), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}
	
	  public static void initRecipes() {
			StairsDiamond.addRecipes();
			StairsGold.addRecipes();
			StairsIron.addRecipes();

	  }
}








