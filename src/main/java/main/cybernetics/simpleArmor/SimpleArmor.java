package main.cybernetics.simpleArmor;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder("CyberneticsSimpleArmor")
public class SimpleArmor {
	
	//Chromium Armor
	public static Item ChromiumHelmet;
	public static Item ChromiumChestplate;
	public static Item ChromiumLeggings;
	public static Item ChromiumBoots;
	
	public static void initializeItems()
	{
		ChromiumHelmet = new SimpleArmorTextures(SimpleArmorMaterials.armorChromium, 3, 0).setUnlocalizedName("ChromiumHelmet") ;
		ChromiumChestplate = new SimpleArmorTextures(SimpleArmorMaterials.armorChromium, 3, 1).setUnlocalizedName("ChromiumChestplate") ;
		ChromiumLeggings = new SimpleArmorTextures(SimpleArmorMaterials.armorChromium, 3, 2).setUnlocalizedName("ChromiumLeggings") ;
		ChromiumBoots = new SimpleArmorTextures(SimpleArmorMaterials.armorChromium, 3, 3).setUnlocalizedName("ChromiumBoots") ;
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ChromiumHelmet, "ChromiumHelmet");
		GameRegistry.registerItem(ChromiumChestplate, "ChromiumChestplate");
		GameRegistry.registerItem(ChromiumLeggings, "ChromiumLeggings");
		GameRegistry.registerItem(ChromiumBoots, "ChromiumBoots");
	}
}
