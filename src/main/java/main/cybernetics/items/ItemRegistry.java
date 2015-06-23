package main.cybernetics.items;

/*
 * Class to register your blocks in.
 * The order that you list them here is the order they are registered.
 * Keep that in mind if you like nicely organized creative tabs.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {

    //items
    public static Item ChromiumNugget;
    public static Item ChromiumIngot;

    // I use multiple sections here to sort things. It's just my system, you don't have to.
    // Just delete "registerItemSet2" and "registerAllItems" then make this public. Make sure to change the call in the main class.

    public static void registerItems() {
        ChromiumNugget = new ItemChromiumNugget();
        GameRegistry.registerItem(ChromiumNugget, "ItemChromiumNugget");
        
        ChromiumIngot = new ItemChromiumIngot();
        GameRegistry.registerItem(ChromiumIngot, "ItemChromiumIngot");
    }
}
