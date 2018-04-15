 package mod.sparkyfox.servermod.init;
 
 import mod.sparkyfox.servermod.item.magic.enchantments.EnchantConfusion;
import mod.sparkyfox.servermod.item.magic.enchantments.EnchantDamage;
import mod.sparkyfox.servermod.item.magic.enchantments.EnchantInfinite;
import mod.sparkyfox.servermod.item.magic.enchantments.EnchantPoison;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
 
 public abstract class ModEnchant extends Enchantment {
	 
   private static EnumEnchantmentType ServerModType;
   public static ModEnchant Damage;
   public static ModEnchant Poison;
   public static ModEnchant Confusion;
   public static ModEnchant Infinite;
   private Class[] classes;
   private static int id = 6124;
   
   protected ModEnchant(Enchantment.Rarity par2, ResourceLocation location, Class... obs) {
     super(par2, ServerModType, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
     this.classes = obs;
     
     REGISTRY.register(id++, location, this);
   }
   
   public boolean canApplyAtEnchantingTable(ItemStack stack)
   {
     return canApply(stack);
   }
   
   public boolean canApply(ItemStack par1ItemStack)
   {
     if (par1ItemStack.getItem() == null)
       return false;
     for (Class cls : this.classes) {
       if (cls.isInstance(par1ItemStack.getItem()))
         return true;
     }
     return false;
   }
   
   public static void load() {
	   ServerModType = EnumHelper.addEnchantmentType("servermod_enchants", null);
     
     try {
       Damage = new EnchantDamage();
       Poison = new EnchantPoison();
       Confusion = new EnchantConfusion();
       Infinite = new EnchantInfinite();
     }
     catch (Exception localException) {}
   }
   
   public static int getLevel(ModEnchant enchant, ItemStack stack)
   {
/* 67 */     if (enchant == null)
/* 68 */       return 0;
/* 69 */     return EnchantmentHelper.getEnchantmentLevel(enchant, stack);
   }
 }
