package mod.sparkyfox.servermod.props.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.init.ModProps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PropHole4 extends BlockWeb {

	
	public PropHole4(String name, float hardness, float resistance, int harvestLevel) 
	{
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(hardness);
		setResistance(resistance);
		this.setTickRandomly(true);
		this.setCreativeTab(null);
        this.setBlockUnbreakable();
        this.disableStats();
	}
	
	       /**
     * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
     * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
     */
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.INVISIBLE;
    }
	

    /**
     * Called When an Entity Collided with the Block
     */
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.getAir();
    }
    
    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Block getBlockDropped(IBlockState state, Random rand, int fortune)
    {
        return ModProps.savestar;
    }

    protected boolean canSilkHarvest()
    {
        return false;
    }
}