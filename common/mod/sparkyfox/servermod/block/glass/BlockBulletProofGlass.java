package mod.sparkyfox.servermod.block.glass;

import java.util.Random;

import javax.annotation.Nonnull;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class BlockBulletProofGlass extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "BulletProofGlass" + ServerMod.RESOURCE_PREFIX + ModNames.BulletProofGlass;  // TitaniumBlock.ServerMod:TitaniumBlock
	}
	


	public BlockBulletProofGlass() {							  //===================================================================================================================//
		super(Material.IRON);					  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(5.0f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(10.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.GLASS);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	//this.setHarvestLevel("pickaxe", 2);   			 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 

			
	}
	@Override

	public boolean isOpaqueCube(IBlockState state) {

		return false;

	}
	@SideOnly(Side.CLIENT)

	@Override

	public boolean shouldSideBeRendered(IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, EnumFacing side) {

		Block block = world.getBlockState(pos.offset(side)).getBlock();

		return block == this ? false : super.shouldSideBeRendered(state, world, pos, side);

	}
	@SideOnly(Side.CLIENT)

	@Nonnull

	@Override

	public BlockRenderLayer getBlockLayer() {

		return BlockRenderLayer.TRANSLUCENT;

	}

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 0;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }

	
																		//Crafting Recipe//


		public void addRecipes() {
		
				
				//GameRegistry.addShapedRecipe(new ItemStack(this),"TTT", "TTT", "TTT", 'T', ModItems.TitaniumIngot);
				
					
		}
}
