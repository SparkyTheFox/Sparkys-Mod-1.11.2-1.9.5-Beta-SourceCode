package mod.sparkyfox.servermod.item;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemRecipeBook extends Item
{
	public ItemRecipeBook(){
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(1);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "RecipeBook" + ServerMod.RESOURCE_PREFIX + ModNames.RecipeBook;
	}

	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand) 
	{
		ItemStack stack = playerIn.getHeldItem(hand);
		if (worldIn.isRemote)
		{
			playerIn.openGui(ServerMod.instance, 10, worldIn, 0, 0, 0);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	}
}
