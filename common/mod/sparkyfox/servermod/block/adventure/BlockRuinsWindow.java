package mod.sparkyfox.servermod.block.adventure;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class BlockRuinsWindow extends Block	 {

	
	@Override
	public String getUnlocalizedName() {
		return "RuinsWindow" + ServerMod.RESOURCE_PREFIX + ModNames.RuinsWindow;  // BrassBlock.ServerMod:BrassBlock
	}
	

	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public BlockRuinsWindow() {							  	  //===================================================================================================================//
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
