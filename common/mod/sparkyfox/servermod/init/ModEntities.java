package mod.sparkyfox.servermod.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler;
import static net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn;
import static net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity;
import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import mod.sparkyfox.servermod.render.RenderSMGRounds;


public class ModEntities {

    //Arrows ID 0 to 5
    private static final int SMGRounds = 0;


    public static void init() {
        // Every entity in ArmorPlus has an ID (local to this mod)
        registerModEntity(setResourceLocation("smgrounds"), EntitySMGRounds.class, "smgrounds", SMGRounds, ServerMod.instance, 64, 1, true);

	}

	private static ResourceLocation setResourceLocation(String string) {
		return null;
	}

	@SideOnly(Side.CLIENT)
    public static void initModels() {
        //Mobs

        //Arrows
        registerEntityRenderingHandler(EntitySMGRounds.class, RenderSMGRounds::new);
    }
}