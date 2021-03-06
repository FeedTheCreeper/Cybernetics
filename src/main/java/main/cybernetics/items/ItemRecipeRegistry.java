package main.cybernetics.items;

/*
 * General place to do all your item related recipe things'n'stuff.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import main.cybernetics.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import main.cybernetics.items.ItemChromiumNugget;
import main.cybernetics.items.ItemChromiumIngot;
import main.cybernetics.util.OreDictHandler;
import main.cybernetics.blocks.BlockChromiteOre;

public class ItemRecipeRegistry {

    // Self explanatory. Continue these how you wish. EG: registerSmeltingRecipes
    private static void registerShapedRecipes() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.BlockChromiumBlock), new Object[]{"XXX", "XXX", "XXX", 'X', ItemRegistry.ChromiumIngot}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.ChromiumIngot), new Object[]{"XXX", "XXX", "XXX", 'X', ItemRegistry.ChromiumNugget}));
    }

    private static void registerShapelessRecipes() {
        //GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.BlockChromiumBlock), new ItemStack(ItemRegistry.ChromiumIngot, 9));
    	//GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.ChromiumIngot), new ItemStack(ItemRegistry.ChromiumNugget, 9));
    }
    
    private static void registerSmeltingRecipes() {
    	GameRegistry.addSmelting(new ItemStack(BlockRegistry.BlockChromiteOre), new ItemStack(ItemRegistry.ChromiumNugget), 0.1f);
    }

    public static void registerItemRecipes() {
        registerShapedRecipes();
        registerShapelessRecipes();
        registerSmeltingRecipes();
    }
    
}
