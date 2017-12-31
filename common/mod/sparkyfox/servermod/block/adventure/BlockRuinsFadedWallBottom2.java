package mod.sparkyfox.servermod.block.adventure;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;



public class BlockRuinsFadedWallBottom2 extends Block {

	
	@Override
	public String getUnlocalizedName() {
		return "RuinsFadedWallBottom2" + ServerMod.RESOURCE_PREFIX + ModNames.RuinsFadedWallBottom2;  // BrassBlock.ServerMod:BrassBlock
	}
	


	public BlockRuinsFadedWallBottom2() {							  		  //===================================================================================================================//
		super(Material.BARRIER);					  			 // The Material determines some properties of the block.															  //
		this.setBlockUnbreakable();				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(6000001.0F);     				   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
		this.disableStats();  			 	                 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
															//===================================================================================================================// 
		this.setCreativeTab(null);	
	}
    
    
																		//Crafting Recipe//


		//public void addRecipes() {
		
				
				//GameRegistry.addShapedRecipe(new ItemStack(this),"BBB", "BBB", "BBB", 'B', ModItems.BrassIngot);
				
					
		}

