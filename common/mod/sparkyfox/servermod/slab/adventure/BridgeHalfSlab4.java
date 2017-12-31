package mod.sparkyfox.servermod.slab.adventure;

public class BridgeHalfSlab4 extends BridgeSlab4
{
	public BridgeHalfSlab4(String name, float hardness, float resistance)
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
