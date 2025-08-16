package com.github.mahmudindev.mcmod.thevoiddimension.forge;

import com.github.mahmudindev.mcmod.thevoiddimension.TheVoidDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(TheVoidDimension.MOD_ID)
public final class TheVoidDimensionForge {
    public TheVoidDimensionForge() {
        // Run our common setup.
        TheVoidDimension.init();
    }
}
