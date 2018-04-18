 package mod.sparkyfox.servermod.init;
 
 import mod.sparkyfox.servermod.item.armor.ItemArmorBasic;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

 
 
 public class ModArmors {
	 
   public static Item cow_leather_head;
   public static Item cow_leather_chest;
   public static Item cow_leather_legs;
   public static Item cow_leather_boots;
   public static Item nanorum_head;
   public static Item nanorum_chest;
   public static Item nanorum_legs;
   public static Item nanorum_boots;
   public static Item tactical_head;
   public static Item tactical_chest;
   public static Item full_leather_head;
   public static Item full_leather_chest;
   public static Item full_iron_head;
   public static Item full_iron_chest;
   public static Item full_golden_head;
   public static Item full_golden_chest;
   public static Item full_diamond_head;
   public static Item full_diamond_chest;
   public static Item full_brass_head;
   public static Item full_brass_chest;
   public static Item full_brass_legs;
   public static Item full_brass_boots;
   public static Item full_wooden_head;
   public static Item full_wooden_chest;
   public static Item full_wooden_legs;
   public static Item full_wooden_boots;
   public static Item wizard_head;
   public static Item wizard_chest;
   public static Item wizard_pants;
   public static Item assassin_head;
   public static Item assassin_chest;
   public static Item assassin_legs;
   public static Item assassin_boots;
   public static Item soldier_head;
   public static Item soldier_chest;
   public static Item soldier_legs;
   public static Item soldier_bottom;
   public static Item x407_head;
   public static Item x407_chest;
   public static Item x407_legs;
   public static Item x407_boots;
   public static Item mithril_head;
   public static Item mithril_chest;
   public static Item mithril_legs;
   public static Item mithril_boots;
   public static Item demonic_head;
   public static Item demonic_chest;
   public static Item demonic_legs;
   public static Item demonic_boots;
   public static Item commissar_head;
   public static Item commissar_chest;
   public static Item commissar_legs;
   public static Item commissar_bottom;
   public static Item infantry_helmet;
   public static Item officer_chest;
   public static Item crown;
   public static Item crown2;
   public static Item ninja_head;
   public static Item ninja_chest;
   public static Item ninja_legs;
   public static Item chain_skirt;
   public static Item leather_skirt;
   public static Item golden_skirt;
   public static Item iron_skirt;
   public static Item diamond_skirt;
   public static Item emerald_skirt;
   public static Item brass_skirt;
   public static Item demonic_skirt;
   public static Item mithril_skirt;
   
   public static void Load()
   {
     Class<?>[] types = { String.class, Integer.TYPE, int[].class, Integer.TYPE, SoundEvent.class, Float.TYPE };
     ItemArmor.ArmorMaterial armorMithril = (ItemArmor.ArmorMaterial)EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, "MITHRIL", types, new Object[] { "", 40, new int[] {3, 6, 8, 3}, Integer.valueOf(20), SoundEvents.ITEM_ARMOR_EQUIP_IRON, Float.valueOf(2.0F) });
     ItemArmor.ArmorMaterial armorBrass = (ItemArmor.ArmorMaterial)EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, "BRASS", types, new Object[] { "", 7, new int[] { 2, 5, 6, 2 }, Integer.valueOf(20), SoundEvents.ITEM_ARMOR_EQUIP_IRON, Float.valueOf(0.0F) });
     ItemArmor.ArmorMaterial armorEmerald = (ItemArmor.ArmorMaterial)EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, "EMERALD", types, new Object[] { "", 35, new int[] { 3, 6, 8, 3 }, Integer.valueOf(5), SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Float.valueOf(2.0F) });



     armorMithril.setRepairItem(new ItemStack(ModFunItems.ingot_mithril));
     
     cow_leather_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, "cow_leather").register("cow_leather_head");
     cow_leather_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, "cow_leather").register("cow_leather_chest");
     cow_leather_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, "cow_leather").register("cow_leather_legs");
     cow_leather_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.FEET, "cow_leather").register("cow_leather_boots");
     
     nanorum_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "nanorum").register("nanorum_head");
     nanorum_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "nanorum").register("nanorum_chest");
     nanorum_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, "nanorum").register("nanorum_legs");
     nanorum_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, "nanorum").register("nanorum_boots");
     
     tactical_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "tactical").register("tactical_head");
     tactical_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "tactical").register("tactical_chest");
     
     full_leather_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "full_cloth").register("full_leather_head");
     full_leather_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "full_cloth").register("full_leather_chest");
     
     full_iron_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "full_iron").register("full_iron_head");
     full_iron_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "full_iron").register("full_iron_chest");
     
     full_golden_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, "full_golden").register("full_golden_head");
     full_golden_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, "full_golden").register("full_golden_chest");
     
     full_diamond_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, "full_diamond").register("full_diamond_head");
     full_diamond_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, "full_diamond").register("full_diamond_chest");
     
     full_brass_head = new ItemArmorBasic(armorBrass, EntityEquipmentSlot.HEAD, "full_brass").register("full_brass_head");
     full_brass_chest = new ItemArmorBasic(armorBrass, EntityEquipmentSlot.CHEST, "full_brass").register("full_brass_chest");
     full_brass_legs = new ItemArmorBasic(armorBrass, EntityEquipmentSlot.LEGS, "full_brass").register("full_brass_legs");
     full_brass_boots = new ItemArmorBasic(armorBrass, EntityEquipmentSlot.FEET, "full_brass").register("full_brass_boots");
     
     
     full_wooden_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD, "full_wooden").register("full_wooden_head");
     full_wooden_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST, "full_wooden").register("full_wooden_chest");
     full_wooden_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS, "full_wooden").register("full_wooden_legs");
     full_wooden_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET, "full_wooden").register("full_wooden_boots");
     
     
     wizard_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.HEAD, "wizard").register("wizard_head");
     wizard_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.CHEST, "wizard").register("wizard_chest");
     wizard_pants = new ItemArmorBasic(ItemArmor.ArmorMaterial.CHAIN, EntityEquipmentSlot.LEGS, "wizard").register("wizard_pants");
     
     assassin_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "assassin").register("assassin_head");
     assassin_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "assassin").register("assassin_chest");
     assassin_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, "assassin").register("assassin_legs");
     assassin_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, "assassin").register("assassin_boots");
     
     soldier_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "soldier").register("soldier_head");
     soldier_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "soldier").register("soldier_chest");
     soldier_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, "soldier").register("soldier_legs");
     soldier_bottom = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.FEET, "soldier").register("soldier_bottom");
     
     x407_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, "x407").register("x407_head");
     x407_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, "x407").register("x407_chest");
     x407_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, "x407").register("x407_legs");
     x407_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, "x407").register("x407_boots");
     
     mithril_head = new ItemArmorBasic(armorMithril, EntityEquipmentSlot.HEAD, "mithril").register("mithril_head");
     mithril_chest = new ItemArmorBasic(armorMithril, EntityEquipmentSlot.CHEST, "mithril").register("mithril_chest");
     mithril_legs = new ItemArmorBasic(armorMithril, EntityEquipmentSlot.LEGS, "mithril").register("mithril_legs");
     mithril_boots = new ItemArmorBasic(armorMithril, EntityEquipmentSlot.FEET, "mithril").register("mithril_boots");
     
     demonic_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, "demonic").register("demonic_head");
     //demonic_head = new ItemArmorHead(ItemArmor.ArmorMaterial.DIAMOND, "servermod", "demonic").register("demonic_head");
     demonic_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, "demonic").register("demonic_chest");
     demonic_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, "demonic").register("demonic_legs");
     demonic_boots = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, "demonic").register("demonic_boots");
     
     commissar_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.HEAD, "commissar").register("commissar_head");
     commissar_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.CHEST, "commissar").register("commissar_chest");
     commissar_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.LEGS, "commissar").register("commissar_legs");
     commissar_bottom = new ItemArmorBasic(ItemArmor.ArmorMaterial.GOLD, EntityEquipmentSlot.FEET, "commissar").register("commissar_bottom");
     
     infantry_helmet = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "infantry").register("infantry_helmet");
     officer_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, "officer").register("officer_chest");
     
     crown = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, "crown1").register("crown");
     crown2 = new ItemArmorBasic(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, "crown2").register("crown2");
     
     ninja_head = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.HEAD, "ninja").register("ninja_head");
     ninja_chest = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.CHEST, "ninja").register("ninja_chest");
     ninja_legs = new ItemArmorBasic(ItemArmor.ArmorMaterial.IRON, EntityEquipmentSlot.LEGS, "ninja").register("ninja_legs");
     
//     chain_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.CHAIN, "chainmail_layer").register("chain_skirt");
//    leather_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.LEATHER, "leather_laye").register("leather_skirt");
//     golden_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.GOLD, "gold_layer").register("golden_skirt");
//     iron_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.IRON, "iron_layer").register("iron_skirt");
//     diamond_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.DIAMOND, "diamond_layer").register("diamond_skirt");
//     emerald_skirt = new ItemArmorSkirt(armorEmerald, "variedcommodities", "fullemerald").register("emerald_skirt");
//     brass_skirt = new ItemArmorSkirt(armorBrass, "variedcommodities", "fullbrass").register("brass_skirt");
//     demonic_skirt = new ItemArmorSkirt(ItemArmor.ArmorMaterial.DIAMOND, "variedcommodities", "demonic").register("demonic_skirt");
//     mithril_skirt = new ItemArmorSkirt(armorMithril, "variedcommodities", "mithril").register("mithril_skirt");
   }
 }
