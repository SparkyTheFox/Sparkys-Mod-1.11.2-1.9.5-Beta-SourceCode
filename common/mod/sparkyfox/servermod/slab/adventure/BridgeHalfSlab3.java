package mod.sparkyfox.servermod.slab.adventure;

public class BridgeHalfSlab3 extends BridgeSlab3
{
	public BridgeHalfSlab3(String name, float hardness, float resistance)
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
