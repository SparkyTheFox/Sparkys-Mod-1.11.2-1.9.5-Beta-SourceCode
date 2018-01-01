package mod.sparkyfox.servermod.init;



import java.util.ArrayList;
import java.util.List;

import mod.sparkyfox.servermod.props.adventure.PropPillarBottom;
import mod.sparkyfox.servermod.props.adventure.PropPillarMiddle;
import mod.sparkyfox.servermod.stair.adventure.CustomBlockStairs;
import mod.sparkyfox.servermod.stair.adventure.CustomIngotBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModStairs 
{
	
    public static List<Block> BLOCKS;
    public static List<ItemBlock> ITEM_BLOCKS;

	public static Block tutorial_block;
	public static Block tutorial_stairs;
	public static Block tutorial_stairs2;
	public static Block tutorial_stairs3;
	public static Block tutorial_stairs4;
	
	public static Block pillar_bottom;
	public static Block pillar_middle;
	
    public static void addBlock(Block block)
    {
        BLOCKS.add(block);
        ITEM_BLOCKS.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


	public static void init()
	{
		
        BLOCKS = new ArrayList<>();
        ITEM_BLOCKS = new ArrayList<>();

        addBlock(tutorial_block = new CustomIngotBlock("tutorial_block", 2.5F, 4.5F, 2));
		addBlock(tutorial_stairs = new CustomBlockStairs("tutorial_stairs", tutorial_block.getDefaultState()));
		addBlock(tutorial_stairs2 = new CustomBlockStairs("tutorial_stairs2", tutorial_block.getDefaultState()));
		addBlock(tutorial_stairs3 = new CustomBlockStairs("tutorial_stairs3", tutorial_block.getDefaultState()));
		addBlock(tutorial_stairs4 = new CustomBlockStairs("tutorial_stairs4", tutorial_block.getDefaultState()));
		
		addBlock(pillar_bottom = new PropPillarBottom("pillar_bottom", tutorial_block.getDefaultState()));
		addBlock(pillar_middle = new PropPillarMiddle("pillar_middle", tutorial_block.getDefaultState()));

    }

    public static void regTileEntities()
    {
     //   registerTE(TileLiquidEnergiser.class, liquidEnergiser);
    //   registerTE(TileMatterScanner.class, matterScanner);
   //    registerTE(TileScannerStorage.class, scannerStorage);
  //     registerTE(TileMatterCreator.class, matterCreator);
    }

    @SideOnly(Side.CLIENT)
    public static void regColours()
    {
        //Was gonna try use this to make blocks constantly change colour as a test
        /*
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new IBlockColor()
        {
            @Override
            public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
            {
                return tintIndex == 0 ? (int) Math.round(Math.random() * 0xFFFFFF) : -1;
            }
        });
        */
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
