package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.entity.EntityAK4URounds;
import mod.sparkyfox.servermod.entity.EntitySMGRounds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static int SMGRounds = 0;
	public static int AK4URounds = 1;
	

	public ModEntities() {
		register();
	}

	public void register() {
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntitySMGRounds") , EntitySMGRounds.class, "SMGRounds", SMGRounds, ServerMod.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("ServerMod:EntityAK4URounds") , EntityAK4URounds.class, "AK4URounds", AK4URounds, ServerMod.instance, 64, 1, true);

	}

}
