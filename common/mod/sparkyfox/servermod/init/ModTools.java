package mod.sparkyfox.servermod.init;


import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.Utils;
import mod.sparkyfox.servermod.item.tools.ItemAstroHammer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Handles the tool registration and render
 * @author CJMinecraft
 *
 */
public class ModTools {
	
	/**
	 * The tool material (Ours is like Iron)
	 */
	public static final ToolMaterial astralMaterial = EnumHelper.addToolMaterial(ServerMod.MOD_ID + "Astral", 3, 5000, 30.0F, 18.0F, 30);
	
	/**
	 * State the individual tools
	 */
	public static ItemPickaxe AstroHammer;

	
	/**
	 * Initialize the tools
	 */
	public static void init() {
		AstroHammer = new ItemAstroHammer(astralMaterial, "AstroHammer", -2.5F);

	}
	
	/**
	 * Register the tools
	 */
	public static void register() {
		registerItem(AstroHammer);

	}
	
	/**
	 * Register the tools render
	 */
	public static void registerRenders() {
		registerRender(AstroHammer);

	}
	
	/**
	 * Register the item
	 * @param item The item
	 */
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Register the items render
	 * @param item The item
	 */
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(ServerMod.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

}
