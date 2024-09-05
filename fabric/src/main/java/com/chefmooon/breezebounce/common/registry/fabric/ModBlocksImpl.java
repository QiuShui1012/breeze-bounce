package com.chefmooon.breezebounce.common.registry.fabric;

import com.chefmooon.breezebounce.common.block.BreezeBounceBlock;
import com.chefmooon.breezebounce.common.block.BreezeBounceWallBlock;
import com.chefmooon.breezebounce.common.registry.ModBlocks;
import com.chefmooon.breezebounce.common.registry.ModSounds;
import com.chefmooon.breezebounce.common.util.TextUtil;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static com.chefmooon.breezebounce.common.registry.ModBlocks.basicBounce;

public class ModBlocksImpl {
    public static final Block BASIC_BOUNCE_WHITE = registerBlock(ModBlocks.BASIC_BOUNCE_WHITE, new BreezeBounceBlock(basicBounce().mapColor(MapColor.SNOW)));
    public static final Block BASIC_BOUNCE_LIGHT_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_LIGHT_GRAY, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block BASIC_BOUNCE_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_GRAY, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Block BASIC_BOUNCE_BLACK = registerBlock(ModBlocks.BASIC_BOUNCE_BLACK, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Block BASIC_BOUNCE_BROWN = registerBlock(ModBlocks.BASIC_BOUNCE_BROWN, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Block BASIC_BOUNCE_RED = registerBlock(ModBlocks.BASIC_BOUNCE_RED, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Block BASIC_BOUNCE_ORANGE = registerBlock(ModBlocks.BASIC_BOUNCE_ORANGE, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block BASIC_BOUNCE_YELLOW = registerBlock(ModBlocks.BASIC_BOUNCE_YELLOW, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Block BASIC_BOUNCE_LIME = registerBlock(ModBlocks.BASIC_BOUNCE_LIME, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block BASIC_BOUNCE_GREEN = registerBlock(ModBlocks.BASIC_BOUNCE_GREEN, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Block BASIC_BOUNCE_CYAN = registerBlock(ModBlocks.BASIC_BOUNCE_CYAN, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Block BASIC_BOUNCE_LIGHT_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_LIGHT_BLUE, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block BASIC_BOUNCE_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_BLUE, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BASIC_BOUNCE_PURPLE = registerBlock(ModBlocks.BASIC_BOUNCE_PURPLE, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BASIC_BOUNCE_MAGENTA = registerBlock(ModBlocks.BASIC_BOUNCE_MAGENTA, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block BASIC_BOUNCE_PINK = registerBlock(ModBlocks.BASIC_BOUNCE_PINK, new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_PINK)));

    public static final Block BASIC_BOUNCE_WALL_WHITE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_WHITE, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.SNOW)));
    public static final Block BASIC_BOUNCE_WALL_LIGHT_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIGHT_GRAY, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block BASIC_BOUNCE_WALL_GRAY = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_GRAY, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Block BASIC_BOUNCE_WALL_BLACK = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BLACK, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Block BASIC_BOUNCE_WALL_BROWN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BROWN, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Block BASIC_BOUNCE_WALL_RED = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_RED, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Block BASIC_BOUNCE_WALL_ORANGE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_ORANGE, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block BASIC_BOUNCE_WALL_YELLOW = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_YELLOW, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Block BASIC_BOUNCE_WALL_LIME = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIME, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block BASIC_BOUNCE_WALL_GREEN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_GREEN, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Block BASIC_BOUNCE_WALL_CYAN = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_CYAN, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Block BASIC_BOUNCE_WALL_LIGHT_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_LIGHT_BLUE, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block BASIC_BOUNCE_WALL_BLUE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_BLUE, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BASIC_BOUNCE_WALL_PURPLE = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_PURPLE, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BASIC_BOUNCE_WALL_MAGENTA = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_MAGENTA, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block BASIC_BOUNCE_WALL_PINK = registerBlock(ModBlocks.BASIC_BOUNCE_WALL_PINK, new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_PINK)));

    private static Block registerBlock(ResourceLocation location, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, location, block);
    }

    public static void register() {

    }
}
