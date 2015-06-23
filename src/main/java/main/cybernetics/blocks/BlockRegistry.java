package main.cybernetics.blocks;

//General place to register all your blocks.

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class BlockRegistry {

    //blocks
	public static Block BlockChromiteOre;
	public static Block BlockChromiumBlock;

    public static void registerBlocks() {
    	BlockChromiteOre = new BlockChromiteOre();
    	GameRegistry.registerBlock(BlockChromiteOre, "chromiteOre");
    	
    	BlockChromiumBlock = new BlockChromiumBlock();
    	GameRegistry.registerBlock(BlockChromiumBlock, "chromiteBlock");
    }
}
