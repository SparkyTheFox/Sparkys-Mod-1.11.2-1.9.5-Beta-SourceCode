package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.item.ItemColdTechite;
import mod.sparkyfox.servermod.item.ItemCommieFabric;
import mod.sparkyfox.servermod.item.ItemCompressedTechite;
import mod.sparkyfox.servermod.item.ItemCredit;
import mod.sparkyfox.servermod.item.ItemHotTechite;
import mod.sparkyfox.servermod.item.ItemKerbalFabric;
import mod.sparkyfox.servermod.item.ItemKevlar;
import mod.sparkyfox.servermod.item.ItemLegacyPermit;
import mod.sparkyfox.servermod.item.ItemNasaFabric;
import mod.sparkyfox.servermod.item.ItemPremiumPermit;
import mod.sparkyfox.servermod.item.ItemRecipeBook;
import mod.sparkyfox.servermod.item.ItemTechite;
import mod.sparkyfox.servermod.item.ItemTitaniumNugget;
import mod.sparkyfox.servermod.item.ItemUniverseFabric;
import mod.sparkyfox.servermod.item.armor.ItemAdventureSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemAuzSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemDiamondTechSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemEmeraldArmor;
import mod.sparkyfox.servermod.item.armor.ItemEmeraldTechSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemFESpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemKerbalSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemLapisArmor;
import mod.sparkyfox.servermod.item.armor.ItemLapisArmorHeavy;
import mod.sparkyfox.servermod.item.armor.ItemLapisTechSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemNasaSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemOdstArmor;
import mod.sparkyfox.servermod.item.armor.ItemRedstoneTechSpaceSuit;
import mod.sparkyfox.servermod.item.armor.ItemTitaniumArmor;
import mod.sparkyfox.servermod.item.armor.ItemUssrSpaceSuit;
import mod.sparkyfox.servermod.item.food.ItemBurger;
import mod.sparkyfox.servermod.item.food.ItemFries;
import mod.sparkyfox.servermod.item.guns.ItemAK4U;
import mod.sparkyfox.servermod.item.guns.ItemAK4URounds;
import mod.sparkyfox.servermod.item.guns.ItemSMG;
import mod.sparkyfox.servermod.item.guns.ItemSMGBullet;
import mod.sparkyfox.servermod.item.guns.ItemSMGBulletCasing;
import mod.sparkyfox.servermod.item.guns.ItemSMGRounds;
import mod.sparkyfox.servermod.item.ingots.ItemBrassIngot;
import mod.sparkyfox.servermod.item.ingots.ItemCobaltIngot;
import mod.sparkyfox.servermod.item.ingots.ItemMagnesiumIngot;
import mod.sparkyfox.servermod.item.ingots.ItemNickelIngot;
import mod.sparkyfox.servermod.item.ingots.ItemPlatinumIngot;
import mod.sparkyfox.servermod.item.ingots.ItemSiliconIngot;
import mod.sparkyfox.servermod.item.ingots.ItemTitaniumIngot;
import mod.sparkyfox.servermod.item.ingots.ItemUraniumIngot;
import mod.sparkyfox.servermod.item.knifes.ItemDiamondKnife;
import mod.sparkyfox.servermod.item.knifes.ItemGoldKnife;
import mod.sparkyfox.servermod.item.knifes.ItemIronKnife;
import mod.sparkyfox.servermod.item.knifes.ItemStoneKnife;
import mod.sparkyfox.servermod.item.knifes.ItemToyKnife;
import mod.sparkyfox.servermod.item.knifes.ItemWoodenKnife;
import mod.sparkyfox.servermod.item.swords.ItemDiamondMesser;
import mod.sparkyfox.servermod.item.swords.ItemEmeraldSword;
import mod.sparkyfox.servermod.item.swords.ItemGoldMesser;
import mod.sparkyfox.servermod.item.swords.ItemIronMesser;
import mod.sparkyfox.servermod.item.swords.ItemLapisSword;
import mod.sparkyfox.servermod.item.swords.ItemScarlet;
import mod.sparkyfox.servermod.item.swords.ItemStoneMesser;
import mod.sparkyfox.servermod.item.swords.ItemTitaniumSword;
import mod.sparkyfox.servermod.item.swords.ItemWoodenMesser;
import mod.sparkyfox.servermod.item.tools.ItemCraftingHammer;
import mod.sparkyfox.servermod.item.tools.ItemEmeraldAxe;
import mod.sparkyfox.servermod.item.tools.ItemEmeraldHoe;
import mod.sparkyfox.servermod.item.tools.ItemEmeraldPickaxe;
import mod.sparkyfox.servermod.item.tools.ItemEmeraldShovel;
import mod.sparkyfox.servermod.item.tools.ItemLapisAxe;
import mod.sparkyfox.servermod.item.tools.ItemLapisHoe;
import mod.sparkyfox.servermod.item.tools.ItemLapisPickaxe;
import mod.sparkyfox.servermod.item.tools.ItemLapisShovel;
import mod.sparkyfox.servermod.item.tools.ItemTitaniumAxe;
import mod.sparkyfox.servermod.item.tools.ItemTitaniumHammer;
import mod.sparkyfox.servermod.item.tools.ItemTitaniumHoe;
import mod.sparkyfox.servermod.item.tools.ItemTitaniumPickaxe;
import mod.sparkyfox.servermod.item.tools.ItemTitaniumShovel;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

	public class ModItems {
//===============================================================================================================================================================================================\\
																									//Food Registry\\
		
	public static ItemBurger Burger;
	public static ItemFries Fries;
	
//===============================================================================================================================================================================================\\
																									//Weapons Registry\\
	
	public static ItemToyKnife ToyKnife;
	public static ItemScarlet Scarlet;
	public static ItemWoodenMesser WoodenMesser;
	public static ItemStoneMesser StoneMesser;
	public static ItemIronMesser IronMesser;
	public static ItemGoldMesser GoldMesser;
	public static ItemDiamondMesser DiamondMesser;
	public static ItemWoodenKnife WoodenKnife;
	public static ItemStoneKnife StoneKnife;
	public static ItemIronKnife IronKnife;
	public static ItemGoldKnife GoldKnife;
	public static ItemDiamondKnife DiamondKnife;
	public static ItemSMG SMG;
	public static ItemSMGRounds SMGRounds;
	public static ItemAK4U AK4U;
	public static ItemAK4URounds AK4URounds;
	//public static ToolMaterial Titanium;
	//public static ToolMaterial Emerald;
	public static ItemTitaniumSword TitaniumSword;
	public static ItemTitaniumHammer TitaniumHammer;
	public static ItemEmeraldSword EmeraldSword;
	public static ItemLapisSword LapisSword;
	
//===============================================================================================================================================================================================\\
																									//Tools Registry\\
	
	public static ToolMaterial Titanium = EnumHelper.addToolMaterial(ServerMod.RESOURCE_PREFIX + "Titanium", 3, 500, 7.0F, 4.0F, 10);
	public static ItemPickaxe TitaniumPickaxe;
	public static ItemTitaniumAxe TitaniumAxe;
	public static ItemSpade TitaniumShovel;
	public static ItemHoe TitaniumHoe;
	
	public static ToolMaterial Emerald = EnumHelper.addToolMaterial(ServerMod.RESOURCE_PREFIX + "Emerald", 3, 3122, 10.0F, 5.0F, 20);
	public static ItemPickaxe EmeraldPickaxe;
	public static ItemEmeraldAxe EmeraldAxe;
	public static ItemSpade EmeraldShovel;
	public static ItemHoe EmeraldHoe;
	
	public static ToolMaterial Lapis = EnumHelper.addToolMaterial(ServerMod.RESOURCE_PREFIX + "Lapis", 3, 800, 12.0F, 2.0F, 16);
	public static ItemPickaxe LapisPickaxe;
	public static ItemLapisAxe LapisAxe;
	public static ItemSpade LapisShovel;
	public static ItemHoe LapisHoe;
	
	
//===============================================================================================================================================================================================\\
																									//Basic Item Registry\\

	public static ItemKevlar Kevlar;
	public static ItemTitaniumIngot TitaniumIngot;
	public static ItemTitaniumNugget TitaniumNugget;
	public static ItemSMGBulletCasing SMGBulletCasing;
	public static ItemSMGBullet SMGBullet;
	public static ItemBrassIngot BrassIngot;
	public static ItemNickelIngot NickelIngot;
	public static ItemCobaltIngot CobaltIngot;
	public static ItemMagnesiumIngot MagnesiumIngot;
	public static ItemSiliconIngot SiliconIngot;
	public static ItemPlatinumIngot PlatinumIngot;
	public static ItemUraniumIngot UraniumIngot;
	public static ItemCredit Credit;
	public static ItemPremiumPermit PremiumPermit;
	public static ItemLegacyPermit LegacyPermit;
	public static ItemCraftingHammer CraftingHammer;
	public static ItemNasaFabric NasaFabric;
	public static ItemCommieFabric CommieFabric;
	public static ItemKerbalFabric KerbalFabric;
	public static ItemUniverseFabric UniverseFabric;
	public static ItemRecipeBook RecipeBook;
	public static ItemTechite Techite;
	public static ItemHotTechite HotTechite;
	public static ItemColdTechite ColdTechite;
	public static ItemCompressedTechite CompressedTechite;
	//public static ItemTitaniumShield TitaniumShield;
	
//===============================================================================================================================================================================================\\
																										//Armor Registry\\
	
	public static ArmorMaterial OdstArmor;
	public static ItemArmor OdstHelmet;
	public static ItemArmor OdstChestplate;
	public static ItemArmor OdstLeggings;
	public static ItemArmor OdstBoots;
	
	public static ArmorMaterial TitaniumArmor;
	public static ItemArmor TitaniumHelmet;
	public static ItemArmor TitaniumChestplate;
	public static ItemArmor TitaniumLeggings;
	public static ItemArmor TitaniumBoots;
	
	public static ArmorMaterial EmeraldArmor;
	public static ItemArmor EmeraldHelmet;
	public static ItemArmor EmeraldChestplate;
	public static ItemArmor EmeraldLeggings;
	public static ItemArmor EmeraldBoots;
	
	public static ArmorMaterial LapisArmor;
	public static ItemArmor LapisHelmet;
	public static ItemArmor LapisChestplate;
	public static ItemArmor LapisLeggings;
	public static ItemArmor LapisBoots;
	
	public static ArmorMaterial LapisArmorHeavy;
	public static ItemArmor LapisHelmetHeavy;
	public static ItemArmor LapisChestplateHeavy;
	public static ItemArmor LapisLeggingsHeavy;
	public static ItemArmor LapisBootsHeavy;
	
	public static ArmorMaterial FoxSpacesuit;
	public static ItemArmor FoxSpaceHelmet;
	public static ItemArmor FoxSpaceChestplate;
	public static ItemArmor FoxSpaceLeggings;
	public static ItemArmor FoxSpaceBoots;
	
	public static ArmorMaterial AuzzySpacesuit;
	public static ItemArmor AuzzySpaceHelmet;
	public static ItemArmor AuzzySpaceChestplate;
	public static ItemArmor AuzzySpaceLeggings;
	public static ItemArmor AuzzySpaceBoots;
	
	public static ArmorMaterial Spacesuit;
	public static ItemArmor SpaceHelmet;
	public static ItemArmor SpaceChestplate;
	public static ItemArmor SpaceLeggings;
	public static ItemArmor SpaceBoots;
	
	public static ArmorMaterial CPSpacesuit;
	public static ItemArmor CPSpaceHelmet;
	public static ItemArmor CPSpaceChestplate;
	public static ItemArmor CPSpaceLeggings;
	public static ItemArmor CPSpaceBoots;
	
	public static ArmorMaterial KerbalSpacesuit;
	public static ItemArmor KerbalSpaceHelmet;
	public static ItemArmor KerbalSpaceChestplate;
	public static ItemArmor KerbalSpaceLeggings;
	public static ItemArmor KerbalSpaceBoots;
	
	public static ArmorMaterial AdventureSpacesuit;
	public static ItemArmor AdventureSpaceHelmet;
	public static ItemArmor AdventureSpaceChestplate;
	public static ItemArmor AdventureSpaceLeggings;
	public static ItemArmor AdventureSpaceBoots;
	
	public static ArmorMaterial LapisTechSpacesuit;
	public static ItemArmor LapisTechSpaceHelmet;
	public static ItemArmor LapisTechSpaceChestplate;
	public static ItemArmor LapisTechSpaceLeggings;
	public static ItemArmor LapisTechSpaceBoots;
	
	public static ArmorMaterial DiamondTechSpacesuit;
	public static ItemArmor DiamondTechSpaceHelmet;
	public static ItemArmor DiamondTechSpaceChestplate;
	public static ItemArmor DiamondTechSpaceLeggings;
	public static ItemArmor DiamondTechSpaceBoots;
	
	public static ArmorMaterial EmeraldTechSpacesuit;
	public static ItemArmor EmeraldTechSpaceHelmet;
	public static ItemArmor EmeraldTechSpaceChestplate;
	public static ItemArmor EmeraldTechSpaceLeggings;
	public static ItemArmor EmeraldTechSpaceBoots;
	
	public static ArmorMaterial RedstoneTechSpacesuit;
	public static ItemArmor RedstoneTechSpaceHelmet;
	public static ItemArmor RedstoneTechSpaceChestplate;
	public static ItemArmor RedstoneTechSpaceLeggings;
	public static ItemArmor RedstoneTechSpaceBoots;
	
	
//===============================================================================================================================================================================================\\	
    public static void init() {																			//Initialisation\\
		

				
		//Food- Initialisation
		Burger = (ItemBurger) new ItemBurger(18, 1.0F, true);//(18=[how many bars is heals] 1.0F=[Saturation(how long it will last)] true=[Wolfs Can eat])
		Burger.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Burger)); 
		GameRegistry.register(Burger); 
			
		Fries = (ItemFries) new ItemFries(9, 0.5F, false);  
		Fries.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Fries)); 
		GameRegistry.register(Fries); 
		
