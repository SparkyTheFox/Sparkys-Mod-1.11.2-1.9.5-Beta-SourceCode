package mod.sparkyfox.servermod.slab.adventure;

public class BridgeHalfSlab extends BridgeSlab
{
	public BridgeHalfSlab(String name, float hardness, float resistance)
	{
		super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
