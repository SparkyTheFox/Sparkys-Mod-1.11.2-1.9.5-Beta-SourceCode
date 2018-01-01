package mod.sparkyfox.servermod.init;



import java.util.ArrayList;
import java.util.List;

import mod.sparkyfox.servermod.props.adventure.PropCandy;
import mod.sparkyfox.servermod.props.adventure.PropCandySpill;
import mod.sparkyfox.servermod.props.adventure.PropDummy;
import mod.sparkyfox.servermod.props.adventure.PropHole;
import mod.sparkyfox.servermod.props.adventure.PropHole2;
import mod.sparkyfox.servermod.props.adventure.PropHole3;
import mod.sparkyfox.servermod.props.adventure.PropHole4;
import mod.sparkyfox.servermod.props.adventure.PropMTable;
import mod.sparkyfox.servermod.props.adventure.PropSaveStar;
import mod.sparkyfox.servermod.props.adventure.PropVine;
import mod.sparkyfox.servermod.props.adventure.PropWebBig;
import mod.sparkyfox.servermod.props.adventure.PropWebSmall;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModProps {

	
    public static List<Block> BLOCKS;
    public static List<ItemBlock> ITEM_BLOCKS;
    
	public static Block dummy;
	public static Block candy;
	public static Block candyspill;
	public static Block mtable;
	public static Block vine;
	public static Block webbig;
	public static Block websmall;
	public static Block savestar;
	public static Block hole;
	public static Block hole2;
	//public static Block hole3;
	//public static Block hole4;
	
    public static void addBlock(Block block) 
    {
        BLOCKS.add(block);
        ITEM_BLOCKS.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }



	public static void init() {
		
        BLOCKS = new ArrayList<>();
        ITEM_BLOCKS = new ArrayList<>();
	
         addBlock(dummy = new PropDummy("dummy", 2.5F, 4.5F, 2));
		 addBlock(candy = new PropCandy("candy", 2.5F, 4.5F, 2));
		 addBlock(candyspill = new PropCandySpill("candyspill", 2.5F, 4.5F, 2));
		 addBlock(mtable = new PropMTable("mtable", 2.5F, 4.5F, 2));
		 addBlock(vine = new PropVine("vine", 2.5F, 4.5F, 2));
		 addBlock(webbig = new PropWebBig("webbig", 2.5F, 4.5F, 2));
		 addBlock(websmall = new PropWebSmall("websmall", 2.5F, 4.5F, 2));
		 addBlock(savestar = new PropSaveStar("savestar", 2.5F, 4.5F, 2));
		 addBlock(hole = new PropHole("hole", 2.5F, 4.5F, 2));
		 addBlock(hole2 = new PropHole2("hole2", 2.5F, 4.5F, 2));
		//hole3 = new PropHole3("hole3", 2.5F, 4.5F, 2);
		//hole4 = new PropHole4("hole4", 2.5F, 4.5F, 2);
		
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
}
