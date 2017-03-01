package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.block.BlockTitaniumBlock;
import mod.sparkyfox.servermod.block.BlockTitaniumOre;
import mod.sparkyfox.servermod.lib.ModNames;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

  public class ModBlocks {
	  
	  //Ores
	  public static BlockTitaniumOre TitaniumOre;
	  
	  //Blocks
	  public static BlockTitaniumBlock TitaniumBlock;
	  
  
	  public static void init() {
		  
		  //Ores
		  ResourceLocation location = new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumOre);
		  TitaniumOre = new BlockTitaniumOre();
		  TitaniumOre.setRegistryName(location);
		  GameRegistry.register(TitaniumOre);
		  GameRegistry.register(new ItemBlock(TitaniumOre), location);{
			  
		  }
		  
		  //Blocks
		  ResourceLocation location1 = new ResourceLocation(ServerMod.MOD_ID, ModNames.TitaniumBlock);
		  TitaniumBlock = new BlockTitaniumBlock();
		  TitaniumBlock.setRegistryName(location1);
		  GameRegistry.register(TitaniumBlock);
		  GameRegistry.register(new ItemBlock(TitaniumBlock), location1);
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public static void initClient(ItemModelMesher mesher) {
	
		  	//Ores
		    Item item = Item.getItemFromBlock(TitaniumOre);
		    ModelResourceLocation model = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumOre, "inventory");
		    ModelLoader.registerItemVariants(item, model);
		    mesher.register(item, 0, model);{
		    	
		    }
		    
		    //Blocks
		    Item item1 = Item.getItemFromBlock(TitaniumBlock);
		    ModelResourceLocation model1 = new ModelResourceLocation(ServerMod.RESOURCE_PREFIX + ModNames.TitaniumBlock, "inventory");
		    ModelLoader.registerItemVariants(item1, model1);
		    mesher.register(item1, 0, model1);
	  		
	  		}
  
	  public static void initRecipes() {
			TitaniumOre.addRecipes();
			TitaniumBlock.addRecipes();
	  }
  }

