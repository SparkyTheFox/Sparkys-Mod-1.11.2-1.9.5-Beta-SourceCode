package mod.sparkyfox.servermod.block.stairs;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StairsDiamond extends BlockStairs 
{
	public StairsDiamond(String unlocalizedName, IBlockState state) 
	{
		super(state);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
		this.useNeighborBrightness = true;
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.METAL);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
	}
	
	
																		//Crafting Recipe//


		public void addRecipes() {
		
				
				GameRegistry.addShapedRecipe(new ItemStack(this),"DDD", "DD ", "D  ", 'D', Blocks.DIAMOND_BLOCK);

	}

}
//        registerBlock(41, "gold_block", (new Block(Material.IRON, MapColor.GOLD)).setHardness(3.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockGold").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
//		  registerBlock(42, "iron_block", (new Block(Material.IRON, MapColor.IRON)).setHardness(5.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockIron").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
//		  registerBlock(57, "diamond_block", (new Block(Material.IRON, MapColor.DIAMOND)).setHardness(5.0F).setResistance(10.0F).setSoundType(SoundType.METAL).setUnlocalizedName("blockDiamond").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));