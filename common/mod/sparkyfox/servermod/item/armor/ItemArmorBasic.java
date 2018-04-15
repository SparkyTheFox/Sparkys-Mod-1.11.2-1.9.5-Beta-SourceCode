 package mod.sparkyfox.servermod.item.armor;
 
 import mod.sparkyfox.servermod.init.ModArmors;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
 
 public class ItemArmorBasic extends ItemArmor {
	 
   private String texture;
   
   public ItemArmorBasic(ItemArmor.ArmorMaterial par2EnumArmorMaterial, EntityEquipmentSlot par4, String texture)
   {
     super(par2EnumArmorMaterial, 0, par4);
     this.texture = texture;
     this.setMaxStackSize(1);
   }
   
   public net.minecraft.item.Item register(String name) {
     setUnlocalizedName(name);
     mod.sparkyfox.servermod.ServerMod.proxy.registerItem(this, name, 0);
     
     return this;
   }
   
   public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
   {
     if (this.armorType == EntityEquipmentSlot.LEGS)
    	 return "servermod:textures/models/armor/" + this.texture + "_2.png";
     return "servermod:textures/models/armor/" + this.texture + "_1.png";
   }
   
	  @Override
	  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	  if (itemStack.getItem().equals(ModArmors.demonic_chest))
		  	player.addPotionEffect(new PotionEffect(Potion.getPotionById(12)));
	  }
 }