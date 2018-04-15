 package mod.sparkyfox.servermod.item;
 
 import mod.sparkyfox.servermod.item.magic.ModToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.SideOnly;
 

 
 public class ItemShieldBasic extends net.minecraft.item.ItemShield
 {
   public ModToolMaterial material;
   
   public ItemShieldBasic(ModToolMaterial material)
   {
     this.material = material;
     setFull3D();
     setMaxStackSize(1);
	 setMaxDamage(material.getMaxUses() * 5);
   }
   
   public net.minecraft.item.Item register(String name) {
     setUnlocalizedName(name);
     mod.sparkyfox.servermod.ServerMod.proxy.registerItem(this, name, 0);
     
     return this;
   }
   
 }
