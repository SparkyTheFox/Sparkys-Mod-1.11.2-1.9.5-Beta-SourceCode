package mod.sparkyfox.servermod.init;

import java.util.ArrayList;
import java.util.List;

import mod.sparkyfox.servermod.slab.adventure.BridgeDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.BridgeHalfSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleDoubleSlab;
import mod.sparkyfox.servermod.slab.adventure.WindowMiddleHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ModSlabs
{
    public static List<Block> BLOCKS;
    public static List<ItemBlock> ITEM_BLOCKS;



    public static void addBlock(Block block)
    {
        BLOCKS.add(block);
        ITEM_BLOCKS.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }




    public static void init()
    {
        BLOCKS = new ArrayList<>();
        ITEM_BLOCKS = new ArrayList<>();


    
    }

    public static Block[] getBlocks()
    {
        if(BLOCKS == null) init();
        return BLOCKS.toArray(new Block[BLOCKS.size()]);
    }

    public static ItemBlock[] getItemBlocks()
    {
        if(ITEM_BLOCKS == null) init();
        return ITEM_BLOCKS.toArray(new ItemBlock[ITEM_BLOCKS.size()]);
    }

    public static void regOres()
    {
       // OreDictionary.registerOre("machine_block", machineBlock);
    }




	public static void registerRenders() {
		// TODO Auto-generated method stub
		
	}
}

