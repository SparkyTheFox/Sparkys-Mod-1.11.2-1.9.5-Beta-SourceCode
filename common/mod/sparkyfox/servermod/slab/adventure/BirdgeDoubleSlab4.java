package mod.sparkyfox.servermod.slab.adventure;

public class BirdgeDoubleSlab4 extends BridgeSlab4
{
	public BirdgeDoubleSlab4(String name, float hardness, float resistance) 
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