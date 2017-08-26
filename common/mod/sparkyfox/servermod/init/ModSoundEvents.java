package mod.sparkyfox.servermod.init;

import mod.sparkyfox.servermod.ServerMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSoundEvents {
//===============================================================================================================================================================================================\\
																									//SFX Registry\\
	public static SoundEvent smg;
	public static SoundEvent impact;
	public static SoundEvent bloodsplat;
	public static SoundEvent ak4u;
	public static SoundEvent alarm;
	
//===============================================================================================================================================================================================\\
																									//UTM Registry\\
	public static SoundEvent mus_ruins;
	public static SoundEvent mus_wrongnumbersong;
	public static SoundEvent mus_battle1;
	public static SoundEvent mus_battle2;
	public static SoundEvent mus_boss1;
	public static SoundEvent mus_grillbys;
	public static SoundEvent mus_epicadventure;
	public static SoundEvent mus_temshop;
	public static SoundEvent mus_snowy;
	public static SoundEvent mus_snowdintown;
	public static SoundEvent mus_dogsong;
	public static SoundEvent mus_shop;
	public static SoundEvent mus_home;
	public static SoundEvent mus_home2;
	public static SoundEvent mus_boss2;
	
//===============================================================================================================================================================================================\\
																									//SONG Registry\\	
	//public static SoundEvent song_90s;


//===============================================================================================================================================================================================\\
																									//Flowey Registry\\	
	
	//public static SoundEvent FloweyHowdy;
	//public static SoundEvent FloweyKOBK;
	//public static SoundEvent FloweyIKWYD;
	//public static SoundEvent FloweyHurt;
	//public static SoundEvent FloweyLaugh;
	//public static SoundEvent FloweyDeath;
//public static SoundEvent mus_boss1;

//===============================================================================================================================================================================================\\
																								//Sound Initialisation: SFX\\	
	private void init() {
		smg = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg"));
		impact = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "impact")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "impact"));
		bloodsplat = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "bloodsplat"));
		ak4u = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "ak4u")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "ak4u"));
		alarm = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "alarm")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "alarm"));

//===============================================================================================================================================================================================\\
																								//Sound Initialisation: UTM\\
		
		mus_ruins = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_ruins")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_ruins"));
		mus_wrongnumbersong = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_wrongnumbersong")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_wrongnumbersong"));
		mus_battle1 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_battle1")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_battle1"));
		mus_battle2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_battle2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_battle2"));
		mus_boss1 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_boss1")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_boss1"));
		mus_grillbys = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_grillbys")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_grillbys"));
		mus_epicadventure = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_epicadventure")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_epicadventure"));
		mus_temshop = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_temshop")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_temshop"));
		mus_snowy = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_snowy")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_snowy"));
		mus_snowdintown = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_snowdintown")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_snowdintown"));
		mus_dogsong = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_dogsong")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_dogsong"));
		mus_shop = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_shop")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_shop"));
		mus_home = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_home")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_home"));
		mus_home2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_home2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_home2"));
		mus_boss2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_boss2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_boss2"));
		
//===============================================================================================================================================================================================\\
																								//Sound Initialisation: SONGS\\
		
		//song_90s = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "song_90s")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "song_90s"));
		
		
		
//===============================================================================================================================================================================================\\
																								//Sound Initialisation: Flowey\\
		
		//FloweyHowdy = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyHowdy")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyHowdy"));
		//FloweyKOBK= new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyKOBK")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyKOBK"));
		//FloweyIKWYD = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyIKWYD")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyIKWYD"));
		//FloweyHurt = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyHurt")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyHurt"));
		//FloweyLaugh = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyLaugh")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyLaugh"));
		//FloweyDeath = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "FloweyDeath")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "FloweyDeath"));
		

	

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
		registerSound(mus_grillbys);
		registerSound(mus_epicadventure);
		registerSound(mus_temshop);
		registerSound(mus_snowy);
		registerSound(mus_snowdintown);
		registerSound(mus_dogsong);
		registerSound(mus_shop);
		registerSound(mus_home);
		registerSound(mus_home2);
		registerSound(mus_boss2);
		registerSound(alarm);
		//registerSound(song_90s);
		//registerSound(FloweyHowdy);
		//registerSound(FloweyKOBK);
		//registerSound(FloweyIKWYD);
		//registerSound(FloweyHurt);
		//registerSound(FloweyLaugh);
		//registerSound(FloweyDeath);
		
		
	}

//===============================================================================================================================================================================================\\
	
	//Init-Reg
	public ModSoundEvents() {
		init();
		register();
	}
	
	//Game Registry
	private void registerSound(SoundEvent sound) {
		GameRegistry.register(sound);
	}
//===============================================================================================================================================================================================\\

}
