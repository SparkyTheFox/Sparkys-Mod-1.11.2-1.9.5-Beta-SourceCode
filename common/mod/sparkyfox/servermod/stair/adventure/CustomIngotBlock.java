package mod.sparkyfox.servermod.stair.adventure;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;

public class CustomIngotBlock extends Block
{
	public CustomIngotBlock(String name, float hardness, float resistance, int harvestLevel) 
	{
																  //===================================================================================================================//
		super(Material.BARRIER);					  			 // The Material determines some properties of the block.															  //
	//	this.setBlockUnbreakable();				 				// The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.					 //
		this.setResistance(6000001.0F);     				   // Resistance to explosions.																							//
		this.setSoundType(SoundType.STONE);   			  	  // Sound type effects placing, breaking, and step sounds.														   	   //
		//this.disableStats();  			 	                 // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions. //
															//===================================================================================================================//
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		setRegistryName(name);
		setUnlocalizedName(name);
		//setHardness(hardness);
		//setResistance(resistance);
		//setHarvestLevel("pickaxe", harvestLevel);
	}

}
