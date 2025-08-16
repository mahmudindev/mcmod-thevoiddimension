package com.github.mahmudindev.mcmod.thevoiddimension.fabric;

import com.github.mahmudindev.mcmod.thevoiddimension.TheVoidDimension;
import net.fabricmc.api.ModInitializer;

public final class TheVoidDimensionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        TheVoidDimension.init();
    }
}
