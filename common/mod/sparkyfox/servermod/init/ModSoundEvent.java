package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSoundEvent {

	public static SoundEvent smg;

	public ModSoundEvent() {
		init();
		register();
	}

	private void init() {
		smg = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg"));
	}

	private void register() {
		registerSound(smg);
	}

	private void registerSound(SoundEvent sound) {
		GameRegistry.register(sound);
	}

}
