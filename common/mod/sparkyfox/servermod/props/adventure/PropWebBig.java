package mod.sparkyfox.servermod.props.adventure;

import net.minecraft.block.BlockWeb;

public class PropWebBig extends BlockWeb {
	
	
	public PropWebBig(String name, float hardness, float resistance, int harvestLevel) 
	{
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(hardness);
		setResistance(resistance);
		this.setCreativeTab(null);
		this.setTickRandomly(true);
        this.setBlockUnbreakable();
        this.disableStats();
	}
}


