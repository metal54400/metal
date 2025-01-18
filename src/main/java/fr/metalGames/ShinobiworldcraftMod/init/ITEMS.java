package fr.metalGames.ShinobiworldcraftMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.metalGames.ShinobiworldcraftMod.Main;
import fr.metalGames.ShinobiworldcraftMod.init.ArmorMaterials.ToolMaterialMod;
import fr.metalGames.ShinobiworldcraftMod.init.Items.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ITEMS {
    //Item Armor
    public static Item titane_helmet;
    public static Item titane_chestplate;
    public static Item titane_leggings;
    public static Item titane_boots;

    public static Item netherite_helmet;
    public static Item netherite_chestplate;
    public static Item netherite_leggings;
    public static Item netherite_boots;
    //Item Tool
    public static Item titane_pickaxe;
    public static Item titane_shovel;
    public static Item Titane_sword;

    public static Item netherite_pickaxe;
    public static Item netherite_shovel;
    public static Item netherite_sword;
    public static Item netherite_axe;
    public static Item netherite_hoe;


    //item Basic
    public static Item titane;
    public static Item ruby;
    public static Item Enderite_Ingot;
    public static Item netherite_ingot;
    public static Item prismarine_crystals;
    public static Item prismarine_shard;
    public static Item Iranium;
    public static Item amethyst_ingot;

    //food
    public static Item Nuggets;


    public static void init()
    {
        //Item tool
        titane_pickaxe = (new ItemsPickaxe(Item.ToolMaterial.EMERALD)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_pickaxe").setTextureName("metalserver:titane_pickaxe");
        titane_shovel = new ItemsShowel(Item.ToolMaterial.EMERALD).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_shovel").setTextureName("metalserver:titane_shovel");
        Titane_sword = (new ItemsSword(Item.ToolMaterial.EMERALD)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("Titane_sword").setTextureName("metalserver:titane_sword");

        netherite_pickaxe = new ItemsPickaxe(Item.ToolMaterial.EMERALD).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_pickaxe").setTextureName("metalserver:netherite_pickaxe");
        netherite_shovel = new ItemsShowel(Item.ToolMaterial.EMERALD).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_shovel").setTextureName("metalserver:netherite_shovel");
        netherite_sword = (new ItemsSword(Item.ToolMaterial.EMERALD)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_sword").setTextureName("metalserver:netherite_sword");
        netherite_axe = new ItemsAxe(Item.ToolMaterial.EMERALD).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_axe").setTextureName("metalserver:netherite_axe");
        netherite_hoe = (new ItemsHoe(Item.ToolMaterial.EMERALD)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_hoe").setTextureName("metalserver:netherite_hoe");


        //Item Armor
        titane_helmet = (new TitaneArmor(ToolMaterialMod.titane, 0, 0)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_helmet").setTextureName("metalserver:titane_helmet");
        titane_chestplate = (new TitaneArmor(ToolMaterialMod.titane, 0, 1)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_chestplate").setTextureName("metalserver:titane_chestplate");
        titane_leggings = (new TitaneArmor(ToolMaterialMod.titane, 0, 2)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_leggings").setTextureName("metalserver:titane_leggings");
        titane_boots = (new TitaneArmor(ToolMaterialMod.titane, 0, 3)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("titane_boots").setTextureName("metalserver:titane_boots");

        netherite_helmet = (new netheriteArmor(ToolMaterialMod.netherite, 1, 0)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_helmet").setTextureName("metalserver:netherite_helmet");
        netherite_chestplate = (new netheriteArmor(ToolMaterialMod.netherite, 1, 1)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_chestplate").setTextureName("metalserver:netherite_chestplate");
        netherite_leggings = (new netheriteArmor(ToolMaterialMod.netherite, 1, 2)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_leggings").setTextureName("metalserver:netherite_leggings");
        netherite_boots = (new netheriteArmor(ToolMaterialMod.netherite, 1, 3)).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_boots").setTextureName("metalserver:netherite_boots");

        //item basic

        Iranium = new Item().setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("Iranium").setTextureName(Main.MODID + ":Iranium");

        amethyst_ingot = new Item().setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("amethyst_ingot").setTextureName(Main.MODID + ":amethyst_ingot");

        Enderite_Ingot = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("Enderite_Ingot").setTextureName(Main.MODID + ":Enderite_Ingot");

        titane = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("Titane").setTextureName(Main.MODID + ":titane");

        netherite_ingot = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("netherite_ingot").setTextureName(Main.MODID + ":netherite_ingot");

        ruby = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("ruby").setTextureName("ruby");

        prismarine_crystals = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("prismarine_crystals").setTextureName(Main.MODID + ":prismarine_crystals");

        prismarine_shard = (new Item()).setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("prismarine_shard").setTextureName(Main.MODID + ":prismarine_shard");

        //foods

        Nuggets = new ItemsFood(10,10, false).setAlwaysEdible().setCreativeTab(Main.MetalForgeTab).setUnlocalizedName("Nuggets").setTextureName(Main.MODID + ":Nuggets");
    }
    public static void register()
    {
        //Armor Item
        GameRegistry.registerItem(titane_helmet, "titane_helmet");
        GameRegistry.registerItem(titane_chestplate, "titane_chestplate");
        GameRegistry.registerItem(titane_leggings, "titane_leggings");
        GameRegistry.registerItem(titane_boots, "titane_boots");

        GameRegistry.registerItem(netherite_helmet, "netherite_helmet");
        GameRegistry.registerItem(netherite_chestplate, "netherite_chestplate");
        GameRegistry.registerItem(netherite_leggings, "netherite_leggings");
        GameRegistry.registerItem(netherite_boots, "netherite_boots");


        //item tool
        GameRegistry.registerItem(titane_shovel, "titane_shovel");
        GameRegistry.registerItem(titane_pickaxe, "titane_pickaxe");
        GameRegistry.registerItem(Titane_sword, "Titane_sword");

        GameRegistry.registerItem(netherite_shovel, "netherite_shovel");
        GameRegistry.registerItem(netherite_pickaxe, "netherite_pickaxe");
        GameRegistry.registerItem(netherite_sword, "netherite_sword");
        GameRegistry.registerItem(netherite_axe, "netherite_axe");
        GameRegistry.registerItem(netherite_hoe, "netherite_hoe");


        //food
        GameRegistry.registerItem(Nuggets," Nuggets");



        //item basic
        GameRegistry.registerItem(Iranium,"Iranium");
        GameRegistry.registerItem(titane, "Titane");
        GameRegistry.registerItem(prismarine_shard, "prismarine_shard");
        GameRegistry.registerItem(prismarine_crystals, "prismarine_crystals");
        GameRegistry.registerItem(netherite_ingot, "netherite_ingot");
        GameRegistry.registerItem(Enderite_Ingot, "Enderite_Ingot");
        GameRegistry.registerItem(ruby, "ruby");
        GameRegistry.registerItem(amethyst_ingot, "amethyst_ingot");





        //Resipes Armor
        GameRegistry.addRecipe(new ItemStack(ITEMS.titane_boots), new Object[]{"X X", "X X", 'X', new ItemStack(ITEMS.titane)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.titane_helmet), new Object[]{"XXX", "X X", 'X', new ItemStack(ITEMS.titane)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.titane_chestplate), new Object[]{"X X", "XXX", "XXX", 'X', new ItemStack(ITEMS.titane)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.titane_leggings), new Object[]{"XXX", "X X", "X X", 'X', new ItemStack(ITEMS.titane)});

        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_boots), new Object[]{"X X", "X X", 'X', new ItemStack(ITEMS.netherite_ingot)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_helmet), new Object[]{"XXX", "X X", 'X', new ItemStack(ITEMS.netherite_ingot)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_chestplate), new Object[]{"X X", "XXX", "XXX", 'X', new ItemStack(ITEMS.netherite_ingot)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_leggings), new Object[]{"XXX", "X X", "X X", 'X', new ItemStack(ITEMS.netherite_ingot)});


        //Recipes tool
        GameRegistry.addRecipe(new ItemStack(ITEMS.titane_pickaxe, 1), new Object[]{"XXX", " Y ", " Y ", 'X', new ItemStack(ITEMS.titane), 'Y', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_pickaxe, 1), new Object[]{"XXX", " Y ", " Y ", 'X', new ItemStack(ITEMS.netherite_ingot), 'Y', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_axe, 1), new Object[]{" XX", " ZX", " Z ", 'X', new ItemStack(ITEMS.netherite_ingot), 'Z', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_axe, 1), new Object[]{"XX ", "XZ ", " Z ", 'X', new ItemStack(ITEMS.netherite_ingot), 'Z', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_hoe, 1), new Object[]{"XX ", "XZ ", " Z ", 'X', new ItemStack(BlockMod.netherite_block), 'Z', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.Titane_sword, 1), new Object[]{"X", "X", "Y", 'X', new ItemStack(ITEMS.titane), 'Y', new ItemStack(Items.stick)});
        GameRegistry.addRecipe(new ItemStack(ITEMS.netherite_shovel, 1), new Object[]{"X", "Z", "Z", 'X', new ItemStack(ITEMS.netherite_ingot), 'Z', new ItemStack(Items.stick)});



        //Recipes item basic
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.netherite_ingot, 9), new Object[]{new ItemStack(BlockMod.netherite_block, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.titane, 9), new Object[]{new ItemStack(BlockMod.Titane_block, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.Enderite_Ingot, 9), new Object[]{new ItemStack(BlockMod.enderite_block, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.ruby, 9), new Object[]{new ItemStack(BlockMod.Ruby_block, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.Iranium, 9), new Object[]{new ItemStack(BlockMod.Iraniumblock, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.prismarine_crystals, 9), new Object[]{new ItemStack(BlockMod.sea_lantern, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ITEMS.prismarine_shard, 9), new Object[]{new ItemStack(BlockMod.prismarine_rough, 1)});



        //Smelt
        GameRegistry.addSmelting(new ItemStack(BlockMod.ancient_debris), new ItemStack(ITEMS.netherite_ingot), 0.1F);
        GameRegistry.addSmelting(new ItemStack(BlockMod.AmethystOre), new ItemStack(ITEMS.amethyst_ingot), 0.1F);
        GameRegistry.addSmelting(new ItemStack(BlockMod.enderite_ore), new ItemStack(ITEMS.Enderite_Ingot), 0.1F);
        GameRegistry.addSmelting(new ItemStack(BlockMod.Ruby_ore), new ItemStack(ITEMS.ruby), 0.1F);
        GameRegistry.addSmelting(new ItemStack(BlockMod.Titane_ore), new ItemStack(ITEMS.titane), 0.1F);
        GameRegistry.addSmelting(new ItemStack(BlockMod.oreIranium), new ItemStack(ITEMS.Iranium), 0.1F);


        //Spetial
        GameRegistry.addRecipe(new ItemStack(ITEMS.Nuggets), new Object[] {"##", "##", '#', ITEMS.Iranium});
        GameRegistry.addRecipe(new ItemStack(BlockMod.IraniumChest), new Object[] {"###", "# #", "###", '#', ITEMS.Iranium});
    }
    }



