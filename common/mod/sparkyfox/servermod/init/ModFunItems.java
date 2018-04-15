 package mod.sparkyfox.servermod.init;
 
 import mod.sparkyfox.servermod.item.ItemBasic;
import mod.sparkyfox.servermod.item.ItemHidden;
//import mod.sparkyfox.servermod.item.ItemOrb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraftforge.oredict.OreDictionary;

 
 
 
 public class ModFunItems {

	 
   public static Item ingot_bronze;
   public static Item ingot_steel;
   public static Item ingot_demonic;
   public static Item ingot_mithril;
   public static Item coin_wood;
   public static Item coin_stone;
   public static Item coin_iron;
   public static Item coin_gold;
   public static Item coin_diamond;
   public static Item coin_bronze;
   public static Item coin_emerald;
   public static Item element_earth;
   public static Item element_water;
   public static Item element_fire;
   public static Item element_air;
   public static Item bandit_mask;
   public static Item paper_crown;
   public static Item broken_arrow;

   public static Item spell_nature;
   public static Item spell_arcane;
   public static Item spell_lightning;
   public static Item spell_ice;
   public static Item spell_fire;
   public static Item spell_dark;
   public static Item spell_holy;
   public static Item orb;
   public static Item orb_broken;
   public static Item lighter;

   
   public static void Load()
   {
     
     coin_wood = new ItemHidden().register("coin_wood");
     coin_stone = new ItemHidden().register("coin_stone");
     coin_bronze = new ItemHidden().register("coin_bronze");
     coin_iron = new ItemHidden().register("coin_iron");
     coin_gold = new ItemHidden().register("coin_gold");
     coin_diamond = new ItemHidden().register("coin_diamond");
     coin_emerald = new ItemHidden().register("coin_emerald");
     
     ingot_bronze = new ItemBasic().register("ingot_bronze");
     ingot_steel = new ItemBasic().register("ingot_steel");
     ingot_demonic = new ItemBasic().register("ingot_demonic");
     ingot_mithril = new ItemBasic().register("ingot_mithril");
     
     OreDictionary.registerOre("ingotBronze", ingot_bronze);
     OreDictionary.registerOre("ingotSteel", ingot_steel);
     OreDictionary.registerOre("ingotDemonic", ingot_demonic);
     OreDictionary.registerOre("ingotMithril", ingot_mithril);
     

     element_earth = new ItemHidden().register("element_earth");
     element_water = new ItemHidden().register("element_water");
     element_fire = new ItemHidden().register("element_fire");
     element_air = new ItemHidden().register("element_air");
     
     spell_nature = new ItemHidden().register("spell_nature");	
     spell_arcane = new ItemHidden().register("spell_arcane");
     spell_lightning = new ItemHidden().register("spell_lightning");
     spell_ice = new ItemHidden().register("spell_ice");
     spell_fire = new ItemHidden().register("spell_fire");
     spell_dark = new ItemHidden().register("spell_dark");
     spell_holy = new ItemHidden().register("spell_holy");

     broken_arrow = new ItemHidden().register("broken_arrow");


     
     lighter = new ItemFlintAndSteel().setUnlocalizedName("lighter").setMaxStackSize(1);

   }
 }

