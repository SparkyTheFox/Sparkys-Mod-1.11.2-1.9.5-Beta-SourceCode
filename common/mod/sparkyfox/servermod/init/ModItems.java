package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.item.ItemAK4U;
import mod.sparkyfox.servermod.item.ItemAK4URounds;
import mod.sparkyfox.servermod.item.ItemBrassIngot;
import mod.sparkyfox.servermod.item.ItemBurger;
import mod.sparkyfox.servermod.item.ItemCobaltIngot;
import mod.sparkyfox.servermod.item.ItemDiamondKnife;
import mod.sparkyfox.servermod.item.ItemDiamondMesser;
import mod.sparkyfox.servermod.item.ItemFries;
import mod.sparkyfox.servermod.item.ItemGoldKnife;
import mod.sparkyfox.servermod.item.ItemGoldMesser;
import mod.sparkyfox.servermod.item.ItemIronKnife;
import mod.sparkyfox.servermod.item.ItemIronMesser;
import mod.sparkyfox.servermod.item.ItemKevlar;
import mod.sparkyfox.servermod.item.ItemMagnesiumIngot;
import mod.sparkyfox.servermod.item.ItemNickelIngot;
import mod.sparkyfox.servermod.item.ItemOdstArmor;
import mod.sparkyfox.servermod.item.ItemPlatinumIngot;
import mod.sparkyfox.servermod.item.ItemSMG;
import mod.sparkyfox.servermod.item.ItemSMGBullet;
import mod.sparkyfox.servermod.item.ItemSMGBulletCasing;
import mod.sparkyfox.servermod.item.ItemSMGRounds;
import mod.sparkyfox.servermod.item.ItemScarlet;
import mod.sparkyfox.servermod.item.ItemSiliconIngot;
import mod.sparkyfox.servermod.item.ItemStoneKnife;
import mod.sparkyfox.servermod.item.ItemStoneMesser;
import mod.sparkyfox.servermod.item.ItemTitaniumIngot;
import mod.sparkyfox.servermod.item.ItemToyKnife;
import mod.sparkyfox.servermod.item.ItemUraniumIngot;
import mod.sparkyfox.servermod.item.ItemWoodenKnife;
import mod.sparkyfox.servermod.item.ItemWoodenMesser;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	
//===============================================================================================================================================================================================\\
																									//Basic Item Registry\\

	public static ItemKevlar Kevlar;
	public static ItemTitaniumIngot TitaniumIngot;
	public static ItemSMGBulletCasing SMGBulletCasing;
	public static ItemSMGBullet SMGBullet;
	public static ItemBrassIngot BrassIngot;
	public static ItemNickelIngot NickelIngot;
	public static ItemCobaltIngot CobaltIngot;
	public static ItemMagnesiumIngot MagnesiumIngot;
	public static ItemSiliconIngot SiliconIngot;
	public static ItemPlatinumIngot PlatinumIngot;
	public static ItemUraniumIngot UraniumIngot;
	
//===============================================================================================================================================================================================\\
																										//Armor Registry\\
	
	public static ArmorMaterial OdstArmor;
	public static ItemArmor OdstHelmet;
	public static ItemArmor OdstChestplate;
	public static ItemArmor OdstLeggings;
	public static ItemArmor OdstBoots;
	
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
			
		Scarlet = (ItemScarlet) new ItemScarlet(EnumHelper.addToolMaterial("Scarlet", 0, 2000, 0.0F, 1.0F, 30), -2.4F);
		Scarlet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Scarlet)); 
		GameRegistry.register(Scarlet); 
		
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
		
