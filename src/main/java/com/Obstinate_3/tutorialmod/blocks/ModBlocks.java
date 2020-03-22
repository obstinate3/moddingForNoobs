package com.Obstinate_3.tutorialmod.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("tutorialmod:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("tutorialmod:firstblock")
    public  static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