//===============================================================================================================================================================================================\\

		//Weapon- Initialisation
		ToyKnife = (ItemToyKnife) new ItemToyKnife(EnumHelper.addToolMaterial("ToyKnife", 0, 500, 0.0F, 5.5F, 30), 1.0F);
		ToyKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.ToyKnife)); 
		GameRegistry.register(ToyKnife); 
			
		Scarlet = (ItemScarlet) new ItemScarlet(EnumHelper.addToolMaterial("Scarlet", 0, 2000, 12.0F, 6.0F, 30), -2.4F);
		Scarlet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Scarlet)); 
		GameRegistry.register(Scarlet); 
		
		TitaniumSword = (ItemTitaniumSword) new ItemTitaniumSword(EnumHelper.addToolMaterial("TitaniumSword", 3, 500, 0.0F, 7.0F, 10), -2.4F);
		TitaniumSword.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumSword)); 
		GameRegistry.register(TitaniumSword);
		
		TitaniumHammer = (ItemTitaniumHammer) new ItemTitaniumHammer(EnumHelper.addToolMaterial("TitaniumHammer", 3, 500, 0.0F, 10.0F, 10), -2.8F);
		TitaniumHammer.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumHammer)); 
		GameRegistry.register(TitaniumHammer);
		
		CraftingHammer = (ItemCraftingHammer) new ItemCraftingHammer(EnumHelper.addToolMaterial("TitaniumHammer", 3, 100, 0.0F, 3.0F, 0), -2.8F);
		CraftingHammer.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CraftingHammer)); 
		GameRegistry.register(CraftingHammer);
		
		EmeraldSword = (ItemEmeraldSword) new ItemEmeraldSword(EnumHelper.addToolMaterial("EmeraldSword", 0, 3122, 0.0F, 10.0F, 20), -2.4F);
		EmeraldSword.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldSword)); 
		GameRegistry.register(EmeraldSword);
		
		LapisSword = (ItemLapisSword) new ItemLapisSword(EnumHelper.addToolMaterial("LapisSword", 0, 800, 0.0F, 8.0F, 16), -2.4F);
		LapisSword.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisSword)); 
		GameRegistry.register(LapisSword);
		
			
		
//===============================================================================================================================================================================================\\
		
		//Tools- Initialisation	
		TitaniumPickaxe = (ItemTitaniumPickaxe) new ItemTitaniumPickaxe(Titanium);
		TitaniumPickaxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumPickaxe)); 
		GameRegistry.register(TitaniumPickaxe); 
		
		TitaniumAxe = (ItemTitaniumAxe) new ItemTitaniumAxe(Titanium, 8.0F, 0.0F);
		TitaniumAxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumAxe)); 
		GameRegistry.register(TitaniumAxe); 
		
		TitaniumShovel = (ItemTitaniumShovel) new ItemTitaniumShovel(Titanium);
		TitaniumShovel.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumShovel)); 
		GameRegistry.register(TitaniumShovel); 
		
		TitaniumHoe = (ItemTitaniumHoe) new ItemTitaniumHoe(Titanium);
		TitaniumHoe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumHoe)); 
		GameRegistry.register(TitaniumHoe);
		
		
		//Tools- Initialisation	
		EmeraldPickaxe = (ItemEmeraldPickaxe) new ItemEmeraldPickaxe(Emerald);
		EmeraldPickaxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldPickaxe)); 
		GameRegistry.register(EmeraldPickaxe); 
		
		EmeraldAxe = (ItemEmeraldAxe) new ItemEmeraldAxe(Emerald, 13.0F, -3.0F); //0.0F[ATTACK DAMAGE]+(0.0F=1) || -3.0F[ATTACK SPEED]+(-3.0F=1)
		EmeraldAxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldAxe)); 
		GameRegistry.register(EmeraldAxe); 
		
		EmeraldShovel = (ItemEmeraldShovel) new ItemEmeraldShovel(Emerald);
		EmeraldShovel.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldShovel)); 
		GameRegistry.register(EmeraldShovel); 
		
		EmeraldHoe = (ItemEmeraldHoe) new ItemEmeraldHoe(Emerald);
		EmeraldHoe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldHoe)); 
		GameRegistry.register(EmeraldHoe);
		
		
		//Tools- Initialisation	
		LapisPickaxe = (ItemLapisPickaxe) new ItemLapisPickaxe(Lapis);
		LapisPickaxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisPickaxe)); 
		GameRegistry.register(LapisPickaxe); 
		
		LapisAxe = (ItemLapisAxe) new ItemLapisAxe(Lapis, 10.0F, -3.0F); //0.0F[ATTACK DAMAGE]+(0.0F=1) || -3.0F[ATTACK SPEED]+(-3.0F=1)
		LapisAxe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisAxe)); 
		GameRegistry.register(LapisAxe); 
		
		LapisShovel = (ItemLapisShovel) new ItemLapisShovel(Lapis);
		LapisShovel.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisShovel)); 
		GameRegistry.register(LapisShovel); 
		
		LapisHoe = (ItemLapisHoe) new ItemLapisHoe(Lapis);
		LapisHoe.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisHoe)); 
		GameRegistry.register(LapisHoe);
		
//===============================================================================================================================================================================================\\
		//Messers- Initialisation
		WoodenMesser = (ItemWoodenMesser) new ItemWoodenMesser(EnumHelper.addToolMaterial("WoodenMesser", 0, 59, 2.0F, 0.5F, 15), -2.0F);
		WoodenMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.WoodenMesser)); 
		GameRegistry.register(WoodenMesser); 
				
		StoneMesser = (ItemStoneMesser) new ItemStoneMesser(EnumHelper.addToolMaterial("StoneMesser", 1, 131, 2.0F, 1.5F, 5), -2.0F);
		StoneMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.StoneMesser)); 
		GameRegistry.register(StoneMesser); 
				
		IronMesser = (ItemIronMesser) new ItemIronMesser(EnumHelper.addToolMaterial("IronMesser", 2, 250, 6.0F, 2.5F, 14), -2.0F);
		IronMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.IronMesser)); 
		GameRegistry.register(IronMesser); 	
		GoldMesser = (ItemGoldMesser) new ItemGoldMesser(EnumHelper.addToolMaterial("GoldMesser", 0, 32, 0.0F, 1.8F, 22), -2.0F);
		GoldMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.GoldMesser)); 
		GameRegistry.register(GoldMesser); 
				
		DiamondMesser = (ItemDiamondMesser) new ItemDiamondMesser(EnumHelper.addToolMaterial("DiamondMesser", 3, 1561, 8.0F, 3.5F, 10), -2.0F);
		DiamondMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondMesser)); 
		GameRegistry.register(DiamondMesser); 
		
