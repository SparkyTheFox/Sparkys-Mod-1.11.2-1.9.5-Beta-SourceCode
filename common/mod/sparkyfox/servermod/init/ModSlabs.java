package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.slab.adventure.CustomBlockDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.CustomBlockHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSlabs
{

	public static CustomBlockHalfSlab tutorial_slab_half;
	public static CustomBlockDoubleSlab tutorial_slab_double;
	
	public static void init()
	{

		tutorial_slab_half = new CustomBlockHalfSlab("tutorial_slab_half", 2.5F, 4.5F);
		tutorial_slab_double = new CustomBlockDoubleSlab("tutorial_slab_double", 2.5F, 4.5F);
	}
	
	public static void register()
	{

		registerBlock(tutorial_slab_half, new ItemSlab(tutorial_slab_half, tutorial_slab_half, tutorial_slab_double));
		ForgeRegistries.BLOCKS.register(tutorial_slab_double);
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
