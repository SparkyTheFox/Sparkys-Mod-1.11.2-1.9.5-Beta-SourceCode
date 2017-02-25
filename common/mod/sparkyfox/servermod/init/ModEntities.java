package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	

	public ModEntities() {
		register();
	}

	private void register() {
		EntityRegistry.registerModEntity(null, EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);

	}

}
