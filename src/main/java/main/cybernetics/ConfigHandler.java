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
    public static String SimpleToolConfig = "Simple Tool Configuration";
    public static String OreConfig = "Ore Configuration";

    // Simple Armor Configuration Options
    public static int[] chromiumArmorReduction;
    public static int chromiumArmorDurability;
    public static int chromiumArmorEnchantability;
    
    // Simple Tools Configuration Options
    public static int chromiumToolHarvestLevel;
    public static int chromiumToolMaxUses;
    public static double chromiumToolEfficiency;
    public static int chromiumToolDamage;
    public static int chromiumToolEnchantability;
    
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
        config.addCustomCategoryComment(SimpleArmorConfig, "This section is for setting simple armor configuration");
        config.addCustomCategoryComment(SimpleToolConfig, "This section is for setting simple tool configuration");
        config.addCustomCategoryComment(OreConfig, "This section is for setting ore hardness");
        
        //************************************************************************************************************************
        //********************************** ARMOR CONFIGURATION *****************************************************************
        //************************************************************************************************************************
        
        //Chromium Armor
        chromiumArmorReduction = new int[4];
        chromiumArmorReduction[0] = config.get(SimpleArmorConfig, "chromiumHelmetReduction", 0, "Chromium Helmet Reduction").getInt(chromiumArmorReduction[0]);
        chromiumArmorReduction[1] = config.get(SimpleArmorConfig, "chromiumChestplateReduction", 0, "Chromium Chestplate Reduction").getInt(chromiumArmorReduction[1]);
        chromiumArmorReduction[2] = config.get(SimpleArmorConfig, "chromiumLeggingsReduction", 0, "Chromium Leggings Reduction").getInt(chromiumArmorReduction[2]);
        chromiumArmorReduction[3] = config.get(SimpleArmorConfig, "chromiumBootsReduction", 0, "Chromium Boots Reduction").getInt(chromiumArmorReduction[3]);
        chromiumArmorDurability = config.get(SimpleArmorConfig, "chromiumArmorDurability", 0, "Chromium Armor Durability").getInt(chromiumArmorDurability);
        chromiumArmorEnchantability = config.get(SimpleArmorConfig, "chromiumArmorEnchantability", 0, "Chromium Armor Enchantability").getInt(chromiumArmorEnchantability);
        
        
        //************************************************************************************************************************
        //********************************** TOOL CONFIGURATION ******************************************************************
        //************************************************************************************************************************
        
        //Chromium Tools
        chromiumToolHarvestLevel = config.get(SimpleToolConfig, "chromiumToolHarvestLevel", 0, "Chromium Tool Harvest Level").getInt(chromiumToolHarvestLevel);
        chromiumToolMaxUses = config.get(SimpleToolConfig, "chromiumToolMaxUses", 0, "Chromium Tool Max Uses").getInt(chromiumToolMaxUses);
        chromiumToolEfficiency = config.get(SimpleToolConfig, "chromiumToolEfficiency", 0, "Chromium Tool Efficiency").getDouble(chromiumToolEfficiency);
        chromiumToolDamage = config.get(SimpleToolConfig, "chromiumToolDamage", 0, "Chromium Tool Damage").getInt(chromiumToolDamage);
        chromiumToolEnchantability = config.get(SimpleToolConfig, "chromiumToolEnchantability", 0, "Chromium Tool Enchantability").getInt(chromiumToolEnchantability);;
        
        
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
