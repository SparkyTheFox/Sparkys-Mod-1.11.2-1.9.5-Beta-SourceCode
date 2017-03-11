package mod.sparkyfox.servermod.block;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class BlockBrassOre extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "BrassOre" + ServerMod.RESOURCE_PREFIX + ModNames.BrassOre;  // BrassOre.ServerMod:BrassOre
	}
	


	public BlockBrassOre() {								  	  //===================================================================================================================//
		super(Material.ROCK);					  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(1.5f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(2.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 

	}
																		//Smelting Recipe\\ 
	
		public void addRecipes() {
			GameRegistry.addSmelting(ModBlocks.BrassOre, new ItemStack(ModItems.BrassIngot), 1.0F);
		}
	}