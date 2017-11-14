package mod.sparkyfox.servermod.block.adventure;

/**
 * A half slab which gets its properties from the Bridge slab
 * @author CJMinecraft
 *
 */
public class BlockBridgeSlabHalf extends BlockBridgeSlab {

	public BlockBridgeSlabHalf(String unlocalizedName) {
		super(unlocalizedName);
	}

	/**
	 * Says that it isn't the double version of the block
	 */
	@Override
	public boolean isDouble() {
		return false;
	}

}
