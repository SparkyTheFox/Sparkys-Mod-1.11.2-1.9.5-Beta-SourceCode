package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.render.RenderAK4URounds;
import mod.sparkyfox.servermod.render.RenderSMGRounds;
import mod.sparkyfox.servermod.world.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ClientProxy extends CommonProxy {
	
	public void registerModels() {
		registerModel(ModItems.SMGRounds, 0);
		registerModel(ModItems.AK4URounds, 0);
	}

	public void registerRenderer() {
		RenderingRegistry.registerEntityRenderingHandler(EntitySMGRounds.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSMGRounds(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAK4URounds.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderAK4URounds(manager);
			}
			});
		}

	public void registerEventHandler() {

	}

	private void registerModel(Object obj, int meta) {

		Item item;
		if (obj instanceof Item) {
			item = (Item) obj;
		} else if (obj instanceof Block) {
			item = Item.getItemFromBlock((Block) obj);
		} else {
			throw new IllegalArgumentException("Only item and block instances");
		}
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}



	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);



	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		ModItems.initClient(mesher);
		ModBlocks.initClient(mesher);
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);  //Register the ore generator
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		
	}
   
    
	}