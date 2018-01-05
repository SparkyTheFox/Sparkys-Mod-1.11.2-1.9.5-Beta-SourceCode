package mod.sparkyfox.servermod.props.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class PropVine extends BlockVine{
	
	public PropVine(String unlocalizedName) 
	{
		super();

		this.setTickRandomly(true);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
	}
}