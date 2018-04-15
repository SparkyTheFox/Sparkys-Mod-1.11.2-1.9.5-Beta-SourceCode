package mod.sparkyfox.servermod;

import java.util.Random;

import com.google.common.base.Function;

import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.entity.EntityElementalStaffFX;
import mod.sparkyfox.servermod.entity.EntityProjectile;
//import mod.sparkyfox.servermod.entity.EntityFlowey;
//import mod.sparkyfox.servermod.entity.EntityFriendlynessPellet;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.init.ModArmors;
import mod.sparkyfox.servermod.init.ModBlocks;
import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModProps;
import mod.sparkyfox.servermod.init.ModSlab;
import mod.sparkyfox.servermod.init.ModStairs;
import mod.sparkyfox.servermod.init.ModTools;
import mod.sparkyfox.servermod.render.RenderAK4URounds;
import mod.sparkyfox.servermod.render.RenderProjectile;
//import mod.sparkyfox.servermod.render.RenderFlowey;
//import mod.sparkyfox.servermod.render.RenderFriendlynessPellet;
import mod.sparkyfox.servermod.render.RenderSMGRounds;
import mod.sparkyfox.servermod.world.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFlame;
import net.minecraft.client.particle.ParticleSmokeNormal;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {
	
//	public static IBakedModel MODEL_HEAD;
//===========================================================================================================================================================================================\\	
																					//Bright Sparks Model Registry\\
	
    public static void regModel(Item item)
    {
        if(item instanceof ISubTypes && item.getHasSubtypes())
            for(int meta = 0; meta < ((ISubTypes) item).getSubNames().length; meta++)
                ModelLoader.setCustomModelResourceLocation(item, meta,
                        new ModelResourceLocation(item.getRegistryName().toString() + "/" + ((ISubTypes) item).getSubNames()[meta], "inventory"));
        else
            regModel(item, 0);
    }

    public static void regModel(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        assert item != null : "Block has no Item!";
        if(block instanceof ISubTypes)
            for(int meta = 0; meta < ((ISubTypes) block).getSubNames().length; meta++)
                ModelLoader.setCustomModelResourceLocation(item, meta,
                        new ModelResourceLocation(item.getRegistryName().toString() + "/" + ((ISubTypes) block).getSubNames()[meta], "inventory"));
        else
            regModel(item);
    }

    public static void regModel(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

	
//===========================================================================================================================================================================================\\	
																								//Model Registry\\
	
	public void registerModels() {
		
		//Bullets and Ammo
		registerModel(ModItems.SMGRounds, 0);
		registerModel(ModItems.AK4URounds, 0);
	}
	
																								
//===============================================================================================================================================================================================\\
																								//Render Registry\\
	
	public void registerRenderer() {

	
																									//Ammo\\

	//SMG Rounds	
	RenderingRegistry.registerEntityRenderingHandler(EntitySMGRounds.class, new IRenderFactory() {
		@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderSMGRounds(manager);
		}});
	
	//AK-4U Rounds	
	RenderingRegistry.registerEntityRenderingHandler(EntityAK4URounds.class, new IRenderFactory() {
		@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderAK4URounds(manager);
		}});

	
	/**
	 Flowey
	 
    RenderingRegistry.registerEntityRenderingHandler(EntityFlowey.class, new IRenderFactory() {
    	@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderFlowey(manager, null, 0);
    	}});
    
  //Friendlyness Pellet	
  	RenderingRegistry.registerEntityRenderingHandler(EntityFriendlynessPellet.class, new IRenderFactory() {
  		@Override
  		public Render createRenderFor(RenderManager manager) {
  			return new RenderFriendlynessPellet(manager);
  		}});
  	
	*/		
//===============================================================================================================================================================================================\\
																								//Event Handler\\
	
	}
	public void registerEventHandler() {
	}
	
//===============================================================================================================================================================================================\\
																								//Register Model?\\
	
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
	
