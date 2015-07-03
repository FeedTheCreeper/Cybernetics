package main.cybernetics.simplearmor;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import main.cybernetics.cybernetics;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.util.EnumHelper;

public class CyberneticsSimpleTools {
	
	public static ArmorMaterial armorChromium;
	
	public static void addRecipes()
	{
		
	}
	
	public static void addItems()
	{
		//Armors
		armorChromium = EnumHelper.addArmorMaterial("Chromium"
				, 10
				, new int[]
				{
					10,
					10,
					10,
					10
				},
					10
				);
		CyberneticsSimpleArmorTools.initializeItems();
		CyberneticsSimpleArmorTools.register();

	}
}
