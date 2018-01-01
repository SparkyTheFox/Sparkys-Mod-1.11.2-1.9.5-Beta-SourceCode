package mod.sparkyfox.servermod.slab.adventure;

/**
 * A half slab which gets its properties from the tin slab
 * 
 * @author CJMinecraft
 *
 */
public class WindowMiddleDoubleSlab extends WindowMiddleSlab {

	public WindowMiddleDoubleSlab(String unlocalizedName) {
		super(unlocalizedName);
	}

	
	@Override
	public boolean isDouble() {
		return true;
	}

}
