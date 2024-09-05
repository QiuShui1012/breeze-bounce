package com.chefmooon.breezebounce.common.util;

import com.chefmooon.breezebounce.BreezeBounce;
import net.minecraft.resources.ResourceLocation;

public class TextUtil {
    public static ResourceLocation res(String string) {
        return ResourceLocation.tryBuild(BreezeBounce.MOD_ID, string);
    }
}