//===============================================================================================================================================================================================\\
				
		//Knifes- Initialisation
		WoodenKnife = (ItemWoodenKnife) new ItemWoodenKnife(EnumHelper.addToolMaterial("WoodenKnife", 0, 59, 2.0F, 1.5F, 15), -1.0F);
		WoodenKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.WoodenKnife)); 
		GameRegistry.register(WoodenKnife); 
				
		StoneKnife = (ItemStoneKnife) new ItemStoneKnife(EnumHelper.addToolMaterial("StoneKnife", 1, 131, 2.0F, 2.5F, 5), -1.0F);
		StoneKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.StoneKnife)); 
		GameRegistry.register(StoneKnife); 
				
		IronKnife = (ItemIronKnife) new ItemIronKnife(EnumHelper.addToolMaterial("IronKnife", 2, 250, 6.0F, 3.5F, 14), -1.0F);
		IronKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.IronKnife)); 
		GameRegistry.register(IronKnife); 
				
		GoldKnife = (ItemGoldKnife) new ItemGoldKnife(EnumHelper.addToolMaterial("GoldKnife", 0, 32, 0.0F, 2.8F, 22), -1.0F);
		GoldKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.GoldKnife)); 
		GameRegistry.register(GoldKnife); 
				
		DiamondKnife = (ItemDiamondKnife) new ItemDiamondKnife(EnumHelper.addToolMaterial("DiamondKnife", 3, 1561, 8.0F, 4.5F, 10), -1.0F);
		DiamondKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondKnife)); 
		GameRegistry.register(DiamondKnife); 
		
//===============================================================================================================================================================================================\\

		//Guns- Initialisation
		SMG = (ItemSMG) new ItemSMG();
		SMG.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SMG)); 
		GameRegistry.register(SMG); 
			
		AK4U = (ItemAK4U) new ItemAK4U();
		AK4U.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AK4U)); 
		GameRegistry.register(AK4U); 
			
//===============================================================================================================================================================================================\\
		
		//Ammo- Initialisation
		SMGRounds = (ItemSMGRounds) new ItemSMGRounds();
		SMGRounds.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SMGRounds)); 
		GameRegistry.register(SMGRounds); 
			
		AK4URounds = (ItemAK4URounds) new ItemAK4URounds();
		AK4URounds.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AK4URounds)); 
		GameRegistry.register(AK4URounds); 
			
