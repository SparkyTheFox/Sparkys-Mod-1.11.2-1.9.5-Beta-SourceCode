package mod.sparkyfox.servermod.block.adventure;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockLever;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSwitch2 extends BlockLever {

	@Override
	public String getUnlocalizedName() {
		return "WallSwitch2" + ServerMod.RESOURCE_PREFIX + ModNames.Switch2;  // CobaltOre.ServerMod:CobaltOre
	}
	public BlockSwitch2() {
		super();
        this.setBlockUnbreakable();
        this.setResistance(6000001.0F);
        this.disableStats();
        this.setCreativeTab(null);
		}
        @SideOnly(Side.CLIENT)
        public BlockRenderLayer getBlockLayer()
        {
            return BlockRenderLayer.CUTOUT;
        }

        public boolean isFullCube(IBlockState state)
        {
            return false;
        }
        
        
    /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            state = state.cycleProperty(POWERED);
            worldIn.setBlockState(pos, state, 3);
            float f = ((Boolean)state.getValue(POWERED)).booleanValue() ? 0.0F : 0.0F;
            worldIn.playSound((EntityPlayer)null, pos, ModSoundEvents.soulbattleflash, SoundCategory.BLOCKS, 1.0F, 1.0F);
            worldIn.notifyNeighborsOfStateChange(pos, this, false);
            EnumFacing enumfacing = ((BlockLever.EnumOrientation)state.getValue(FACING)).getFacing();
            worldIn.notifyNeighborsOfStateChange(pos.offset(enumfacing.getOpposite()), this, false);
            return true;
        }
    }

}