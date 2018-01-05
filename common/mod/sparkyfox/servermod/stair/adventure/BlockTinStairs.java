package mod.sparkyfox.servermod.stair.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/**
 * A block representing a default instance of stairs
 * 
 * @author CJMinecraft
 *
 */
public class BlockTinStairs extends BlockStairs {

	/**
	 * Initialise custom stairs
	 * 
	 * @param unlocalizedName
	 *            The unlocalized name of the stairs
	 * @param state
	 *            The block which the stairs is made out of (i.e. the tin block
	 *            for tin stairs)
	 */
	public BlockTinStairs(String unlocalizedName, IBlockState state) {
		super(state);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.setHardness(3);
		this.setResistance(20);
		this.useNeighborBrightness = true;
	}

}
