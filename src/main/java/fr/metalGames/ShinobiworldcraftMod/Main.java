package fr.metalGames.ShinobiworldcraftMod;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.metalGames.ShinobiworldcraftMod.common.CommonProxy;
import fr.metalGames.ShinobiworldcraftMod.init.BlockMod;
import fr.metalGames.ShinobiworldcraftMod.init.ITEMS;
import fr.metalGames.ShinobiworldcraftMod.world.OreGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import org.lwjgl.opengl.Display;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static OreGeneration worldgen1 = new OreGeneration();
    public static final String MODID = "shinobiworldcraftmod";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "fr.metalGames.ShinobiworldcraftMod.Client.ClientProxy", serverSide = "fr.metalGames.ShinobiworldcraftMod.common.CommonProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        if(e.getSide().isClient()){
            Display.setTitle("ShinobiworldcraftMod");
        }
        BlockMod.init();
        BlockMod.register();
        ITEMS.init();
        ITEMS.register();
        GameRegistry.registerWorldGenerator(worldgen1, 1);

    }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    }
    @EventHandler
    public void PostInit(FMLPostInitializationEvent e)
    {

    }

    //CreativeTabs
    public static CreativeTabs MetalForgeTab = new CreativeTabs("MetalForgeTab")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ITEMS.titane;
        }
    };
}
