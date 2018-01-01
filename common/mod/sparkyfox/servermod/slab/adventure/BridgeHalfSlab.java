package mod.sparkyfox.servermod.slab.adventure;

public class BridgeHalfSlab extends BridgeSlab
{
	public BridgeHalfSlab(String name, float hardness, float resistance)
	{
		super(name);
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
