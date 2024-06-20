package com.chefmooon;

import com.chefmooon.registry.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BreezeBounce implements ModInitializer {
	public static final String MOD_ID = "breezebounce";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocksRegistry.register();
		ModCreativetabsRegistry.register();
		ModItemsRegistry.register();
		ModParticlesRegistry.register();
		ModSoundsRegistry.register();

	}
}