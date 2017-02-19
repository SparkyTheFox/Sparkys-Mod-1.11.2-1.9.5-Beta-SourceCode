package mod.sparkyfox.servermod;

import net.minecraft.util.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Sound {

	public static SoundEvent SMG;

	public Sound() {
		init();
		register();
	}

	private void init() {
		SMG = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "SMG")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "SMG"));
	}

	private void register() {
		registerSound(SMG);
	}

	private void registerSound(SoundEvent sound) {
		GameRegistry.register(sound);
	}

}
