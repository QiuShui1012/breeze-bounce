package com.chefmooon.breezebounce.data;

import com.chefmooon.breezebounce.common.registry.fabric.ModBlocksImpl;
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
                .add(ModBlocksImpl.BASIC_BOUNCE_WHITE)
                .add(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY)
                .add(ModBlocksImpl.BASIC_BOUNCE_GRAY)
                .add(ModBlocksImpl.BASIC_BOUNCE_BLACK)
                .add(ModBlocksImpl.BASIC_BOUNCE_BROWN)
                .add(ModBlocksImpl.BASIC_BOUNCE_RED)
                .add(ModBlocksImpl.BASIC_BOUNCE_ORANGE)
                .add(ModBlocksImpl.BASIC_BOUNCE_YELLOW)
                .add(ModBlocksImpl.BASIC_BOUNCE_LIME)
                .add(ModBlocksImpl.BASIC_BOUNCE_GREEN)
                .add(ModBlocksImpl.BASIC_BOUNCE_CYAN)
                .add(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE)
                .add(ModBlocksImpl.BASIC_BOUNCE_BLUE)
                .add(ModBlocksImpl.BASIC_BOUNCE_PURPLE)
                .add(ModBlocksImpl.BASIC_BOUNCE_MAGENTA)
                .add(ModBlocksImpl.BASIC_BOUNCE_PINK)

                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_RED)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA)
                .add(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK);
    }
}
