package mod.sparkyfox.servermod.stair.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class CustomIngotBlock extends Block
{
	public CustomIngotBlock(String unlocalizedName) 
	{
																  
		super(Material.BARRIER);					  			
		this.setResistance(6000001.0F);     			
		this.setSoundType(SoundType.STONE);   			  	
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));

	}

}
