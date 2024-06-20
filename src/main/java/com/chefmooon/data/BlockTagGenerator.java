package com.chefmooon.data;

import com.chefmooon.registry.ModBlocksRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        registerMinecraftBlockTags();
    }

    private void registerMinecraftBlockTags() {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WHITE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_GRAY)
                .add(ModBlocksRegistry.BASIC_BOUNCE_GRAY)
                .add(ModBlocksRegistry.BASIC_BOUNCE_BLACK)
                .add(ModBlocksRegistry.BASIC_BOUNCE_BROWN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_RED)
                .add(ModBlocksRegistry.BASIC_BOUNCE_ORANGE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_YELLOW)
                .add(ModBlocksRegistry.BASIC_BOUNCE_LIME)
                .add(ModBlocksRegistry.BASIC_BOUNCE_GREEN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_CYAN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_BLUE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_BLUE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_PURPLE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_MAGENTA)
                .add(ModBlocksRegistry.BASIC_BOUNCE_PINK)

                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_WHITE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_GRAY)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_GRAY)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLACK)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_BROWN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_RED)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_ORANGE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_YELLOW)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIME)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_GREEN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_CYAN)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_BLUE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLUE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_PURPLE)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_MAGENTA)
                .add(ModBlocksRegistry.BASIC_BOUNCE_WALL_PINK);
    }
}
