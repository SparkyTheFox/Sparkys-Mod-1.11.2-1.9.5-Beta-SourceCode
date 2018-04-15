/**
package mod.sparkyfox.servermod.block.fun;
 
 import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
 
 
 
 public class BlockPlaceholder
   extends Block
 {
   public static final PropertyInteger DAMAGE = PropertyInteger.create("damage", 0, 15);
   
   public BlockPlaceholder() {
     super(Material.ROCK);
     setSoundType(SoundType.WOOD);
   }
   
   public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack)
   {
     super.onBlockPlacedBy(world, pos, state, entity, stack);
     world.setBlockState(pos, state.withProperty(DAMAGE, Integer.valueOf(stack.getItemDamage())), 2);
   }
   
   public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, NonNullList<ItemStack> par3List)
   {
     for (int i = 0; i < 16; i++) {
       par3List.add(new ItemStack(par1, 1, i));
     }
   }
   
   public int damageDropped(IBlockState state) {
     return ((Integer)state.getValue(DAMAGE)).intValue();
   }
   
   public int getMetaFromState(IBlockState state)
   {
     return damageDropped(state);
   }
   
   public IBlockState getStateFromMeta(int meta)
   {
     return getDefaultState().withProperty(DAMAGE, Integer.valueOf(meta));
   }
   
   protected BlockStateContainer createBlockState()
   {
     return new BlockStateContainer(this, new IProperty[] { DAMAGE });
   }
 }
*/