package main.cybernetics;

/*
 * Check all the classes for (hopefully) detailed descriptions of what it does. There will also be tidbits of comments throughout the codebase.
 * If you wish to add a description to a class, or extend/change an existing one, submit a PR with your changes.
 */

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import main.cybernetics.blocks.BlockRecipeRegistry;
import main.cybernetics.blocks.BlockRegistry;
import main.cybernetics.client.gui.CreativeTabCybernetics;
import main.cybernetics.client.gui.GuiHandler;
import main.cybernetics.items.ItemRecipeRegistry;
import main.cybernetics.items.ItemRegistry;
import main.cybernetics.proxies.CommonProxy;
import main.cybernetics.simpleArmor.SimpleArmorMaterials;
import main.cybernetics.simpleArmor.SimpleArmorTextures;
import main.cybernetics.simpleTools.SimpleToolsMaterials;
import main.cybernetics.util.EventHandler;
import main.cybernetics.util.GenerationHandler;
import main.cybernetics.util.OreDictHandler;
import main.cybernetics.util.TextHelper;
import net.minecraft.creativetab.CreativeTabs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION, dependencies = ModInformation.DEPEND, guiFactory = ModInformation.GUIFACTORY)
public class cybernetics {

    @SidedProxy(clientSide = ModInformation.CLIENTPROXY, serverSide = ModInformation.COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabCybernetics = new CreativeTabCybernetics("Cybernetics");
    public static Logger logger = LogManager.getLogger(ModInformation.NAME);

    @Mod.Instance
    public static cybernetics instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.load.preInit"));

        ConfigHandler.init(event.getSuggestedConfigurationFile());

        ItemRegistry.registerItems();
        BlockRegistry.registerBlocks();
        SimpleArmorMaterials.addItems();
        SimpleToolsMaterials.addItems();
        

        OreDictHandler.registerOreDict();
        FMLCommonHandler.instance().bus().register(new EventHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        GameRegistry.registerWorldGenerator(new GenerationHandler(), 2);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.load.init"));

        ItemRecipeRegistry.registerItemRecipes();
        BlockRecipeRegistry.registerBlockRecipes();
        SimpleArmorMaterials.addRecipes();
        SimpleToolsMaterials.addRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.load.postInit"));
    }
}
