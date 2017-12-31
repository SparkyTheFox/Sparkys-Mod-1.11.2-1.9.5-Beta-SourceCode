package mod.sparkyfox.servermod.props.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.init.ModProps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PropSaveStar extends BlockWeb {

	
	public PropSaveStar(String name, float hardness, float resistance, int harvestLevel) 
	{
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(hardness);
		setResistance(resistance);
		this.setCreativeTab(null);
		this.setTickRandomly(true);
        this.setBlockUnbreakable();
        this.disableStats();
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