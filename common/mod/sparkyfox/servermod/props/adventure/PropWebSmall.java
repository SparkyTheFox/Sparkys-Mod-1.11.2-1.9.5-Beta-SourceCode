package mod.sparkyfox.servermod.props.adventure;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.block.BlockWeb;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class PropWebSmall extends BlockWeb {
	
	
	public PropWebSmall(String unlocalizedName) 
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, unlocalizedName));
        this.setBlockUnbreakable();
        this.disableStats();
        this.setCreativeTab(null);
		this.setTickRandomly(true);

	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, NonNullList<ItemStack> list) {
	// no creative items, nono

	}
}

