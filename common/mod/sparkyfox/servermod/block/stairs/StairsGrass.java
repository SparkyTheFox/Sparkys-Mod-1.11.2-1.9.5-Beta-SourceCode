package mod.sparkyfox.servermod.block.stairs;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StairsGrass extends BlockStairs {

 
	public StairsGrass(String unlocalizedName, IBlockState state) 
	{
		super(state);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.useNeighborBrightness = true;
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.GROUND);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		
	}

   
   public MapColor getMapColor(IBlockState state)
   {
     return MapColor.GRASS;
   }
   
   public boolean isFullCube()
   {
     return false;
   }
   
   protected boolean canSilkHarvest()
   {
     return true;
   }
   
 
   @SideOnly(Side.CLIENT)
   public BlockRenderLayer getBlockLayer()
   {
     return BlockRenderLayer.CUTOUT_MIPPED;
   }
   
   public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
   {
     return state.isOpaqueCube();
   }
   
   public static class ColorHandler
     implements IBlockColor, net.minecraft.client.renderer.color.IItemColor
   {
     public int colorMultiplier(IBlockState state, IBlockAccess access, BlockPos pos, int tintIndex)
     {
       return (access != null) && (pos != null) ? BiomeColorHelper.getGrassColorAtPos(access, pos) : ColorizerGrass.getGrassColor(0.5D, 1.0D);
     }
     
 
     public int getColorFromItemstack(ItemStack stack, int tintIndex)
     {
       IBlockState iblockstate = ((ItemBlock)stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
       return colorMultiplier((IBlockState)null, (IBlockAccess)null, (BlockPos)null, tintIndex);
     }
   }
 

	
																		//Crafting Recipe//


		public void addRecipes() {
		
				
				GameRegistry.addShapedRecipe(new ItemStack(this, 4),"DDD", "DD ", "D  ", 'D', Blocks.GRASS);

	}

}
//        registerBlock(41, "gold_block", (new Block(Material.IRON, MapColor.GOLD)).setHardness(3.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockGold").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
//		  registerBlock(42, "iron_block", (new Block(Material.IRON, MapColor.IRON)).setHardness(5.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockIron").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
//		  registerBlock(57, "Grass_block", (new Block(Material.IRON, MapColor.Grass)).setHardness(5.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockGrass").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));