/*
package mod.sparkyfox.servermod.block;
 
 
import mod.sparkyfox.servermod.tiles.TileBlood;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
 
 public class BlockBlood extends BlockBasicContainer {
	 
   public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 2);
   
  public static final AxisAlignedBB AABB = new AxisAlignedBB(0.009999999776482582D, 0.009999999776482582D, 0.009999999776482582D, 0.9900000095367432D, 0.9900000095367432D, 0.9900000095367432D);
   public static final AxisAlignedBB AABB_EMPTY = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
   
   public BlockBlood()
   {
     super(Material.GLASS);
     this.setBlockUnbreakable();
     this.setLightLevel(0.1F);
     this.setLightOpacity(0);
   }
   
   public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, NonNullList<ItemStack> par3List)
   {
    par3List.add(new ItemStack(par1, 1, 0));
    par3List.add(new ItemStack(par1, 1, 1));
    par3List.add(new ItemStack(par1, 1, 2));
   }
   
   public int damageDropped(IBlockState state)
   {
    return ((Integer)state.getValue(TYPE)).intValue();
   }
   
   public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos)
   {
     return AABB_EMPTY;
   }
   
   public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
   {
     return AABB;
   }
   
   public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess par1World, BlockPos pos)
   {
     return NULL_AABB;
   }
   
   public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
   {
     return true;
   }
   
   public boolean isOpaqueCube(IBlockState state)
   {
     return false;
   }
   
   public boolean isFullCube(IBlockState state)
   {
     return false;
   }
   
   public boolean isTopSolid(IBlockState state)
   {
    return false;
   }
   
   public boolean seperateMeta()
   {
     return true;
   }
   
   public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack)
   {
     if (world.isRemote)
       return;
     world.setBlockState(pos, state.withProperty(TYPE, Integer.valueOf(stack.getItemDamage())), 2);
     
     TileBlood tile = (TileBlood)world.getTileEntity(pos);
     tile.hideBottom = (!world.isSideSolid(pos.down(), EnumFacing.UP));
     tile.hideTop = (!world.isSideSolid(pos.up(), EnumFacing.DOWN));
     tile.hideNorth = (!world.isSideSolid(pos.north(), EnumFacing.SOUTH));
     tile.hideSouth = (!world.isSideSolid(pos.south(), EnumFacing.NORTH));
     tile.hideEast = (!world.isSideSolid(pos.east(), EnumFacing.WEST));
     tile.hideWest = (!world.isSideSolid(pos.west(), EnumFacing.EAST));
     
     if ((tile.hideBottom) && (tile.hideTop) && (tile.hideNorth) && (tile.hideSouth) && (tile.hideEast) && (tile.hideWest))
       tile.hideBottom = false;
     tile.rotation = (MathHelper.floor(entity.rotationYaw / 90.0F + 0.5D) & 0x3);
   }
   
   public TileEntity createNewTileEntity(World worldIn, int meta)
   {
     return new TileBlood();
   }
   
   protected BlockStateContainer createBlockState()
   {
     return new BlockStateContainer(this, new IProperty[] { TYPE });
   }
   
   public int getMetaFromState(IBlockState state)
   {
     return ((Integer)state.getValue(TYPE)).intValue();
   }
   
   public IBlockState getStateFromMeta(int meta)
   {
     return getDefaultState().withProperty(TYPE, Integer.valueOf(meta));
   }
 }
*/