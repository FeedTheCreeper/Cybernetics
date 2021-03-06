package main.cybernetics.blocks;

/*
 * Base block class for getting standard things done with quickly.
 * Extend this for pretty much every block you make.
 */

import main.cybernetics.cybernetics;
import main.cybernetics.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    // If you aren't setting multiple textures for your block. IE: Non-Metadata blocks.
    public BlockBase(String unlocName, Material material, String textureName, SoundType soundType, float hardness, String toolNeeded, int harvestLevel) {
        super(material);

        setBlockName(ModInformation.ID + "." + unlocName);
        setBlockTextureName(ModInformation.ID + ":" + textureName);
        setCreativeTab(cybernetics.tabCybernetics);
        setStepSound(soundType);
        setHardness(hardness);
        setHarvestLevel(toolNeeded, harvestLevel);
    }
}
