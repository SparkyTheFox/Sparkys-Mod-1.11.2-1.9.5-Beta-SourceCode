package mod.sparkyfox.servermod.slab.adventure;

public class WindowMiddleSlab extends BridgeSlab
{
	public WindowMiddleSlab(String name, float hardness, float resistance) 
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
