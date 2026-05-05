package com.github.mahmudindev.mcmod.thevoiddimension;

import com.github.mahmudindev.mcmod.thevoiddimension.platform.Services;
import com.github.mahmudindev.mcmod.thevoiddimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class TheVoidDimension {
    public static final String MOD_ID = "thevoiddimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
