package com.chefmooon.util;

import com.chefmooon.BreezeBounce;
import com.chefmooon.registry.ModBlocksRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CommonSetup {

    public static void init() {
        registerFlammableBlocks();
    }

    public static void registerFlammableBlocks() {
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WHITE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_GRAY);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_BLACK);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_BROWN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_RED);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_ORANGE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_YELLOW);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_LIME);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_GREEN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_CYAN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_BLUE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_PURPLE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_MAGENTA);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_PINK);

        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_WHITE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_GRAY);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLACK);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_BROWN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_RED);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_ORANGE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_YELLOW);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIME);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_GREEN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_CYAN);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLUE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_PURPLE);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_MAGENTA);
        addBasicBounceFlammable(ModBlocksRegistry.BASIC_BOUNCE_WALL_PINK);
    }

    private static void addBasicBounceFlammable(Block block) {
        addFlammable(block, 30, 60);
    }

    private static void addFlammable(Block block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }
}
