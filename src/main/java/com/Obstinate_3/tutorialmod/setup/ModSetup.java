package com.Obstinate_3.tutorialmod.setup;

import com.Obstinate_3.tutorialmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("tutorialmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
