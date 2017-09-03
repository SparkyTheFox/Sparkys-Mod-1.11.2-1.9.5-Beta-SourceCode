package mod.sparkyfox.servermod.world;

import java.util.Random;

import com.google.common.base.Predicate;

import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) //Monster string
	{
		int dimension = world.provider.getDimension(); //get the dimension ID 0=overworld, nether = -1 and end = 1
		{
			if (dimension == 0) //two =, you can also do greater than/less than with =< and => but thats a bad idea
			{
				 genSurfaceOverworld(world, random, chunkX * 16, chunkZ * 16); //each one of these calls one of the methods

				 
			}
			if (dimension == -1)
			{
				
				//nether genSurfaceNether(world, random, chunkX * 16, chunkZ * 16); //each one of these calls one of the methods
				
			}
			if (dimension == 1)
			{
				
				//end genSurfaceEnd(world, random, chunkX * 16, chunkZ * 16); //each one of these calls one of the methods
				
			}
		}
		
	}
	private void genSurfaceOverworld(World world, Random random, int chunkX, int chunkZ)
	{
		 addOreSpawn(ModBlocks.TitaniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 10, 8, 1, 70, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.BrassOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 8, 10, 1, 128, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value 
		 addOreSpawn(ModBlocks.NickelOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 9, 20, 1, 64, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.CobaltOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 9, 3, 1, 36, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.MagnesiumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 9, 7, 1, 20, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.SiliconOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 12, 4, 1, 100, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.PlatinumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 4, 1, 18, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.UraniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 6, 1, 30, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		 addOreSpawn(ModBlocks.TechiteOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 1, 1, 20, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
		}
	 private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) //world generator. make sure to register in clientproxy, use GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);.
	 {
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
		  }
	 }
}

/**



package mod.neptune.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreNeptuneWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case 20:
		generateNeptune(world, random, chunkZ, chunkZ);
		break;
	
		}
	}
	
	public void generateNeptune(World world, Random rand, int chunkX, int chunkZ)
	{
		
			//30 veins of ore chunk\\
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to y = 64\\
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(55); //height of ore found\\
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 Blocks per vein\\
			(new WorldGenMinable(NeptuneMod.FrozenCrystalOre.blockID, 40)).generate(world, rand,
			randPosX, randPosY, randPosZ);
	}
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to y = 64\\
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(50); //height of ore found\\
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 Blocks per vein\\
			(new WorldGenMinable(NeptuneMod.FrozenPlatinumOre.blockID, 40)).generate(world, rand,
			randPosX, randPosY, randPosZ);
			}
		
			//30 veins of ore chunk\\
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to y = 64\\
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40); //height of ore found\\
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 Blocks per vein\\
			(new WorldGenMinable(NeptuneMod.CrystalOre.blockID, 40)).generate(world, rand,
			randPosX, randPosY, randPosZ);
	}	
	
			//30 veins of ore chunk\\
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to y = 64\\
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(45); //height of ore found\\
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 Blocks per vein\\
			(new WorldGenMinable(NeptuneMod.CrystalOre.blockID, 40)).generate(world, rand,
			randPosX, randPosY, randPosZ);
	}		
		
			//30 veins of ore chunk\\
		for (int i = 0; i < 30; i++)
		{
			//16x16 area up to y = 64\\
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(35); //height of ore found\\
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 Blocks per vein\\
			(new WorldGenMinable(NeptuneMod.Savierite.blockID, 40)).generate(world, rand,
			randPosX, randPosY, randPosZ);
	}	
	
	}
			
	}
	
*/


/**
 *          public int coalSize = 17; Vein Size
            public int coalCount = 20; Rarity
            public int coalMinHeight; Min height
            public int coalMaxHeight = 128; Max Height
            
            public int ironSize = 9; Vein Size
            public int ironCount = 20; Rarity
            public int ironMinHeight; Min height
            public int ironMaxHeight = 64; Max Height
            
            public int goldSize = 9; Vein Size
            public int goldCount = 2; Rarity
            public int goldMinHeight; Min height
            public int goldMaxHeight = 32; Max Height
            
            public int redstoneSize = 8; Vein Size
            public int redstoneCount = 8; Rarity
            public int redstoneMinHeight; Min height
            public int redstoneMaxHeight = 16;Max Height
            
            public int diamondSize = 8; Vein Size
            public int diamondCount = 1; Rarity
            public int diamondMinHeight; Min height
            public int diamondMaxHeight = 16; Max Height
            
            public int lapisSize = 7; Vein Size
            public int lapisCount = 1; Rarity
            public int lapisCenterHeight = 16; 
            public int lapisSpread = 16; 
 */
