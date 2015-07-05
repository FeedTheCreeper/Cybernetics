package main.cybernetics.simpleArmor;

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

public class SimpleArmorMaterials {
	
	public static ArmorMaterial armorChromium;
	
	public static void addRecipes()
	{
		addArmorForMaterial(ItemRegistry.ChromiumIngot, 
							SimpleArmor.ChromiumHelmet, 
							SimpleArmor.ChromiumChestplate,
							SimpleArmor.ChromiumLeggings,
							SimpleArmor.ChromiumBoots);
	}
	
	public static void addItems()
	{
		armorChromium = EnumHelper.addArmorMaterial("Chromium",
				ConfigHandler.chromiumArmorDurability,
				ConfigHandler.chromiumArmorReduction,
				ConfigHandler.chromiumArmorEnchantability	
				);
		SimpleArmor.initializeItems();
		SimpleArmor.register();

	}
	
	private static void addArmorForMaterial(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots)
	{
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{"XXX", "X X", "   ", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[]{"X X", "XXX", "XXX", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[]{"XXX", "X X", "X X", 'X', ingot});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[]{"X X", "X X", "   ", 'X', ingot});
	}
}
