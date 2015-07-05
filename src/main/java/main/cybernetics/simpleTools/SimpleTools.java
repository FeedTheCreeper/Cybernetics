package main.cybernetics.simpleTools;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import main.cybernetics.simpleArmor.SimpleArmorMaterials;
import main.cybernetics.simpleArmor.SimpleArmorTextures;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@ObjectHolder("CyberneticsSimpleTools")
public class SimpleTools {

	//Chromium Tools
	public static Item ChromiumShovel;
	public static Item ChromiumHoe;
	public static Item ChromiumAxe;
	public static Item ChromiumPickaxe;
	public static Item ChromiumSword;
	
	public static void initializeItems()
	{
		ChromiumShovel = new SimpleToolsShovel(SimpleToolsMaterials.toolChromium, "ChromiumShovel").setUnlocalizedName("ChromiumShovel");
		ChromiumHoe = new SimpleToolsHoe(SimpleToolsMaterials.toolChromium, "ChromiumHoe").setUnlocalizedName("ChromiumHoe");
		ChromiumAxe = new SimpleToolsAxe(SimpleToolsMaterials.toolChromium, "ChromiumAxe").setUnlocalizedName("ChromiumAxe");
		ChromiumPickaxe = new SimpleToolsPickaxe(SimpleToolsMaterials.toolChromium, "ChromiumPickaxe").setUnlocalizedName("ChromiumPickaxe");
		ChromiumSword = new SimpleToolsSword(SimpleToolsMaterials.toolChromium, "ChromiumSword").setUnlocalizedName("ChromiumSword");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ChromiumShovel, "ChromiumShovel");
		GameRegistry.registerItem(ChromiumHoe, "ChromiumHoe");
		GameRegistry.registerItem(ChromiumAxe, "ChromiumAxe");
		GameRegistry.registerItem(ChromiumPickaxe, "ChromiumPickaxe");
		GameRegistry.registerItem(ChromiumSword, "ChromiumSword");
	}
}
