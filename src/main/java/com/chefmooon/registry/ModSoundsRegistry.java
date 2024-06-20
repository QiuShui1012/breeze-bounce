package com.chefmooon.registry;

import com.chefmooon.util.TextUtil;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;

public class ModSoundsRegistry {

    public static final SoundEvent BOUNCE_BLOCK_INFLATE = registerSound("bounce_block_inflate");
    public static final SoundEvent BOUNCE_BLOCK_DEFLATE = registerSound("bounce_block_deflate");
    public static final SoundEvent BOUNCE_BLOCK_BOUNCE = registerSound("bounce_block_bounce");
    public static final SoundEvent BOUNCE_BLOCK_STEP = registerSound("bounce_block_step");

    private static SoundEvent registerSound(String string) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, TextUtil.res(string),
                SoundEvent.createVariableRangeEvent(TextUtil.res(string)));
    }

    public static void register() {

    }
}
