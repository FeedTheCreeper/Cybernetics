package main.cybernetics.simpleTools;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class SimpleToolsSword extends ItemSword{
	
	public SimpleToolsSword(ToolMaterial material, String texture)
	{
		super(material);
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + texture);
		this.setCreativeTab(cybernetics.tabCybernetics);
	}
}
