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

    public static void addBlock(Block block)
    {
        BLOCKS.add(block);
        ITEM_BLOCKS.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }




    public static void init()
    {
        BLOCKS = new ArrayList<>();
        ITEM_BLOCKS = new ArrayList<>();

        addBlock(bridgeslabhalf = (BridgeHalfSlab) new BridgeHalfSlab("bridgeslabhalf", 2.5F, 6000001.0F));
        addBlock(bridgeslabdouble = (BridgeDoubleSlab) new BridgeDoubleSlab("bridgeslabdouble", 2.5F, 6000001.0F));
        
        addBlock(bridgeslabhalf2 = (BridgeHalfSlab) new BridgeHalfSlab("bridgeslabhalf2", 2.5F, 6000001.0F));
        addBlock(bridgeslabdouble2 = (BridgeDoubleSlab) new BridgeDoubleSlab("bridgeslabdouble2", 2.5F, 6000001.0F));
        
        addBlock(bridgeslabhalf3 = new BridgeHalfSlab("bridgeslabhalf3", 2.5F, 6000001.0F));
        addBlock(bridgeslabdouble3 = new BridgeDoubleSlab("bridgeslabdouble3", 2.5F, 6000001.0F));
        
        addBlock(bridgeslabhalf4 = new BridgeHalfSlab("bridgeslabhalf4", 2.5F, 6000001.0F));
        addBlock(bridgeslabdouble4 = new BridgeDoubleSlab("bridgeslabdouble4", 2.5F, 6000001.0F));
        
        addBlock(windowmiddleslabhalf = (WindowMiddleHalfSlab) new WindowMiddleHalfSlab("windowmiddleslabhalf", 2.5F, 6000001.0F));
        addBlock(windowmiddleslabdouble = (WindowMiddleDoubleSlab) new WindowMiddleDoubleSlab("windowmiddleslabdouble", 2.5F, 6000001.0F));
    
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
}

