package mod.sparkyfox.servermod.block.stairs;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt.DirtType;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass.EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlockGrass extends Block implements IGrowable
{
/*  28 */   public static final PropertyBool SNOWY = PropertyBool.create("snowy");
  
  public ModBlockGrass()
  {
/*  32 */     super(Material.GRASS);
/*  33 */     setDefaultState(this.blockState.getBaseState().withProperty(SNOWY, Boolean.valueOf(false)));
/*  34 */     setTickRandomly(true);
  }
  
  public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
  {
/*  39 */     Block block = worldIn.getBlockState(pos.up()).getBlock();
/*  40 */     return state.withProperty(SNOWY, Boolean.valueOf((block == Blocks.SNOW) || (block == Blocks.SNOW_LAYER)));
  }
  
  @SideOnly(Side.CLIENT)
  public int getBlockColor()
  {
/*  46 */     return ColorizerGrass.getGrassColor(0.5D, 1.0D);
  }
  
  @SideOnly(Side.CLIENT)
  public int getRenderColor(IBlockState state)
  {
/*  52 */     return getBlockColor();
  }
  
  @SideOnly(Side.CLIENT)
  public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass)
  {
/*  58 */     return net.minecraft.world.biome.BiomeColorHelper.getGrassColorAtPos(worldIn, pos);
  }
  
  public Item getItemDropped(IBlockState state, Random rand, int fortune)
  {
/*  63 */     return Blocks.DIRT.getItemDropped(Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), rand, fortune);
  }
  
  public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
  {
/*  68 */     return true;
  }
  
  public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
  {
/*  73 */     return true;
  }
  
  @SideOnly(Side.CLIENT)
  public BlockRenderLayer getBlockLayer()
  {
/*  79 */     return BlockRenderLayer.CUTOUT_MIPPED;
  }
  
  public int getMetaFromState(IBlockState state)
  {
/*  84 */     return 0;
  }
  
  protected BlockStateContainer createBlockState()
  {
/*  89 */     return new BlockStateContainer(this, new IProperty[] { SNOWY });
  }
  
  public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
  {
/*  94 */     BlockPos blockpos = pos.up();
    
/*  96 */     for (int i = 0; i < 128; i++)
    {
/*  98 */       BlockPos blockpos1 = blockpos;
/*  99 */       int j = 0;
      
      for (;;)
      {
/* 103 */         if (j >= i / 16)
        {
/* 105 */           if (!worldIn.isAirBlock(blockpos1))
            break;
/* 107 */           if (rand.nextInt(8) == 0)
          {
/* 109 */             worldIn.getBiome(blockpos1).plantFlower(worldIn, rand, blockpos1); break;
          }
          

/* 113 */           IBlockState iblockstate1 = Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS);
          
/* 115 */           if (Blocks.TALLGRASS.canBlockStay(worldIn, blockpos1, iblockstate1))
          {
/* 117 */             worldIn.setBlockState(blockpos1, iblockstate1, 3);
          }
/* 119 */           break;
        }
        



/* 125 */         blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
        
/* 127 */         if ((worldIn.getBlockState(blockpos1.down()).getBlock() != Blocks.GRASS) || (worldIn.getBlockState(blockpos1).isNormalCube())) {
          break;
        }
        

/* 132 */         j++;
      }
    }
  }
}


