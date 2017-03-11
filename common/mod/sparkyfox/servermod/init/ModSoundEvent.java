package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSoundEvent {
//===============================================================================================================================================================================================\\
																									//SFX Registry\\
	public static SoundEvent smg;
	public static SoundEvent impact;
	public static SoundEvent bloodsplat;
	public static SoundEvent ak4u;
	
//===============================================================================================================================================================================================\\
																									//UTM Registry\\
	public static SoundEvent mus_ruins;
	public static SoundEvent mus_wrongnumbersong;
	public static SoundEvent mus_battle1;
	public static SoundEvent mus_battle2;
	public static SoundEvent mus_boss1;
	
//===============================================================================================================================================================================================\\
																									//SONG Registry\\	
	public static SoundEvent song_90s;


//===============================================================================================================================================================================================\\
																									//Flowey Registry\\	
	
public static SoundEvent FloweyAmbient;
public static SoundEvent FloweyAmbient2;
public static SoundEvent FloweyHurt;
public static SoundEvent FloweyAngry;
//public static SoundEvent mus_boss1;

//===============================================================================================================================================================================================\\
																								//Sound Initialisation: SFX\\	
	private void init() {
		smg = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg"));
		impact = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "impact")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "impact"));
		bloodsplat = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat"));
		ak4u = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "ak4u")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "ak4u"));

//===============================================================================================================================================================================================\\
																								//Sound Initialisation: UTM\\
		
		mus_ruins = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_ruins")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_ruins"));
		mus_wrongnumbersong = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_wrongnumbersong")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_wrongnumbersong"));
		mus_battle1 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_battle1")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_battle1"));
		mus_battle2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_battle2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_battle2"));
		mus_boss1 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_boss1")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_boss1"));
		
//===============================================================================================================================================================================================\\
																								//Sound Initialisation: SONGS\\
		
		song_90s = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "song_90s")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "song_90s"));
		
		
		
//===============================================================================================================================================================================================\\
																								//Sound Initialisation: Flowey\\
		
FloweyAmbient = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyAmbient")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyAmbient"));
FloweyAmbient2= new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyAmbient2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyAmbient2"));
FloweyHurt = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyHurt")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyHurt"));
FloweyAngry = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyAngry")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyAngry"));



//===============================================================================================================================================================================================\\
																									//Sound Name Registry\\
	}

	private void register() {
		registerSound(smg);
		registerSound(impact);
		registerSound(bloodsplat);
		registerSound(ak4u);
		registerSound(mus_ruins);
		registerSound(mus_wrongnumbersong);
		registerSound(mus_battle1);
		registerSound(mus_battle2);
		registerSound(mus_boss1);
		registerSound(song_90s);
		registerSound(FloweyAmbient);
		registerSound(FloweyAmbient2);
		registerSound(FloweyHurt);
		registerSound(FloweyAngry);
		
	}

//===============================================================================================================================================================================================\\
	
	//Init-Reg
	public ModSoundEvent() {
		init();
		register();
	}
	
	//Game Registry
	private void registerSound(SoundEvent sound) {
		GameRegistry.register(sound);
	}
//===============================================================================================================================================================================================\\

}
