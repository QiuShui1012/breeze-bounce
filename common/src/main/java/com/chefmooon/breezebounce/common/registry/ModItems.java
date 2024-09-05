package com.chefmooon.breezebounce.common.registry;

import com.chefmooon.breezebounce.common.util.TextUtil;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static Item.Properties basicItemProperties() {
        return new Item.Properties();
    }

    public static final ResourceLocation BASIC_BOUNCE = item("basic_bounce");
    public static final ResourceLocation BASIC_BOUNCE_LIGHT_GRAY = item("basic_bounce_light_gray");
    public static final ResourceLocation BASIC_BOUNCE_GRAY = item("basic_bounce_gray");
    public static final ResourceLocation BASIC_BOUNCE_BLACK = item("basic_bounce_black");
    public static final ResourceLocation BASIC_BOUNCE_BROWN = item("basic_bounce_brown");
    public static final ResourceLocation BASIC_BOUNCE_RED = item("basic_bounce_red");
    public static final ResourceLocation BASIC_BOUNCE_ORANGE = item("basic_bounce_orange");
    public static final ResourceLocation BASIC_BOUNCE_YELLOW = item("basic_bounce_yellow");
    public static final ResourceLocation BASIC_BOUNCE_LIME = item("basic_bounce_lime");
    public static final ResourceLocation BASIC_BOUNCE_GREEN = item("basic_bounce_green");
    public static final ResourceLocation BASIC_BOUNCE_CYAN = item("basic_bounce_cyan");
    public static final ResourceLocation BASIC_BOUNCE_LIGHT_BLUE = item("basic_bounce_light_blue");
    public static final ResourceLocation BASIC_BOUNCE_BLUE = item("basic_bounce_blue");
    public static final ResourceLocation BASIC_BOUNCE_PURPLE = item("basic_bounce_purple");
    public static final ResourceLocation BASIC_BOUNCE_MAGENTA = item("basic_bounce_magenta");
    public static final ResourceLocation BASIC_BOUNCE_PINK = item("basic_bounce_pink");

    public static final ResourceLocation BASIC_BOUNCE_WALL = item("basic_bounce_wall");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIGHT_GRAY = item("basic_bounce_wall_light_gray");
    public static final ResourceLocation BASIC_BOUNCE_WALL_GRAY = item("basic_bounce_wall_gray");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BLACK = item("basic_bounce_wall_black");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BROWN = item("basic_bounce_wall_brown");
    public static final ResourceLocation BASIC_BOUNCE_WALL_RED = item("basic_bounce_wall_red");
    public static final ResourceLocation BASIC_BOUNCE_WALL_ORANGE = item("basic_bounce_wall_orange");
    public static final ResourceLocation BASIC_BOUNCE_WALL_YELLOW = item("basic_bounce_wall_yellow");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIME = item("basic_bounce_wall_lime");
    public static final ResourceLocation BASIC_BOUNCE_WALL_GREEN = item("basic_bounce_wall_green");
    public static final ResourceLocation BASIC_BOUNCE_WALL_CYAN = item("basic_bounce_wall_cyan");
    public static final ResourceLocation BASIC_BOUNCE_WALL_LIGHT_BLUE = item("basic_bounce_wall_light_blue");
    public static final ResourceLocation BASIC_BOUNCE_WALL_BLUE = item("basic_bounce_wall_blue");
    public static final ResourceLocation BASIC_BOUNCE_WALL_PURPLE = item("basic_bounce_wall_purple");
    public static final ResourceLocation BASIC_BOUNCE_WALL_MAGENTA = item("basic_bounce_wall_magenta");
    public static final ResourceLocation BASIC_BOUNCE_WALL_PINK = item("basic_bounce_wall_pink");
    
    private static ResourceLocation item(String location) {
        return TextUtil.res(location);
    }
}
