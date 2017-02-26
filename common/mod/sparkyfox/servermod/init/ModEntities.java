package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	

	public ModEntities() {
		register();
	}

	public void register() {
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntitySMGRounds") , EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);

	}

}
