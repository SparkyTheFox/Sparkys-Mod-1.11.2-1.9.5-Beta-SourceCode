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
	public static SoundEvent switch1;
	public static SoundEvent switch2;
	public static SoundEvent sfx_fall;
	public static SoundEvent sfx_mousesqueek;
	public static SoundEvent sfx_savepoint;
	public static SoundEvent sfx_savesucces;
	public static SoundEvent soulbattleflash;
	public static SoundEvent sfx_monsterencounter;
	public static SoundEvent sfx_soulgameoverhit;
	public static SoundEvent sfx_soulgameoverhitbreak;
	public static SoundEvent sfx_soulbattlestart;
	public static SoundEvent nosound;
	public static SoundEvent noclip;
	public static SoundEvent smgreload;
	public static SoundEvent sniper;
	public static SoundEvent sniperreload;
	public static SoundEvent smg2;
	public static SoundEvent smg2reload;
	public static SoundEvent assaultrifle;
	public static SoundEvent assaultriflereload;
	public static SoundEvent magnum;
	public static SoundEvent magnumreload;
	public static SoundEvent charge;
	public static SoundEvent shot;
	
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
	public static SoundEvent mus_determination;
//===============================================================================================================================================================================================\\
																									//SONG Registry\\	
	//public static SoundEvent song_90s;
	public static SoundEvent song_ohmygodno;


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
		switch1 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "switch1")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "switch1"));
		switch2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "switch2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "switch2"));
		soulbattleflash = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "soulbattleflash")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "soulbattleflash"));
		noclip = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "noclip")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "noclip"));
		smgreload = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smgreload")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smgreload"));
		sniper = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sniper")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sniper"));
		sniperreload = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sniperreload")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sniperreload"));
		charge = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "charge")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "charge"));
		shot = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "shot")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "shot"));
		smg2 = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg2")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg2"));
		smg2reload = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "smg2reload")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "smg2reload"));
		assaultrifle = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "assaultrifle")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "assaultrifle"));
		assaultriflereload = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "assaultriflereload")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "assaultriflereload"));
		magnum = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "magnum")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "magnum"));
		magnumreload = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "magnumreload")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "magnumreload"));
		
		
		
//===============================================================================================================================================================================================\\
																									//Sound Initialisation: UTS\\	

			sfx_mousesqueek = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_mousesqueek")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_mousesqueek"));
			sfx_savepoint = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_savepoint")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_savepoint"));
			sfx_savesucces = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_savesucces")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_savesucces"));
			sfx_fall = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_fall")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_fall"));
			
			sfx_monsterencounter = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_monsterencounter")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_monsterencounter"));
			sfx_soulgameoverhit = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulgameoverhit")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulgameoverhit"));
			sfx_soulgameoverhitbreak = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulgameoverhitbreak")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulgameoverhitbreak"));
			sfx_soulbattlestart = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulbattlestart")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "sfx_soulbattlestart"));



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
		mus_determination = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "mus_determination")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "mus_determination"));
		
//===============================================================================================================================================================================================\\
																								//Sound Initialisation: SONGS\\
		
		//song_90s = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "song_90s")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "song_90s"));
		song_ohmygodno = new SoundEvent(new ResourceLocation(ServerMod.MOD_ID, "song_ohmygodno")).setRegistryName(new ResourceLocation(ServerMod.MOD_ID, "song_ohmygodno"));
		
		
		
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
		registerSound(mus_determination);
		registerSound(song_ohmygodno);
		registerSound(alarm);
		registerSound(switch1);
		registerSound(switch2);
		registerSound(soulbattleflash);
		registerSound(sfx_fall);
		registerSound(sfx_mousesqueek);
		registerSound(sfx_savepoint);
		registerSound(sfx_savesucces);
		registerSound(sfx_monsterencounter);
		registerSound(sfx_soulgameoverhit);
		registerSound(sfx_soulgameoverhitbreak);
		registerSound(sfx_soulbattlestart);
		registerSound(noclip);
		registerSound(smgreload);
		registerSound(sniper);
		registerSound(sniperreload);
		registerSound(smg2);
		registerSound(smg2reload);
		registerSound(assaultrifle);
		registerSound(assaultriflereload);
		registerSound(magnum);
		registerSound(magnumreload);
		registerSound(charge);
		registerSound(shot);
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