//===============================================================================================================================================================================================\\
				
		//Armor Material
		OdstArmor = EnumHelper.addArmorMaterial("OdstArmor", "", 66, new int[] {6, 6, 8, 6}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 20.0F); 
		TitaniumArmor = EnumHelper.addArmorMaterial("TitaniumArmor", "", 30, new int[] {3, 6, 8, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
		EmeraldArmor = EnumHelper.addArmorMaterial("EmeraldArmor", "", 36, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
		LapisArmor = EnumHelper.addArmorMaterial("LapisArmor", "", 20, new int[] {3, 6, 6, 3}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
		LapisArmorHeavy = EnumHelper.addArmorMaterial("LapisArmorHeavy", "", 23, new int[] {3, 5, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);
		FoxSpacesuit = EnumHelper.addArmorMaterial("FoxSpacesuit", "", 100, new int[] {4, 2, 10, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
		AuzzySpacesuit = EnumHelper.addArmorMaterial("AuzzySpacesuit", "", 100, new int[] {4, 2, 10, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
		Spacesuit = EnumHelper.addArmorMaterial("Spacesuit", "", 75, new int[] {4, 2, 10, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
		CPSpacesuit = EnumHelper.addArmorMaterial("CPSpacesuit", "", 70, new int[] {4, 2, 10, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
		KerbalSpacesuit = EnumHelper.addArmorMaterial("KerbalSpacesuit", "", 65, new int[] {4, 2, 10, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
		AdventureSpacesuit = EnumHelper.addArmorMaterial("AdventureSpacesuit", "", 60, new int[] {4, 2, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);		
		LapisTechSpacesuit = EnumHelper.addArmorMaterial("LapisTechSpacesuit", "", 28, new int[] {4, 2, 10, 4}, 26, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		DiamondTechSpacesuit = EnumHelper.addArmorMaterial("DiamondTechSpacesuit", "", 55, new int[] {5, 2, 8, 5}, 28, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
		EmeraldTechSpacesuit = EnumHelper.addArmorMaterial("EmeraldTechSpacesuit", "", 60, new int[] {3, 2, 10, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
		RedstoneTechSpacesuit = EnumHelper.addArmorMaterial("RedstoneTechSpacesuit", "", 25, new int[] {5, 5, 5, 5}, 33, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		
		
//===============================================================================================================================================================================================\\
		
		//ODST Armor
		OdstHelmet = (ItemArmor) new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("OdstHelmet");
		OdstHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstHelmet)); 
		GameRegistry.register(OdstHelmet); 
			
		OdstChestplate = (ItemArmor) new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("OdstChestplate");
		OdstChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstChestplate)); 
		GameRegistry.register(OdstChestplate); 
			
		OdstLeggings = (ItemArmor) new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("OdstLeggings");
		OdstLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstLeggings)); 
		GameRegistry.register(OdstLeggings); 
    		
		OdstBoots = (ItemArmor) new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("OdstBoots");
		OdstBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstBoots)); 
		GameRegistry.register(OdstBoots); 
		
		//Titanium Armor
		TitaniumHelmet = (ItemArmor) new ItemTitaniumArmor(TitaniumArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("TitaniumHelmet");
		TitaniumHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumHelmet)); 
		GameRegistry.register(TitaniumHelmet); 
			
		TitaniumChestplate = (ItemArmor) new ItemTitaniumArmor(TitaniumArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("TitaniumChestplate");
		TitaniumChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumChestplate)); 
		GameRegistry.register(TitaniumChestplate); 
			
		TitaniumLeggings = (ItemArmor) new ItemTitaniumArmor(TitaniumArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("TitaniumLeggings");
		TitaniumLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumLeggings)); 
		GameRegistry.register(TitaniumLeggings); 
    		
		TitaniumBoots = (ItemArmor) new ItemTitaniumArmor(TitaniumArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("TitaniumBoots");
		TitaniumBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumBoots)); 
		GameRegistry.register(TitaniumBoots); 
		
		//Emerald Armor
		EmeraldHelmet = (ItemArmor) new ItemEmeraldArmor(EmeraldArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("EmeraldHelmet");
		EmeraldHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldHelmet)); 
		GameRegistry.register(EmeraldHelmet); 
			
		EmeraldChestplate = (ItemArmor) new ItemEmeraldArmor(EmeraldArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("EmeraldChestplate");
		EmeraldChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldChestplate)); 
		GameRegistry.register(EmeraldChestplate); 
			
		EmeraldLeggings = (ItemArmor) new ItemEmeraldArmor(EmeraldArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("EmeraldLeggings");
		EmeraldLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldLeggings)); 
		GameRegistry.register(EmeraldLeggings); 
    		
		EmeraldBoots = (ItemArmor) new ItemEmeraldArmor(EmeraldArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("EmeraldBoots");
		EmeraldBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldBoots)); 
		GameRegistry.register(EmeraldBoots); 
		
		//Lapis Armor
		LapisHelmet = (ItemArmor) new ItemLapisArmor(LapisArmor, EntityEquipmentSlot.HEAD).setUnlocalizedName("LapisHelmet");
		LapisHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisHelmet)); 
		GameRegistry.register(LapisHelmet); 
			
		LapisChestplate = (ItemArmor) new ItemLapisArmor(LapisArmor, EntityEquipmentSlot.CHEST).setUnlocalizedName("LapisChestplate");
		LapisChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisChestplate)); 
		GameRegistry.register(LapisChestplate); 
			
		LapisLeggings = (ItemArmor) new ItemLapisArmor(LapisArmor, EntityEquipmentSlot.LEGS).setUnlocalizedName("LapisLeggings");
		LapisLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisLeggings)); 
		GameRegistry.register(LapisLeggings); 
    		
		LapisBoots = (ItemArmor) new ItemLapisArmor(LapisArmor, EntityEquipmentSlot.FEET).setUnlocalizedName("LapisBoots");
		LapisBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisBoots)); 
		GameRegistry.register(LapisBoots); 
		
		
		//Lapis Armor Heavy
		LapisHelmetHeavy = (ItemArmor) new ItemLapisArmorHeavy(LapisArmorHeavy, EntityEquipmentSlot.HEAD).setUnlocalizedName("LapisHelmetHeavy");
		LapisHelmetHeavy.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisHelmetHeavy)); 
		GameRegistry.register(LapisHelmetHeavy); 
			
		LapisChestplateHeavy = (ItemArmor) new ItemLapisArmorHeavy(LapisArmorHeavy, EntityEquipmentSlot.CHEST).setUnlocalizedName("LapisChestplateHeavy");
		LapisChestplateHeavy.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisChestplateHeavy)); 
		GameRegistry.register(LapisChestplateHeavy); 
			
		LapisLeggingsHeavy = (ItemArmor) new ItemLapisArmorHeavy(LapisArmorHeavy, EntityEquipmentSlot.LEGS).setUnlocalizedName("LapisLeggingsHeavy");
		LapisLeggingsHeavy.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisLeggingsHeavy)); 
		GameRegistry.register(LapisLeggingsHeavy); 
    		
		LapisBootsHeavy = (ItemArmor) new ItemLapisArmorHeavy(LapisArmorHeavy, EntityEquipmentSlot.FEET).setUnlocalizedName("LapisBootsHeavy");
		LapisBootsHeavy.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisBootsHeavy)); 
		GameRegistry.register(LapisBootsHeavy);
		
		//Fox Spacesuit
		FoxSpaceHelmet = (ItemArmor) new ItemFESpaceSuit(FoxSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("FoxSpaceHelmet");
		FoxSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.FoxSpaceHelmet)); 
		GameRegistry.register(FoxSpaceHelmet); 
			
		FoxSpaceChestplate = (ItemArmor) new ItemFESpaceSuit(FoxSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("FoxSpaceChestplate");
		FoxSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.FoxSpaceChestplate)); 
		GameRegistry.register(FoxSpaceChestplate);
			
		FoxSpaceLeggings = (ItemArmor) new ItemFESpaceSuit(FoxSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("FoxSpaceLeggings");
		FoxSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.FoxSpaceLeggings)); 
		GameRegistry.register(FoxSpaceLeggings); 
    		
		FoxSpaceBoots = (ItemArmor) new ItemFESpaceSuit(FoxSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("FoxSpaceBoots");
		FoxSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.FoxSpaceBoots)); 
		GameRegistry.register(FoxSpaceBoots);
		
		//Auzzy Spacesuit
		AuzzySpaceHelmet = (ItemArmor) new ItemAuzSpaceSuit(AuzzySpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("AuzzySpaceHelmet");
		AuzzySpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AuzzySpaceHelmet)); 
		GameRegistry.register(AuzzySpaceHelmet); 
			
		AuzzySpaceChestplate = (ItemArmor) new ItemAuzSpaceSuit(AuzzySpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("AuzzySpaceChestplate");
		AuzzySpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AuzzySpaceChestplate)); 
		GameRegistry.register(AuzzySpaceChestplate);
			
		AuzzySpaceLeggings = (ItemArmor) new ItemAuzSpaceSuit(AuzzySpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("AuzzySpaceLeggings");
		AuzzySpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AuzzySpaceLeggings)); 
		GameRegistry.register(AuzzySpaceLeggings); 
    		
		AuzzySpaceBoots = (ItemArmor) new ItemAuzSpaceSuit(AuzzySpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("AuzzySpaceBoots");
		AuzzySpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AuzzySpaceBoots)); 
		GameRegistry.register(AuzzySpaceBoots);
		
		// Spacesuit
		SpaceHelmet = (ItemArmor) new ItemNasaSpaceSuit(Spacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("SpaceHelmet");
		SpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SpaceHelmet)); 
		GameRegistry.register(SpaceHelmet); 
			
		SpaceChestplate = (ItemArmor) new ItemNasaSpaceSuit(Spacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("SpaceChestplate");
		SpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SpaceChestplate)); 
		GameRegistry.register(SpaceChestplate);
			
		SpaceLeggings = (ItemArmor) new ItemNasaSpaceSuit(Spacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("SpaceLeggings");
		SpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SpaceLeggings)); 
		GameRegistry.register(SpaceLeggings); 
    		
		SpaceBoots = (ItemArmor) new ItemNasaSpaceSuit(Spacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("SpaceBoots");
		SpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SpaceBoots)); 
		GameRegistry.register(SpaceBoots);
		
		// CPSpacesuit
		CPSpaceHelmet = (ItemArmor) new ItemUssrSpaceSuit(CPSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("CPSpaceHelmet");
		CPSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CPSpaceHelmet)); 
		GameRegistry.register(CPSpaceHelmet); 
			
		CPSpaceChestplate = (ItemArmor) new ItemUssrSpaceSuit(CPSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("CPSpaceChestplate");
		CPSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CPSpaceChestplate)); 
		GameRegistry.register(CPSpaceChestplate);
			
		CPSpaceLeggings = (ItemArmor) new ItemUssrSpaceSuit(CPSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("CPSpaceLeggings");
		CPSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CPSpaceLeggings)); 
		GameRegistry.register(CPSpaceLeggings); 
    		
		CPSpaceBoots = (ItemArmor) new ItemUssrSpaceSuit(CPSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("CPSpaceBoots");
		CPSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CPSpaceBoots)); 
		GameRegistry.register(CPSpaceBoots);
		
		// KerbalSpacesuit
		KerbalSpaceHelmet = (ItemArmor) new ItemKerbalSpaceSuit(KerbalSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("KerbalSpaceHelmet");
		KerbalSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.KerbalSpaceHelmet)); 
		GameRegistry.register(KerbalSpaceHelmet); 
			
		KerbalSpaceChestplate = (ItemArmor) new ItemKerbalSpaceSuit(KerbalSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("KerbalSpaceChestplate");
		KerbalSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.KerbalSpaceChestplate)); 
		GameRegistry.register(KerbalSpaceChestplate);
			
		KerbalSpaceLeggings = (ItemArmor) new ItemKerbalSpaceSuit(KerbalSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("KerbalSpaceLeggings");
		KerbalSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.KerbalSpaceLeggings)); 
		GameRegistry.register(KerbalSpaceLeggings); 
    		
		KerbalSpaceBoots = (ItemArmor) new ItemKerbalSpaceSuit(KerbalSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("KerbalSpaceBoots");
		KerbalSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.KerbalSpaceBoots)); 
		GameRegistry.register(KerbalSpaceBoots);
		
		// AdventureSpacesuit
		AdventureSpaceHelmet = (ItemArmor) new ItemAdventureSpaceSuit(AdventureSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("AdventureSpaceHelmet");
		AdventureSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AdventureSpaceHelmet)); 
		GameRegistry.register(AdventureSpaceHelmet); 
			
		AdventureSpaceChestplate = (ItemArmor) new ItemAdventureSpaceSuit(AdventureSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("AdventureSpaceChestplate");
		AdventureSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AdventureSpaceChestplate)); 
		GameRegistry.register(AdventureSpaceChestplate);
			
		AdventureSpaceLeggings = (ItemArmor) new ItemAdventureSpaceSuit(AdventureSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("AdventureSpaceLeggings");
		AdventureSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AdventureSpaceLeggings)); 
		GameRegistry.register(AdventureSpaceLeggings); 
    		
		AdventureSpaceBoots = (ItemArmor) new ItemAdventureSpaceSuit(AdventureSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("AdventureSpaceBoots");
		AdventureSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.AdventureSpaceBoots)); 
		GameRegistry.register(AdventureSpaceBoots);
		
		// LapisTechSpacesuit
		LapisTechSpaceHelmet = (ItemArmor) new ItemLapisTechSpaceSuit(LapisTechSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("LapisTechSpaceHelmet");
		LapisTechSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisTechSpaceHelmet)); 
		GameRegistry.register(LapisTechSpaceHelmet); 
			
		LapisTechSpaceChestplate = (ItemArmor) new ItemLapisTechSpaceSuit(LapisTechSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("LapisTechSpaceChestplate");
		LapisTechSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisTechSpaceChestplate)); 
		GameRegistry.register(LapisTechSpaceChestplate);
			
		LapisTechSpaceLeggings = (ItemArmor) new ItemLapisTechSpaceSuit(LapisTechSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("LapisTechSpaceLeggings");
		LapisTechSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisTechSpaceLeggings)); 
		GameRegistry.register(LapisTechSpaceLeggings); 
    		
		LapisTechSpaceBoots = (ItemArmor) new ItemLapisTechSpaceSuit(LapisTechSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("LapisTechSpaceBoots");
		LapisTechSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LapisTechSpaceBoots)); 
		GameRegistry.register(LapisTechSpaceBoots);
		
		// DiamondTechSpacesuit
		DiamondTechSpaceHelmet = (ItemArmor) new ItemDiamondTechSpaceSuit(DiamondTechSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("DiamondTechSpaceHelmet");
		DiamondTechSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondTechSpaceHelmet)); 
		GameRegistry.register(DiamondTechSpaceHelmet); 
			
		DiamondTechSpaceChestplate = (ItemArmor) new ItemDiamondTechSpaceSuit(DiamondTechSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("DiamondTechSpaceChestplate");
		DiamondTechSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondTechSpaceChestplate)); 
		GameRegistry.register(DiamondTechSpaceChestplate);
			
		DiamondTechSpaceLeggings = (ItemArmor) new ItemDiamondTechSpaceSuit(DiamondTechSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("DiamondTechSpaceLeggings");
		DiamondTechSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondTechSpaceLeggings)); 
		GameRegistry.register(DiamondTechSpaceLeggings); 
    		
		DiamondTechSpaceBoots = (ItemArmor) new ItemDiamondTechSpaceSuit(DiamondTechSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("DiamondTechSpaceBoots");
		DiamondTechSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondTechSpaceBoots)); 
		GameRegistry.register(DiamondTechSpaceBoots);
		
		// EmeraldTechSpacesuit
		EmeraldTechSpaceHelmet = (ItemArmor) new ItemEmeraldTechSpaceSuit(EmeraldTechSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("EmeraldTechSpaceHelmet");
		EmeraldTechSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldTechSpaceHelmet)); 
		GameRegistry.register(EmeraldTechSpaceHelmet); 
			
		EmeraldTechSpaceChestplate = (ItemArmor) new ItemEmeraldTechSpaceSuit(EmeraldTechSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("EmeraldTechSpaceChestplate");
		EmeraldTechSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldTechSpaceChestplate)); 
		GameRegistry.register(EmeraldTechSpaceChestplate);
			
		EmeraldTechSpaceLeggings = (ItemArmor) new ItemEmeraldTechSpaceSuit(EmeraldTechSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("EmeraldTechSpaceLeggings");
		EmeraldTechSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldTechSpaceLeggings)); 
		GameRegistry.register(EmeraldTechSpaceLeggings); 
    		
		EmeraldTechSpaceBoots = (ItemArmor) new ItemEmeraldTechSpaceSuit(EmeraldTechSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("EmeraldTechSpaceBoots");
		EmeraldTechSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.EmeraldTechSpaceBoots)); 
		GameRegistry.register(EmeraldTechSpaceBoots);
		
		// RedstoneTechSpacesuit
		RedstoneTechSpaceHelmet = (ItemArmor) new ItemRedstoneTechSpaceSuit(RedstoneTechSpacesuit, EntityEquipmentSlot.HEAD).setUnlocalizedName("RedstoneTechSpaceHelmet");
		RedstoneTechSpaceHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.RedstoneTechSpaceHelmet)); 
		GameRegistry.register(RedstoneTechSpaceHelmet); 
			
		RedstoneTechSpaceChestplate = (ItemArmor) new ItemRedstoneTechSpaceSuit(RedstoneTechSpacesuit, EntityEquipmentSlot.CHEST).setUnlocalizedName("RedstoneTechSpaceChestplate");
		RedstoneTechSpaceChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.RedstoneTechSpaceChestplate)); 
		GameRegistry.register(RedstoneTechSpaceChestplate);
			
		RedstoneTechSpaceLeggings = (ItemArmor) new ItemRedstoneTechSpaceSuit(RedstoneTechSpacesuit, EntityEquipmentSlot.LEGS).setUnlocalizedName("RedstoneTechSpaceLeggings");
		RedstoneTechSpaceLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.RedstoneTechSpaceLeggings)); 
		GameRegistry.register(RedstoneTechSpaceLeggings); 
    		
		RedstoneTechSpaceBoots = (ItemArmor) new ItemRedstoneTechSpaceSuit(RedstoneTechSpacesuit, EntityEquipmentSlot.FEET).setUnlocalizedName("RedstoneTechSpaceBoots");
		RedstoneTechSpaceBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.RedstoneTechSpaceBoots)); 
		GameRegistry.register(RedstoneTechSpaceBoots);
		
		
