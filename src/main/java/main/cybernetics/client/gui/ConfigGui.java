package main.cybernetics.client.gui;

/*
 * Creates a config GUI for your mod. This requires an mcmod.info file with the correct modid. These are dummy sections that don't do anything.
 */

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import main.cybernetics.ModInformation;
import main.cybernetics.util.TextHelper;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

import static main.cybernetics.ConfigHandler.*;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), ModInformation.ID, false, false, TextHelper.localize("gui." + ModInformation.ID + ".config.title"));
    }

    @SuppressWarnings("rawtypes")
    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        // adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we.
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(SimpleArmorConfig.toLowerCase())));
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(OreConfig.toLowerCase())));

        return list;
    }
}