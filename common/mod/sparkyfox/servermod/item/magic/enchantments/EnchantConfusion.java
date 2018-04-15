 package mod.sparkyfox.servermod.item.magic.enchantments;
import mod.sparkyfox.servermod.init.ModEnchant;
import mod.sparkyfox.servermod.item.guns.ItemSMG;
import mod.sparkyfox.servermod.item.magic.ItemStaff;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
 
 public class EnchantConfusion extends ModEnchant
 {
   public EnchantConfusion()
   {
     super(Enchantment.Rarity.RARE, new ResourceLocation("servermod", "mod_confusion"), new Class[] { ItemStaff.class, ItemSMG.class });
     this.setName("confusion");
   }
   
   public int getMinEnchantability(int par1)
   {
     return 12 + (par1 - 1) * 20;
   }
   
   public int getMaxEnchantability(int par1)
   {
     return getMinEnchantability(par1) + 25;
   }
   
   public int getMaxLevel()
   {
     return 2;
   }
 }
