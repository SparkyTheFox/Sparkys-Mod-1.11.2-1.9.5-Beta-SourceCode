/**
package mod.sparkyfox.servermod.block.fun;
 
 import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

 
 public class BlockCrystal extends BlockBreakable
 {
   public static final PropertyInteger DAMAGE = PropertyInteger.create("damage", 0, 15);
   
   public BlockCrystal() {
     super(net.minecraft.block.material.Material.GLASS, false);
     setSoundType(SoundType.GLASS);
     setLightLevel(0.8F);
     setHardness(5.0F);
     setResistance(10.0F);
   }
   
   public boolean isOpaqueCube(IBlockState state)
   {
     return false;
   }
   
   public boolean isFullCube(IBlockState state)
   {
     return false;
   }
   
   @SideOnly(Side.CLIENT)
   public BlockRenderLayer getBlockLayer() {
     return BlockRenderLayer.TRANSLUCENT;
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
   
   public int damageDropped(IBlockState state)
   {
     return ((Integer)state.getValue(DAMAGE)).intValue();
   }
   
   @SideOnly(Side.CLIENT)
   public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list)
   {
     for (int i = 0; i < 16; i++) {
       list.add(new ItemStack(item, 1, i));
     }
   }
   
 
 
 
 
 
 
 
 
 
 
 
 
   public MapColor getMapColor(IBlockState state)
   {
     return EnumDyeColor.byDyeDamage(damageDropped(state)).getMapColor();
   }
   
   public String getUnlocalizedName()
   {
     return "item.crystal";
   }
   
   public Block register(String name) {
     setUnlocalizedName(name);
     ServerMod.proxy.registerBlock(this, "crystal_block", 15, mod.sparkyfox.servermod.item.ItemBlockColored.class);
     return this;
   }
 }

*/