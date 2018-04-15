 package mod.sparkyfox.servermod.item.magic.enchantments;
import mod.sparkyfox.servermod.init.ModEnchant;
import mod.sparkyfox.servermod.item.guns.ItemSMG;
import mod.sparkyfox.servermod.item.magic.ItemStaff;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
 
 public class EnchantDamage extends ModEnchant
 {
   public EnchantDamage()
   {
     super(Enchantment.Rarity.COMMON, new ResourceLocation("servermod", "mod_damage"), new Class[] { ItemStaff.class, ItemSMG.class });
     this.setName("damage");
   }
   
   public int getMinEnchantability(int par1)
   {
     return 1 + (par1 - 1) * 10;
   }
   
   public int getMaxEnchantability(int par1)
   {
     return getMinEnchantability(par1) + 15;
   }
   
   public int getMaxLevel()
   {
     return 5;
   }
 }
