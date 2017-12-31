package mod.sparkyfox.servermod.slab.adventure;

public class BridgeHalfSlab2 extends BridgeSlab2
{
	public BridgeHalfSlab2(String name, float hardness, float resistance)
	{
		super(name, hardness, resistance);
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
