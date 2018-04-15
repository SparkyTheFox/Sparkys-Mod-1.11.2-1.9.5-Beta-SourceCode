package mod.sparkyfox.servermod.slab.adventure;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * A half slab which gets its properties from the tin slab
 * 
 * @author CJMinecraft
 *
 */
public class BridgeHalfSlab3 extends BridgeSlab3 {

	public BridgeHalfSlab3(String unlocalizedName) {
		super(unlocalizedName);
		
    }
	 
	 @Override
	 public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
	 // no creative items, nono

	}

	@Override
	public boolean isDouble() {
		return false;
	}

}
