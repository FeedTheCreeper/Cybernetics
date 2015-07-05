package main.cybernetics.simpleTools;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.item.ItemAxe;

public class SimpleToolsAxe extends ItemAxe{
	
	public SimpleToolsAxe(ToolMaterial material, String texture)
	{
		super(material);
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + texture);
		this.setCreativeTab(cybernetics.tabCybernetics);
	}

}
