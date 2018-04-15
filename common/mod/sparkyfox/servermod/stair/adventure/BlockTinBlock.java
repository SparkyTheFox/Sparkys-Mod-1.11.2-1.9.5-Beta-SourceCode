package mod.sparkyfox.servermod.stair.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

/**
 * A block of tin, similar to an iron block
 * 
 * @author CJMinecraft
 *
 */
public class BlockTinBlock extends Block {

	/**
	 * Default constructor which sets the hardness and resistance
	 * 
	 * @param unlocalizedName
	 *            The unlocalized name
	 */
	public BlockTinBlock(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.setHardness(3);
		this.setResistance(20);
		
    }
	 
	 @Override
	 public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
	 // no creative items, nono

	}
	

}
