package mod.sparkyfox.servermod.block.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;


public abstract class BlockBridgeSlab extends BlockSlab {


	//public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public BlockBridgeSlab(String unlocalizedName) {
		super(Material.BARRIER);					  			 // The Material determines some properties of the block.															  //
		this.setBlockUnbreakable();				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(6000001.0F);     				   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
		this.disableStats();  			 	                 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
															//===================================================================================================================// 

		
		//this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));

		//Set the default state
		IBlockState state = this.blockState.getBaseState();
		if (!this.isDouble()) {
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		setDefaultState(state);
		this.useNeighborBrightness = true; //Makes it so that you don't get dark patches on the block
	}

	/**
	 * Makes it so that your block doesn't accept meta data
	 */
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	/**
	 * Only use if your block has multiple types, i.e {@link ChipTypes}. If yours does not then just use what I put
	 */
	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}

	/**
	 * Only use if your block has multiple types, i.e {@link ChipTypes}. If yours does not then just use what I put
	 */
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return EnumBlockHalf.BOTTOM;
	}

	/**
	 * Make it so that meta data won't work with our block
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	/**
	 * Gets the state from the meta data so our block saves correctly
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		if (!this.isDouble())
			return this.getDefaultState().withProperty(HALF,
					EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
		return this.getDefaultState();
	}

	/**
	 * Gets the meta from the state so it will save correctly
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
		if (this.isDouble())
			return 0;
		return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
	}

	/**
	 * Use your block from your {@link ModBlocks} class
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.BridgeSlabHalf);
	}

	/**
	 * Register it so that your block has its own half.
	 * MUST DO!!
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF });
	}

}
