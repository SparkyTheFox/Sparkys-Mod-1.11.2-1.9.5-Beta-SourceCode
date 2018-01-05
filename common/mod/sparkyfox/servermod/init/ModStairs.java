package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.Utils;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor2Bottom;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor2Top;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3BottomLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3BottomRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3MiddleLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3MiddleRight;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3TopLeft;
import mod.sparkyfox.servermod.block.adventure.BlockRuinsDoor3TopRight;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class handles the registration of our blocks and also the rendering of
 * them
 * 
 * @author CJMinecraft
 *
 */
public class ModStairs {

	/**
	 * State our blocks
	 */
	
	
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

	/**
	 * Register the blocks
	 */
	public static void register() {
		
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

}








