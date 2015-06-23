package main.cybernetics.blocks;

import main.cybernetics.items.ItemRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockChromiumBlock extends BlockBase {

    public BlockChromiumBlock() {
        super("chromite.block", Material.rock, "chromiumBlock", soundTypeStone, 3F);
    }
}