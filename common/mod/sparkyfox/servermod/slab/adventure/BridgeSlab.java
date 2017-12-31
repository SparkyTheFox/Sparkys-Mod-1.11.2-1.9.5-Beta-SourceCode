package mod.sparkyfox.servermod.slab.adventure;

import java.util.Random;

import mod.sparkyfox.servermod.init.ModSlabs;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BridgeSlab extends BlockSlab //NEEDS to be abstract (for some reason :P)
{
	public BridgeSlab(String name, float hardness, float resistance)
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);//i think this is the  2.5F, 4.5F vaules-float-paramters are in ModSlabs
		setResistance(resistance);//i think this is the  2.5F, 4.5F vaules-float-paramters are in ModSlabs
		//still need to do a modnames or just go with servermod.tile.name= in en_US.lang	
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		
		IBlockState state = this.blockState.getBaseState();
		
		if(!this.isDouble())
		{
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		setDefaultState(state);
		this.useNeighborBrightness = true;//setting this to true this stops dark shadows from appearing
	}
	
	@Override
	public String getUnlocalizedName(int meta) 
	{
		return this.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() 
	{
		return HALF;
	}
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack)
	{
		return EnumBlockHalf.BOTTOM;
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		if(!this.isDouble())
		{
			return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
		}
		return this.getDefaultState();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		if(!this.isDouble())
		{
			return 0;
		}
		
		return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(ModSlabs.bridgeslabhalf);
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {HALF});
		
	}
}




























