package main.cybernetics.items;

/*
 * Base item class for getting standard things done with quickly.
 * Extend this for pretty much every item you make.
 */

import main.cybernetics.cybernetics;
import main.cybernetics.ModInformation;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    // If you aren't setting multiple textures for your item. IE: Non-Metadata items.
    public ItemBase(String unlocName, String textureName) {
        super();

        setUnlocalizedName(ModInformation.ID + "." + unlocName);
        setTextureName(ModInformation.ID + ":" + textureName);
        setCreativeTab(cybernetics.tabCybernetics);
    }

    // If you are setting multiple textures for your item. IE: Metadata items.
    public ItemBase(String unlocName) {
        super();

        setUnlocalizedName(ModInformation.ID + "." + unlocName);
        setCreativeTab(cybernetics.tabCybernetics);
    }
}
