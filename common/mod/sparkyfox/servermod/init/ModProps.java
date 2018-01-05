package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.Utils;
import mod.sparkyfox.servermod.props.adventure.PropCandy;
import mod.sparkyfox.servermod.props.adventure.PropCandySpill;
import mod.sparkyfox.servermod.props.adventure.PropDummy;
import mod.sparkyfox.servermod.props.adventure.PropHole;
import mod.sparkyfox.servermod.props.adventure.PropHole2;
import mod.sparkyfox.servermod.props.adventure.PropMTable;
import mod.sparkyfox.servermod.props.adventure.PropSaveStar;
import mod.sparkyfox.servermod.props.adventure.PropVine;
import mod.sparkyfox.servermod.props.adventure.PropWebBig;
import mod.sparkyfox.servermod.props.adventure.PropWebSmall;
import mod.sparkyfox.servermod.slab.adventure.BridgeDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeHalfSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
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
public class ModProps {

	/**
	 * State our blocks
	 */
	
	public static PropDummy Dummy;
	public static PropCandy Candy;
	public static PropCandySpill CandySpill;
	public static PropMTable MTable;
	public static PropVine Vine;
	public static PropWebBig WebBig;
	public static PropWebSmall WebSmall;
	public static PropSaveStar SaveStar;
	public static PropHole Hole;
	public static PropHole2 Hole2;
	


	/**
	 * Initialize the blocks
	 */
	public static void init() {
		


        Dummy = new PropDummy("dummy");
        Candy = new PropCandy("candy");
        CandySpill = new PropCandySpill("candyspill");
        MTable = new PropMTable("mtable");
        Vine = new PropVine("vine");
        WebBig = new PropWebBig("webbig");
        WebSmall = new PropWebSmall("websmall");
        SaveStar = new PropSaveStar("savestar");
        Hole = new PropHole("hole");
        Hole2 = new PropHole2("hole2");
		



	}

	/**
	 * Register the blocks
	 */
	public static void register() {
		
		registerBlock(Dummy);
		registerBlock(Candy);
		registerBlock(CandySpill);
		registerBlock(MTable);
		registerBlock(Vine);
		registerBlock(WebBig);
		registerBlock(WebSmall);
		registerBlock(SaveStar);
		registerBlock(Hole);
		registerBlock(Hole2);

	}

	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {
		


		registerRender(Dummy);
		registerRender(Candy);
		registerRender(CandySpill);
		registerRender(MTable);
		registerRender(Vine);
		registerRender(WebBig);
		registerRender(WebSmall);
		registerRender(SaveStar);
		registerRender(Hole);
		registerRender(Hole2);


		


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