//===============================================================================================================================================================================================\\
			
		//Basic Items
		Kevlar = (ItemKevlar) new ItemKevlar();
		Kevlar.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Kevlar)); 
		GameRegistry.register(Kevlar); 
			
		TitaniumIngot = (ItemTitaniumIngot) new ItemTitaniumIngot();
		TitaniumIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumIngot)); 
		GameRegistry.register(TitaniumIngot); 
		
		TitaniumNugget = (ItemTitaniumNugget) new ItemTitaniumNugget();
		TitaniumNugget.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumNugget)); 
		GameRegistry.register(TitaniumNugget); 
			
		SMGBulletCasing = (ItemSMGBulletCasing) new ItemSMGBulletCasing();
		SMGBulletCasing.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SMGBulletCasing)); 
		GameRegistry.register(SMGBulletCasing); 
			
		SMGBullet = (ItemSMGBullet) new ItemSMGBullet();
		SMGBullet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SMGBullet)); 
		GameRegistry.register(SMGBullet); 
		
		BrassIngot = (ItemBrassIngot) new ItemBrassIngot();
		BrassIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.BrassIngot)); 
		GameRegistry.register(BrassIngot);
		
		NickelIngot = (ItemNickelIngot) new ItemNickelIngot();
		NickelIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.NickelIngot)); 
		GameRegistry.register(NickelIngot);
		
		CobaltIngot = (ItemCobaltIngot) new ItemCobaltIngot();
		CobaltIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CobaltIngot)); 
		GameRegistry.register(CobaltIngot);

		MagnesiumIngot = (ItemMagnesiumIngot) new ItemMagnesiumIngot();
		MagnesiumIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.MagnesiumIngot)); 
		GameRegistry.register(MagnesiumIngot);

		SiliconIngot = (ItemSiliconIngot) new ItemSiliconIngot();
		SiliconIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.SiliconIngot)); 
		GameRegistry.register(SiliconIngot);

		PlatinumIngot = (ItemPlatinumIngot) new ItemPlatinumIngot();
		PlatinumIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.PlatinumIngot)); 
		GameRegistry.register(PlatinumIngot);

		UraniumIngot = (ItemUraniumIngot) new ItemUraniumIngot();
		UraniumIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.UraniumIngot)); 
		GameRegistry.register(UraniumIngot);
		
		Credit = (ItemCredit) new ItemCredit();
		Credit.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Credit)); 
		GameRegistry.register(Credit);
		
		PremiumPermit = (ItemPremiumPermit) new ItemPremiumPermit();
		PremiumPermit.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.PremiumPermit)); 
		GameRegistry.register(PremiumPermit);
		
		LegacyPermit = (ItemLegacyPermit) new ItemLegacyPermit();
		LegacyPermit.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.LegacyPermit)); 
		GameRegistry.register(LegacyPermit);
		
		NasaFabric = (ItemNasaFabric) new ItemNasaFabric();
		NasaFabric.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.NasaFabric)); 
		GameRegistry.register(NasaFabric);
		
		CommieFabric = (ItemCommieFabric) new ItemCommieFabric();
		CommieFabric.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CommieFabric)); 
		GameRegistry.register(CommieFabric);
		
		KerbalFabric = (ItemKerbalFabric) new ItemKerbalFabric();
		KerbalFabric.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.KerbalFabric)); 
		GameRegistry.register(KerbalFabric);
		
		UniverseFabric = (ItemUniverseFabric) new ItemUniverseFabric();
		UniverseFabric.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.UniverseFabric)); 
		GameRegistry.register(UniverseFabric);
		
		RecipeBook = (ItemRecipeBook) new ItemRecipeBook();
		RecipeBook.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.RecipeBook)); 
		GameRegistry.register(RecipeBook);
		
		Techite = (ItemTechite) new ItemTechite();
		Techite.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Techite)); 
		GameRegistry.register(Techite);
		
		HotTechite = (ItemHotTechite) new ItemHotTechite();
		HotTechite.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.HotTechite)); 
		GameRegistry.register(HotTechite);
		
		ColdTechite = (ItemColdTechite) new ItemColdTechite();
		ColdTechite.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.ColdTechite)); 
		GameRegistry.register(ColdTechite);
		
		CompressedTechite = (ItemCompressedTechite) new ItemCompressedTechite();
		CompressedTechite.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.CompressedTechite)); 
		GameRegistry.register(CompressedTechite);
		
		
		//TitaniumShield = (ItemTitaniumShield) new ItemTitaniumShield();
		//TitaniumShield.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumShield)); 
		//GameRegistry.register(TitaniumShield);
		
//===============================================================================================================================================================================================\\

			{
		}
	}
		
//===============================================================================================================================================================================================\
		//////ARMOR AND TOOL INFO WALL\\\\\\                                                                                                    //SPARKY WUZ HERE ;D\\
	
    
		/** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) 
		 
        * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) 

        * The strength of this tool material against blocks which it is effective against. 
 
        * Damage versus entities. 
 
        * Defines the natural enchantability factor of the material. 
		
		* The Attack Speed. */
		
		
		/**Tools*/
		//WOOD(0, 59, 2.0F, 0.0F, 15),
        //STONE(1, 131, 4.0F, 1.0F, 5),
        //IRON(2, 250, 6.0F, 2.0F, 14),
    	//TITANIUM(3, 500, 7.0F, 4.0F, 10);
        //DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        //GOLD(0, 32, 12.0F, 0.0F, 22);
    	//EMERALD(3, 3122, 10.0F, 5.0F, 20);
		
		/**Swords*/
		//addToolMaterial("Scarlet((NAME))", 0, 2000((AMMOUNT OF USSES)), 0.0F, 9.0F((Attack Damage= 1.0F= 1heart)), 30((ENCHANTMENT LEVEL))), -2.4F((ATTACK SPEED)));
    	
	
	
		
    
    


    
//===============================================================================================================================================================================================\\
																									
		/**
        private ArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn)
        {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            
            //LEATHER("leather((NAME))", 5((MAX DAMAGE)), new int[]{1, 2, 3, 1((SHOWS THE ARMOR HEALTH))}, 15((ENCHANTMENT)), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F((ARMOR TOUGHNESS))
            // return addEnum(ArmorMaterial.class, name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness);
         */
 //===============================================================================================================================================================================================\\
	
    	/**Armor*/
    	//LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    	//CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    	//IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    	//GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    	//DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    
      //===============================================================================================================================================================================\\
     //EMERALD("EmeraldArmor", ***""***, 36, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);                                                                   \\
    //public static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness)\\
   // return addEnum(ArmorMaterial.class, name, ***textureName***, durability, reductionAmounts, enchantability, soundOnEquip, toughness);                                                \\
  //=======================================================================================================================================================================================\\
    
		/**Example*/
		//Leather new int[]{1(boots), 2(leggings), 3(Chestplate), 1(helmet)}====(3.5 armor bars)
		//Chain new int[]{1(boots), 4(leggings), 5(Chestplate), 2(helmet)}====(6 armor bars)
		//Iron new int[]{2(boots), 5(leggings), 6(Chestplate), 2(helmet)}====(7.5 armor bars)
		//Gold new int[]{1(boots), 3(leggings), 5(Chestplate), 2(helmet)}====(5.5 armor bars)
		//Diamond new int[]{3(boots), 6(leggings), 8(Chestplate), 3(helmet)}====(20 armor bars)
    



	//RedstoneTechSpacesuit = EnumHelper.addArmorMaterial("RedstoneTechSpacesuit", "", 60, new int[] {4, 2, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    
    
    	/**Armor Durability*/
    	//Helmet = 11
    	//Chestplate = 16
    	//Leggings = 15
    	//Boots = 13
    
    	/**Example*/
    	/*DIAMOND("diamond", ***33<--(times the armor piece with this number)***, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);*/
    	/* 33x11= 363
    	 * 33x16= 528
    	 * 33x15= 495
    	 * 33x13= 429
    	 */
    
		
	/**Java Comments*/
	/*[RED]*/
	/**[BLUE]*/
	//[GREEN]//
	
