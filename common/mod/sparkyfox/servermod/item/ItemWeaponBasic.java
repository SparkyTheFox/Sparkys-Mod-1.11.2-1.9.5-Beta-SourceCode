 package mod.sparkyfox.servermod.item;
 
 import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

 
 public class ItemWeaponBasic extends ItemSword
 {
   private int damage = 1;
   
   public ItemWeaponBasic(Item.ToolMaterial material) {
     super(material);
     //setCreativeTab(VCTabs.WEAPONS);
   }
   
   public ItemWeaponBasic(Item.ToolMaterial material, int damage) {
     this(material);
   }
   
   public net.minecraft.item.Item register(String name)
   {
     setUnlocalizedName(name);
     mod.sparkyfox.servermod.ServerMod.proxy.registerItem(this, name, 0);
     return this;
   }
   
   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
   {
     stack.damageItem(this.damage, attacker);
     return true;
   }
 }