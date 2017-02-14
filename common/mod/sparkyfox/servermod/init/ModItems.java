package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.item.ItemBurger;
import mod.sparkyfox.servermod.item.ItemDiamondMesser;
import mod.sparkyfox.servermod.item.ItemFries;
import mod.sparkyfox.servermod.item.ItemGoldMesser;
import mod.sparkyfox.servermod.item.ItemIronMesser;
import mod.sparkyfox.servermod.item.ItemOdstArmor;
import mod.sparkyfox.servermod.item.ItemScarlet;
import mod.sparkyfox.servermod.item.ItemStoneMesser;
import mod.sparkyfox.servermod.item.ItemToyKnife;
import mod.sparkyfox.servermod.item.ItemWoodenMesser;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

	public class ModItems {
	
	//Food
	public static ItemBurger Burger;
	public static ItemFries Fries;
	
	//Weapons
	public static ItemToyKnife ToyKnife;
	public static ItemScarlet Scarlet;
	public static ItemWoodenMesser WoodenMesser;
	public static ItemStoneMesser StoneMesser;
	public static ItemIronMesser IronMesser;
	public static ItemGoldMesser GoldMesser;
	public static ItemDiamondMesser DiamondMesser;
	
	
	//Armor
	public static ArmorMaterial OdstArmor;
	public static Item OdstHelmet;
	public static Item OdstChestplate;
	public static Item OdstLeggings;
	public static Item OdstBoots;
	
	public static void init() {
		
		//Food- Item Registry
		Burger = (ItemBurger) new ItemBurger(18, 1.0F, true);//(18=[how many bars is heals] 1.0F=[Saturation(how long it will last)] true=[Wolfs Can eat])
		Burger.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Burger)); 
		GameRegistry.register(Burger); {
			
		}
	
		Fries = (ItemFries) new ItemFries(9, 0.5F, false);  
		Fries.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Fries)); 
		GameRegistry.register(Fries); {
			
		//Weapons
		ToyKnife = (ItemToyKnife) new ItemToyKnife(EnumHelper.addToolMaterial("ToyKnife", 0, 500, 0.0F, 5.5F, 30), 1.0F);
		ToyKnife.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.ToyKnife)); 
		GameRegistry.register(ToyKnife); {
			
		Scarlet = (ItemScarlet) new ItemScarlet(EnumHelper.addToolMaterial("Scarlet", 0, 2000, 0.0F, 9.0F, 30), -2.4F);
		Scarlet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.Scarlet)); 
		GameRegistry.register(Scarlet); {
			
			//messers
			
			WoodenMesser = (ItemWoodenMesser) new ItemWoodenMesser(EnumHelper.addToolMaterial("WoodenMesser", 0, 59, 2.0F, 0.5F, 15), -2.0F);
			WoodenMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.WoodenMesser)); 
			GameRegistry.register(WoodenMesser); {
				
			}
			
			StoneMesser = (ItemStoneMesser) new ItemStoneMesser(EnumHelper.addToolMaterial("StoneMesser", 1, 131, 2.0F, 1.5F, 5), -2.0F);
			StoneMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.StoneMesser)); 
			GameRegistry.register(StoneMesser); {
				
			}
			
			IronMesser = (ItemIronMesser) new ItemIronMesser(EnumHelper.addToolMaterial("IronMesser", 2, 250, 6.0F, 2.5F, 14), -2.0F);
			IronMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.IronMesser)); 
			GameRegistry.register(IronMesser); {
				
			}
			
			GoldMesser = (ItemGoldMesser) new ItemGoldMesser(EnumHelper.addToolMaterial("GoldMesser", 0, 32, 0.0F, 1.8F, 22), -2.0F);
			GoldMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.GoldMesser)); 
			GameRegistry.register(GoldMesser); {
				
			}
			
			DiamondMesser = (ItemDiamondMesser) new ItemDiamondMesser(EnumHelper.addToolMaterial("DiamondMesser", 3, 1561, 8.0F, 3.5F, 10), -2.0F);
			DiamondMesser.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.DiamondMesser)); 
			GameRegistry.register(DiamondMesser); {
			
				
				
				
		//Armor
			OdstArmor = EnumHelper.addArmorMaterial("OdstArmor", null, 20, new int[] { 5, 5, 5, 5 }, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0); }
		
			OdstHelmet = new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.HEAD);
			OdstHelmet.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstHelmet)); 
			GameRegistry.register(OdstHelmet);
			
			OdstChestplate = new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.CHEST);
			OdstChestplate.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstChestplate)); 
			GameRegistry.register(OdstChestplate);
			
			OdstLeggings = new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.LEGS);
			OdstLeggings.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstLeggings)); 
			GameRegistry.register(OdstLeggings);
			
			OdstBoots = new ItemOdstArmor(OdstArmor, EntityEquipmentSlot.FEET);
			OdstBoots.setRegistryName(new ResourceLocation(ServerMod.MOD_ID, ModNames.OdstBoots)); 
			GameRegistry.register(OdstBoots);
			



		}
		
		}
		}
			
		
		
		
	
		
		
		/** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
		 
        /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */

        /** The strength of this tool material against blocks which it is effective against. */
 
        /** Damage versus entities. */
 
        /** Defines the natural enchantability factor of the material. */
		
		

		//WOOD(0, 59, 2.0F, 0.0F, 15),
        //STONE(1, 131, 4.0F, 1.0F, 5),
        //IRON(2, 250, 6.0F, 2.0F, 14),
        //DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        //GOLD(0, 32, 12.0F, 0.0F, 22);
		
		
		}
		

		
	

	public static void initRecipes() {
		
		
		Burger.addRecipes();
		Fries.addRecipes();
		ToyKnife.addRecipes();
		WoodenMesser.addRecipes();
		StoneMesser.addRecipes();
		IronMesser.addRecipes();
		GoldMesser.addRecipes();
		DiamondMesser.addRecipes();
		
	}
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		
		
		
															//Texture Registry\\

		ModelResourceLocation model = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Burger, "inventory");
		ModelLoader.registerItemVariants(Burger, model);
		mesher.register(Burger, 0, model); {
	}

		ModelResourceLocation model1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Fries, "inventory");
		ModelLoader.registerItemVariants(Fries, model1);
		mesher.register(Fries, 0, model1); {
			
		ModelResourceLocation model2 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.ToyKnife, "inventory");
		ModelLoader.registerItemVariants(ToyKnife, model2);
		mesher.register(ToyKnife, 0, model2); {
			
		ModelResourceLocation model3 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.Scarlet, "inventory");
		ModelLoader.registerItemVariants(Scarlet, model3);
		mesher.register(Scarlet, 0, model3); {
			
		ModelResourceLocation model4 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstHelmet, "inventory");
		ModelLoader.registerItemVariants(OdstHelmet, model4);
		mesher.register(OdstHelmet, 0, model4); {
			
		ModelResourceLocation model5 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstChestplate, "inventory");
		ModelLoader.registerItemVariants(OdstChestplate, model5);
		mesher.register(OdstChestplate, 0, model5); {
		
		ModelResourceLocation model6 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstLeggings, "inventory");
		ModelLoader.registerItemVariants(OdstLeggings, model6);
		mesher.register(OdstLeggings, 0, model6); {
		
		ModelResourceLocation model7 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.OdstBoots, "inventory");
		ModelLoader.registerItemVariants(OdstBoots, model7);
		mesher.register(OdstBoots, 0, model7); {
			///
			ModelResourceLocation model8 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.WoodenMesser, "inventory");
			ModelLoader.registerItemVariants(WoodenMesser, model8);
			mesher.register(WoodenMesser, 0, model8); {
				
				ModelResourceLocation model9 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.StoneMesser, "inventory");
				ModelLoader.registerItemVariants(StoneMesser, model9);
				mesher.register(StoneMesser, 0, model9); {
					
					ModelResourceLocation model10 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.IronMesser, "inventory");
					ModelLoader.registerItemVariants(IronMesser, model10);
					mesher.register(IronMesser, 0, model10); {
						
						ModelResourceLocation model11 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.GoldMesser, "inventory");
						ModelLoader.registerItemVariants(GoldMesser, model11);
						mesher.register(GoldMesser, 0, model11); {
					
						ModelResourceLocation model12 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.DiamondMesser, "inventory");
						ModelLoader.registerItemVariants(DiamondMesser, model12);
						mesher.register(DiamondMesser, 0, model12); {
		
												}
											}
										}
									}
								}
			
							}
						}
					}
				}
			}
		}
	}
}





	public static Item getItemFromModItem(Item odstHelmet) {
		// TODO Auto-generated method stub
		return null;
	}




	}


