package mod.sparkyfox.servermod.slab.adventure;

public class BridgeDoubleSlab4 extends BridgeSlab4
{
	public BridgeDoubleSlab4(String name, float hardness, float resistance) 
	{
		super(name, hardness, resistance);
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
	}
	
	@Override
	public boolean isDouble() 
	{
		return true;
	}
	
}
