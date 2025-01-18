package fr.metalGames.ShinobiworldcraftMod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import fr.metalGames.ShinobiworldcraftMod.Main;
import fr.metalGames.ShinobiworldcraftMod.init.blocks.BlocChest;
import fr.metalGames.ShinobiworldcraftMod.init.blocks.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

import static net.minecraft.block.Block.soundTypeGlass;


public class BlockMod
{
    public static Block Iraniumblock;
    public static Block oreIranium;
    public static Block IraniumChest;
    public static Block Titane_block;
    public static Block Titane_ore;
    public static Block Ruby_ore;
    public static Block enderite_ore;
    public static Block Ruby_block;
    public static Block enderite_block;
    public static Block ancient_debris;
    public static Block netherite_block;
    public static Block sea_lantern;
    public static Block prismarine_rough;
    public static Block AmethystOre;



    public static void init()
    {   AmethystOre = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("shinobiworldcraftmod:Amethystore").setBlockName("AmethystOre");
        Ruby_block = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Main.MetalForgeTab).setBlockName("Ruby_block").setBlockTextureName("shinobiworldcraftmod:rubyblock");
        Titane_block = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Main.MetalForgeTab).setBlockName("Titane_Block").setBlockTextureName("shinobiworldcraftmod:TitaneBlock");
        enderite_block = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("shinobiworldcraftmod:enderiteblock").setBlockName("enderite_block");
        netherite_block = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("shinobiworldcraftmod:netheriteblock").setBlockName("netherite_block");
        enderite_ore = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("shinobiworldcraftmod:enderiteore").setBlockName("enderite_ore");
        Ruby_ore = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("shinobiworldcraftmod:rubyore").setBlockName("Rubyore");
        Titane_ore = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("metalserver:Titaneore").setBlockName("Titane_ore");
        ancient_debris = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName(Main.MODID +":ancientdebris").setBlockName("ancient_debris");

        prismarine_rough = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName(Main.MODID +":prismarinerough").setBlockName("prismarine_rough");

        sea_lantern = new blocks(Material.glass).setHardness(0.3F).setStepSound(soundTypeGlass).setLightLevel(1.0F).setBlockName("sea_lantern").setCreativeTab(Main.MetalForgeTab).setBlockTextureName("sealantern").setBlockTextureName(Main.MODID +":sea_lantern");


        oreIranium = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(Main.MetalForgeTab).setBlockTextureName("metalserver:Iraniumore").setBlockName("oreIranium");
        IraniumChest = new BlocChest(100).setStepSound(Block.soundTypeWood).setCreativeTab(Main.MetalForgeTab).setBlockName("IraniumChest").setBlockTextureName("metalserver:IraniumChest");
        Iraniumblock = new blocks(new Material(MapColor.ironColor)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Main.MetalForgeTab).setBlockTextureName(Main.MODID + ":Iraniumblock").setBlockName("Iraniumblock");
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(Titane_block, "Titane_block");
        GameRegistry.registerBlock(Titane_ore, "Titane_ore");
        GameRegistry.registerBlock(Ruby_ore, "Ruby_ore");
        GameRegistry.registerBlock(Ruby_block, "Ruby_block");
        GameRegistry.registerBlock(enderite_block, "enderite_block");
        GameRegistry.registerBlock(enderite_ore, "enderite_ore");
        GameRegistry.registerBlock(ancient_debris, "ancient_debris");
        GameRegistry.registerBlock(netherite_block, "netherite_block");
        GameRegistry.registerBlock(sea_lantern, "sea_lantern");
        GameRegistry.registerBlock(prismarine_rough, "prismarine_rough");
        GameRegistry.registerBlock(oreIranium, "oreIranium");
        GameRegistry.registerBlock(Iraniumblock, "Iraniumblock");
        GameRegistry.registerBlock(IraniumChest, "IraniumChest");
        GameRegistry.registerBlock(AmethystOre, "AmethystOre");


    }
}
