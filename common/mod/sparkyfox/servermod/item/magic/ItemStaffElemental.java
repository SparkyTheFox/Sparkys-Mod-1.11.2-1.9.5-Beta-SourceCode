
package mod.sparkyfox.servermod.item.magic;
 
 import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
 
 public class ItemStaffElemental extends ItemStaff
 {
   public ItemStaffElemental(ModToolMaterial material)
   {
     super(material);
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
       ServerMod.proxy.registerItem(this, name, var4);
     }
     return this;
   }
   
   public ItemStack getProjectile(ItemStack stack)
   {
     return new ItemStack(mod.sparkyfox.servermod.init.ModFunItems.orb, 1, stack.getItemDamage());

   }
   
   public void spawnParticle(ItemStack stack, net.minecraft.entity.EntityLivingBase player)
   {
	   ServerMod.proxy.spawnParticle(player, "Spell", new Object[] { Integer.valueOf(stack.getItemDamage()), Integer.valueOf(4) });
   }
 }