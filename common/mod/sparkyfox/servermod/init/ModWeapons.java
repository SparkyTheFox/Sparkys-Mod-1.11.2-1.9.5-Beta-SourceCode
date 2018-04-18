package mod.sparkyfox.servermod.init;
 
import mod.sparkyfox.servermod.item.ItemHidden;
import mod.sparkyfox.servermod.item.ItemMana;
import mod.sparkyfox.servermod.item.ItemShieldBasic;
import mod.sparkyfox.servermod.item.ItemWeaponBasic;
import mod.sparkyfox.servermod.item.guns.ItemAK4U;
import mod.sparkyfox.servermod.item.guns.ItemAssaultRifle;
import mod.sparkyfox.servermod.item.guns.ItemMagnum;
import mod.sparkyfox.servermod.item.guns.ItemSMG;
import mod.sparkyfox.servermod.item.guns.ItemSMG2;
import mod.sparkyfox.servermod.item.guns.ItemSniper;
import mod.sparkyfox.servermod.item.magic.ItemStaff;
//import mod.sparkyfox.servermod.item.magic.ItemStaffElemental;
import mod.sparkyfox.servermod.item.magic.ModToolMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;





	public class ModWeapons {
		
	/** Guns and Ammo */	
	public static Item smg;
	public static Item smg2;
	public static Item assaultrifle;
	public static Item sniper;
	public static Item magnum;
	public static Item bullet;
	public static Item crowbar;
	public static Item ak4u;
	
	
	/** Magic */
	public static Item mana;
	public static Item wooden_staff;
	public static Item stone_staff;
	public static Item iron_staff;
	public static Item golden_staff;
	public static Item diamond_staff;
	public static Item brass_staff;
	public static Item emerald_staff;
	public static Item demonic_staff;
	public static Item frost_staff;
	public static Item mithril_staff;
	public static Item elemental_staff;
	
	
	/** Tridents */
	public static Item wooden_trident;
	public static Item stone_trident;
	public static Item iron_trident;
	public static Item golden_trident;
	public static Item diamond_trident;
	public static Item brass_trident;
	public static Item emerald_trident;
	public static Item cursed_trident;
	public static Item demonic_trident;
	public static Item frost_trident;
	public static Item mithril_trident;
	
	
	/** Swords */
	public static Item brass_sword;
	public static Item emerald_sword;
	public static Item demonic_sword;
	public static Item frost_sword;
	public static Item mithril_sword;
	public static Item leaf_sword;
	
	
	/** Sheild's */
	public static Item wooden_shield_round;
	public static Item stone_shield_round;
	public static Item iron_shield_round;
	public static Item golden_shield_round;
	public static Item diamond_shield_round;
	public static Item brass_shield_round;
	public static Item emerald_shield_round;
	public static Item demonic_shield_round;
	public static Item mithril_shield_round;
	public static Item wooden_shield;
	public static Item stone_shield;
	public static Item iron_shield;
	public static Item golden_shield;
	public static Item diamond_shield;
	public static Item brass_shield;
	public static Item emerald_shield;
	public static Item frost_shield;
	public static Item heater_shield;
	public static Item crescent_shield;
	public static Item scutum_shield;
	public static Item tower_shield;
	
	
	/** Broadsword's */
	public static Item wooden_broadsword;
	public static Item stone_broadsword;
	public static Item iron_broadsword;
	public static Item golden_broadsword;
	public static Item diamond_broadsword;
	public static Item brass_broadsword;
	public static Item emerald_broadsword;
	public static Item demonic_broadsword;
	public static Item frost_broadsword;
	public static Item mithril_broadsword;

	
	/** Glaive's */
	public static Item wooden_glaive;
	public static Item stone_glaive;
	public static Item iron_glaive;
	public static Item golden_glaive;
	public static Item diamond_glaive;
	public static Item brass_glaive;
	public static Item emerald_glaive;
	public static Item demonic_glaive;
	public static Item frost_glaive;
	public static Item mithril_glaive;

	
	/** Scythes */
	public static Item wooden_scythe;
	public static Item stone_scythe;
	public static Item iron_scythe;
	public static Item golden_scythe;
	public static Item diamond_scythe;
	public static Item brass_scythe;
	public static Item emerald_scythe;
	public static Item demonic_scythe;
	public static Item frost_scythe;
	public static Item mithril_scythe;

	
	/** Reversed Daggers */
	public static Item wooden_dagger_reversed;
	public static Item stone_dagger_reversed;
	public static Item iron_dagger_reversed;
	public static Item golden_dagger_reversed;
	public static Item mithril_dagger_reversed;
	public static Item diamond_dagger_reversed;
	public static Item brass_dagger_reversed;
	public static Item emerald_dagger_reversed;
	public static Item demonic_dagger_reversed;
	public static Item frost_dagger_reversed;

	
	/** Daggers */
	public static Item wooden_dagger;   
	public static Item stone_dagger;
	public static Item iron_dagger;
	public static Item golden_dagger;
	public static Item diamond_dagger;
	public static Item brass_dagger;
	public static Item emerald_dagger;
	public static Item demonic_dagger;
	public static Item frost_dagger;
	public static Item mithril_dagger;

	
	/** Maces */
	public static Item wooden_mace;
	public static Item stone_mace;
	public static Item iron_mace;
	public static Item golden_mace;
	public static Item diamond_mace;
	public static Item brass_mace;
	public static Item emerald_mace;
	public static Item demonic_mace;
	public static Item frost_mace;	
	public static Item mithril_mace;

	
	/** War Hammers */
	public static Item wooden_warhammer;
	public static Item stone_warhammer;
	public static Item iron_warhammer;
	public static Item golden_warhammer;
	public static Item diamond_warhammer;
	public static Item brass_warhammer;
	public static Item emerald_warhammer;
	public static Item demonic_warhammer;
	public static Item frost_warhammer;	
	public static Item mithril_warhammer;

	
	/** Battle Axes */
	public static Item wooden_battleaxe;
	public static Item stone_battleaxe;
	public static Item iron_battleaxe;
	public static Item golden_battleaxe;
	public static Item diamond_battleaxe;
	public static Item brass_battleaxe;
	public static Item emerald_battleaxe;
	public static Item demonic_battleaxe;
	public static Item frost_battleaxe;
	public static Item mithril_battleaxe;

	
	/** Halberd's */
	
	public static Item wooden_halberd;
	public static Item stone_halberd;
	public static Item iron_halberd;
	public static Item golden_halberd;
	public static Item diamond_halberd;
	public static Item brass_halberd;
	public static Item emerald_halberd;
	public static Item demonic_halberd;
	public static Item frost_halberd;
	public static Item mithril_halberd;
	
	
	/** Spears */
	public static Item wooden_spear;
	public static Item stone_spear;
	public static Item iron_spear;
	public static Item golden_spear;
	public static Item diamond_spear;
	public static Item brass_spear;
	public static Item emerald_spear;
	public static Item demonic_spear;
	public static Item frost_spear;
	public static Item mithril_spear;
	
	
	/** Melee */
	public static Item sledge_hammer;
	public static Item bo_staff;
	public static Item katana;


	public static void Load() {
		
		Item.ToolMaterial brass = EnumHelper.addToolMaterial("BRASS", 2, 170, 5.0F, 2.0F, 15);
		Item.ToolMaterial emerald = EnumHelper.addToolMaterial("REALEMERALD", 3, 1000, 8.0F, 4.0F, 10);
		Item.ToolMaterial demonic = EnumHelper.addToolMaterial("DEMONIC", 3, 100, 8.0F, 6.0F, 22);
		Item.ToolMaterial frost = EnumHelper.addToolMaterial("FROST", 2, 59, 6.0F, 3.0F, 5);
		Item.ToolMaterial mithril = EnumHelper.addToolMaterial("MITHRIL", 3, 3000, 8.0F, 3.0F, 10);
		
		
		brass.setRepairItem(new ItemStack(ModItems.BrassIngot));
		emerald.setRepairItem(new ItemStack(Items.EMERALD));
		demonic.setRepairItem(new ItemStack(ModFunItems.ingot_demonic));
		frost.setRepairItem(new ItemStack(Blocks.ICE));
		mithril.setRepairItem(new ItemStack(ModFunItems.ingot_mithril));

	smg = new ItemSMG().register("smg");
	ak4u = new ItemAK4U().register("ak4u");
	smg2 = new ItemSMG2().register("smg2");
	assaultrifle = new ItemAssaultRifle().register("assaultrifle");
	sniper = new ItemSniper().register("sniper");
	magnum = new ItemMagnum().register("magnum");
	bullet = new ItemHidden().register("bullet");
	
	
	mana = new ItemMana().register("mana");
	wooden_staff = new ItemStaff(ModToolMaterial.WOOD).register("wooden_staff");
	stone_staff = new ItemStaff(ModToolMaterial.STONE).register("stone_staff");
	iron_staff = new ItemStaff(ModToolMaterial.IRON).register("iron_staff");
	golden_staff = new ItemStaff(ModToolMaterial.GOLD).register("golden_staff");
	diamond_staff = new ItemStaff(ModToolMaterial.DIA).register("diamond_staff");
	brass_staff = new ItemStaff(ModToolMaterial.BRASS).register("brass_staff");
	emerald_staff = new ItemStaff(ModToolMaterial.EMERALD).register("emerald_staff");
	demonic_staff = new ItemStaff(ModToolMaterial.DEMONIC).register("demonic_staff");
	frost_staff = new ItemStaff(ModToolMaterial.FROST).register("frost_staff");
	mithril_staff = new ItemStaff(ModToolMaterial.MITHRIL).register("mithril_staff");
	//elemental_staff = new ItemStaffElemental(ModToolMaterial.IRON).register("elemental_staff");
	
	crowbar = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("crowbar");
	wooden_trident = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_trident");
	stone_trident = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_trident");
	iron_trident = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_trident");
	golden_trident = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_trident");
	diamond_trident = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_trident");
	brass_trident = new ItemWeaponBasic(brass).register("brass_trident");
	emerald_trident = new ItemWeaponBasic(emerald).register("emerald_trident");
	cursed_trident = new ItemWeaponBasic(emerald).register("cursed_trident");
	demonic_trident = new ItemWeaponBasic(demonic).register("demonic_trident");
	frost_trident = new ItemWeaponBasic(frost).register("frost_trident");
	mithril_trident = new ItemWeaponBasic(mithril).register("mithril_trident");
	
    brass_sword = new ItemWeaponBasic(brass).register("brass_sword");
    emerald_sword = new ItemWeaponBasic(emerald).register("emerald_sword");
    demonic_sword = new ItemWeaponBasic(demonic).register("demonic_sword");
    frost_sword = new ItemWeaponBasic(frost).register("frost_sword");
    mithril_sword = new ItemWeaponBasic(mithril).register("mithril_sword");
    leaf_sword = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("leaf_sword");
    
    wooden_shield_round = new ItemShieldBasic(ModToolMaterial.WOOD).register("wooden_shield_round");
    stone_shield_round = new ItemShieldBasic(ModToolMaterial.STONE).register("stone_shield_round");
    iron_shield_round = new ItemShieldBasic(ModToolMaterial.IRON).register("iron_shield_round");
    golden_shield_round = new ItemShieldBasic(ModToolMaterial.GOLD).register("golden_shield_round");
    diamond_shield_round = new ItemShieldBasic(ModToolMaterial.DIA).register("diamond_shield_round");
    brass_shield_round = new ItemShieldBasic(ModToolMaterial.BRASS).register("brass_shield_round");
    emerald_shield_round = new ItemShieldBasic(ModToolMaterial.EMERALD).register("emerald_shield_round");
    demonic_shield_round = new ItemShieldBasic(ModToolMaterial.DEMONIC).register("demonic_shield_round");
    mithril_shield_round = new ItemShieldBasic(ModToolMaterial.MITHRIL).register("mithril_shield_round");
    
    wooden_shield = new ItemShieldBasic(ModToolMaterial.WOOD).register("wooden_shield");
    stone_shield = new ItemShieldBasic(ModToolMaterial.STONE).register("stone_shield");
    iron_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("iron_shield");
    golden_shield = new ItemShieldBasic(ModToolMaterial.GOLD).register("golden_shield");
    diamond_shield = new ItemShieldBasic(ModToolMaterial.DIA).register("diamond_shield");
    brass_shield = new ItemShieldBasic(ModToolMaterial.BRASS).register("brass_shield");
    emerald_shield = new ItemShieldBasic(ModToolMaterial.EMERALD).register("emerald_shield");
    frost_shield = new ItemShieldBasic(ModToolMaterial.FROST).register("frost_shield");
    
    heater_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("heater_shield");
    crescent_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("crescent_shield");
    scutum_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("scutum_shield");
    tower_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("tower_shield");
    



    mithril_spear = new ItemWeaponBasic(mithril, 2).register("mithril_spear");
    mithril_halberd = new ItemWeaponBasic(mithril).register("mithril_halberd");
    mithril_battleaxe = new ItemWeaponBasic(mithril).register("mithril_battleaxe");
    mithril_warhammer = new ItemWeaponBasic(mithril).register("mithril_warhammer");
    mithril_mace = new ItemWeaponBasic(mithril).register("mithril_mace");
    mithril_dagger_reversed = new ItemWeaponBasic(frost, 2).register("mithril_dagger_reversed");
    mithril_scythe = new ItemWeaponBasic(mithril).register("mithril_scythe");
    mithril_glaive = new ItemWeaponBasic(mithril).register("mithril_glaive");
    mithril_broadsword = new ItemWeaponBasic(mithril).register("mithril_broadsword");
    
    /////////////////////////////////////////////////////////////////////////////////
    
    
    
    

    

    
    wooden_trident = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_trident");
    stone_trident = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_trident");
    iron_trident = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_trident");
    golden_trident = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_trident");
    diamond_trident = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_trident");
    brass_trident = new ItemWeaponBasic(brass).register("brass_trident");
    emerald_trident = new ItemWeaponBasic(emerald).register("emerald_trident");
    cursed_trident = new ItemWeaponBasic(emerald).register("cursed_trident");
    demonic_trident = new ItemWeaponBasic(demonic).register("demonic_trident");
    frost_trident = new ItemWeaponBasic(frost).register("frost_trident");
    

    
     katana = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("katana");

    
    brass_sword = new ItemWeaponBasic(brass).register("brass_sword");
    emerald_sword = new ItemWeaponBasic(emerald).register("emerald_sword");
    demonic_sword = new ItemWeaponBasic(demonic).register("demonic_sword");
    frost_sword = new ItemWeaponBasic(frost).register("frost_sword");
    mithril_sword = new ItemWeaponBasic(mithril).register("mithril_sword");
    leaf_sword = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("leaf_sword");
    
     sledge_hammer = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("sledge_hammer");
     bo_staff = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("bo_staff");
 

    

    
    wooden_shield_round = new ItemShieldBasic(ModToolMaterial.WOOD).register("wooden_shield_round");
    stone_shield_round = new ItemShieldBasic(ModToolMaterial.STONE).register("stone_shield_round");
    iron_shield_round = new ItemShieldBasic(ModToolMaterial.IRON).register("iron_shield_round");
    golden_shield_round = new ItemShieldBasic(ModToolMaterial.GOLD).register("golden_shield_round");
    diamond_shield_round = new ItemShieldBasic(ModToolMaterial.DIA).register("diamond_shield_round");
    brass_shield_round = new ItemShieldBasic(ModToolMaterial.BRASS).register("brass_shield_round");
    emerald_shield_round = new ItemShieldBasic(ModToolMaterial.EMERALD).register("emerald_shield_round");
    demonic_shield_round = new ItemShieldBasic(ModToolMaterial.DEMONIC).register("demonic_shield_round");
    mithril_shield_round = new ItemShieldBasic(ModToolMaterial.MITHRIL).register("mithril_shield_round");
    
    wooden_shield = new ItemShieldBasic(ModToolMaterial.WOOD).register("wooden_shield");
    stone_shield = new ItemShieldBasic(ModToolMaterial.STONE).register("stone_shield");
    iron_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("iron_shield");
    golden_shield = new ItemShieldBasic(ModToolMaterial.GOLD).register("golden_shield");
    diamond_shield = new ItemShieldBasic(ModToolMaterial.DIA).register("diamond_shield");
    brass_shield = new ItemShieldBasic(ModToolMaterial.BRASS).register("brass_shield");
    emerald_shield = new ItemShieldBasic(ModToolMaterial.EMERALD).register("emerald_shield");
    frost_shield = new ItemShieldBasic(ModToolMaterial.FROST).register("frost_shield");
    
    heater_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("heater_shield");
    crescent_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("crescent_shield");
    scutum_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("scutum_shield");
    tower_shield = new ItemShieldBasic(ModToolMaterial.IRON).register("tower_shield");
    
     wooden_spear = new ItemWeaponBasic(Item.ToolMaterial.WOOD, 2).register("wooden_spear");
     stone_spear = new ItemWeaponBasic(Item.ToolMaterial.STONE, 2).register("stone_spear");
     iron_spear = new ItemWeaponBasic(Item.ToolMaterial.IRON, 2).register("iron_spear");
     golden_spear = new ItemWeaponBasic(Item.ToolMaterial.GOLD, 2).register("golden_spear");
     diamond_spear = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND, 2).register("diamond_spear");
     brass_spear = new ItemWeaponBasic(brass, 2).register("brass_spear");
     emerald_spear = new ItemWeaponBasic(emerald, 2).register("emerald_spear");
     demonic_spear = new ItemWeaponBasic(demonic, 2).register("demonic_spear");
     frost_spear = new ItemWeaponBasic(frost, 2).register("frost_spear");
     mithril_spear = new ItemWeaponBasic(mithril, 2).register("mithril_spear");
    
     wooden_halberd = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_halberd");
     stone_halberd = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_halberd");
     iron_halberd = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_halberd");
     golden_halberd = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_halberd");
     diamond_halberd = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_halberd");
     brass_halberd = new ItemWeaponBasic(brass).register("brass_halberd");
     emerald_halberd = new ItemWeaponBasic(emerald).register("emerald_halberd");
     demonic_halberd = new ItemWeaponBasic(demonic).register("demonic_halberd");
     frost_halberd = new ItemWeaponBasic(frost).register("frost_halberd");
     mithril_halberd = new ItemWeaponBasic(mithril).register("mithril_halberd");
    
     wooden_battleaxe = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_battleaxe");
     stone_battleaxe = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_battleaxe");
     iron_battleaxe = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_battleaxe");
     golden_battleaxe = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_battleaxe");
     diamond_battleaxe = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_battleaxe");
     brass_battleaxe = new ItemWeaponBasic(brass).register("brass_battleaxe");
     emerald_battleaxe = new ItemWeaponBasic(emerald).register("emerald_battleaxe");
     demonic_battleaxe = new ItemWeaponBasic(demonic).register("demonic_battleaxe");
     frost_battleaxe = new ItemWeaponBasic(frost).register("frost_battleaxe");
     mithril_battleaxe = new ItemWeaponBasic(mithril).register("mithril_battleaxe");
    
     wooden_warhammer = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_warhammer");
     stone_warhammer = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_warhammer");
     iron_warhammer = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_warhammer");
     golden_warhammer = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_warhammer");
     diamond_warhammer = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_warhammer");
     brass_warhammer = new ItemWeaponBasic(brass).register("brass_warhammer");
     emerald_warhammer = new ItemWeaponBasic(emerald).register("emerald_warhammer");
     demonic_warhammer = new ItemWeaponBasic(demonic).register("demonic_warhammer");
     frost_warhammer = new ItemWeaponBasic(frost).register("frost_warhammer");
     mithril_warhammer = new ItemWeaponBasic(mithril).register("mithril_warhammer");
    
     wooden_mace = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_mace");
     stone_mace = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_mace");
     iron_mace = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_mace");
     golden_mace = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_mace");
     diamond_mace = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_mace");
     brass_mace = new ItemWeaponBasic(brass).register("brass_mace");
     emerald_mace = new ItemWeaponBasic(emerald).register("emerald_mace");
     demonic_mace = new ItemWeaponBasic(demonic).register("demonic_mace");
     frost_mace = new ItemWeaponBasic(frost).register("frost_mace");
     mithril_mace = new ItemWeaponBasic(mithril).register("mithril_mace");
    
     wooden_dagger = new ItemWeaponBasic(Item.ToolMaterial.WOOD, 2).register("wooden_dagger");
     wooden_dagger_reversed = new ItemWeaponBasic(Item.ToolMaterial.WOOD, 2).register("wooden_dagger_reversed");
     stone_dagger = new ItemWeaponBasic(Item.ToolMaterial.STONE, 2).register("stone_dagger");
     stone_dagger_reversed = new ItemWeaponBasic(Item.ToolMaterial.STONE, 2).register("stone_dagger_reversed");
     iron_dagger = new ItemWeaponBasic(Item.ToolMaterial.IRON, 2).register("iron_dagger");
     iron_dagger_reversed = new ItemWeaponBasic(Item.ToolMaterial.IRON, 2).register("iron_dagger_reversed");
     golden_dagger = new ItemWeaponBasic(Item.ToolMaterial.GOLD, 2).register("golden_dagger");
     golden_dagger_reversed = new ItemWeaponBasic(Item.ToolMaterial.GOLD, 2).register("golden_dagger_reversed");
     diamond_dagger = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND, 2).register("diamond_dagger");
     diamond_dagger_reversed = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND, 2).register("diamond_dagger_reversed");
     brass_dagger = new ItemWeaponBasic(brass, 2).register("brass_dagger");
     brass_dagger_reversed = new ItemWeaponBasic(brass, 2).register("brass_dagger_reversed");
     emerald_dagger = new ItemWeaponBasic(emerald, 2).register("emerald_dagger");
     emerald_dagger_reversed = new ItemWeaponBasic(emerald, 2).register("emerald_dagger_reversed");
     demonic_dagger = new ItemWeaponBasic(demonic, 2).register("demonic_dagger");
     demonic_dagger_reversed = new ItemWeaponBasic(demonic, 2).register("demonic_dagger_reversed");
     frost_dagger = new ItemWeaponBasic(frost, 2).register("frost_dagger");
     frost_dagger_reversed = new ItemWeaponBasic(frost, 2).register("frost_dagger_reversed");
     mithril_dagger = new ItemWeaponBasic(mithril, 2).register("mithril_dagger");
     mithril_dagger_reversed = new ItemWeaponBasic(frost, 2).register("mithril_dagger_reversed");
    
    wooden_scythe = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_scythe");
    stone_scythe = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_scythe");
    iron_scythe = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_scythe");
    golden_scythe = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_scythe");
    diamond_scythe = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_scythe");
    brass_scythe = new ItemWeaponBasic(brass).register("brass_scythe");
    emerald_scythe = new ItemWeaponBasic(emerald).register("emerald_scythe");
    demonic_scythe = new ItemWeaponBasic(demonic).register("demonic_scythe");
    frost_scythe = new ItemWeaponBasic(frost).register("frost_scythe");
    mithril_scythe = new ItemWeaponBasic(mithril).register("mithril_scythe");
    
    wooden_glaive = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_glaive");
    stone_glaive = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_glaive");
    iron_glaive = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_glaive");
    golden_glaive = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_glaive");
    diamond_glaive = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_glaive");
    brass_glaive = new ItemWeaponBasic(brass).register("brass_glaive");
    emerald_glaive = new ItemWeaponBasic(emerald).register("emerald_glaive");
    demonic_glaive = new ItemWeaponBasic(demonic).register("demonic_glaive");
    frost_glaive = new ItemWeaponBasic(frost).register("frost_glaive");
    mithril_glaive = new ItemWeaponBasic(mithril).register("mithril_glaive");
    
    wooden_broadsword = new ItemWeaponBasic(Item.ToolMaterial.WOOD).register("wooden_broadsword");
    stone_broadsword = new ItemWeaponBasic(Item.ToolMaterial.STONE).register("stone_broadsword");
    iron_broadsword = new ItemWeaponBasic(Item.ToolMaterial.IRON).register("iron_broadsword");
    golden_broadsword = new ItemWeaponBasic(Item.ToolMaterial.GOLD).register("golden_broadsword");
    diamond_broadsword = new ItemWeaponBasic(Item.ToolMaterial.DIAMOND).register("diamond_broadsword");
    brass_broadsword = new ItemWeaponBasic(brass).register("brass_broadsword");
    emerald_broadsword = new ItemWeaponBasic(emerald).register("emerald_broadsword");
    demonic_broadsword = new ItemWeaponBasic(demonic).register("demonic_broadsword");
    frost_broadsword = new ItemWeaponBasic(frost).register("frost_broadsword");
    mithril_broadsword = new ItemWeaponBasic(mithril).register("mithril_broadsword");

	}
	
	public static void initRecipes() {
		
		((ItemMana) mana).addRecipes();
	}
}


