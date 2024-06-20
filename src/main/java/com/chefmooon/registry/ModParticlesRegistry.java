package com.chefmooon.registry;

import com.chefmooon.util.TextUtil;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModParticlesRegistry {


    public static final SimpleParticleType BOUNCE_WHITE = registerSimpleParticle("bounce_white", true);

    private static SimpleParticleType registerSimpleParticle(String string, boolean bl) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, TextUtil.res(string), FabricParticleTypes.simple(bl));
    }

    public static void register() {

    }
}
