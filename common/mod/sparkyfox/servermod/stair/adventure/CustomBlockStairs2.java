package mod.sparkyfox.servermod.stair.adventure;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class CustomBlockStairs2 extends BlockStairs 
{
	public CustomBlockStairs2(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
	}

}
