package main.cybernetics.simpleTools;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class SimpleToolsShovel extends ItemSpade{
	
	public SimpleToolsShovel(ToolMaterial material, String texture)
	{
		super(material);
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + texture);
		this.setCreativeTab(cybernetics.tabCybernetics);
	}
}