//===============================================================================================================================================================================================\\
			
		//Basic Items
		Kevlar = (ItemKevlar) new ItemKevlar();
		Kevlar.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Kevlar)); 
		GameRegistry.register(Kevlar); 
			
		TitaniumIngot = (ItemTitaniumIngot) new ItemTitaniumIngot();
		TitaniumIngot.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumIngot)); 
		GameRegistry.register(TitaniumIngot); 
			
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
        //DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        //GOLD(0, 32, 12.0F, 0.0F, 22);
		
		
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
    
    
		/**Example*/
		//Leather new int[]{1(boots), 2(leggings), 3(Chestplate), 1(helmet)}====(3.5 armor bars)
		//Chain new int[]{1(boots), 4(leggings), 5(Chestplate), 2(helmet)}====(6 armor bars)
		//Iron new int[]{2(boots), 5(leggings), 6(Chestplate), 2(helmet)}====(7.5 armor bars)
		//Gold new int[]{1(boots), 3(leggings), 5(Chestplate), 2(helmet)}====(5.5 armor bars)
		//Diamond new int[]{3(boots), 6(leggings), 8(Chestplate), 3(helmet)}====(20 armor bars)
//===============================================================================================================================================================================================\\
    																								//Recipe Initialisation\\
    
	public static void initRecipes() {
			
		Burger.addRecipes();
		Fries.addRecipes();
		ToyKnife.addRecipes();
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
		
//===============================================================================================================================================================================================\\
																												//Texture Registry\\
	}
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {

		//Food\\
		ModelResourceLocation model = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Burger, "inventory");
		ModelLoader.registerItemVariants(Burger, model);
		mesher.register(Burger, 0, model); 

		ModelResourceLocation model1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Fries, "inventory");
		ModelLoader.registerItemVariants(Fries, model1);
		mesher.register(Fries, 0, model1); 
		
//===============================================================================================================================================================================================\\
																														//Weapons\\	
		
		ModelResourceLocation model2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.ToyKnife, "inventory");
		ModelLoader.registerItemVariants(ToyKnife, model2);
		mesher.register(ToyKnife, 0, model2); 
		
		ModelResourceLocation model3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Scarlet, "inventory");
		ModelLoader.registerItemVariants(Scarlet, model3);
		mesher.register(Scarlet, 0, model3); 
		
//===============================================================================================================================================================================================\\
																														//OdstArmor\\
		
		ModelResourceLocation model4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstHelmet, "inventory");
		ModelLoader.registerItemVariants(OdstHelmet, model4);
		mesher.register(OdstHelmet, 0, model4); 
			
		ModelResourceLocation model5 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstChestplate, "inventory");
		ModelLoader.registerItemVariants(OdstChestplate, model5);
		mesher.register(OdstChestplate, 0, model5); 
		
		ModelResourceLocation model6 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstLeggings, "inventory");
		ModelLoader.registerItemVariants(OdstLeggings, model6);
		mesher.register(OdstLeggings, 0, model6); 
		
		ModelResourceLocation model7 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstBoots, "inventory");
		ModelLoader.registerItemVariants(OdstBoots, model7);
		mesher.register(OdstBoots, 0, model7);
		
//===============================================================================================================================================================================================\\
																															//Messers\\
		
		ModelResourceLocation model8 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.WoodenMesser, "inventory");
		ModelLoader.registerItemVariants(WoodenMesser, model8);
		mesher.register(WoodenMesser, 0, model8); 
				
		ModelResourceLocation model9 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.StoneMesser, "inventory");
		ModelLoader.registerItemVariants(StoneMesser, model9);
		mesher.register(StoneMesser, 0, model9); 
					
		ModelResourceLocation model10 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IronMesser, "inventory");
		ModelLoader.registerItemVariants(IronMesser, model10);
		mesher.register(IronMesser, 0, model10); 
					
		ModelResourceLocation model11 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GoldMesser, "inventory");
		ModelLoader.registerItemVariants(GoldMesser, model11);
		mesher.register(GoldMesser, 0, model11); 
				
		ModelResourceLocation model12 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondMesser, "inventory");
		ModelLoader.registerItemVariants(DiamondMesser, model12);
		mesher.register(DiamondMesser, 0, model12); 
	
