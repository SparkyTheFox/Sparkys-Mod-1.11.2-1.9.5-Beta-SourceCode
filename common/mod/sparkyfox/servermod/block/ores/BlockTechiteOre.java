package mod.sparkyfox.servermod.block.ores;

import java.util.Random;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockTechiteOre extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "TechiteOre" + ServerMod.RESOURCE_PREFIX + ModNames.TechiteOre;  // TechiteOre.ServerMod:TechiteOre
	}
	


	public BlockTechiteOre() {								  	  //===================================================================================================================//
		super(Material.ROCK);					  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(1.5f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(2.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.ANVIL);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 
    	this.setLightLevel(1.0F);

	}
																		//Smelting Recipe\\ 
	
		public void addRecipes() {
			//GameRegistry.addSmelting(ModBlocks.TechiteOre, new ItemStack(ModItems.BrassIngot), 1.0F);
		}
		
																			//Drops\\
		
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ModItems.Techite;
	    }
	}