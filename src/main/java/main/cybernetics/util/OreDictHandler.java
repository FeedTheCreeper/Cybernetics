package main.cybernetics.util;

//General place to register all oreDict recipes.

import main.cybernetics.blocks.BlockRegistry;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

    //Oredict entries
    //items
    //public static String powderBlaze = "powderBlaze";
    //public static String quisqueLapis = "dustQuisqueLapis";

    //blocks
    public static String BlockChromiteOre = "BlockChromiteOre";

    public static void registerOreDict() {
        //OreDictionary.registerOre(powderBlaze, new ItemStack(Items.blaze_powder, 1, 0));
        //OreDictionary.registerOre(quisqueLapis, new ItemStack(ItemRegistry.quisqueLapis));

        OreDictionary.registerOre(BlockChromiteOre, new ItemStack(BlockRegistry.BlockChromiteOre));
    }
}