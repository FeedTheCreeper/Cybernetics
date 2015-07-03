package main.cybernetics.metalarmor;

import main.cybernetics.cybernetics;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCyberneticsMetalArmor extends ItemArmor
{
	private String texture;
	
	public ItemCyberneticsMetalArmor(ArmorMaterial material, int renderIndex, int armorPart, String texture)
	{
		super(material, renderIndex, armorPart);
		this.texture = texture + "_";
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String RenderingType)
    {
        if (this.armorType == 1)
        {
            return this.texture + "1.png";
        }
        else
        {
            return this.texture + "2.png";
        }
    }
	
	public static void init()
	{
		ItemCyberneticsChromiumArmor.init();
	}
}
