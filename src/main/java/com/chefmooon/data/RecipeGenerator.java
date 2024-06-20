package com.chefmooon.data;

import com.chefmooon.registry.ModItemsRegistry;
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

        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE, Items.WHITE_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_LIGHT_GRAY, Items.LIGHT_GRAY_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_GRAY, Items.GRAY_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_BLACK, Items.BLACK_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_BROWN, Items.BROWN_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_RED, Items.RED_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_ORANGE, Items.ORANGE_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_YELLOW, Items.YELLOW_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_LIME, Items.LIME_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_GREEN, Items.GREEN_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_CYAN, Items.CYAN_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_LIGHT_BLUE, Items.LIGHT_BLUE_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_BLUE, Items.BLUE_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_PURPLE, Items.PURPLE_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_MAGENTA, Items.MAGENTA_WOOL, exporter);
        basicBounceBlock(ModItemsRegistry.BASIC_BOUNCE_PINK, Items.PINK_WOOL, exporter);

        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL, ModItemsRegistry.BASIC_BOUNCE, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_LIGHT_GRAY, ModItemsRegistry.BASIC_BOUNCE_LIGHT_GRAY, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_GRAY, ModItemsRegistry.BASIC_BOUNCE_GRAY, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_BLACK, ModItemsRegistry.BASIC_BOUNCE_BLACK, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_BROWN, ModItemsRegistry.BASIC_BOUNCE_BROWN, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_RED, ModItemsRegistry.BASIC_BOUNCE_RED, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_ORANGE, ModItemsRegistry.BASIC_BOUNCE_ORANGE, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_YELLOW, ModItemsRegistry.BASIC_BOUNCE_YELLOW, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_LIME, ModItemsRegistry.BASIC_BOUNCE_LIME, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_GREEN, ModItemsRegistry.BASIC_BOUNCE_GREEN, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_CYAN, ModItemsRegistry.BASIC_BOUNCE_CYAN, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_LIGHT_BLUE, ModItemsRegistry.BASIC_BOUNCE_LIGHT_BLUE, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_BLUE, ModItemsRegistry.BASIC_BOUNCE_BLUE, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_PURPLE, ModItemsRegistry.BASIC_BOUNCE_PURPLE, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_MAGENTA, ModItemsRegistry.BASIC_BOUNCE_MAGENTA, exporter);
        basicBounceWallBlock(ModItemsRegistry.BASIC_BOUNCE_WALL_PINK, ModItemsRegistry.BASIC_BOUNCE_PINK, exporter);
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
