package mod.sparkyfox.servermod.props.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockWeb;
import net.minecraft.util.ResourceLocation;

public class PropWebBig extends BlockWeb {
	
	
	public PropWebBig(String unlocalizedName) 
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		this.setTickRandomly(true);


	}
}


