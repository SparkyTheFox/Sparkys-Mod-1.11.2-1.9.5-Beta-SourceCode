package mod.sparkyfox.servermod.slab.adventure;

public class WindowMiddleDoubleSlab extends BridgeSlab
{
	public WindowMiddleDoubleSlab(String name, float hardness, float resistance) 
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