//===============================================================================================================================================================================================\\
																										//Inits\\
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		OBJLoader.INSTANCE.addDomain(ServerMod.MOD_ID);
		 //new BookLoader();
		//ModelLoader.setCustomModelResourceLocation(BackpacksContent.BACKPACK, 0,
		 ModelLoader.setCustomModelResourceLocation(ModItems.OdstHelmet, 0,
				new ModelResourceLocation("servermod:demonic_head", "inventory"));
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		ModItems.initClient(mesher);
		ModBlocks.initClient(mesher);
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);  //Register the ore generatorY
		RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, new RenderProjectile());
		//RegistryHandler.client();
		
	}

	/**
	 * Registers the renders
	 */
	@Override
	public void registerRenders() {
		ModSlab.registerRenders();
		ModStairs.registerRenders();
		ModProps.registerRenders();
		ModTools.registerRenders();
		

	}
		@Override
	   public void postInit(FMLPostInitializationEvent event) {
		   super.postInit(event);

	}

	   public void registerItem(Item item, String name, int meta)
	   {
	     super.registerItem(item, name, meta);
	     ModelResourceLocation location = new ModelResourceLocation(new ResourceLocation("servermod", name), "inventory");
	     ModelLoader.setCustomModelResourceLocation(item, meta, location);
	   }
	   
	   public Item registerBlock(Block block, String name, int meta, Class<? extends ItemBlock> itemclass, boolean seperateMetadata)
	   {
	     Item item = super.registerBlock(block, name, meta, itemclass, seperateMetadata);
	     registerItems(item, name, meta, seperateMetadata);
	     return item;
	   }

	   
	   public void registerItems(Item item, String name, int meta, boolean seperate) {
	     if (meta > 0) {
	       item.setHasSubtypes(true);
	       for (int i = 0; i <= meta; i++) {
	         String s = name;
	         if (seperate) {
	           s = s + "_" + i;
	           ModelLoader.registerItemVariants(item, new ResourceLocation[] { new ResourceLocation("servermod", s) });
	         }
	         registerItem(item, s, i);
	       }
	     }
	     else {
	       registerItem(item, name, 0);
	     }
	   }
   
   public void spawnParticle(EntityLivingBase player, String string, Object... ob)
   {
     if (string.equals("Spell")) {
       int color = ((Integer)ob[0]).intValue();
       int number = ((Integer)ob[1]).intValue();
       for (int i = 0; i < number; i++) {
         Random rand = player.getRNG();
         double x = (rand.nextDouble() - 0.5D) * player.width;
         double y = player.getEyeHeight();
         double z = (rand.nextDouble() - 0.5D) * player.width;
        
         double f = (rand.nextDouble() - 0.5D) * 2.0D;
         double f1 = -rand.nextDouble();
         double f2 = (rand.nextDouble() - 0.5D) * 2.0D;
         
         Minecraft.getMinecraft().effectRenderer.addEffect(new EntityElementalStaffFX(player, x, y, z, f, f1, f2, color));
       }
     }
     else if (string.equals("Block")) {
       BlockPos pos = (BlockPos)ob[0];
       int id = ((Integer)ob[1]).intValue();
       Block block = Block.getBlockById(id & 0xFFF);
       Minecraft.getMinecraft().effectRenderer.addBlockDestroyEffects(pos, block.getStateFromMeta(id >> 12 & 0xFF));
     }
   }
   
 
   public void spawnParticle(EnumParticleTypes particle, double x, double y, double z, double motionX, double motionY, double motionZ, float scale)
   {
     Minecraft mc = Minecraft.getMinecraft();
     double xx = mc.getRenderViewEntity().posX - x;
     double yy = mc.getRenderViewEntity().posY - y;
     double zz = mc.getRenderViewEntity().posZ - z;
     if (xx * xx + yy * yy + zz * zz > 256.0D) {
       return;
     }
     Particle fx = mc.effectRenderer.spawnEffectParticle(particle.getParticleID(), x, y, z, motionX, motionY, motionZ, new int[0]);
     if (fx == null) {
       return;
     }
     if (particle == EnumParticleTypes.FLAME) {
       ObfuscationReflectionHelper.setPrivateValue(ParticleFlame.class, (ParticleFlame)fx, Float.valueOf(scale), 0);
     }
     else if (particle == EnumParticleTypes.SMOKE_NORMAL) {
       ObfuscationReflectionHelper.setPrivateValue(ParticleSmokeNormal.class, (ParticleSmokeNormal)fx, Float.valueOf(scale), 0);
     }
   }
   /**
	// Model related
	
	private static final Function<ResourceLocation, TextureAtlasSprite> TEXTURE_GETTER =
		new Function<ResourceLocation, TextureAtlasSprite>() {
			public TextureAtlasSprite apply(ResourceLocation location) {
				return Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(location.toString());
			}
		};
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onModelBake(ModelBakeEvent event) {
		MODEL_HEAD = bakeItemModel("servermod:item/demonic_head");

	}
	
	static IBakedModel bakeItemModel(String location) {
		IModel model = getModel(new ResourceLocation(location));
		return model.bake(model.getDefaultState(),
			DefaultVertexFormats.ITEM, TEXTURE_GETTER);
	}
	
	static IModel getModel(ResourceLocation location) {
		try {
			IModel model = ModelLoaderRegistry.getModel(location);
			if (model == null)
				ServerMod.LOG.error("Model " + location + " is missing! THIS WILL CAUSE A CRASH!");
			return model;
		} catch (Exception e) { e.printStackTrace(); return null; }
	}
   */
 }
	
//===============================================================================================================================================================================================\\
   
  
	