package main.cybernetics.simplearmor;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import main.cybernetics.ConfigHandler;
import main.cybernetics.cybernetics;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.util.EnumHelper;

public class CyberneticsSimpleTools {
	
	public static ArmorMaterial armorChromium;
	
	public static void addRecipes()
	{
		addArmorForMaterial(ItemRegistry.ChromiumIngot, 
							CyberneticsSimpleArmorTools.ChromiumHelmet, 
							CyberneticsSimpleArmorTools.ChromiumChestplate,
							CyberneticsSimpleArmorTools.ChromiumLeggings,
							CyberneticsSimpleArmorTools.ChromiumBoots);
	}
	
	public static void addItems()
	{
		//Armors
		armorChromium = EnumHelper.addArmorMaterial("Chromium",
				ConfigHandler.simpleChromiumArmorDurability,
				ConfigHandler.simpleChromiumArmorReduction,
				ConfigHandler.simpleChromiumArmorEnchantability	
				);
		CyberneticsSimpleArmorTools.initializeItems();
		CyberneticsSimpleArmorTools.register();

	}
	
	private static void addArmorForMaterial(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots)
	{
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{"XXX", "X X", "   ", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[]{"X X", "XXX", "XXX", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[]{"XXX", "X X", "X X", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[]{"X X", "X X", "   ", 'X', ingot});
	}
}
