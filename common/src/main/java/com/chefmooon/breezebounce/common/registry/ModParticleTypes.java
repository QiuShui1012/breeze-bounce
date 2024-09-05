package com.chefmooon.breezebounce.common.registry;

import com.chefmooon.breezebounce.common.util.TextUtil;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class ModParticleTypes {

    public static final Supplier<SimpleParticleType> BOUNCE_WHITE = registerParticleType("bounce_white");

    private static Supplier<SimpleParticleType> registerParticleType(String string) {
        return registerParticleType(TextUtil.res(string));
    }
    @ExpectPlatform
    public static Supplier<SimpleParticleType> registerParticleType(ResourceLocation location) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void register() {
        throw new AssertionError();
    }

    public static void init() {

    }

}
