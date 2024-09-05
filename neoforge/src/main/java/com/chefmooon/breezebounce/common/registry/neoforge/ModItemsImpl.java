package com.chefmooon.breezebounce.common.registry.neoforge;

import com.chefmooon.breezebounce.BreezeBounce;
import com.chefmooon.breezebounce.common.registry.ModItems;
import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static com.chefmooon.breezebounce.common.registry.ModItems.basicItemProperties;

public class ModItemsImpl {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, BreezeBounce.MOD_ID);
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static final Supplier<Item> BASIC_BOUNCE = registerItem(ModItems.BASIC_BOUNCE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WHITE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_LIGHT_GRAY = registerItem(ModItems.BASIC_BOUNCE_LIGHT_GRAY, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_GRAY = registerItem(ModItems.BASIC_BOUNCE_GRAY, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_GRAY.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_BLACK = registerItem(ModItems.BASIC_BOUNCE_BLACK, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BLACK.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_BROWN = registerItem(ModItems.BASIC_BOUNCE_BROWN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BROWN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_RED = registerItem(ModItems.BASIC_BOUNCE_RED, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_RED.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_ORANGE = registerItem(ModItems.BASIC_BOUNCE_ORANGE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_ORANGE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_YELLOW = registerItem(ModItems.BASIC_BOUNCE_YELLOW, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_YELLOW.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_LIME = registerItem(ModItems.BASIC_BOUNCE_LIME, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIME.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_GREEN = registerItem(ModItems.BASIC_BOUNCE_GREEN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_GREEN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_CYAN = registerItem(ModItems.BASIC_BOUNCE_CYAN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_CYAN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_LIGHT_BLUE = registerItem(ModItems.BASIC_BOUNCE_LIGHT_BLUE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_BLUE = registerItem(ModItems.BASIC_BOUNCE_BLUE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_BLUE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_PURPLE = registerItem(ModItems.BASIC_BOUNCE_PURPLE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_PURPLE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_MAGENTA = registerItem(ModItems.BASIC_BOUNCE_MAGENTA, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_MAGENTA.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_PINK = registerItem(ModItems.BASIC_BOUNCE_PINK, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_PINK.get(), basicItemProperties()));

    public static final Supplier<Item> BASIC_BOUNCE_WALL = registerItem(ModItems.BASIC_BOUNCE_WALL, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_LIGHT_GRAY = registerItem(ModItems.BASIC_BOUNCE_WALL_LIGHT_GRAY, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_GRAY = registerItem(ModItems.BASIC_BOUNCE_WALL_GRAY, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_BLACK = registerItem(ModItems.BASIC_BOUNCE_WALL_BLACK, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_BROWN = registerItem(ModItems.BASIC_BOUNCE_WALL_BROWN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_RED = registerItem(ModItems.BASIC_BOUNCE_WALL_RED, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_RED.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_ORANGE = registerItem(ModItems.BASIC_BOUNCE_WALL_ORANGE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_YELLOW = registerItem(ModItems.BASIC_BOUNCE_WALL_YELLOW, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_LIME = registerItem(ModItems.BASIC_BOUNCE_WALL_LIME, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_GREEN = registerItem(ModItems.BASIC_BOUNCE_WALL_GREEN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_CYAN = registerItem(ModItems.BASIC_BOUNCE_WALL_CYAN, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_LIGHT_BLUE = registerItem(ModItems.BASIC_BOUNCE_WALL_LIGHT_BLUE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_BLUE = registerItem(ModItems.BASIC_BOUNCE_WALL_BLUE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_PURPLE = registerItem(ModItems.BASIC_BOUNCE_WALL_PURPLE, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_MAGENTA = registerItem(ModItems.BASIC_BOUNCE_WALL_MAGENTA, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA.get(), basicItemProperties()));
    public static final Supplier<Item> BASIC_BOUNCE_WALL_PINK = registerItem(ModItems.BASIC_BOUNCE_WALL_PINK, () -> new BlockItem(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK.get(), basicItemProperties()));

    public static Supplier<Item> registerItem(final ResourceLocation location, final Supplier<Item> supplier) {
        Supplier<Item> item = ITEMS.register(location.getPath(), supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
