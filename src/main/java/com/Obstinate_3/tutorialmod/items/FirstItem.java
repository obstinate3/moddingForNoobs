package com.Obstinate_3.tutorialmod.items;

import com.Obstinate_3.tutorialmod.TutorialMod;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(TutorialMod.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
