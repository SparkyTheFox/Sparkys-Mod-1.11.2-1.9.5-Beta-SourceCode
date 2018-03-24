package mod.sparkyfox.servermod.lib;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeType;
import com.mrcrayfish.furniture.api.RecipeVariables;

import mod.sparkyfox.servermod.init.ModItems;
import mod.sparkyfox.servermod.init.ModTools;
import net.minecraft.item.ItemStack;

public class FurnitureRecipes {
	
	public static void register(IRecipeRegistry registry)
	{
		//Fox Spacesuit
		RecipeVariables FoxSpaceHelmet = new RecipeVariables();
		FoxSpaceHelmet.setInput(new ItemStack(ModItems.FoxSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, FoxSpaceHelmet);
		
		RecipeVariables FoxSpaceChestplate = new RecipeVariables();
		FoxSpaceChestplate.setInput(new ItemStack(ModItems.FoxSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, FoxSpaceChestplate);
		
		RecipeVariables FoxSpaceLeggings = new RecipeVariables();
		FoxSpaceLeggings.setInput(new ItemStack(ModItems.FoxSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, FoxSpaceLeggings);
		
		RecipeVariables FoxSpaceBoots = new RecipeVariables();
		FoxSpaceBoots.setInput(new ItemStack(ModItems.FoxSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, FoxSpaceBoots);
		
		//Auzzy Spacesuit
		RecipeVariables AuzzySpaceHelmet = new RecipeVariables();
		AuzzySpaceHelmet.setInput(new ItemStack(ModItems.AuzzySpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AuzzySpaceHelmet);
		
		RecipeVariables AuzzySpaceChestplate = new RecipeVariables();
		AuzzySpaceChestplate.setInput(new ItemStack(ModItems.AuzzySpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AuzzySpaceChestplate);
		
		RecipeVariables AuzzySpaceLeggings = new RecipeVariables();
		AuzzySpaceLeggings.setInput(new ItemStack(ModItems.AuzzySpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AuzzySpaceLeggings);
		
		RecipeVariables AuzzySpaceBoots = new RecipeVariables();
		AuzzySpaceBoots.setInput(new ItemStack(ModItems.AuzzySpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AuzzySpaceBoots);
		
		//Spacesuit
		RecipeVariables SpaceHelmet = new RecipeVariables();
		SpaceHelmet.setInput(new ItemStack(ModItems.SpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, SpaceHelmet);
		
		RecipeVariables SpaceChestplate = new RecipeVariables();
		SpaceChestplate.setInput(new ItemStack(ModItems.SpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, SpaceChestplate);
		
		RecipeVariables SpaceLeggings = new RecipeVariables();
		SpaceLeggings.setInput(new ItemStack(ModItems.SpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, SpaceLeggings);
		
		RecipeVariables SpaceBoots = new RecipeVariables();
		SpaceBoots.setInput(new ItemStack(ModItems.SpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, SpaceBoots);
		
		//CP Spacesuit
		RecipeVariables CPSpaceHelmet = new RecipeVariables();
		CPSpaceHelmet.setInput(new ItemStack(ModItems.CPSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, CPSpaceHelmet);
		
		RecipeVariables CPSpaceChestplate = new RecipeVariables();
		CPSpaceChestplate.setInput(new ItemStack(ModItems.CPSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, CPSpaceChestplate);
		
		RecipeVariables CPSpaceLeggings = new RecipeVariables();
		CPSpaceLeggings.setInput(new ItemStack(ModItems.CPSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, CPSpaceLeggings);
		
		RecipeVariables CPSpaceBoots = new RecipeVariables();
		CPSpaceBoots.setInput(new ItemStack(ModItems.CPSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, CPSpaceBoots);
		
		//Kerbal Spacesuit
		RecipeVariables KerbalSpaceHelmet = new RecipeVariables();
		KerbalSpaceHelmet.setInput(new ItemStack(ModItems.KerbalSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, KerbalSpaceHelmet);
		
		RecipeVariables KerbalSpaceChestplate = new RecipeVariables();
		KerbalSpaceChestplate.setInput(new ItemStack(ModItems.KerbalSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, KerbalSpaceChestplate);
		
		RecipeVariables KerbalSpaceLeggings = new RecipeVariables();
		KerbalSpaceLeggings.setInput(new ItemStack(ModItems.KerbalSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, KerbalSpaceLeggings);
		
		RecipeVariables KerbalSpaceBoots = new RecipeVariables();
		KerbalSpaceBoots.setInput(new ItemStack(ModItems.KerbalSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, KerbalSpaceBoots);
		
		
		//Adventure Spacesuit
		RecipeVariables AdventureSpaceHelmet = new RecipeVariables();
		AdventureSpaceHelmet.setInput(new ItemStack(ModItems.AdventureSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AdventureSpaceHelmet);
		
		RecipeVariables AdventureSpaceChestplate = new RecipeVariables();
		AdventureSpaceChestplate.setInput(new ItemStack(ModItems.AdventureSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AdventureSpaceChestplate);
		
		RecipeVariables AdventureSpaceLeggings = new RecipeVariables();
		AdventureSpaceLeggings.setInput(new ItemStack(ModItems.AdventureSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AdventureSpaceLeggings);
		
		RecipeVariables AdventureSpaceBoots = new RecipeVariables();
		AdventureSpaceBoots.setInput(new ItemStack(ModItems.AdventureSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, AdventureSpaceBoots);
		
		//LapisTech Spacesuit
		RecipeVariables LapisTechSpaceHelmet = new RecipeVariables();
		LapisTechSpaceHelmet.setInput(new ItemStack(ModItems.LapisTechSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisTechSpaceHelmet);
		
		RecipeVariables LapisTechSpaceChestplate = new RecipeVariables();
		LapisTechSpaceChestplate.setInput(new ItemStack(ModItems.LapisTechSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisTechSpaceChestplate);
		
		RecipeVariables LapisTechSpaceLeggings = new RecipeVariables();
		LapisTechSpaceLeggings.setInput(new ItemStack(ModItems.LapisTechSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisTechSpaceLeggings);
		
		RecipeVariables LapisTechSpaceBoots = new RecipeVariables();
		LapisTechSpaceBoots.setInput(new ItemStack(ModItems.LapisTechSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisTechSpaceBoots);
		
		//DiamondTech Spacesuit
		RecipeVariables DiamondTechSpaceHelmet = new RecipeVariables();
		DiamondTechSpaceHelmet.setInput(new ItemStack(ModItems.DiamondTechSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, DiamondTechSpaceHelmet);
		
		RecipeVariables DiamondTechSpaceChestplate = new RecipeVariables();
		DiamondTechSpaceChestplate.setInput(new ItemStack(ModItems.DiamondTechSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, DiamondTechSpaceChestplate);
		
		RecipeVariables DiamondTechSpaceLeggings = new RecipeVariables();
		DiamondTechSpaceLeggings.setInput(new ItemStack(ModItems.DiamondTechSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, DiamondTechSpaceLeggings);
		
		RecipeVariables DiamondTechSpaceBoots = new RecipeVariables();
		DiamondTechSpaceBoots.setInput(new ItemStack(ModItems.DiamondTechSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, DiamondTechSpaceBoots);
		
		//EmeraldTech Spacesuit
		RecipeVariables EmeraldTechSpaceHelmet = new RecipeVariables();
		EmeraldTechSpaceHelmet.setInput(new ItemStack(ModItems.EmeraldTechSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldTechSpaceHelmet);
		
		RecipeVariables EmeraldTechSpaceChestplate = new RecipeVariables();
		EmeraldTechSpaceChestplate.setInput(new ItemStack(ModItems.EmeraldTechSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldTechSpaceChestplate);
		
		RecipeVariables EmeraldTechSpaceLeggings = new RecipeVariables();
		EmeraldTechSpaceLeggings.setInput(new ItemStack(ModItems.EmeraldTechSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldTechSpaceLeggings);
		
		RecipeVariables EmeraldTechSpaceBoots = new RecipeVariables();
		EmeraldTechSpaceBoots.setInput(new ItemStack(ModItems.EmeraldTechSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldTechSpaceBoots);
		
		//RedstoneTech Spacesuit
		RecipeVariables RedstoneTechSpaceHelmet = new RecipeVariables();
		RedstoneTechSpaceHelmet.setInput(new ItemStack(ModItems.RedstoneTechSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, RedstoneTechSpaceHelmet);
		
		RecipeVariables RedstoneTechSpaceChestplate = new RecipeVariables();
		RedstoneTechSpaceChestplate.setInput(new ItemStack(ModItems.RedstoneTechSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, RedstoneTechSpaceChestplate);
		
		RecipeVariables RedstoneTechSpaceLeggings = new RecipeVariables();
		RedstoneTechSpaceLeggings.setInput(new ItemStack(ModItems.RedstoneTechSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, RedstoneTechSpaceLeggings);
		
		RecipeVariables RedstoneTechSpaceBoots = new RecipeVariables();
		RedstoneTechSpaceBoots.setInput(new ItemStack(ModItems.RedstoneTechSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, RedstoneTechSpaceBoots);
		
		//Lapis Armor
		RecipeVariables LapisHelmet = new RecipeVariables();
		LapisHelmet.setInput(new ItemStack(ModItems.LapisHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisHelmet);
		
		RecipeVariables LapisChestplate = new RecipeVariables();
		LapisChestplate.setInput(new ItemStack(ModItems.LapisChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisChestplate);
		
		RecipeVariables LapisLeggings = new RecipeVariables();
		LapisLeggings.setInput(new ItemStack(ModItems.LapisLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisLeggings);
		
		RecipeVariables LapisBoots = new RecipeVariables();
		LapisBoots.setInput(new ItemStack(ModItems.LapisBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisBoots);
		
		//Lapis Armor Heavy
		RecipeVariables LapisHelmetHeavy = new RecipeVariables();
		LapisHelmetHeavy.setInput(new ItemStack(ModItems.LapisHelmetHeavy));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisHelmetHeavy);
		
		RecipeVariables LapisChestplateHeavy = new RecipeVariables();
		LapisChestplate.setInput(new ItemStack(ModItems.LapisChestplateHeavy));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisChestplateHeavy);
		
		RecipeVariables LapisLeggingsHeavy = new RecipeVariables();
		LapisLeggings.setInput(new ItemStack(ModItems.LapisLeggingsHeavy));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisLeggingsHeavy);
		
		RecipeVariables LapisBootsHeavy = new RecipeVariables();
		LapisBoots.setInput(new ItemStack(ModItems.LapisBootsHeavy));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, LapisBootsHeavy);
		
		//Emerald Armor
		RecipeVariables EmeraldHelmet = new RecipeVariables();
		EmeraldHelmet.setInput(new ItemStack(ModItems.EmeraldHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldHelmet);
		
		RecipeVariables EmeraldChestplate = new RecipeVariables();
		EmeraldChestplate.setInput(new ItemStack(ModItems.EmeraldChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldChestplate);
		
		RecipeVariables EmeraldLeggings = new RecipeVariables();
		EmeraldLeggings.setInput(new ItemStack(ModItems.EmeraldLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldLeggings);
		
		RecipeVariables EmeraldBoots = new RecipeVariables();
		EmeraldBoots.setInput(new ItemStack(ModItems.EmeraldBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, EmeraldBoots);
		
		//Hazmat Suit
		RecipeVariables HazmatHelmet = new RecipeVariables();
		HazmatHelmet.setInput(new ItemStack(ModItems.HazmatHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, HazmatHelmet);
		
		RecipeVariables HazmatChestplate = new RecipeVariables();
		HazmatChestplate.setInput(new ItemStack(ModItems.HazmatChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, HazmatChestplate);
		
		RecipeVariables HazmatLeggings = new RecipeVariables();
		HazmatLeggings.setInput(new ItemStack(ModItems.HazmatLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, HazmatLeggings);
		
		RecipeVariables HazmatBoots = new RecipeVariables();
		HazmatBoots.setInput(new ItemStack(ModItems.HazmatBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, HazmatBoots);
		
		//PlanetesSpace Suit
		RecipeVariables PlanetesSpaceHelmet = new RecipeVariables();
		PlanetesSpaceHelmet.setInput(new ItemStack(ModItems.PlanetesSpaceHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, PlanetesSpaceHelmet);
		
		RecipeVariables PlanetesSpaceChestplate = new RecipeVariables();
		PlanetesSpaceChestplate.setInput(new ItemStack(ModItems.PlanetesSpaceChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, PlanetesSpaceChestplate);
		
		RecipeVariables PlanetesSpaceLeggings = new RecipeVariables();
		PlanetesSpaceLeggings.setInput(new ItemStack(ModItems.PlanetesSpaceLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, PlanetesSpaceLeggings);
		
		RecipeVariables PlanetesSpaceBoots = new RecipeVariables();
		PlanetesSpaceBoots.setInput(new ItemStack(ModItems.PlanetesSpaceBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, PlanetesSpaceBoots);
		
		//Titanium Armor
		RecipeVariables TitaniumHelmet = new RecipeVariables();
		TitaniumHelmet.setInput(new ItemStack(ModItems.TitaniumHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, TitaniumHelmet);
		
		RecipeVariables TitaniumChestplate = new RecipeVariables();
		TitaniumChestplate.setInput(new ItemStack(ModItems.TitaniumChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, TitaniumChestplate);
		
		RecipeVariables TitaniumLeggings = new RecipeVariables();
		TitaniumLeggings.setInput(new ItemStack(ModItems.TitaniumLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, TitaniumLeggings);
		
		RecipeVariables TitaniumBoots = new RecipeVariables();
		TitaniumBoots.setInput(new ItemStack(ModItems.TitaniumBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, TitaniumBoots);
		
		//Odst Armor
		RecipeVariables OdstHelmet = new RecipeVariables();
		OdstHelmet.setInput(new ItemStack(ModItems.OdstHelmet));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, OdstHelmet);
		
		RecipeVariables OdstChestplate = new RecipeVariables();
		OdstChestplate.setInput(new ItemStack(ModItems.OdstChestplate));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, OdstChestplate);
		
		RecipeVariables OdstLeggings = new RecipeVariables();
		OdstLeggings.setInput(new ItemStack(ModItems.OdstLeggings));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, OdstLeggings);
		
		RecipeVariables OdstBoots = new RecipeVariables();
		OdstBoots.setInput(new ItemStack(ModItems.OdstBoots));
		registry.registerRecipe(RecipeType.WASHING_MACHINE, OdstBoots);
		
		//Scarlet
		RecipeVariables Scarlet = new RecipeVariables();
		Scarlet.setInput(new ItemStack(ModItems.Scarlet));
		registry.registerRecipe(RecipeType.DISHWASHER, Scarlet);
		
		//TitaniumHammer
		RecipeVariables TitaniumHammer = new RecipeVariables();
		TitaniumHammer.setInput(new ItemStack(ModItems.TitaniumHammer));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumHammer);
		
		//CraftingHammer
		RecipeVariables CraftingHammer = new RecipeVariables();
		CraftingHammer.setInput(new ItemStack(ModItems.CraftingHammer));
		registry.registerRecipe(RecipeType.DISHWASHER, CraftingHammer);
		
		//TitaniumSword
		RecipeVariables TitaniumSword = new RecipeVariables();
		TitaniumSword.setInput(new ItemStack(ModItems.TitaniumSword));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumSword);
		
		//TitaniumHoe
		RecipeVariables TitaniumHoe = new RecipeVariables();
		TitaniumHoe.setInput(new ItemStack(ModItems.TitaniumHoe));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumHoe);
		
		//TitaniumShovel
		RecipeVariables TitaniumShovel = new RecipeVariables();
		TitaniumShovel.setInput(new ItemStack(ModItems.TitaniumShovel));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumShovel);
		
		//TitaniumPickaxe
		RecipeVariables TitaniumPickaxe = new RecipeVariables();
		TitaniumPickaxe.setInput(new ItemStack(ModItems.TitaniumPickaxe));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumPickaxe);
		
		//TitaniumAxe
		RecipeVariables TitaniumAxe = new RecipeVariables();
		TitaniumAxe.setInput(new ItemStack(ModItems.TitaniumAxe));
		registry.registerRecipe(RecipeType.DISHWASHER, TitaniumAxe);
		
		//LapisSword
		RecipeVariables LapisSword = new RecipeVariables();
		LapisSword.setInput(new ItemStack(ModItems.LapisSword));
		registry.registerRecipe(RecipeType.DISHWASHER, LapisSword);
		
		//LapisHoe
		RecipeVariables LapisHoe = new RecipeVariables();
		LapisHoe.setInput(new ItemStack(ModItems.LapisHoe));
		registry.registerRecipe(RecipeType.DISHWASHER, LapisHoe);
		
		//LapisShovel
		RecipeVariables LapisShovel = new RecipeVariables();
		LapisShovel.setInput(new ItemStack(ModItems.LapisShovel));
		registry.registerRecipe(RecipeType.DISHWASHER, LapisShovel);
		
		//LapisPickaxe
		RecipeVariables LapisPickaxe = new RecipeVariables();
		LapisPickaxe.setInput(new ItemStack(ModItems.LapisPickaxe));
		registry.registerRecipe(RecipeType.DISHWASHER, LapisPickaxe);
		
		//LapisAxe
		RecipeVariables LapisAxe = new RecipeVariables();
		LapisAxe.setInput(new ItemStack(ModItems.LapisAxe));
		registry.registerRecipe(RecipeType.DISHWASHER, LapisAxe);
		
		//EmeraldSword
		RecipeVariables EmeraldSword = new RecipeVariables();
		EmeraldSword.setInput(new ItemStack(ModItems.EmeraldSword));
		registry.registerRecipe(RecipeType.DISHWASHER, EmeraldSword);
		
		//EmeraldHoe
		RecipeVariables EmeraldHoe = new RecipeVariables();
		EmeraldHoe.setInput(new ItemStack(ModItems.EmeraldHoe));
		registry.registerRecipe(RecipeType.DISHWASHER, EmeraldHoe);
		
		//EmeraldShovel
		RecipeVariables EmeraldShovel = new RecipeVariables();
		EmeraldShovel.setInput(new ItemStack(ModItems.EmeraldShovel));
		registry.registerRecipe(RecipeType.DISHWASHER, EmeraldShovel);
		
		//EmeraldPickaxe
		RecipeVariables EmeraldPickaxe = new RecipeVariables();
		EmeraldPickaxe.setInput(new ItemStack(ModItems.EmeraldPickaxe));
		registry.registerRecipe(RecipeType.DISHWASHER, EmeraldPickaxe);
		
		//EmeraldAxe
		RecipeVariables EmeraldAxe = new RecipeVariables();
		EmeraldAxe.setInput(new ItemStack(ModItems.EmeraldAxe));
		registry.registerRecipe(RecipeType.DISHWASHER, EmeraldAxe);
		
		//TitaniumShovel
		RecipeVariables AstroHammer = new RecipeVariables();
		AstroHammer.setInput(new ItemStack(ModTools.AstroHammer));
		registry.registerRecipe(RecipeType.DISHWASHER, AstroHammer);
		
		


	}

}
