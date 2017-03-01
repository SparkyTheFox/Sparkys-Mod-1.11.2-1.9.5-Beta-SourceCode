package mod.sparkyfox.servermod.world;

import java.util.Random;

import com.google.common.base.Predicate;

import mod.sparkyfox.servermod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenOre implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) //Monster string
	{
		int dimension = world.provider.getDimension(); //get the dimension ID 0=overworld, nether = -1 and end = 1
		{
			if (dimension == 0) //two =, you can also do greater than/less than with =< and => but thats a bad idea
			{
				 genSurfaceTitanium(world, random, chunkX * 16, chunkZ * 16); //each one of these calls one of the methods

				 
			}
			if (dimension == -1)
			{
				
		
			}
		}
		
	}
	private void genSurfaceTitanium(World world, Random random, int chunkX, int chunkZ)
	{
		 addOreSpawn(ModBlocks.TitaniumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 10, 8, 10, 70, BlockMatcher.forBlock(Blocks.STONE)); //the set of numbers meanings are in order, maxX and maxZ in each chunk(leave at 16) max ore blocks per vein, spawn chance, minimum y value, maximum y value   
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