package main.cybernetics.simpleArmor;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SimpleArmorTextures extends ItemArmor
{
	public SimpleArmorTextures(ArmorMaterial material, int renderIndex, int armorPart)
	{
		super(material, renderIndex, armorPart);
		setCreativeTab(cybernetics.tabCybernetics);
		String endname = "_boots";
		if(armorPart == 0) endname = "_helmet";
		else if(armorPart == 1) endname = "_chestplate";
		else if(armorPart == 2) endname = "_leggings";
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + getArmorMaterial().name().toLowerCase() + endname);
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String RenderingType)
    {
		int layer = (slot == 2) ? 2 : 1;
		return ModInformation.ID.toLowerCase() + ":" + "textures/armor/" + getArmorMaterial().name().toLowerCase() + "_" + layer + ".png";
    }
	
	public static void init()
	{
		
	}
}
