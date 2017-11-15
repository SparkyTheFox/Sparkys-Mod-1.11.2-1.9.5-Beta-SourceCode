package mod.sparkyfox.servermod;

import mod.sparkyfox.servermod.init.ModSlabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
	public static void Client()
	{	
		//RecipeHandler.registerCrafting();
		//RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		//ItemInit.init();
		//ItemInit.register();
		
		ModSlabs.init();
		ModSlabs.register();
		
		//ToolInit.init();
		//ToolInit.register();
		
		//ArmourInit.init();
		//ArmourInit.register();
		
		//GameRegistry.registerWorldGenerator(new TutorialOreGen(), 0);
	}
}
