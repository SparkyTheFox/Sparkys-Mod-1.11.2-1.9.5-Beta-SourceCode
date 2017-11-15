package mod.sparkyfox.servermod.slab.adventure;

public class BirdgeDoubleSlab extends BridgeSlab
{
	public BirdgeDoubleSlab(String name, float hardness, float resistance) 
	{
		super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return true;
	}
	
}
