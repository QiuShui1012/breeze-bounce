package com.chefmooon.breezebounce.data;

import com.chefmooon.breezebounce.common.registry.fabric.ModBlocksImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    protected LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WHITE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_GRAY);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_BLACK);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_BROWN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_RED);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_ORANGE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_YELLOW);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_LIME);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_GREEN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_CYAN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_BLUE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_PURPLE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_MAGENTA);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_PINK);

        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_RED);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA);
        this.dropSelf(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK);
    }
}
