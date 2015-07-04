package main.cybernetics.client.gui;

//Creates your creative tab.

import main.cybernetics.ModInformation;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabCybernetics extends CreativeTabs {

    public CreativeTabCybernetics(String tabLabel) {
        super(tabLabel);
        setBackgroundImageName(ModInformation.ID + ".png"); // Automagically has tab_ applied to it. Make sure you change the texture name.
    }

    public boolean hasSearchBar() {
        return true;
    }

    //The tab icon is what you return here.
    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemRegistry.ChromiumIngot);
    }

    @Override
    public Item getTabIconItem() {
        return new Item();
    }
}
