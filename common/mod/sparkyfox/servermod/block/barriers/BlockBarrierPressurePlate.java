package mod.sparkyfox.servermod.block.barriers;

import java.util.List;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBarrierPressurePlate extends BlockPressurePlateWeighted {

	@Override
	public String getUnlocalizedName() {
		return "BarrierPressurePlate" + ServerMod.RESOURCE_PREFIX + ModNames.BarrierPressurePlate;  // CobaltOre.ServerMod:CobaltOre
	}
	
	private final BlockPressurePlate.Sensitivity sensitivity;

	public BlockBarrierPressurePlate(Material materialIn, BlockPressurePlate.Sensitivity sensitivityIn) {
		super(Material.BARRIER, 1);
		this.sensitivity = sensitivityIn;
        this.setBlockUnbreakable();
        this.setResistance(6000001.0F);
        this.disableStats();
        this.translucent = true;
        this.setCreativeTab(null);
    }

    /**
     * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
     * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
     */
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.INVISIBLE;
	
	}

	@Override
	protected void playClickOnSound(World worldIn, BlockPos color) {
		super.playClickOnSound(worldIn, color);
		
	}

	@Override
	protected void playClickOffSound(World worldIn, BlockPos pos) {
		super.playClickOffSound(worldIn, pos);
		
	}

	@Override
	protected int computeRedstoneStrength(World worldIn, BlockPos pos) {
	    
	        AxisAlignedBB axisalignedbb = PRESSURE_AABB.offset(pos);
	        List <? extends Entity > list;

	        switch (this.sensitivity)
	        {
            case MOBS:
                list = worldIn.<Entity>getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
                break;
            default:
                return 0;
	     }

	        if (!list.isEmpty())
	        {
	            for (Entity entity : list)
	            {
	                if (!entity.doesEntityNotTriggerPressurePlate())
	                {
	                    return 15;
	                }
	            }
	        }

	        return 0;
	    }

	//@Override
	//protected int getRedstoneStrength(IBlockState state) {
		// TODO Auto-generated method stub
		//return 0;
	//}

	//@Override
	//protected IBlockState setRedstoneStrength(IBlockState state, int strength) {
		// TODO Auto-generated method stub
		//return null;
	//}

    public static enum Sensitivity
    {
        MOBS;
    }
}