//===============================================================================================================================================================================================\\
    																								//Recipe Initialisation\\
    
	public static void initRecipes() {
			
		Burger.addRecipes();
		Fries.addRecipes();
		ToyKnife.addRecipes();
		Scarlet.addRecipes();
		WoodenMesser.addRecipes();
		StoneMesser.addRecipes();
		IronMesser.addRecipes();
		GoldMesser.addRecipes();
		DiamondMesser.addRecipes();
		WoodenKnife.addRecipes();
		StoneKnife.addRecipes();
		IronKnife.addRecipes();
		GoldKnife.addRecipes();
		DiamondKnife.addRecipes();
		SMG.addRecipes();
		SMGRounds.addRecipes();
		AK4U.addRecipes();
		AK4URounds.addRecipes();
		Kevlar.addRecipes();
		TitaniumIngot.addRecipes();
		TitaniumNugget.addRecipes();
		SMGBullet.addRecipes();
		BrassIngot.addRecipes();
		((ItemOdstArmor) OdstHelmet).addRecipes();
		((ItemOdstArmor) OdstChestplate).addRecipes();
		((ItemOdstArmor) OdstLeggings).addRecipes();
		((ItemOdstArmor) OdstBoots).addRecipes();
		NickelIngot.addRecipes();		
		CobaltIngot.addRecipes();
		MagnesiumIngot.addRecipes();
		SiliconIngot.addRecipes();
		PlatinumIngot.addRecipes();
		UraniumIngot.addRecipes();
		SMGBulletCasing.addRecipes();
		Credit.addRecipes();
		((ItemTitaniumPickaxe) TitaniumPickaxe).addRecipes();
		((ItemTitaniumAxe) TitaniumAxe).addRecipes();
		((ItemTitaniumShovel) TitaniumShovel).addRecipes();
		((ItemTitaniumHoe) TitaniumHoe).addRecipes();
		((ItemTitaniumArmor) TitaniumHelmet).addRecipes();
		((ItemTitaniumArmor) TitaniumChestplate).addRecipes();
		((ItemTitaniumArmor) TitaniumLeggings).addRecipes();
		((ItemTitaniumArmor) TitaniumBoots).addRecipes();
		TitaniumSword.addRecipes();
		TitaniumHammer.addRecipes();
		((ItemEmeraldPickaxe) EmeraldPickaxe).addRecipes();
		((ItemEmeraldAxe) EmeraldAxe).addRecipes();
		((ItemEmeraldShovel) EmeraldShovel).addRecipes();
		((ItemEmeraldHoe) EmeraldHoe).addRecipes();
		((ItemEmeraldArmor) EmeraldHelmet).addRecipes();
		((ItemEmeraldArmor) EmeraldChestplate).addRecipes();
		((ItemEmeraldArmor) EmeraldLeggings).addRecipes();
		((ItemEmeraldArmor) EmeraldBoots).addRecipes();
		EmeraldSword.addRecipes();
		((ItemLapisArmor) LapisHelmet).addRecipes();
		((ItemLapisArmor) LapisChestplate).addRecipes();
		((ItemLapisArmor) LapisLeggings).addRecipes();
		((ItemLapisArmor) LapisBoots).addRecipes();
		((ItemLapisArmorHeavy) LapisHelmetHeavy).addRecipes();
		((ItemLapisArmorHeavy) LapisChestplateHeavy).addRecipes();
		((ItemLapisArmorHeavy) LapisLeggingsHeavy).addRecipes();
		((ItemLapisArmorHeavy) LapisBootsHeavy).addRecipes();
		((ItemLapisPickaxe) LapisPickaxe).addRecipes();
		((ItemLapisAxe) LapisAxe).addRecipes();
		((ItemLapisShovel) LapisShovel).addRecipes();
		((ItemLapisHoe) LapisHoe).addRecipes();
		LapisSword.addRecipes();
		CraftingHammer.addRecipes();
		NasaFabric.addRecipes();
		CommieFabric.addRecipes();
		KerbalFabric.addRecipes();
		UniverseFabric.addRecipes();
		((ItemNasaSpaceSuit) SpaceHelmet).addRecipes();
		((ItemNasaSpaceSuit) SpaceChestplate).addRecipes();
		((ItemNasaSpaceSuit) SpaceLeggings).addRecipes();
		((ItemNasaSpaceSuit) SpaceBoots).addRecipes();
		((ItemUssrSpaceSuit) CPSpaceHelmet).addRecipes();
		((ItemUssrSpaceSuit) CPSpaceChestplate).addRecipes();
		((ItemUssrSpaceSuit) CPSpaceLeggings).addRecipes();
		((ItemUssrSpaceSuit) CPSpaceBoots).addRecipes();
		((ItemKerbalSpaceSuit) KerbalSpaceHelmet).addRecipes();
		((ItemKerbalSpaceSuit) KerbalSpaceChestplate).addRecipes();
		((ItemKerbalSpaceSuit) KerbalSpaceLeggings).addRecipes();
		((ItemKerbalSpaceSuit) KerbalSpaceBoots).addRecipes();
		((ItemAdventureSpaceSuit) AdventureSpaceHelmet).addRecipes();
		((ItemAdventureSpaceSuit) AdventureSpaceChestplate).addRecipes();
		((ItemAdventureSpaceSuit) AdventureSpaceLeggings).addRecipes();
		((ItemAdventureSpaceSuit) AdventureSpaceBoots).addRecipes();
		((ItemLapisTechSpaceSuit) LapisTechSpaceHelmet).addRecipes();
		((ItemLapisTechSpaceSuit) LapisTechSpaceChestplate).addRecipes();
		((ItemLapisTechSpaceSuit) LapisTechSpaceLeggings).addRecipes();
		((ItemLapisTechSpaceSuit) LapisTechSpaceBoots).addRecipes();
		((ItemRedstoneTechSpaceSuit) RedstoneTechSpaceHelmet).addRecipes();
		((ItemRedstoneTechSpaceSuit) RedstoneTechSpaceChestplate).addRecipes();
		((ItemRedstoneTechSpaceSuit) RedstoneTechSpaceLeggings).addRecipes();
		((ItemRedstoneTechSpaceSuit) RedstoneTechSpaceBoots).addRecipes();
		((ItemDiamondTechSpaceSuit) DiamondTechSpaceHelmet).addRecipes();
		((ItemDiamondTechSpaceSuit) DiamondTechSpaceChestplate).addRecipes();
		((ItemDiamondTechSpaceSuit) DiamondTechSpaceLeggings).addRecipes();
		((ItemDiamondTechSpaceSuit) DiamondTechSpaceBoots).addRecipes();
		((ItemEmeraldTechSpaceSuit) EmeraldTechSpaceHelmet).addRecipes();
		((ItemEmeraldTechSpaceSuit) EmeraldTechSpaceChestplate).addRecipes();
		((ItemEmeraldTechSpaceSuit) EmeraldTechSpaceLeggings).addRecipes();
		((ItemEmeraldTechSpaceSuit) EmeraldTechSpaceBoots).addRecipes();
		Techite.addRecipes();
		HotTechite.addRecipes();
		ColdTechite.addRecipes();
		CompressedTechite.addRecipes();
		
//===============================================================================================================================================================================================\\
																												//Texture Registry\\
	}
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {

		//Food\\
		ModelResourceLocation burger = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Burger, "inventory");
		ModelLoader.registerItemVariants(Burger, burger);
		mesher.register(Burger, 0, burger); 

		ModelResourceLocation fries = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Fries, "inventory");
		ModelLoader.registerItemVariants(Fries, fries);
		mesher.register(Fries, 0, fries); 
		
//===============================================================================================================================================================================================\\
																														//Weapons\\	
		
		ModelResourceLocation toyknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.ToyKnife, "inventory");
		ModelLoader.registerItemVariants(ToyKnife, toyknife);
		mesher.register(ToyKnife, 0, toyknife); 
		
		ModelResourceLocation scarlet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Scarlet, "inventory");
		ModelLoader.registerItemVariants(Scarlet, scarlet);
		mesher.register(Scarlet, 0, scarlet); 
		
