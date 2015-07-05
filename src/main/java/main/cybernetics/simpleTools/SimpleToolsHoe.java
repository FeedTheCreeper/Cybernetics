package main.cybernetics.simpleTools;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.item.ItemHoe;

public class SimpleToolsHoe extends ItemHoe{
	
	public SimpleToolsHoe(ToolMaterial material, String texture)
	{
		super(material);
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + texture);
		this.setCreativeTab(cybernetics.tabCybernetics);
		
	}
}
