package mod.sparkyfox.servermod.props.adventure;

import javax.annotation.Nullable;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class PropBlueButton extends BlockButton	 {

	
	@Override
	public String getUnlocalizedName() {
		return "BlueButton" + ServerMod.RESOURCE_PREFIX + ModNames.BlueButton;  // BrassBlock.ServerMod:BrassBlock
	}
	

	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public PropBlueButton() {							  	  	 //===================================================================================================================//
		super(false);					  			 	// The Material determines some properties of the block.															 //
		this.setHardness(0.0f); 				 			   // The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					//
		this.setResistance(10.0F);     					   	  // Resistance to explosions.																						   //
		this.setSoundType(SoundType.METAL);   			  	 // Sound type effects placing, breaking, and step sounds.														   	  //
		this.setCreativeTab(null);													// This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
        this.setBlockUnbreakable();
        this.disableStats();												   //===================================================================================================================// 
    }
    

@Override
public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
// no creative items, nono

}
   /**
    * Used to determine ambient occlusion and culling when rebuilding chunks for render
    */
   public boolean isOpaqueCube(IBlockState state)
   {
       return false;
   }

   @SideOnly(Side.CLIENT)
   public float getAmbientOcclusionLightValue(IBlockState state)
   {
       return 1.0F;
   }
   
   

   protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos)
   {
       //worldIn.playSound(player, pos, ModSoundEvents.alarm, SoundCategory.BLOCKS, 1000.0F, 1.0F);
   }

   protected void playReleaseSound(World worldIn, BlockPos pos)
   {
      // worldIn.playSound((EntityPlayer)null, pos, ModSoundEvents.mus_battle1, SoundCategory.BLOCKS, 0.3F[VOLUME], 0.5F[PITCH]);
   }
}