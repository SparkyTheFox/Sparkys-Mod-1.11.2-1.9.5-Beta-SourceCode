package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.slab.adventure.BridgeDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeHalfSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class handles the registration of our blocks and also the rendering of
 * them
 * 
 * @author CJMinecraft
 *
 */
public class ModSlab {

	/**
	 * State our blocks
	 */

	//BridgeSlab bridgeslab;
	//public static BridgeHalfSlab bridgeslabhalf;
	//public static BridgeDoubleSlab bridgeslabdouble;
	
	public static BridgeHalfSlab bridgeslabhalf;
	public static BridgeDoubleSlab bridgeslabdouble;
	
	public static BridgeHalfSlab bridgeslabhalf2;
	public static BridgeDoubleSlab bridgeslabdouble2;
	
	public static BridgeHalfSlab bridgeslabhalf3;
	public static BridgeDoubleSlab bridgeslabdouble3;
	
	public static BridgeHalfSlab bridgeslabhalf4;
	public static BridgeDoubleSlab bridgeslabdouble4;
	
	public static WindowMiddleHalfSlab windowmiddleslabhalf;
	public static WindowMiddleDoubleSlab windowmiddleslabdouble;


	/*
	 * Energy Blocks
	 */


	/**
	 * Initialize the blocks
	 */
	public static void init() {

		//bridgeslabhalf = new  BridgeHalfSlab("bridgeslabhalf", 2.5F, 6000001.0F);
		//bridgeslabdouble = new BridgeDoubleSlab("bridgeslabdouble", 2.5F, 6000001.0F);
		
        bridgeslabhalf = new BridgeHalfSlab("bridgeslabhalf");
        bridgeslabdouble = new BridgeDoubleSlab("bridgeslabdouble");
        
        bridgeslabhalf2 = new BridgeHalfSlab("bridgeslabhalf2");
        bridgeslabdouble2 = new BridgeDoubleSlab("bridgeslabdouble2");
        
        bridgeslabhalf3 = new BridgeHalfSlab("bridgeslabhalf3");
        bridgeslabdouble3 = new BridgeDoubleSlab("bridgeslabdouble3");
        
        bridgeslabhalf4 = new BridgeHalfSlab("bridgeslabhalf4");
        bridgeslabdouble4 = new BridgeDoubleSlab("bridgeslabdouble4");
        
        windowmiddleslabhalf = new WindowMiddleHalfSlab("windowmiddleslabhalf");
        windowmiddleslabdouble = new WindowMiddleDoubleSlab("windowmiddleslabdouble");



		/*
		 * Energy Blocks
		 */

	}

	/**
	 * Register the blocks
	 */
	public static void register() {

		registerBlock(bridgeslabhalf, new ItemSlab(bridgeslabhalf, bridgeslabhalf, bridgeslabdouble));
		GameRegistry.register(bridgeslabdouble); // Doesn't need an item

		registerBlock(bridgeslabhalf2, new ItemSlab(bridgeslabhalf2, bridgeslabhalf2, bridgeslabdouble2));
		GameRegistry.register(bridgeslabdouble2); // Doesn't need an item
		
		registerBlock(bridgeslabhalf3, new ItemSlab(bridgeslabhalf3, bridgeslabhalf3, bridgeslabdouble3));
		GameRegistry.register(bridgeslabdouble3); // Doesn't need an item
		
		registerBlock(bridgeslabhalf4, new ItemSlab(bridgeslabhalf4, bridgeslabhalf4, bridgeslabdouble4));
		GameRegistry.register(bridgeslabdouble4); // Doesn't need an item
		
		registerBlock(windowmiddleslabhalf, new ItemSlab(windowmiddleslabhalf, windowmiddleslabhalf, windowmiddleslabdouble));
		GameRegistry.register(windowmiddleslabdouble); // Doesn't need an item

		/*
		 * Energy Blocks
		 */

	}

	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {

		registerRender(bridgeslabhalf);
		registerRender(bridgeslabhalf2);
		registerRender(bridgeslabhalf3);
		registerRender(bridgeslabhalf4);
		registerRender(windowmiddleslabhalf);

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