//===============================================================================================================================================================================================\\
																														//OdstArmor\\
		
		ModelResourceLocation odsthelmet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstHelmet, "inventory");
		ModelLoader.registerItemVariants(OdstHelmet, odsthelmet);
		mesher.register(OdstHelmet, 0, odsthelmet); 
			
		ModelResourceLocation odstchestplate = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstChestplate, "inventory");
		ModelLoader.registerItemVariants(OdstChestplate, odstchestplate);
		mesher.register(OdstChestplate, 0, odstchestplate); 
		
		ModelResourceLocation odstleggings = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstLeggings, "inventory");
		ModelLoader.registerItemVariants(OdstLeggings, odstleggings);
		mesher.register(OdstLeggings, 0, odstleggings); 
		
		ModelResourceLocation odstboots = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstBoots, "inventory");
		ModelLoader.registerItemVariants(OdstBoots, odstboots);
		mesher.register(OdstBoots, 0, odstboots);
																												//TitaniumArmor\\
		
		ModelResourceLocation titaniumhelmet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumHelmet, "inventory");
		ModelLoader.registerItemVariants(TitaniumHelmet, titaniumhelmet);
		mesher.register(TitaniumHelmet, 0, titaniumhelmet); 
			
		ModelResourceLocation titaniumchestplate = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumChestplate, "inventory");
		ModelLoader.registerItemVariants(TitaniumChestplate, titaniumchestplate);
		mesher.register(TitaniumChestplate, 0, titaniumchestplate); 
		
		ModelResourceLocation titaniumleggings = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumLeggings, "inventory");
		ModelLoader.registerItemVariants(TitaniumLeggings, titaniumleggings);
		mesher.register(TitaniumLeggings, 0, titaniumleggings); 
		
		ModelResourceLocation titaniumboots = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumBoots, "inventory");
		ModelLoader.registerItemVariants(TitaniumBoots, titaniumboots);
		mesher.register(TitaniumBoots, 0, titaniumboots);
		
		
		ModelResourceLocation emeraldhelmet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldHelmet, "inventory");
		ModelLoader.registerItemVariants(EmeraldHelmet, emeraldhelmet);
		mesher.register(EmeraldHelmet, 0, emeraldhelmet); 
			
		ModelResourceLocation emeraldchestplate = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldChestplate, "inventory");
		ModelLoader.registerItemVariants(EmeraldChestplate, emeraldchestplate);
		mesher.register(EmeraldChestplate, 0, emeraldchestplate); 
		
		ModelResourceLocation emeraldleggings = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldLeggings, "inventory");
		ModelLoader.registerItemVariants(EmeraldLeggings, emeraldleggings);
		mesher.register(EmeraldLeggings, 0, emeraldleggings); 
		
		ModelResourceLocation emeraldboots = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldBoots, "inventory");
		ModelLoader.registerItemVariants(EmeraldBoots, emeraldboots);
		mesher.register(EmeraldBoots, 0, emeraldboots);
		
		
		ModelResourceLocation lapishelmet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisHelmet, "inventory");
		ModelLoader.registerItemVariants(LapisHelmet, lapishelmet);
		mesher.register(LapisHelmet, 0, lapishelmet); 
			
		ModelResourceLocation lapischestplate = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisChestplate, "inventory");
		ModelLoader.registerItemVariants(LapisChestplate, lapischestplate);
		mesher.register(LapisChestplate, 0, lapischestplate); 
		
		ModelResourceLocation lapisleggings = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisLeggings, "inventory");
		ModelLoader.registerItemVariants(LapisLeggings, lapisleggings);
		mesher.register(LapisLeggings, 0, lapisleggings); 
		
		ModelResourceLocation lapisboots = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisBoots, "inventory");
		ModelLoader.registerItemVariants(LapisBoots, lapisboots);
		mesher.register(LapisBoots, 0, lapisboots);
		
		
		ModelResourceLocation lapishelmetheavy = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisHelmetHeavy, "inventory");
		ModelLoader.registerItemVariants(LapisHelmetHeavy, lapishelmetheavy);
		mesher.register(LapisHelmetHeavy, 0, lapishelmetheavy); 
			
		ModelResourceLocation lapischestplateheavy = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisChestplateHeavy, "inventory");
		ModelLoader.registerItemVariants(LapisChestplateHeavy, lapischestplateheavy);
		mesher.register(LapisChestplateHeavy, 0, lapischestplateheavy); 
		
		ModelResourceLocation lapislegggingsheavy = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisLeggingsHeavy, "inventory");
		ModelLoader.registerItemVariants(LapisLeggingsHeavy, lapislegggingsheavy);
		mesher.register(LapisLeggingsHeavy, 0, lapislegggingsheavy); 
		
		ModelResourceLocation lapisbootsheavy = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisBootsHeavy, "inventory");
		ModelLoader.registerItemVariants(LapisBootsHeavy, lapisbootsheavy);
		mesher.register(LapisBootsHeavy, 0, lapisbootsheavy);
		
		//Fox Space Suit
		ModelResourceLocation Foxspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.FoxSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(FoxSpaceHelmet, Foxspacesuit);
		mesher.register(FoxSpaceHelmet, 0, Foxspacesuit); 
			
		ModelResourceLocation Foxspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.FoxSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(FoxSpaceChestplate, Foxspacesuit2);
		mesher.register(FoxSpaceChestplate, 0, Foxspacesuit2); 
		
		ModelResourceLocation Foxspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.FoxSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(FoxSpaceLeggings,Foxspacesuit3);
		mesher.register(FoxSpaceLeggings, 0, Foxspacesuit3); 
		
		ModelResourceLocation Foxspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.FoxSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(FoxSpaceBoots, Foxspacesuit4);
		mesher.register(FoxSpaceBoots, 0, Foxspacesuit4); 
		
		//RA Space Suit
		ModelResourceLocation Auzzyspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AuzzySpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(AuzzySpaceHelmet, Auzzyspacesuit);
		mesher.register(AuzzySpaceHelmet, 0, Auzzyspacesuit); 
			
		ModelResourceLocation Auzzyspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AuzzySpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(AuzzySpaceChestplate, Auzzyspacesuit2);
		mesher.register(AuzzySpaceChestplate, 0, Auzzyspacesuit2); 
		
		ModelResourceLocation Auzzyspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AuzzySpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(AuzzySpaceLeggings,Auzzyspacesuit3);
		mesher.register(AuzzySpaceLeggings, 0, Auzzyspacesuit3); 
		
		ModelResourceLocation Auzzyspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AuzzySpaceBoots, "inventory");
		ModelLoader.registerItemVariants(AuzzySpaceBoots, Auzzyspacesuit4);
		mesher.register(AuzzySpaceBoots, 0, Auzzyspacesuit4); 
		
		
		//US Space Suit
		ModelResourceLocation USspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(SpaceHelmet, USspacesuit);
		mesher.register(SpaceHelmet, 0, USspacesuit); 
			
		ModelResourceLocation USspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(SpaceChestplate, USspacesuit2);
		mesher.register(SpaceChestplate, 0, USspacesuit2); 
		
		ModelResourceLocation USspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(SpaceLeggings, USspacesuit3);
		mesher.register(SpaceLeggings, 0, USspacesuit3); 
		
		ModelResourceLocation USspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SpaceBoots, "inventory");
		ModelLoader.registerItemVariants(SpaceBoots, USspacesuit4);
		mesher.register(SpaceBoots, 0, USspacesuit4); 
		
		//USSR Space Suit
		ModelResourceLocation CPspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CPSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(CPSpaceHelmet, CPspacesuit);
		mesher.register(CPSpaceHelmet, 0, CPspacesuit); 
			
		ModelResourceLocation CPspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CPSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(CPSpaceChestplate, CPspacesuit2);
		mesher.register(CPSpaceChestplate, 0, CPspacesuit2); 
		
		ModelResourceLocation CPspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CPSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(CPSpaceLeggings, CPspacesuit3);
		mesher.register(CPSpaceLeggings, 0, CPspacesuit3); 
		
		ModelResourceLocation CPspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CPSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(CPSpaceBoots, CPspacesuit4);
		mesher.register(CPSpaceBoots, 0, CPspacesuit4);
		
		//Kerbal Space Suit
		ModelResourceLocation Kerbalspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.KerbalSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(KerbalSpaceHelmet, Kerbalspacesuit);
		mesher.register(KerbalSpaceHelmet, 0, Kerbalspacesuit); 
			
		ModelResourceLocation Kerbalspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.KerbalSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(KerbalSpaceChestplate, Kerbalspacesuit2);
		mesher.register(KerbalSpaceChestplate, 0, Kerbalspacesuit2); 
		
		ModelResourceLocation Kerbalspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.KerbalSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(KerbalSpaceLeggings, Kerbalspacesuit3);
		mesher.register(KerbalSpaceLeggings, 0, Kerbalspacesuit3); 
		
		ModelResourceLocation Kerbalspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.KerbalSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(KerbalSpaceBoots, Kerbalspacesuit4);
		mesher.register(KerbalSpaceBoots, 0, Kerbalspacesuit4);
		
		//Adventure Space Suit
		ModelResourceLocation Adventurespacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AdventureSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(AdventureSpaceHelmet, Adventurespacesuit);
		mesher.register(AdventureSpaceHelmet, 0, Adventurespacesuit); 
			
		ModelResourceLocation Adventurespacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AdventureSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(AdventureSpaceChestplate, Adventurespacesuit2);
		mesher.register(AdventureSpaceChestplate, 0, Adventurespacesuit2); 
		
		ModelResourceLocation Adventurespacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AdventureSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(AdventureSpaceLeggings, Adventurespacesuit3);
		mesher.register(AdventureSpaceLeggings, 0, Adventurespacesuit3); 
		
		ModelResourceLocation Adventurespacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AdventureSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(AdventureSpaceBoots, Adventurespacesuit4);
		mesher.register(AdventureSpaceBoots, 0, Adventurespacesuit4);
		
		//LapisTech Space Suit
		ModelResourceLocation LapisTechspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisTechSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(LapisTechSpaceHelmet, LapisTechspacesuit);
		mesher.register(LapisTechSpaceHelmet, 0, LapisTechspacesuit); 
			
		ModelResourceLocation LapisTechspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisTechSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(LapisTechSpaceChestplate, LapisTechspacesuit2);
		mesher.register(LapisTechSpaceChestplate, 0, LapisTechspacesuit2); 
		
		ModelResourceLocation LapisTechspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisTechSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(LapisTechSpaceLeggings, LapisTechspacesuit3);
		mesher.register(LapisTechSpaceLeggings, 0, LapisTechspacesuit3); 
		
		ModelResourceLocation LapisTechspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisTechSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(LapisTechSpaceBoots, LapisTechspacesuit4);
		mesher.register(LapisTechSpaceBoots, 0, LapisTechspacesuit4);
		
		//DiamondTech Space Suit
		ModelResourceLocation DiamondTechspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondTechSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(DiamondTechSpaceHelmet, DiamondTechspacesuit);
		mesher.register(DiamondTechSpaceHelmet, 0, DiamondTechspacesuit); 
			
		ModelResourceLocation DiamondTechspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondTechSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(DiamondTechSpaceChestplate, DiamondTechspacesuit2);
		mesher.register(DiamondTechSpaceChestplate, 0, DiamondTechspacesuit2); 
		
		ModelResourceLocation DiamondTechspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondTechSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(DiamondTechSpaceLeggings, DiamondTechspacesuit3);
		mesher.register(DiamondTechSpaceLeggings, 0, DiamondTechspacesuit3); 
		
		ModelResourceLocation DiamondTechspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondTechSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(DiamondTechSpaceBoots, DiamondTechspacesuit4);
		mesher.register(DiamondTechSpaceBoots, 0, DiamondTechspacesuit4);
		
		//EmeraldTech Space Suit
		ModelResourceLocation EmeraldTechspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldTechSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(EmeraldTechSpaceHelmet, EmeraldTechspacesuit);
		mesher.register(EmeraldTechSpaceHelmet, 0, EmeraldTechspacesuit); 
			
		ModelResourceLocation EmeraldTechspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldTechSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(EmeraldTechSpaceChestplate, EmeraldTechspacesuit2);
		mesher.register(EmeraldTechSpaceChestplate, 0, EmeraldTechspacesuit2); 
		
		ModelResourceLocation EmeraldTechspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldTechSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(EmeraldTechSpaceLeggings, EmeraldTechspacesuit3);
		mesher.register(EmeraldTechSpaceLeggings, 0, EmeraldTechspacesuit3); 
		
		ModelResourceLocation EmeraldTechspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldTechSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(EmeraldTechSpaceBoots, EmeraldTechspacesuit4);
		mesher.register(EmeraldTechSpaceBoots, 0, EmeraldTechspacesuit4);
		
		//RedstoneTech Space Suit
		ModelResourceLocation RedstoneTechspacesuit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedstoneTechSpaceHelmet, "inventory");
		ModelLoader.registerItemVariants(RedstoneTechSpaceHelmet, RedstoneTechspacesuit);
		mesher.register(RedstoneTechSpaceHelmet, 0, RedstoneTechspacesuit); 
			
		ModelResourceLocation RedstoneTechspacesuit2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedstoneTechSpaceChestplate, "inventory");
		ModelLoader.registerItemVariants(RedstoneTechSpaceChestplate, RedstoneTechspacesuit2);
		mesher.register(RedstoneTechSpaceChestplate, 0, RedstoneTechspacesuit2); 
		
		ModelResourceLocation RedstoneTechspacesuit3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedstoneTechSpaceLeggings, "inventory");
		ModelLoader.registerItemVariants(RedstoneTechSpaceLeggings, RedstoneTechspacesuit3);
		mesher.register(RedstoneTechSpaceLeggings, 0, RedstoneTechspacesuit3); 
		
		ModelResourceLocation RedstoneTechspacesuit4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RedstoneTechSpaceBoots, "inventory");
		ModelLoader.registerItemVariants(RedstoneTechSpaceBoots, RedstoneTechspacesuit4);
		mesher.register(RedstoneTechSpaceBoots, 0, RedstoneTechspacesuit4);
		
//===============================================================================================================================================================================================\\
																															//Messers\\
		
		ModelResourceLocation woodenmesser = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.WoodenMesser, "inventory");
		ModelLoader.registerItemVariants(WoodenMesser, woodenmesser);
		mesher.register(WoodenMesser, 0, woodenmesser); 
				
		ModelResourceLocation stonemesser = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.StoneMesser, "inventory");
		ModelLoader.registerItemVariants(StoneMesser, stonemesser);
		mesher.register(StoneMesser, 0, stonemesser); 
					
		ModelResourceLocation ironmesser = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IronMesser, "inventory");
		ModelLoader.registerItemVariants(IronMesser, ironmesser);
		mesher.register(IronMesser, 0, ironmesser); 
					
		ModelResourceLocation goldmesser = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GoldMesser, "inventory");
		ModelLoader.registerItemVariants(GoldMesser, goldmesser);
		mesher.register(GoldMesser, 0, goldmesser); 
				
		ModelResourceLocation diamondmesser = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondMesser, "inventory");
		ModelLoader.registerItemVariants(DiamondMesser, diamondmesser);
		mesher.register(DiamondMesser, 0, diamondmesser); 
	
//===============================================================================================================================================================================================\\
																										//Knifes\\
		
		ModelResourceLocation woodenknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.WoodenKnife, "inventory");
		ModelLoader.registerItemVariants(WoodenKnife, woodenknife);
		mesher.register(WoodenKnife, 0, woodenknife); 
				
		ModelResourceLocation stoneknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.StoneKnife, "inventory");
		ModelLoader.registerItemVariants(StoneKnife, stoneknife);
		mesher.register(StoneKnife, 0, stoneknife); 
					
		ModelResourceLocation ironknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IronKnife, "inventory");
		ModelLoader.registerItemVariants(IronKnife, ironknife);
		mesher.register(IronKnife, 0, ironknife); 
					
		ModelResourceLocation goldknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GoldKnife, "inventory");
		ModelLoader.registerItemVariants(GoldKnife, goldknife);
		mesher.register(GoldKnife, 0, goldknife); 
				
		ModelResourceLocation diamondknife = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondKnife, "inventory");
		ModelLoader.registerItemVariants(DiamondKnife, diamondknife);
		mesher.register(DiamondKnife, 0, diamondknife);
		
