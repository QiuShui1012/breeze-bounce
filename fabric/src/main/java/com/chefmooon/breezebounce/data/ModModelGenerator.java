package com.chefmooon.breezebounce.data;

import com.chefmooon.breezebounce.common.block.AbstractBreezeBounceBlock;
import com.chefmooon.breezebounce.data.model.ModModelTemplates;
import com.chefmooon.breezebounce.common.registry.fabric.ModBlocksImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_WHITE, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_LIGHT_GRAY, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_GRAY, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_BLACK, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_BROWN, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_RED, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_ORANGE, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_YELLOW, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_LIME, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_GREEN, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_CYAN, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_LIGHT_BLUE, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_BLUE, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_PURPLE, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_MAGENTA, blockStateModelGenerator);
        createBasicBounceBlock(ModBlocksImpl.BASIC_BOUNCE_PINK, blockStateModelGenerator);

        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_WHITE, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_GRAY, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_GRAY, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_BLACK, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_BROWN, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_RED, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_ORANGE, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_YELLOW, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_LIME, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_GREEN, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_CYAN, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_LIGHT_BLUE, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_BLUE, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_PURPLE, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_MAGENTA, blockStateModelGenerator);
        createBasicBounceWall(ModBlocksImpl.BASIC_BOUNCE_WALL_PINK, blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    private void createBasicBounceBlock(Block block, BlockModelGenerators blockStateModelGenerator) {
        ResourceLocation BASIC_BOUNCE = ModelTemplates.CUBE_ALL.create(ModelLocationUtils.getModelLocation(block),
                TextureMapping.singleSlot(TextureSlot.ALL, ModelLocationUtils.getModelLocation(block)), blockStateModelGenerator.modelOutput);
        ResourceLocation BASIC_BOUNCE_POWERED = ModelTemplates.CUBE_ALL.create(ModelLocationUtils.getModelLocation(block, "_powered"),
                TextureMapping.singleSlot(TextureSlot.ALL, ModelLocationUtils.getModelLocation(block, "_powered")), blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(BlockModelGenerators.createBooleanModelDispatch(AbstractBreezeBounceBlock.POWERED, BASIC_BOUNCE_POWERED, BASIC_BOUNCE)));
        blockStateModelGenerator.delegateItemModel(block, ModelLocationUtils.getModelLocation(block));
    }

    private void createBasicBounceWall(Block block, BlockModelGenerators blockStateModelGenerator) {
        ResourceLocation BASIC_BOUNCE_WALL = ModModelTemplates.TEMPLATE_BOUNCE_WALL.create(ModelLocationUtils.getModelLocation(block),
                TextureMapping.singleSlot(TextureSlot.ALL, ModelLocationUtils.getModelLocation(block)), blockStateModelGenerator.modelOutput);
        ResourceLocation BASIC_BOUNCE_POWERED_WALL = ModModelTemplates.TEMPLATE_BOUNCE_WALL.create(ModelLocationUtils.getModelLocation(block, "_powered"),
                TextureMapping.singleSlot(TextureSlot.ALL, ModelLocationUtils.getModelLocation(block, "_powered")), blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(BlockModelGenerators.createBooleanModelDispatch(AbstractBreezeBounceBlock.POWERED, BASIC_BOUNCE_POWERED_WALL, BASIC_BOUNCE_WALL)));
        blockStateModelGenerator.delegateItemModel(block, BASIC_BOUNCE_WALL);
    }
}
