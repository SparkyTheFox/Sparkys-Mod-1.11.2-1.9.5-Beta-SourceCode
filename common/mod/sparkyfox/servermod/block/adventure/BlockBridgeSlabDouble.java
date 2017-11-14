package mod.sparkyfox.servermod.block.adventure;

/**
 * A half slab which gets its properties from the tin slab
 * @author CJMinecraft
 *
 */
public class BlockBridgeSlabDouble extends BlockBridgeSlab {

	public BlockBridgeSlabDouble(String unlocalizedName) {
		super(unlocalizedName);
	}

	/**
	 * Says that this block is the double version of the tin slab
	 */
	@Override
	public boolean isDouble() {
		return true;
	}

}
