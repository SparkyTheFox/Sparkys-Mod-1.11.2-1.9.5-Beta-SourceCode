package mod.sparkyfox.servermod.props.adventure;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class PropPillarBottom extends BlockStairs 
{
	public PropPillarBottom(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		this.setCreativeTab(null);
        this.setBlockUnbreakable();
        this.disableStats();
	}

}
