package com.chefmooon.registry;

import com.chefmooon.block.BreezeBounceBlock;
import com.chefmooon.block.BreezeBounceWallBlock;
import com.chefmooon.util.TextUtil;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class ModBlocksRegistry {

    public static final Block BASIC_BOUNCE_WHITE = registerBlock("basic_bounce_white", new BreezeBounceBlock(basicBounce().mapColor(MapColor.SNOW)));
    public static final Block BASIC_BOUNCE_LIGHT_GRAY = registerBlock("basic_bounce_light_gray", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block BASIC_BOUNCE_GRAY = registerBlock("basic_bounce_gray", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Block BASIC_BOUNCE_BLACK = registerBlock("basic_bounce_black", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Block BASIC_BOUNCE_BROWN = registerBlock("basic_bounce_brown", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Block BASIC_BOUNCE_RED = registerBlock("basic_bounce_red", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Block BASIC_BOUNCE_ORANGE = registerBlock("basic_bounce_orange", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block BASIC_BOUNCE_YELLOW = registerBlock("basic_bounce_yellow", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Block BASIC_BOUNCE_LIME = registerBlock("basic_bounce_lime", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block BASIC_BOUNCE_GREEN = registerBlock("basic_bounce_green", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Block BASIC_BOUNCE_CYAN = registerBlock("basic_bounce_cyan", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Block BASIC_BOUNCE_LIGHT_BLUE = registerBlock("basic_bounce_light_blue", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block BASIC_BOUNCE_BLUE = registerBlock("basic_bounce_blue", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BASIC_BOUNCE_PURPLE = registerBlock("basic_bounce_purple", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BASIC_BOUNCE_MAGENTA = registerBlock("basic_bounce_magenta", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block BASIC_BOUNCE_PINK = registerBlock("basic_bounce_pink", new BreezeBounceBlock(basicBounce().mapColor(MapColor.COLOR_PINK)));

    public static final Block BASIC_BOUNCE_WALL_WHITE = registerBlock("basic_bounce_wall_white", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.SNOW)));
    public static final Block BASIC_BOUNCE_WALL_LIGHT_GRAY = registerBlock("basic_bounce_wall_light_gray", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final Block BASIC_BOUNCE_WALL_GRAY = registerBlock("basic_bounce_wall_gray", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_GRAY)));
    public static final Block BASIC_BOUNCE_WALL_BLACK = registerBlock("basic_bounce_wall_black", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BLACK)));
    public static final Block BASIC_BOUNCE_WALL_BROWN = registerBlock("basic_bounce_wall_brown", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BROWN)));
    public static final Block BASIC_BOUNCE_WALL_RED = registerBlock("basic_bounce_wall_red", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_RED)));
    public static final Block BASIC_BOUNCE_WALL_ORANGE = registerBlock("basic_bounce_wall_orange", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block BASIC_BOUNCE_WALL_YELLOW = registerBlock("basic_bounce_wall_yellow", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_YELLOW)));
    public static final Block BASIC_BOUNCE_WALL_LIME = registerBlock("basic_bounce_wall_lime", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final Block BASIC_BOUNCE_WALL_GREEN = registerBlock("basic_bounce_wall_green", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_GREEN)));
    public static final Block BASIC_BOUNCE_WALL_CYAN = registerBlock("basic_bounce_wall_cyan", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_CYAN)));
    public static final Block BASIC_BOUNCE_WALL_LIGHT_BLUE = registerBlock("basic_bounce_wall_light_blue", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final Block BASIC_BOUNCE_WALL_BLUE = registerBlock("basic_bounce_wall_blue", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BASIC_BOUNCE_WALL_PURPLE = registerBlock("basic_bounce_wall_purple", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BASIC_BOUNCE_WALL_MAGENTA = registerBlock("basic_bounce_wall_magenta", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block BASIC_BOUNCE_WALL_PINK = registerBlock("basic_bounce_wall_pink", new BreezeBounceWallBlock(basicBounce().mapColor(MapColor.COLOR_PINK)));

    private static Block registerBlock(String string, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, TextUtil.res(string), block);
    }

    public static void register() {

    }

    private static BlockBehaviour.Properties basicBounce() {
        return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.GUITAR).strength(1.6F).sound(bounceSoundType()).ignitedByLava();
    }

    private static SoundType bounceSoundType() {
        return new SoundType(3.0f, 1.0f, SoundEvents.WOOL_BREAK, ModSoundsRegistry.BOUNCE_BLOCK_STEP, SoundEvents.WOOL_PLACE, ModSoundsRegistry.BOUNCE_BLOCK_BOUNCE, SoundEvents.EMPTY);
    }
}
