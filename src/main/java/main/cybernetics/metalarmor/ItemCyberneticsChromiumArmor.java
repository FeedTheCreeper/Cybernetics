package main.cybernetics.metalarmor;

import cpw.mods.fml.common.registry.GameRegistry;
import main.cybernetics.blocks.BlockRegistry;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemCyberneticsChromiumArmor {
	
	public static ItemArmor.ArmorMaterial Chromium;
	public static ItemCyberneticsMetalArmor helmet;
	public static ItemCyberneticsMetalArmor chestplate;
	public static ItemCyberneticsMetalArmor leggings;
	public static ItemCyberneticsMetalArmor boots;
	
	public ItemCyberneticsChromiumArmor()
	{
	}
	
	public static void init()
	{
		Item Ingot = ItemRegistry.ChromiumIngot;
		
		Chromium = EnumHelper.addArmorMaterial("Chromium", 200, new int[]{2,2,2,2}, 5);
		helmet = new ItemCyberneticsMetalArmor(Chromium, 3, 0, "Chromium");
		chestplate = new ItemCyberneticsMetalArmor(Chromium, 3, 1, "Chromium");
		leggings = new ItemCyberneticsMetalArmor(Chromium, 3, 2, "Chromium");
		boots = new ItemCyberneticsMetalArmor(Chromium, 3, 3, "Chromium");
		
		GameRegistry.registerItem(helmet, "ChromiumHelmet");
		GameRegistry.registerItem(chestplate, "ChromiumChestplate");
		GameRegistry.registerItem(leggings, "ChromiumLeggings");
		GameRegistry.registerItem(boots, "ChromiumBoots");
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(helmet), new Object[]{"XXX", "X X", "   ", 'X', Ingot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chestplate), new Object[]{"X X", "XXX", "XXX", 'X', Ingot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(leggings), new Object[]{"XXX", "X X", "X X", 'X', Ingot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(boots), new Object[]{"X X", "X X", "   ", 'X', Ingot}));
	}
}
