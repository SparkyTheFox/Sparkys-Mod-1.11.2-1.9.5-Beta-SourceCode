package mod.sparkyfox.servermod.block.barriers;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;



public class BlockBarrierTitanium extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "BarrierTitanium" + ServerMod.RESOURCE_PREFIX + ModNames.BarrierTitanium;  // BrassBlock.ServerMod:BrassBlock
	}
	


	public BlockBarrierTitanium() {							  	  //===================================================================================================================//
		super(Material.BARRIER);					  			 // The Material determines some properties of the block.															  //
		this.setBlockUnbreakable();				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(6000001.0F);     				   // Resistance to explosions.																							//
		this.setSoundType(SoundType.METAL);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
		this.disableStats();  			 	                 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
															//===================================================================================================================// 

	}
    
    
																		//Crafting Recipe//


		//public void addRecipes() {
		
				
				//GameRegistry.addShapedRecipe(new ItemStack(this),"BBB", "BBB", "BBB", 'B', ModItems.BrassIngot);
				
					
		}