//===============================================================================================================================================================================================\\
																										//Knifes\\
		
		ModelResourceLocation model13 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.WoodenKnife, "inventory");
		ModelLoader.registerItemVariants(WoodenKnife, model13);
		mesher.register(WoodenKnife, 0, model13); 
				
		ModelResourceLocation model14 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.StoneKnife, "inventory");
		ModelLoader.registerItemVariants(StoneKnife, model14);
		mesher.register(StoneKnife, 0, model14); 
					
		ModelResourceLocation model15 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IronKnife, "inventory");
		ModelLoader.registerItemVariants(IronKnife, model15);
		mesher.register(IronKnife, 0, model15); 
					
		ModelResourceLocation model16 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GoldKnife, "inventory");
		ModelLoader.registerItemVariants(GoldKnife, model16);
		mesher.register(GoldKnife, 0, model16); 
				
		ModelResourceLocation model17 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondKnife, "inventory");
		ModelLoader.registerItemVariants(DiamondKnife, model17);
		mesher.register(DiamondKnife, 0, model17);
		
//===============================================================================================================================================================================================\\
																											//Guns\\
		
		ModelResourceLocation model18 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMG, "inventory");
		ModelLoader.registerItemVariants(SMG, model18);
		mesher.register(SMG, 0, model18); 
	
		ModelResourceLocation model19 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGRounds, "inventory");
		ModelLoader.registerItemVariants(SMGRounds, model19);
		mesher.register(SMGRounds, 0, model19); 
			
//===============================================================================================================================================================================================\\
																											//Ammo\\
		
		ModelResourceLocation model20 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AK4U, "inventory");
		ModelLoader.registerItemVariants(AK4U, model20);
		mesher.register(AK4U, 0, model20); 
	
		ModelResourceLocation model21 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.AK4URounds, "inventory");
		ModelLoader.registerItemVariants(AK4URounds, model21);
		mesher.register(AK4URounds, 0, model21); 
		
//===============================================================================================================================================================================================\\
																											//Basic Items\\
		
		ModelResourceLocation model22 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Kevlar, "inventory");
		ModelLoader.registerItemVariants(Kevlar, model22);
		mesher.register(Kevlar, 0, model22); 
			
		ModelResourceLocation model23 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumIngot, "inventory");
		ModelLoader.registerItemVariants(TitaniumIngot, model23);
		mesher.register(TitaniumIngot, 0, model23); 
			
		ModelResourceLocation model25 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGBulletCasing, "inventory");
		ModelLoader.registerItemVariants(SMGBulletCasing, model25);
		mesher.register(SMGBulletCasing, 0, model25); 
			
		ModelResourceLocation model26 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SMGBullet, "inventory");
		ModelLoader.registerItemVariants(SMGBullet, model26);
		mesher.register(SMGBullet, 0, model26); 
		
		ModelResourceLocation model27 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.BrassIngot, "inventory");
		ModelLoader.registerItemVariants(BrassIngot, model27);
		mesher.register(BrassIngot, 0, model27);
		
		ModelResourceLocation model28 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.NickelIngot, "inventory");
		ModelLoader.registerItemVariants(NickelIngot, model28);
		mesher.register(NickelIngot, 0, model28);
		
		ModelResourceLocation model29 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.CobaltIngot, "inventory");
		ModelLoader.registerItemVariants(CobaltIngot, model29);
		mesher.register(CobaltIngot, 0, model29);
		
		ModelResourceLocation model30 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.MagnesiumIngot, "inventory");
		ModelLoader.registerItemVariants(MagnesiumIngot, model30);
		mesher.register(MagnesiumIngot, 0, model30);
		
		ModelResourceLocation model31 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.SiliconIngot, "inventory");
		ModelLoader.registerItemVariants(SiliconIngot, model31);
		mesher.register(SiliconIngot, 0, model31);
		
		ModelResourceLocation model32 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.PlatinumIngot, "inventory");
		ModelLoader.registerItemVariants(PlatinumIngot, model32);
		mesher.register(PlatinumIngot, 0, model32);
		
		ModelResourceLocation model33 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.UraniumIngot, "inventory");
		ModelLoader.registerItemVariants(UraniumIngot, model33);
		mesher.register(UraniumIngot, 0, model33);
		
//===============================================================================================================================================================================================\\
	
				{
			}
		}
	}
	
//===============================================================================================================================================================================================\\
