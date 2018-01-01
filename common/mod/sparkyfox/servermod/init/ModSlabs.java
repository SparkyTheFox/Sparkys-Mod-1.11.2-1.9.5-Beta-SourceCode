package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.slab.adventure.BirdgeDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeHalfSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSlabs
{

	public static BridgeHalfSlab bridgeslabhalf;
	public static BirdgeDoubleSlab bridgeslabdouble;
	
	public static BridgeHalfSlab bridgeslabhalf2;
	public static BirdgeDoubleSlab bridgeslabdouble2;
	
	public static BridgeHalfSlab bridgeslabhalf3;
	public static BirdgeDoubleSlab bridgeslabdouble3;
	
	public static BridgeHalfSlab bridgeslabhalf4;
	public static BirdgeDoubleSlab bridgeslabdouble4;
	
	public static WindowMiddleHalfSlab windowmiddleslabhalf;
	public static WindowMiddleDoubleSlab windowmiddleslabdouble;
	
	public static void init()
	{
//bridgeslabhalf = new BridgeHalfSlab("bridgeslabhalf", 2.5F(HARDNESS), 4.5F(RESISTANCE);
		bridgeslabhalf = new BridgeHalfSlab("bridgeslabhalf", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		bridgeslabdouble = new BirdgeDoubleSlab("bridgeslabdouble", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		
		bridgeslabhalf2 = new BridgeHalfSlab("bridgeslabhalf2", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		bridgeslabdouble2 = new BirdgeDoubleSlab("bridgeslabdouble2", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		
		bridgeslabhalf3 = new BridgeHalfSlab("bridgeslabhalf3", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		bridgeslabdouble3 = new BirdgeDoubleSlab("bridgeslabdouble3", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		
		bridgeslabhalf4 = new BridgeHalfSlab("bridgeslabhalf4", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		bridgeslabdouble4 = new BirdgeDoubleSlab("bridgeslabdouble4", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		
		windowmiddleslabhalf = new WindowMiddleHalfSlab("windowmiddleslabhalf", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
		windowmiddleslabdouble = new WindowMiddleDoubleSlab("windowmiddleslabdouble", 2.5F, 6000001.0F);//not quite shure what 2.5F and 4.5F even are yet
	}
	
	public static void register()
	{

		registerBlock(bridgeslabhalf, new ItemSlab(bridgeslabhalf, bridgeslabhalf, bridgeslabdouble));
		ForgeRegistries.BLOCKS.register(bridgeslabdouble);
		
		registerBlock(bridgeslabhalf2, new ItemSlab(bridgeslabhalf2, bridgeslabhalf2, bridgeslabdouble2));
		ForgeRegistries.BLOCKS.register(bridgeslabdouble2);
		
		registerBlock(bridgeslabhalf3, new ItemSlab(bridgeslabhalf3, bridgeslabhalf3, bridgeslabdouble3));
		ForgeRegistries.BLOCKS.register(bridgeslabdouble3);
		
		registerBlock(bridgeslabhalf4, new ItemSlab(bridgeslabhalf4, bridgeslabhalf4, bridgeslabdouble4));
		ForgeRegistries.BLOCKS.register(bridgeslabdouble4);
		
		registerBlock(windowmiddleslabhalf, new ItemSlab(windowmiddleslabhalf, windowmiddleslabhalf, windowmiddleslabdouble));
		ForgeRegistries.BLOCKS.register(windowmiddleslabdouble);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
	//	block.setCreativeTab(TutorialMod.tutorialtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		//block.setCreativeTab(TutorialMod.tutorialtab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
