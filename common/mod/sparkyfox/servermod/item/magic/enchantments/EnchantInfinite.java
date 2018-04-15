 package mod.sparkyfox.servermod.item.magic.enchantments;
import mod.sparkyfox.servermod.init.ModEnchant;
import mod.sparkyfox.servermod.item.guns.ItemSMG;
import mod.sparkyfox.servermod.item.magic.ItemStaff;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
 
 public class EnchantInfinite extends ModEnchant
 {
   public EnchantInfinite()
   {
     super(Enchantment.Rarity.VERY_RARE, new ResourceLocation("servermod", "mod_infinite"), new Class[] { ItemStaff.class, ItemSMG.class });
     this.setName("infinite");
   }
   
   public int getMinEnchantability(int par1)
   {
     return 20;
   }
   
   public int getMaxEnchantability(int par1)
   {
     return 50;
   }
   
   public int getMaxLevel()
   {
     return 1;
   }
 }
