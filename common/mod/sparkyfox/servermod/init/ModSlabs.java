package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.slab.adventure.BirdgeDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeHalfSlab;
import net.minecraft.block.Block;
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
	
	public static void init()
	{

		bridgeslabhalf = new BridgeHalfSlab("bridgeslabhalf", 2.5F, 4.5F);//not quite shure what 2.5F and 4.5F even are yet
		bridgeslabdouble = new BirdgeDoubleSlab("bridgeslabdouble", 2.5F, 4.5F);//not quite shure what 2.5F and 4.5F even are yet
	}
	
	public static void register()
	{

		registerBlock(bridgeslabhalf, new ItemSlab(bridgeslabhalf, bridgeslabhalf, bridgeslabdouble));
		ForgeRegistries.BLOCKS.register(bridgeslabdouble);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
	//	block.setCreativeTab(TutorialMod.tutorialtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		//block.setCreativeTab(TutorialMod.tutorialtab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
