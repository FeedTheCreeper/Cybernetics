package main.cybernetics;

/*
 * Creation and usage of the config file.
 */

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    // Sections to add to the config
    public static String SimpleArmorConfig = "Simple Armor Configuration";
    public static String OreConfig = "Ore Configuration";

    // Simple Armor Configuration Options
    public static int[] simpleChromiumArmorReduction;
    public static int simpleChromiumArmorDurability;
    public static int simpleChromiumArmorEnchantability;
    
    // Block and Ore options
    public static int chromiteOreHardness;
    public static int chromiteOreHarvestability;
    public static String chromiteOreTool;
    
    public static int chromiumBlockHardness;
    public static int chromiumBlockHarvestability;
    public static String chromiumBlockTool;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
    	//Adding Configuration Sections
        config.addCustomCategoryComment(SimpleArmorConfig, "This section is for setting simple armor hardnesses and tool usages");
        config.addCustomCategoryComment(OreConfig, "This section is for setting ore hardness");
        
        //************************************************************************************************************************
        //********************************** ARMOR DURABILITY ********************************************************************
        //************************************************************************************************************************
        
        //Chromium Armor
        
        simpleChromiumArmorReduction = new int[4];
        simpleChromiumArmorReduction[0] = config.get(SimpleArmorConfig, "chromiumHelmetReduction", 0, "Chromium Helmet Reduction").getInt(simpleChromiumArmorReduction[0]);
        simpleChromiumArmorReduction[1] = config.get(SimpleArmorConfig, "chromiumChestplateReduction", 0, "Chromium Chestplate Reduction").getInt(simpleChromiumArmorReduction[1]);
        simpleChromiumArmorReduction[2] = config.get(SimpleArmorConfig, "chromiumLeggingsReduction", 0, "Chromium Leggings Reduction").getInt(simpleChromiumArmorReduction[2]);
        simpleChromiumArmorReduction[3] = config.get(SimpleArmorConfig, "chromiumBootsReduction", 0, "Chromium Boots Reduction").getInt(simpleChromiumArmorReduction[3]);
        simpleChromiumArmorDurability = config.get(SimpleArmorConfig, "simpleChromiumArmorDurability", 0, "Chromium Armor Durability").getInt(simpleChromiumArmorDurability);
        simpleChromiumArmorEnchantability = config.get(SimpleArmorConfig, "simpleChromiumArmorEnchantability", 0, "Chromium Armor Enchantability").getInt(simpleChromiumArmorEnchantability);
        
        
        
        //************************************************************************************************************************
        //******************************** BLOCK CONFIGURATION *******************************************************************
        //************************************************************************************************************************
        
        //Chromite Ore
        chromiteOreHardness = config.get(OreConfig, "chromiteOreHardness", 0, "Chromite Ore Hardness").getInt(chromiteOreHardness);
        chromiteOreHarvestability = config.get(OreConfig, "chromiteOreHarvestability", 0, "Chromite Ore Harvestability").getInt(chromiteOreHarvestability);
        chromiteOreTool = config.get(OreConfig, "chromiteOreTool", "pickaxe", "Chromite Ore Tool").getString();
        
        //Chromium Block
        chromiumBlockHardness = config.get(OreConfig, "chromiumBlockHardness", 0, "Chromium Block Hardness").getInt(chromiumBlockHardness);
        chromiumBlockHarvestability = config.get(OreConfig, "chromiumBlockHarvestability", 0, "Chromium Block Harvestability").getInt(chromiumBlockHarvestability);
        chromiumBlockTool = config.get(OreConfig, "chromiumBlockTool", "pickaxe", "Chromium Block Tool").getString();

        config.save();
    }
}
