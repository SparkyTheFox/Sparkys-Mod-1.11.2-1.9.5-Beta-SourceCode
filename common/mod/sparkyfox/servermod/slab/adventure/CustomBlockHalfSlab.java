package mod.sparkyfox.servermod.slab.adventure;

public class CustomBlockHalfSlab extends CustomBlockSlab
{
	public CustomBlockHalfSlab(String name, float hardness, float resistance)
	{
		super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
