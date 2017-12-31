package mod.sparkyfox.servermod.slab.adventure;

public class WindowMiddleHalfSlab extends BridgeSlab
{
	public WindowMiddleHalfSlab(String name, float hardness, float resistance)
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
