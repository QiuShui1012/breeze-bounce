package com.chefmooon.breezebounce.data;

import com.chefmooon.breezebounce.common.registry.fabric.ModItemsImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {

        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE, Items.WHITE_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_LIGHT_GRAY, Items.LIGHT_GRAY_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_GRAY, Items.GRAY_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_BLACK, Items.BLACK_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_BROWN, Items.BROWN_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_RED, Items.RED_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_ORANGE, Items.ORANGE_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_YELLOW, Items.YELLOW_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_LIME, Items.LIME_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_GREEN, Items.GREEN_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_CYAN, Items.CYAN_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_LIGHT_BLUE, Items.LIGHT_BLUE_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_BLUE, Items.BLUE_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_PURPLE, Items.PURPLE_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_MAGENTA, Items.MAGENTA_WOOL, exporter);
        basicBounceBlock(ModItemsImpl.BASIC_BOUNCE_PINK, Items.PINK_WOOL, exporter);

        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL, ModItemsImpl.BASIC_BOUNCE, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY, ModItemsImpl.BASIC_BOUNCE_LIGHT_GRAY, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_GRAY, ModItemsImpl.BASIC_BOUNCE_GRAY, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_BLACK, ModItemsImpl.BASIC_BOUNCE_BLACK, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_BROWN, ModItemsImpl.BASIC_BOUNCE_BROWN, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_RED, ModItemsImpl.BASIC_BOUNCE_RED, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_ORANGE, ModItemsImpl.BASIC_BOUNCE_ORANGE, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_YELLOW, ModItemsImpl.BASIC_BOUNCE_YELLOW, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_LIME, ModItemsImpl.BASIC_BOUNCE_LIME, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_GREEN, ModItemsImpl.BASIC_BOUNCE_GREEN, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_CYAN, ModItemsImpl.BASIC_BOUNCE_CYAN, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE, ModItemsImpl.BASIC_BOUNCE_LIGHT_BLUE, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_BLUE, ModItemsImpl.BASIC_BOUNCE_BLUE, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_PURPLE, ModItemsImpl.BASIC_BOUNCE_PURPLE, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_MAGENTA, ModItemsImpl.BASIC_BOUNCE_MAGENTA, exporter);
        basicBounceWallBlock(ModItemsImpl.BASIC_BOUNCE_WALL_PINK, ModItemsImpl.BASIC_BOUNCE_PINK, exporter);
    }

    private static void basicBounceBlock(Item output, Item wool, RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
                .pattern("BAB")
                .pattern("ACA")
                .pattern("BAB")
                .define('A', wool)
                .define('B', Items.LEATHER)
                .define('C', Items.WIND_CHARGE)
                .unlockedBy(RecipeProvider.getHasName(Items.WIND_CHARGE), RecipeProvider.has(Items.WIND_CHARGE))
                .save(exporter, RecipeProvider.getSimpleRecipeName(output));
    }

    private static void basicBounceWallBlock(Item output, Item input, RecipeOutput exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 8)
                .pattern("   ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', input)
                .unlockedBy(RecipeProvider.getHasName(input), RecipeProvider.has(input))
                .save(exporter, RecipeProvider.getSimpleRecipeName(output));
    }
}
