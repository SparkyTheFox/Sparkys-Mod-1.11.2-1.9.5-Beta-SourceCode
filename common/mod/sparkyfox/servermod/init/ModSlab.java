package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.Utils;
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
	
	public static BridgeHalfSlab BridgeSlabHalf;
	public static BridgeDoubleSlab BridgeSlabDouble;
	
	public static BridgeHalfSlab BridgeSlabHalf2;
	public static BridgeDoubleSlab BridgeSlabDouble2;
	
	public static BridgeHalfSlab BridgeSlabHalf3;
	public static BridgeDoubleSlab BridgeSlabDouble3;
	
	public static BridgeHalfSlab BridgeSlabHalf4;
	public static BridgeDoubleSlab BridgeSlabDouble4;
	
	public static WindowMiddleHalfSlab WindowMiddleSlabHalf;
	public static WindowMiddleDoubleSlab WindowMiddleSlabDouble;


	/*
	 * Energy Blocks
	 */


	/**
	 * Initialize the blocks
	 */
	public static void init() {

		//bridgeslabhalf = new  BridgeHalfSlab("bridgeslabhalf", 2.5F, 6000001.0F);
		//bridgeslabdouble = new BridgeDoubleSlab("bridgeslabdouble", 2.5F, 6000001.0F);
		
        BridgeSlabHalf = new BridgeHalfSlab("bridge_slab_half");
        BridgeSlabDouble = new BridgeDoubleSlab("bridge_slab_double");
        
        BridgeSlabHalf2 = new BridgeHalfSlab("bridge_slab_half2");
        BridgeSlabDouble2 = new BridgeDoubleSlab("bridge_slab_double2");
        
        BridgeSlabHalf3 = new BridgeHalfSlab("bridge_slab_half3");
        BridgeSlabDouble3 = new BridgeDoubleSlab("bridge_slab_double3");
        
        BridgeSlabHalf4 = new BridgeHalfSlab("bridge_slab_half4");
        BridgeSlabDouble4 = new BridgeDoubleSlab("bridge_slab_double4");
        
        WindowMiddleSlabHalf = new WindowMiddleHalfSlab("windowmiddle_slab_half");
        WindowMiddleSlabDouble = new WindowMiddleDoubleSlab("windowmiddle_slab_double");
        
 

		/*
		 * Energy Blocks
		 */

	}

	/**
	 * Register the blocks
	 */
	public static void register() {

		registerBlock(BridgeSlabHalf, new ItemSlab(BridgeSlabHalf, BridgeSlabHalf, BridgeSlabDouble));
		GameRegistry.register(BridgeSlabDouble); // Doesn't need an item

		registerBlock(BridgeSlabHalf2, new ItemSlab(BridgeSlabHalf2, BridgeSlabHalf2, BridgeSlabDouble2));
		GameRegistry.register(BridgeSlabDouble2); // Doesn't need an item
		
		registerBlock(BridgeSlabHalf3, new ItemSlab(BridgeSlabHalf3, BridgeSlabHalf3, BridgeSlabDouble3));
		GameRegistry.register(BridgeSlabDouble3); // Doesn't need an item
		
		registerBlock(BridgeSlabHalf4, new ItemSlab(BridgeSlabHalf4, BridgeSlabHalf4, BridgeSlabDouble4));
		GameRegistry.register(BridgeSlabDouble4); // Doesn't need an item
		
		registerBlock(WindowMiddleSlabHalf, new ItemSlab(WindowMiddleSlabHalf, WindowMiddleSlabHalf, WindowMiddleSlabDouble));
		GameRegistry.register(WindowMiddleSlabDouble); // Doesn't need an item

		/*
		 * Energy Blocks
		 */

	}

	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {

		registerRender(BridgeSlabHalf);
		registerRender(BridgeSlabHalf2);
		registerRender(BridgeSlabHalf3);
		registerRender(BridgeSlabHalf4);
		registerRender(WindowMiddleSlabHalf);

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
