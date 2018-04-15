package mod.sparkyfox.servermod.block.adventure;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class BlockRuinsWindowCorner extends Block	 {

	
	@Override
	public String getUnlocalizedName() {
		return "RuinsWindowCorner" + ServerMod.RESOURCE_PREFIX + ModNames.RuinsWindowCorner;  // BrassBlock.ServerMod:BrassBlock
	}
	

	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public BlockRuinsWindowCorner() {							  	  //===================================================================================================================//
		super(Material.BARRIER);					  			 // The Material determines some properties of the block.															  //
		this.setBlockUnbreakable();				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(6000001.0F);     				   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
		this.disableStats();  			 	                 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
															//===================================================================================================================// 
		this.setCreativeTab(null);	
        
		}
	 @Override
	 public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
	   // no creative items, nono
	 
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
}
