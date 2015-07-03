package main.cybernetics.simplearmor;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCyberneticsSimpleArmor extends ItemArmor
{
	public ItemCyberneticsSimpleArmor(ArmorMaterial material, int renderIndex, int armorPart)
	{
		super(material, renderIndex, armorPart);
		setCreativeTab(cybernetics.tabCybernetics);
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String RenderingType)
    {
		int layer = (slot == 2) ? 2 : 1;
		return "cybernetics:textures:armor/" + getArmorMaterial().name().toLowerCase() + "_" + layer + ".png";
    }
	
	public static void init()
	{
		
	}
}
