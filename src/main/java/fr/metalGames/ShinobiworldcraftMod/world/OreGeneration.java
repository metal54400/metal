package fr.metalGames.ShinobiworldcraftMod.world;

import cpw.mods.fml.common.IWorldGenerator;
import fr.metalGames.ShinobiworldcraftMod.init.BlockMod;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {
    public OreGeneration() {
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            default:
                break;
        }
    }

    private void generateSurface(World world, Random random, int x, int z) {
        addOreSpawn(BlockMod.ancient_debris, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 16);
        addOreSpawn(BlockMod.Titane_ore, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 69);
        addOreSpawn(BlockMod.Ruby_ore, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 59);
        addOreSpawn(BlockMod.enderite_ore, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 69);
        addOreSpawn(BlockMod.oreIranium, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 59);
        addOreSpawn(BlockMod.AmethystOre, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 59);
    }

    private void generateEnd(World world, Random random, int x, int z) {
        addOreSpawn(BlockMod.enderite_ore, world, random, x, z, 16, 16, 1 + random.nextInt(5), 20, 1, 69);
    }

    private void generateNether(World world, Random random, int x, int z) {
        // Ajoutez ici la génération des minerais dans le Nether si nécessaire
    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        int diffBtwnMinMaxY = maxY - minY;

        for (int x = 0; x < chancesToSpawn; ++x) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}