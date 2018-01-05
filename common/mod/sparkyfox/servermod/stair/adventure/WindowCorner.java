package mod.sparkyfox.servermod.stair.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

public class WindowCorner extends BlockStairs 
{
	public WindowCorner(String unlocalizedName, IBlockState state) 
	{
		super(state);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.useNeighborBrightness = true;
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
	}

}
