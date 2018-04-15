/**
package mod.sparkyfox.servermod.item;
 
 import mod.sparkyfox.servermod.item.ItemBasic;
import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.NonNullList;
 
 public class ItemOrb extends ItemBasic
 {
   public ItemOrb()
   {
     setHasSubtypes(true);
   }
   
   public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, NonNullList<ItemStack> par3List)
   {
     for (int var4 = 0; var4 < 16; var4++) {
       par3List.add(new ItemStack(par1, 1, var4));
     }
   }
   
   public Item register(String name)
   {
     setUnlocalizedName(name);
     for (int var4 = 0; var4 < 16; var4++) {
    	 mod.sparkyfox.servermod.ServerMod.proxy.registerItem(this, name, var4);
     }     return this;
   }
 }
*/