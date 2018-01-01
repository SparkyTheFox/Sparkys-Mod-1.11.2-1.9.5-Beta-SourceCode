package mod.sparkyfox.servermod.slab.adventure;

public class BridgeDoubleSlab extends BridgeSlab
{
	public BridgeDoubleSlab(String name, float hardness, float resistance) 
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
