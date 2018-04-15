package mod.sparkyfox.servermod.block.ores;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockDemonicOre extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "DemonicOre" + ServerMod.RESOURCE_PREFIX + ModNames.DemonicOre;  // CobaltOre.ServerMod:CobaltOre
	}
	


	public BlockDemonicOre() {								  	  //===================================================================================================================//
		super(Material.ROCK);					  			 	 // The Material determines some properties of the block.															  //
		//this.setHardness(3.0f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		//this.setResistance(5.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 

	}
    /**
     * Get the MapColor for this Block and the given BlockState
     */
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.NETHERRACK;
    }
																		//Smelting Recipe\\ 
	
		public void addRecipes() {
			GameRegistry.addSmelting(ModBlocks.DemonicOre, new ItemStack(ModItems.DemonicIngot), 1.0F);
		}
	}