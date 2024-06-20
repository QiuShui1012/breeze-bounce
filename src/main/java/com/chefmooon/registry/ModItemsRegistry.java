package com.chefmooon.registry;

import com.chefmooon.util.TextUtil;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItemsRegistry {
    public static final Item BASIC_BOUNCE = registerBlockItem("basic_bounce", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WHITE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIGHT_GRAY = registerBlockItem("basic_bounce_light_gray", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_GRAY = registerBlockItem("basic_bounce_gray", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BLACK = registerBlockItem("basic_bounce_black", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_BLACK, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BROWN = registerBlockItem("basic_bounce_brown", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_BROWN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_RED = registerBlockItem("basic_bounce_red", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_RED, basicItemProperties()));
    public static final Item BASIC_BOUNCE_ORANGE = registerBlockItem("basic_bounce_orange", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_ORANGE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_YELLOW = registerBlockItem("basic_bounce_yellow", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_YELLOW, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIME = registerBlockItem("basic_bounce_lime", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_LIME, basicItemProperties()));
    public static final Item BASIC_BOUNCE_GREEN = registerBlockItem("basic_bounce_green", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_GREEN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_CYAN = registerBlockItem("basic_bounce_cyan", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_CYAN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIGHT_BLUE = registerBlockItem("basic_bounce_light_blue", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_LIGHT_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BLUE = registerBlockItem("basic_bounce_blue", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_PURPLE = registerBlockItem("basic_bounce_purple", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_PURPLE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_MAGENTA = registerBlockItem("basic_bounce_magenta", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_MAGENTA, basicItemProperties()));
    public static final Item BASIC_BOUNCE_PINK = registerBlockItem("basic_bounce_pink", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_PINK, basicItemProperties()));

    public static final Item BASIC_BOUNCE_WALL = registerBlockItem("basic_bounce_wall", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_WHITE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIGHT_GRAY = registerBlockItem("basic_bounce_wall_light_gray", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_GRAY = registerBlockItem("basic_bounce_wall_gray", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BLACK = registerBlockItem("basic_bounce_wall_black", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLACK, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BROWN = registerBlockItem("basic_bounce_wall_brown", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_BROWN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_RED = registerBlockItem("basic_bounce_wall_red", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_RED, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_ORANGE = registerBlockItem("basic_bounce_wall_orange", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_ORANGE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_YELLOW = registerBlockItem("basic_bounce_wall_yellow", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_YELLOW, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIME = registerBlockItem("basic_bounce_wall_lime", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIME, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_GREEN = registerBlockItem("basic_bounce_wall_green", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_GREEN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_CYAN = registerBlockItem("basic_bounce_wall_cyan", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_CYAN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIGHT_BLUE = registerBlockItem("basic_bounce_wall_light_blue", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_LIGHT_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BLUE = registerBlockItem("basic_bounce_wall_blue", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_PURPLE = registerBlockItem("basic_bounce_wall_purple", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_PURPLE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_MAGENTA = registerBlockItem("basic_bounce_wall_magenta", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_MAGENTA, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_PINK = registerBlockItem("basic_bounce_wall_pink", new BlockItem(ModBlocksRegistry.BASIC_BOUNCE_WALL_PINK, basicItemProperties()));

    private static Item registerBlockItem(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModCreativetabsRegistry.ITEM_GROUP).register(entries -> entries.accept(item));
        return Registry.register(BuiltInRegistries.ITEM, TextUtil.res(name), item);
    }

    public static void register() {

    }

    private static Item.Properties basicItemProperties() {
        return new Item.Properties();
    }
}
