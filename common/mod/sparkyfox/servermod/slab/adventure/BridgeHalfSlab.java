package mod.sparkyfox.servermod.slab.adventure;

/**
 * A half slab which gets its properties from the tin slab
 * 
 * @author CJMinecraft
 *
 */
public class BridgeHalfSlab extends BridgeSlab {

	public BridgeHalfSlab(String unlocalizedName) {
		super(unlocalizedName);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}