//===============================================================================================================================================================================================\\
																											//Guns\\
		
		ModelResourceLocation smg = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMG, "inventory");
		ModelLoader.registerItemVariants(SMG, smg);
		mesher.register(SMG, 0, smg); 
	
		ModelResourceLocation smgrounds = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGRounds, "inventory");
		ModelLoader.registerItemVariants(SMGRounds, smgrounds);
		mesher.register(SMGRounds, 0, smgrounds); 
			
//===============================================================================================================================================================================================\\
																											//Ammo\\
		
		ModelResourceLocation ak4u = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AK4U, "inventory");
		ModelLoader.registerItemVariants(AK4U, ak4u);
		mesher.register(AK4U, 0, ak4u); 
	
		ModelResourceLocation ak4urounds = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AK4URounds, "inventory");
		ModelLoader.registerItemVariants(AK4URounds, ak4urounds);
		mesher.register(AK4URounds, 0, ak4urounds); 
		
//===============================================================================================================================================================================================\\
																											//Basic Items\\
		
		ModelResourceLocation kevlar = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Kevlar, "inventory");
		ModelLoader.registerItemVariants(Kevlar, kevlar);
		mesher.register(Kevlar, 0, kevlar); 
			
		ModelResourceLocation titaniumingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumIngot, "inventory");
		ModelLoader.registerItemVariants(TitaniumIngot, titaniumingot);
		mesher.register(TitaniumIngot, 0, titaniumingot); 
		
		ModelResourceLocation titaniumnugget = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumNugget, "inventory");
		ModelLoader.registerItemVariants(TitaniumNugget, titaniumnugget);
		mesher.register(TitaniumNugget, 0, titaniumnugget); 
			
		ModelResourceLocation smgbulletcasing = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGBulletCasing, "inventory");
		ModelLoader.registerItemVariants(SMGBulletCasing, smgbulletcasing);
		mesher.register(SMGBulletCasing, 0, smgbulletcasing); 
			
		ModelResourceLocation smgbullet = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGBullet, "inventory");
		ModelLoader.registerItemVariants(SMGBullet, smgbullet);
		mesher.register(SMGBullet, 0, smgbullet); 
		
		ModelResourceLocation brassingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassIngot, "inventory");
		ModelLoader.registerItemVariants(BrassIngot, brassingot);
		mesher.register(BrassIngot, 0, brassingot);
		
		ModelResourceLocation nickelingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.NickelIngot, "inventory");
		ModelLoader.registerItemVariants(NickelIngot, nickelingot);
		mesher.register(NickelIngot, 0, nickelingot);
		
		ModelResourceLocation cobaltingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CobaltIngot, "inventory");
		ModelLoader.registerItemVariants(CobaltIngot, cobaltingot);
		mesher.register(CobaltIngot, 0, cobaltingot);
		
		ModelResourceLocation magnesiumingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.MagnesiumIngot, "inventory");
		ModelLoader.registerItemVariants(MagnesiumIngot, magnesiumingot);
		mesher.register(MagnesiumIngot, 0, magnesiumingot);
		
		ModelResourceLocation siliconingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SiliconIngot, "inventory");
		ModelLoader.registerItemVariants(SiliconIngot, siliconingot);
		mesher.register(SiliconIngot, 0, siliconingot);
		
		ModelResourceLocation platinumingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PlatinumIngot, "inventory");
		ModelLoader.registerItemVariants(PlatinumIngot, platinumingot);
		mesher.register(PlatinumIngot, 0, platinumingot);
		
		ModelResourceLocation uraniumingot = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.UraniumIngot, "inventory");
		ModelLoader.registerItemVariants(UraniumIngot, uraniumingot);
		mesher.register(UraniumIngot, 0, uraniumingot);
		
		ModelResourceLocation credit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Credit, "inventory");
		ModelLoader.registerItemVariants(Credit, credit);
		mesher.register(Credit, 0, credit);
		
		ModelResourceLocation premiumpermit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PremiumPermit, "inventory");
		ModelLoader.registerItemVariants(PremiumPermit, premiumpermit);
		mesher.register(PremiumPermit, 0, premiumpermit);
		
		ModelResourceLocation legacypermit = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LegacyPermit, "inventory");
		ModelLoader.registerItemVariants(LegacyPermit, legacypermit);
		mesher.register(LegacyPermit, 0, legacypermit);
		
		ModelResourceLocation craftinghammer = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CraftingHammer, "inventory");
		ModelLoader.registerItemVariants(CraftingHammer, craftinghammer);
		mesher.register(CraftingHammer, 0, craftinghammer);
		
		ModelResourceLocation nasafabric = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.NasaFabric, "inventory");
		ModelLoader.registerItemVariants(NasaFabric, nasafabric);
		mesher.register(NasaFabric, 0, nasafabric);
		
		ModelResourceLocation commiefabric = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CommieFabric, "inventory");
		ModelLoader.registerItemVariants(CommieFabric, commiefabric);
		mesher.register(CommieFabric, 0, commiefabric);
		
		ModelResourceLocation kerbalfabric = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.KerbalFabric, "inventory");
		ModelLoader.registerItemVariants(KerbalFabric, kerbalfabric);
		mesher.register(KerbalFabric, 0, kerbalfabric);
		
		ModelResourceLocation universefabric = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.UniverseFabric, "inventory");
		ModelLoader.registerItemVariants(UniverseFabric, universefabric);
		mesher.register(UniverseFabric, 0, universefabric);
		
		ModelResourceLocation recipebook = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.RecipeBook, "inventory");
		ModelLoader.registerItemVariants(RecipeBook, recipebook);
		mesher.register(RecipeBook, 0, recipebook);
		
		ModelResourceLocation techite = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Techite, "inventory");
		ModelLoader.registerItemVariants(Techite, techite);
		mesher.register(Techite, 0, techite);
		
		ModelResourceLocation hottechite = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.HotTechite, "inventory");
		ModelLoader.registerItemVariants(HotTechite, hottechite);
		mesher.register(HotTechite, 0, hottechite);
		
		ModelResourceLocation coldtechite = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.ColdTechite, "inventory");
		ModelLoader.registerItemVariants(ColdTechite, coldtechite);
		mesher.register(ColdTechite, 0, coldtechite);
		
		ModelResourceLocation compressedtechite = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CompressedTechite, "inventory");
		ModelLoader.registerItemVariants(CompressedTechite, compressedtechite);
		mesher.register(CompressedTechite, 0, compressedtechite);
		
		
//===============================================================================================================================================================================================\\
																										//Tools\\	

		ModelResourceLocation titaniumpickaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumPickaxe, "inventory");
		ModelLoader.registerItemVariants(TitaniumPickaxe, titaniumpickaxe);
		mesher.register(TitaniumPickaxe, 0, titaniumpickaxe); 

		ModelResourceLocation titaniumaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumAxe, "inventory");
		ModelLoader.registerItemVariants(TitaniumAxe, titaniumaxe);
		mesher.register(TitaniumAxe, 0, titaniumaxe); 

		ModelResourceLocation titaniumshovel = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumShovel, "inventory");
		ModelLoader.registerItemVariants(TitaniumShovel, titaniumshovel);
		mesher.register(TitaniumShovel, 0, titaniumshovel);

		ModelResourceLocation titaniumhoe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumHoe, "inventory");
		ModelLoader.registerItemVariants(TitaniumHoe, titaniumhoe);
		mesher.register(TitaniumHoe, 0, titaniumhoe);
		
		ModelResourceLocation titaniumsword = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumSword, "inventory");
		ModelLoader.registerItemVariants(TitaniumSword, titaniumsword);
		mesher.register(TitaniumSword, 0, titaniumsword);
		
		ModelResourceLocation titaniumhammer = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumHammer, "inventory");
		ModelLoader.registerItemVariants(TitaniumHammer, titaniumhammer);
		mesher.register(TitaniumHammer, 0, titaniumhammer);
		
		//ModelResourceLocation titaniumshield = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumShield, "inventory");
		//ModelLoader.registerItemVariants(TitaniumShield, titaniumshield);
		//smesher.register(TitaniumShield, 0, titaniumshield);
		
		ModelResourceLocation emeraldpickaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldPickaxe, "inventory");
		ModelLoader.registerItemVariants(EmeraldPickaxe, emeraldpickaxe);
		mesher.register(EmeraldPickaxe, 0, emeraldpickaxe); 

		ModelResourceLocation emeraldaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldAxe, "inventory");
		ModelLoader.registerItemVariants(EmeraldAxe, emeraldaxe);
		mesher.register(EmeraldAxe, 0, emeraldaxe); 

		ModelResourceLocation emeraldshovel = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldShovel, "inventory");
		ModelLoader.registerItemVariants(EmeraldShovel, emeraldshovel);
		mesher.register(EmeraldShovel, 0, emeraldshovel);

		ModelResourceLocation emeraldhoe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldHoe, "inventory");
		ModelLoader.registerItemVariants(EmeraldHoe, emeraldhoe);
		mesher.register(EmeraldHoe, 0, emeraldhoe);
		
		ModelResourceLocation emeraldsword = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.EmeraldSword, "inventory");
		ModelLoader.registerItemVariants(EmeraldSword, emeraldsword);
		mesher.register(EmeraldSword, 0, emeraldsword);
		
		ModelResourceLocation lapispickaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisPickaxe, "inventory");
		ModelLoader.registerItemVariants(LapisPickaxe, lapispickaxe);
		mesher.register(LapisPickaxe, 0, lapispickaxe); 

		ModelResourceLocation lapisaxe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisAxe, "inventory");
		ModelLoader.registerItemVariants(LapisAxe, lapisaxe);
		mesher.register(LapisAxe, 0, lapisaxe); 

		ModelResourceLocation lapisshovel = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisShovel, "inventory");
		ModelLoader.registerItemVariants(LapisShovel, lapisshovel);
		mesher.register(LapisShovel, 0, lapisshovel);

		ModelResourceLocation lapishoe = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisHoe, "inventory");
		ModelLoader.registerItemVariants(LapisHoe, lapishoe);
		mesher.register(LapisHoe, 0, lapishoe);
		
		ModelResourceLocation lapissword = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.LapisSword, "inventory");
		ModelLoader.registerItemVariants(LapisSword, lapissword);
		mesher.register(LapisSword, 0, lapissword);
		
		
//===============================================================================================================================================================================================\\
	
				{
			}
		}
	}
	//ZOO YA PH4NNY
//===============================================================================================================================================================================================\\
