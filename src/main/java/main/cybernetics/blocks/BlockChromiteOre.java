package main.cybernetics.blocks;

import main.cybernetics.ConfigHandler;
import main.cybernetics.items.ItemRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChromiteOre extends BlockBase {

    public BlockChromiteOre() {
        super("chromite.ore", Material.rock, "oreChromite", soundTypeStone, ConfigHandler.chromiteOreHardness, ConfigHandler.chromiteOreTool, ConfigHandler.chromiteOreHarvestability);
    }
}
