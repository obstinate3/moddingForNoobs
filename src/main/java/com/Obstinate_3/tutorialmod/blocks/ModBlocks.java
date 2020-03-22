package com.Obstinate_3.tutorialmod.blocks;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("tutorialmod:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("tutorialmod:firstblock")
    public  static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
    @ObjectHolder("tutorialmod:firstblock")
    public static ContainerType<FirstBlockContainer> FIRSTBLOCK_CONTAINER;
}
