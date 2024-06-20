package com.chefmooon;

import com.chefmooon.particle.BounceParticle;
import com.chefmooon.registry.ModParticlesRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class BreezeBounceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticlesRegistry.BOUNCE_WHITE, BounceParticle.Provider::new);
    }
}
