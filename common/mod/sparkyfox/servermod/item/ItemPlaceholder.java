package mod.sparkyfox.servermod.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemPlaceholder extends ItemBlock
{
  public ItemPlaceholder(net.minecraft.block.Block block)
  {
     super(block);
     setHasSubtypes(true);
     setMaxDamage(0);
  }
  
  public int getMetadata(int damage)
  {
     return damage;
  }
  
  public String getUnlocalizedName(ItemStack par1ItemStack)
  {
     return super.getUnlocalizedName(par1ItemStack) + "_" + par1ItemStack.getItemDamage();
  }
}
