package com.chefmooon.breezebounce.common.registry.neoforge;

import com.chefmooon.breezebounce.BreezeBounce;
import com.chefmooon.breezebounce.common.block.neoforge.BreezeBounceBlockImpl;
import com.chefmooon.breezebounce.common.block.neoforge.BreezeBounceWallBlockImpl;
import com.chefmooon.breezebounce.common.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.chefmooon.breezebounce.common.registry.ModBlocks.basicBounce;

public class ModBlocksImpl {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, BreezeBounce.MOD_ID);

    public static final Supplier<Block> BASIC_BOUNCE_WHITE = registerBlock(ModBlocks.BASIC_BOUNCE_WHITE, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.SNOW)));
    public static final Supplier<Block> BASIC_BOUNCE_LIGHT_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_LIGHT_GRAY, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Supplier<Block> BASIC_BOUNCE_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_GRAY, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Supplier<Block> BASIC_BOUNCE_BLACK = registerBlock(ModBlocks.BASIC_BOUNCE_BLACK, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Supplier<Block> BASIC_BOUNCE_BROWN = registerBlock(ModBlocks.BASIC_BOUNCE_BROWN, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> BASIC_BOUNCE_RED = registerBlock(ModBlocks.BASIC_BOUNCE_RED, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Supplier<Block> BASIC_BOUNCE_ORANGE = registerBlock(ModBlocks.BASIC_BOUNCE_ORANGE, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Supplier<Block> BASIC_BOUNCE_YELLOW = registerBlock(ModBlocks.BASIC_BOUNCE_YELLOW, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Supplier<Block> BASIC_BOUNCE_LIME = registerBlock(ModBlocks.BASIC_BOUNCE_LIME, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Supplier<Block> BASIC_BOUNCE_GREEN = registerBlock(ModBlocks.BASIC_BOUNCE_GREEN, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Supplier<Block> BASIC_BOUNCE_CYAN = registerBlock(ModBlocks.BASIC_BOUNCE_CYAN, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Supplier<Block> BASIC_BOUNCE_LIGHT_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_LIGHT_BLUE, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Supplier<Block> BASIC_BOUNCE_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_BLUE, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Supplier<Block> BASIC_BOUNCE_PURPLE = registerBlock(ModBlocks.BASIC_BOUNCE_PURPLE, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Supplier<Block> BASIC_BOUNCE_MAGENTA = registerBlock(ModBlocks.BASIC_BOUNCE_MAGENTA, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Supplier<Block> BASIC_BOUNCE_PINK = registerBlock(ModBlocks.BASIC_BOUNCE_PINK, () -> new BreezeBounceBlockImpl(basicBounce().mapColor(MapColor.COLOR_PINK)));

    public static final Supplier<Block> BASIC_BOUNCE_WALL_WHITE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_WHITE, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.SNOW)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_LIGHT_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIGHT_GRAY, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_GRAY, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_BLACK = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BLACK, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_BROWN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BROWN, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_RED = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_RED, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_ORANGE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_ORANGE, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_YELLOW = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_YELLOW, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_LIME = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIME, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_GREEN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_GREEN, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_CYAN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_CYAN, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_LIGHT_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIGHT_BLUE, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BLUE, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_PURPLE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_PURPLE, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_MAGENTA = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_MAGENTA, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Supplier<Block> BASIC_BOUNCE_WALL_PINK = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_PINK, () -> new BreezeBounceWallBlockImpl(basicBounce().mapColor(MapColor.COLOR_PINK)));

    public static Supplier<Block> registerBlock(final ResourceLocation location, final Supplier<Block> block) {
        return BLOCKS.register(location.getPath(), block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
