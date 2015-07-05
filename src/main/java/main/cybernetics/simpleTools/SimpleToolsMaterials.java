package main.cybernetics.simpleTools;

import cpw.mods.fml.common.registry.GameRegistry;
import main.cybernetics.ConfigHandler;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SimpleToolsMaterials {
	
	public static ToolMaterial toolChromium;
	
	public static void addRecipes()
	{
		addToolsForMaterial(ItemRegistry.ChromiumIngot, 
							SimpleTools.ChromiumShovel,
							SimpleTools.ChromiumHoe,
							SimpleTools.ChromiumAxe,
							SimpleTools.ChromiumPickaxe,
							SimpleTools.ChromiumSword);
	}
	
	public static void addItems()
	{
		toolChromium = EnumHelper.addToolMaterial("Chromium", 
					   ConfigHandler.chromiumToolHarvestLevel,
					   ConfigHandler.chromiumToolMaxUses,
					   (float)ConfigHandler.chromiumToolEfficiency,
					   ConfigHandler.chromiumToolDamage,
					   ConfigHandler.chromiumToolEnchantability);
		SimpleTools.initializeItems();
		SimpleTools.register();
	}
	
	private static void addToolsForMaterial(Item ingot, Item shovel, Item hoe, Item axe, Item pickaxe, Item sword)
	{
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{" X ", " Y ", " Y ", 'X', ingot, 'Y', Item.getItemById(280)});
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[]{"XX ", " Y ", " Y ", 'X', ingot, 'Y', Item.getItemById(280)});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[]{"XX ", "XY ", " Y ", 'X', ingot, 'Y', Item.getItemById(280)});
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{"XXX", " Y ", " Y ", 'X', ingot, 'Y', Item.getItemById(280)});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[]{" X ", " X ", " Y ", 'X', ingot, 'Y', Item.getItemById(280)});
		
	}
}
