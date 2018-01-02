package mod.sparkyfox.servermod.slab.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.DummyBlockProperty;
import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModSlab;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Basic Slab Class. When creating a new slab you need to have your own version
 * of this with your hardness and resistance being set
 * 
 * @author CJMinecraft
 *
 */
public abstract class BridgeSlab extends BlockSlab {

	/**
	 * Used purely so that the slab places correctly
	 */
	public static final DummyBlockProperty DUMMY_VARIANT = DummyBlockProperty.create("dummy");

	/**
	 * Create a new Tin Slab
	 * 
	 * @param unlocalizedName
	 *            The block's unlocalizedName
	 */
	public BridgeSlab(String unlocalizedName) {
		super(Material.WOOD); // Normal block stuff
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);

		// Set the default state
		IBlockState state = this.blockState.getBaseState();
		if (!this.isDouble())
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		setDefaultState(state);
		this.useNeighborBrightness = true; // Makes it so that you don't get dark patches on the block
	}

	/**
	 * Makes it so that your block doesn't accept meta data
	 */
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	/**
	 * Only use if your block has multiple types, i.e {@link ChipTypes}. If
	 * yours does not then just use what I put
	 */
	@Override
	public IProperty<?> getVariantProperty() {
		return DUMMY_VARIANT;
	}

	/**
	 * Only use if your block has multiple types, i.e {@link ChipTypes}. If
	 * yours does not then just use what I put
	 */
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return false;
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
		return Item.getItemFromBlock(ModSlab.BridgeSlabHalf);
	}

	/**
	 * Register it so that your block has its own half. MUST DO!!
	 */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF, DUMMY_VARIANT });
	}

}
