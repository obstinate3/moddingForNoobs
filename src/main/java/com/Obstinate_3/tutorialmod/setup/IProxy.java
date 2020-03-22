package com.Obstinate_3.tutorialmod.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
