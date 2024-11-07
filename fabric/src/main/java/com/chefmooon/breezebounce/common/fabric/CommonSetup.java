package com.chefmooon.breezebounce.common.fabric;

import com.chefmooon.breezebounce.common.block.BreezeBounceBlock;
import com.chefmooon.breezebounce.common.block.SimpleBreezeBounceBlock;
import com.chefmooon.breezebounce.common.registry.fabric.ModBlocksImpl;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.world.level.block.Block;

public class CommonSetup {

    public static void init() {
        registerFlammableBlocks();
    }

    public static void registerFlammableBlocks() {
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WHITE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_BLACK);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_BROWN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_RED);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_ORANGE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_YELLOW);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_LIME);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_GREEN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_CYAN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_PURPLE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_MAGENTA);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_PINK);

        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_WHITE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_BLACK);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_BROWN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_RED);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_ORANGE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_YELLOW);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_LIME);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_GREEN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_CYAN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_PURPLE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_MAGENTA);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_STAIR_PINK);

        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_WHITE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_BLACK);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_BROWN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_RED);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_ORANGE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_YELLOW);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_LIME);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_GREEN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_CYAN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_PURPLE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_MAGENTA);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_SLAB_PINK);

        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_RED);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA);
        addBasicBounceFlammable(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK);
    }

    private static void addBasicBounceFlammable(Block block) {
        addFlammable(block, SimpleBreezeBounceBlock.FLAMMABILITY, SimpleBreezeBounceBlock.FIRE_SPREAD);
    }

    private static void addFlammable(Block block, int burn, int spread) {
        FlammableBlockRegistry.getDefaultInstance().add(block, burn, spread);
    }
}
