package mod.sparkyfox.servermod.block.adventure;

import java.util.List;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModSoundEvents;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPadPressurePlate3 extends BlockPressurePlateWeighted {

	@Override
	public String getUnlocalizedName() {
		return "PadPressurePlate3" + ServerMod.RESOURCE_PREFIX + ModNames.PadPressurePlate3;  // CobaltOre.ServerMod:CobaltOre
	}
	
	private final BlockPressurePlate.Sensitivity sensitivity;

	public BlockPadPressurePlate3(Material materialIn, BlockPressurePlate.Sensitivity sensitivityIn) {
		super(Material.IRON, 1);
		this.sensitivity = sensitivityIn;
        this.setBlockUnbreakable();
        this.setResistance(6000001.0F);
        this.disableStats();
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

        protected void playClickOnSound(World worldIn, BlockPos color)
        {
            worldIn.playSound((EntityPlayer)null, color, ModSoundEvents.soulbattleflash, SoundCategory.BLOCKS, 0.3F, 0.90000004F);
        }

        protected void playClickOffSound(World worldIn, BlockPos pos)
        {
            worldIn.playSound((EntityPlayer)null, pos, ModSoundEvents.nosound, SoundCategory.BLOCKS, 0.3F, 0.75F);
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