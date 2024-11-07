package com.chefmooon.breezebounce.data;

import com.chefmooon.breezebounce.BreezeBounce;
import com.chefmooon.breezebounce.common.registry.ModItems;
import com.chefmooon.breezebounce.common.registry.fabric.ModCreativeTabs;
import com.chefmooon.breezebounce.common.registry.fabric.ModItemsImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class TranslationGenerator extends FabricLanguageProvider {

    protected TranslationGenerator(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        String SUBTITLE = BreezeBounce.MOD_ID + ".subtitles.";

        translationBuilder.add(ModCreativeTabs.ITEM_GROUP, "Breeze Bounce");

        translationBuilder.add(SUBTITLE + "bounce_block_inflate", "Bounce Block Inflated");
        translationBuilder.add(SUBTITLE + "bounce_block_deflate", "Bounce Block Deflated");
        translationBuilder.add(SUBTITLE + "bounce_block_bounce", "Squeaky Bounce");
        translationBuilder.add(SUBTITLE + "bounce_block_step", "Squeaky Step");

        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE, "Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_LIGHT_GRAY, "Light Gray Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_GRAY, "Gray Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_BLACK, "Black Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_BROWN, "Brown Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_RED, "Red Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_ORANGE, "Orange Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_YELLOW, "Yellow Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_LIME, "Lime Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_GREEN, "Green Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_CYAN, "Cyan Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_LIGHT_BLUE, "Light Blue Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_BLUE, "Blue Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_PURPLE, "Purple Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_MAGENTA, "Magenta Bounce Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_PINK, "Pink Bounce Block");

        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_WHITE, "White Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_LIGHT_GRAY, "Light Gray Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_GRAY, "Gray Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_BLACK, "Black Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_BROWN, "Brown Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_RED, "Red Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_ORANGE, "Orange Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_YELLOW, "Yellow Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_LIME, "Lime Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_GREEN, "Green Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_CYAN, "Cyan Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_LIGHT_BLUE, "Light Blue Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_BLUE, "Blue Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_PURPLE, "Purple Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_MAGENTA, "Magenta Bounce Slab Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_SLAB_PINK, "Pink Bounce Slab Block");

        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_WHITE, "White Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_LIGHT_GRAY, "Light Gray Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_GRAY, "Gray Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_BLACK, "Black Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_BROWN, "Brown Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_RED, "Red Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_ORANGE, "Orange Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_YELLOW, "Yellow Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_LIME, "Lime Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_GREEN, "Green Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_CYAN, "Cyan Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_LIGHT_BLUE, "Light Blue Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_BLUE, "Blue Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_PURPLE, "Purple Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_MAGENTA, "Magenta Bounce Stair Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_STAIR_PINK, "Pink Bounce Stair Block");


        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL, "Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY, "Light Gray Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_GRAY, "Gray Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_BLACK, "Black Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_BROWN, "Brown Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_RED, "Red Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_ORANGE, "Orange Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_YELLOW, "Yellow Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_LIME, "Lime Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_GREEN, "Green Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_CYAN, "Cyan Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE, "Light Blue Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_BLUE, "Blue Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_PURPLE, "Purple Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_MAGENTA, "Magenta Bounce Post Block");
        translationBuilder.add(ModItemsImpl.BASIC_BOUNCE_WALL_PINK, "Pink Bounce Post Block");
    }

    private static Item getItem(ResourceLocation location) {
        return BuiltInRegistries.ITEM.get(location);
    }
}
