package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSoundEvent {

	public static SoundEvent smg;
	public static SoundEvent impact;
	public static SoundEvent bloodsplat;
	public static SoundEvent ak4u;
	
	public ModSoundEvent() {
		init();
		register();
	}

	private void init() {
		smg = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg"));
		impact = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "impact")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "impact"));
		bloodsplat = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat"));
		ak4u = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "ak4u")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "ak4u"));
	}

	private void register() {
		registerSound(smg);
		registerSound(impact);
		registerSound(bloodsplat);
		registerSound(ak4u);
	}

	private void registerSound(SoundEvent sound) {
		GameRegistry.register(sound);
	}

	public static void registerSounds() {

		
	}

}
