package main.cybernetics.simplearmor;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder("CyberneticsSimpleTools")
public class CyberneticsSimpleArmorTools {
	
	//Chromium Armor
	public static Item ChromiumHelmet;
	public static Item ChromiumChestplate;
	public static Item ChromiumLeggings;
	public static Item ChromiumBoots;
	
	public static void initializeItems()
	{
		ChromiumHelmet = new ItemCyberneticsSimpleArmor(CyberneticsSimpleTools.armorChromium, 1, 0).setUnlocalizedName("ChromiumHelmet") ;
		ChromiumChestplate = new ItemCyberneticsSimpleArmor(CyberneticsSimpleTools.armorChromium, 1, 1).setUnlocalizedName("ChromiumChestplate") ;
		ChromiumLeggings = new ItemCyberneticsSimpleArmor(CyberneticsSimpleTools.armorChromium, 2, 2).setUnlocalizedName("ChromiumLeggings") ;
		ChromiumBoots = new ItemCyberneticsSimpleArmor(CyberneticsSimpleTools.armorChromium, 2, 3).setUnlocalizedName("ChromiumBoots") ;
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ChromiumHelmet, "ChromiumHelmet");
		GameRegistry.registerItem(ChromiumChestplate, "ChromiumChestplate");
		GameRegistry.registerItem(ChromiumLeggings, "ChromiumLeggings");
		GameRegistry.registerItem(ChromiumBoots, "ChromiumBoots");
	}
}
