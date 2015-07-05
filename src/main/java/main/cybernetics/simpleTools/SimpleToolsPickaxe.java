package main.cybernetics.simpleTools;

import main.cybernetics.ModInformation;
import main.cybernetics.cybernetics;
import net.minecraft.item.ItemPickaxe;

public class SimpleToolsPickaxe extends ItemPickaxe{
	
	public SimpleToolsPickaxe(ToolMaterial material, String texture)
	{
		super(material);
		this.setTextureName(ModInformation.ID.toLowerCase() + ":" + texture);
		this.setCreativeTab(cybernetics.tabCybernetics);
	}
}
