package mod.sparkyfox.servermod.block.ores;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockPlatinumOre extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "PlatinumOre" + ServerMod.RESOURCE_PREFIX + ModNames.PlatinumOre;  // PlatinumOre.ServerMod:PlatinumOre
	}
	


	public BlockPlatinumOre() {								  	  //===================================================================================================================//
		super(Material.ROCK);					  			 	 // The Material determines some properties of the block.															  //
		this.setHardness(8.0f); 				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(10.0F);     					   	   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
    	this.setHarvestLevel("pickaxe", 2);   			 	 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
    	this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);	//===================================================================================================================// 
    	this.setLightLevel(1.0F);
	}
																		//Smelting Recipe\\ 
	
		public void addRecipes() {
			GameRegistry.addSmelting(ModBlocks.PlatinumOre, new ItemStack(ModItems.PlatinumIngot), 1.0F);
		}
	}