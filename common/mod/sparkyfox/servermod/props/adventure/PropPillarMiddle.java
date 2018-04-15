package mod.sparkyfox.servermod.props.adventure;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class PropPillarMiddle extends BlockStairs 
{
	public PropPillarMiddle(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		this.setCreativeTab(null);
        this.setBlockUnbreakable();
        this.disableStats();
	}
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
	// no creative items, nono

	}

}
