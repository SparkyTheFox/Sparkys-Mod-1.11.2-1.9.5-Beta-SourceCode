package mod.sparkyfox.servermod.props.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PropHole2 extends BlockWeb {

	
	public PropHole2(String unlocalizedName) 
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		this.setTickRandomly(true);

		
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
        return ModBlocks.RuinsCrackedBlock;
    }

    protected boolean canSilkHarvest()
    {
        return false;
    }
}