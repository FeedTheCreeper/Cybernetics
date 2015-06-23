package main.cybernetics.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import main.cybernetics.cybernetics;
import main.cybernetics.ModInformation;
import main.cybernetics.util.TextHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/*
 * The most simple item you can make. It literally does nothing but set a texture and name.
 */

public class ItemChromiumNugget extends ItemBase {

    public ItemChromiumNugget() {
        super("nugget.chromium", "chromiumNugget");
    }
}