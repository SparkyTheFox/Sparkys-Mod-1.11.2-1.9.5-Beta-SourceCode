package mod.sparkyfox.servermod.props.adventure;

import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;

public class PropVine extends BlockVine{
	
	public PropVine(String name, float hardness, float resistance, int harvestLevel) 
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