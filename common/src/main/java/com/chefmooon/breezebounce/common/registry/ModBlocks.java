package com.chefmooon.breezebounce.common.registry;

import com.chefmooon.breezebounce.common.block.BreezeBounceBlock;
import com.chefmooon.breezebounce.common.block.BreezeBounceWallBlock;
import com.chefmooon.breezebounce.common.util.TextUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    public static BlockBehaviour.Properties basicBounce() {
        return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.GUITAR).strength(1.6F).sound(bounceSoundType()).ignitedByLava();
    }

    private static SoundType bounceSoundType() {
        return new SoundType(3.0f, 1.0f, SoundEvents.WOOL_BREAK, ModSounds.BOUNCE_BLOCK_STEP.get(), SoundEvents.WOOL_PLACE, ModSounds.BOUNCE_BLOCK_BOUNCE.get(), SoundEvents.EMPTY);
    }
    public static final ResourceLocation BASIC_BOUNCE_WHITE = block("basic_bounce_white");
    public static final ResourceLocation BASIC_BOUNCE_LIGHT_GRAY = block("basic_bounce_light_gray");
    public static final ResourceLocation BASIC_BOUNCE_GRAY = block("basic_bounce_gray");
    public static final ResourceLocation BASIC_BOUNCE_BLACK = block("basic_bounce_black");
    public static final ResourceLocation BASIC_BOUNCE_BROWN = block("basic_bounce_brown");
    public static final ResourceLocation BASIC_BOUNCE_RED = block("basic_bounce_red");
    public static final ResourceLocation BASIC_BOUNCE_ORANGE = block("basic_bounce_orange");
    public static final ResourceLocation BASIC_BOUNCE_YELLOW = block("basic_bounce_yellow");
    public static final ResourceLocation BASIC_BOUNCE_LIME = block("basic_bounce_lime");
    public static final ResourceLocation BASIC_BOUNCE_GREEN = block("basic_bounce_green");
    public static final ResourceLocation BASIC_BOUNCE_CYAN = block("basic_bounce_cyan");
    public static final ResourceLocation BASIC_BOUNCE_LIGHT_BLUE = block("basic_bounce_light_blue");
    public static final ResourceLocation BASIC_BOUNCE_BLUE = block("basic_bounce_blue");
    public static final ResourceLocation BASIC_BOUNCE_PURPLE = block("basic_bounce_purple");
    public static final ResourceLocation BASIC_BOUNCE_MAGENTA = block("basic_bounce_magenta");
    public static final ResourceLocation BASIC_BOUNCE_PINK = block("basic_bounce_pink");

    public static final ResourceLocation BASIC_BOUNCE_WALL_WHITE = block("basic_bounce_wall_white");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIGHT_GRAY = block("basic_bounce_wall_light_gray");
    public static final ResourceLocation BASIC_BOUNCE_WALL_GRAY = block("basic_bounce_wall_gray");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BLACK = block("basic_bounce_wall_black");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BROWN = block("basic_bounce_wall_brown");
    public static final ResourceLocation BASIC_BOUNCE_WALL_RED = block("basic_bounce_wall_red");
    public static final ResourceLocation BASIC_BOUNCE_WALL_ORANGE = block("basic_bounce_wall_orange");
    public static final ResourceLocation BASIC_BOUNCE_WALL_YELLOW = block("basic_bounce_wall_yellow");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIME = block("basic_bounce_wall_lime");
    public static final ResourceLocation BASIC_BOUNCE_WALL_GREEN = block("basic_bounce_wall_green");
    public static final ResourceLocation BASIC_BOUNCE_WALL_CYAN = block("basic_bounce_wall_cyan");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIGHT_BLUE = block("basic_bounce_wall_light_blue");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BLUE = block("basic_bounce_wall_blue");
    public static final ResourceLocation BASIC_BOUNCE_WALL_PURPLE = block("basic_bounce_wall_purple");
    public static final ResourceLocation BASIC_BOUNCE_WALL_MAGENTA = block("basic_bounce_wall_magenta");
    public static final ResourceLocation BASIC_BOUNCE_WALL_PINK = block("basic_bounce_wall_pink");

    private static ResourceLocation block(String location) {
        return TextUtil.res(location);
    }
}
