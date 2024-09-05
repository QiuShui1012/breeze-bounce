package com.chefmooon.breezebounce.common.registry.fabric;

import com.chefmooon.breezebounce.common.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static com.chefmooon.breezebounce.common.registry.ModItems.basicItemProperties;

public class ModItemsImpl {
    public static final Item BASIC_BOUNCE = registerItem(ModItems.BASIC_BOUNCE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WHITE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIGHT_GRAY = registerItem(ModItems.BASIC_BOUNCE_LIGHT_GRAY, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_GRAY = registerItem(ModItems.BASIC_BOUNCE_GRAY, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BLACK = registerItem(ModItems.BASIC_BOUNCE_BLACK, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BLACK, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BROWN = registerItem(ModItems.BASIC_BOUNCE_BROWN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BROWN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_RED = registerItem(ModItems.BASIC_BOUNCE_RED, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_RED, basicItemProperties()));
    public static final Item BASIC_BOUNCE_ORANGE = registerItem(ModItems.BASIC_BOUNCE_ORANGE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_ORANGE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_YELLOW = registerItem(ModItems.BASIC_BOUNCE_YELLOW, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_YELLOW, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIME = registerItem(ModItems.BASIC_BOUNCE_LIME, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIME, basicItemProperties()));
    public static final Item BASIC_BOUNCE_GREEN = registerItem(ModItems.BASIC_BOUNCE_GREEN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_GREEN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_CYAN = registerItem(ModItems.BASIC_BOUNCE_CYAN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_CYAN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_LIGHT_BLUE = registerItem(ModItems.BASIC_BOUNCE_LIGHT_BLUE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_BLUE = registerItem(ModItems.BASIC_BOUNCE_BLUE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_PURPLE = registerItem(ModItems.BASIC_BOUNCE_PURPLE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_PURPLE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_MAGENTA = registerItem(ModItems.BASIC_BOUNCE_MAGENTA, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_MAGENTA, basicItemProperties()));
    public static final Item BASIC_BOUNCE_PINK = registerItem(ModItems.BASIC_BOUNCE_PINK, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_PINK, basicItemProperties()));

    public static final Item BASIC_BOUNCE_WALL = registerItem(ModItems.BASIC_BOUNCE_WALL, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIGHT_GRAY = registerItem(ModItems.BASIC_BOUNCE_WALL_LIGHT_GRAY, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_GRAY = registerItem(ModItems.BASIC_BOUNCE_WALL_GRAY, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BLACK = registerItem(ModItems.BASIC_BOUNCE_WALL_BLACK, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BROWN = registerItem(ModItems.BASIC_BOUNCE_WALL_BROWN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_RED = registerItem(ModItems.BASIC_BOUNCE_WALL_RED, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_RED, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_ORANGE = registerItem(ModItems.BASIC_BOUNCE_WALL_ORANGE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_YELLOW = registerItem(ModItems.BASIC_BOUNCE_WALL_YELLOW, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIME = registerItem(ModItems.BASIC_BOUNCE_WALL_LIME, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_GREEN = registerItem(ModItems.BASIC_BOUNCE_WALL_GREEN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_CYAN = registerItem(ModItems.BASIC_BOUNCE_WALL_CYAN, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_LIGHT_BLUE = registerItem(ModItems.BASIC_BOUNCE_WALL_LIGHT_BLUE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_BLUE = registerItem(ModItems.BASIC_BOUNCE_WALL_BLUE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_PURPLE = registerItem(ModItems.BASIC_BOUNCE_WALL_PURPLE, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_MAGENTA = registerItem(ModItems.BASIC_BOUNCE_WALL_MAGENTA, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA, basicItemProperties()));
    public static final Item BASIC_BOUNCE_WALL_PINK = registerItem(ModItems.BASIC_BOUNCE_WALL_PINK, new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK, basicItemProperties()));

    private static Item registerItem(ResourceLocation location, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModCreativeTabs.ITEM_GROUP).register(entries -> entries.accept(item));
        return Registry.register(BuiltInRegistries.ITEM, location, item);
    }

    public static void register() {

    }
}
