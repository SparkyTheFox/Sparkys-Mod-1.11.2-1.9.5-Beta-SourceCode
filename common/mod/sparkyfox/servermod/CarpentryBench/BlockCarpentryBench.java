package mod.sparkyfox.servermod.CarpentryBench;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.industrialFreezer.ModStatList;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCarpentryBench extends Block {

	//1 1 spruce(dark wood)
	//1 2 birch(white wood)
	@Override
	public String getUnlocalizedName() {
		return "CarpentryBench" + ServerMod.RESOURCE_PREFIX + ModNames.CarpentryBench;  // CarpentryBench.ServerMod:CarpentryBench 
		}
		
		
	 	public static final PropertyDirection FACING = BlockHorizontal.FACING;
    	private static boolean keepInventory;
    	
    	
		public BlockCarpentryBench(boolean b) 
		{
		    													  //===================================================================================================================//
		super(Material.WOOD);					  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(2.0f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(5.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.WOOD);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 0);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 
    	this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}
		
	
															//Crafting Recipe\\
	
		public void addRecipes() {
			GameRegistry.addShapedRecipe(new ItemStack(this), "SSS", "CTB", "PWP", 
			'S', new ItemStack (Blocks.WOODEN_SLAB, 1, 2),  
			'C', new ItemStack (Blocks.CHEST), 
			'T', new ItemStack (Blocks.CRAFTING_TABLE), 
			'B', new ItemStack (Blocks.PLANKS, 1, 2), 
			'P', new ItemStack (Blocks.SPRUCE_FENCE), 
			'W', new ItemStack(Blocks.WOODEN_SLAB, 1, 1));
	}
		
	    /**
	     * Called when the block is right clicked by a player.
	     */
	    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            playerIn.displayGui(new BlockCarpentryBench.InterfaceCarpentryBench(worldIn, pos));
	            playerIn.addStat(ModStatList.CARPENTRY_BENCH_INTERACTION);
	            return true;
	        }
	    }

	    public static class InterfaceCarpentryBench implements IInteractionObject
	        {
	            private final World world;
	            private final BlockPos position;

	            public InterfaceCarpentryBench(World worldIn, BlockPos pos)
	            {
	                this.world = worldIn;
	                this.position = pos;
	            }

	            /**
	             * Get the name of this object. For players this returns their username
	             */
	            public String getName()
	            {
	                return "CarpentryBench";
	            }

	            /**
	             * Returns true if this thing is named
	             */
	            public boolean hasCustomName()
	            {
	                return false;
	            }

	            /**
	             * Get the formatted ChatComponent that will be used for the sender's username in chat
	             */
	            public ITextComponent getDisplayName()
	            {
	                return new TextComponentTranslation(ModBlocks.CarpentryBench.getUnlocalizedName() + ".name", new Object[0]);
	            }

	            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
	            {
	                return new ContainerCarpentryBench(playerInventory, null, this.world, this.position);
	            }

	            public String getGuiID()
	            {
	                return "servermod:CarpentryBench";
	            }
	        }


	    /**
	     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
	     * blockstate.
	     */
	    public IBlockState withRotation(IBlockState state, Rotation rot)
	    {
	        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	    }

	    /**
	     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
	     * blockstate.
	     */
	    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	    {
	        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	    }

	    /**
	     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
	     * IBlockstate
	     */
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	    }

	    /**
	     * Convert the given metadata into a BlockState for this Block
	     */
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	    }

	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
	    }

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {FACING});
	    }


	    /**
	     * Used to determine ambient occlusion and culling when rebuilding chunks for render
	     */
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }

	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        return super.canPlaceBlockAt(worldIn, pos) && this.canBlockStay(worldIn, pos);
	    }

	    /**
	     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
	     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
	     * block, etc.
	     */
	    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	    {
	        this.checkForDrop(worldIn, pos, state);
	    }

	    private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!this.canBlockStay(worldIn, pos))
	        {
	            this.dropBlockAsItem(worldIn, pos, state, 0);
	            worldIn.setBlockToAir(pos);
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    }

	    private boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return !worldIn.isAirBlock(pos.down());
	    }

	    @SideOnly(Side.CLIENT)
	    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	    {
	        return side == EnumFacing.UP ? true : (blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side));
	    }

	}