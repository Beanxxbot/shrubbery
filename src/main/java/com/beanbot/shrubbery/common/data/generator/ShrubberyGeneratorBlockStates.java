package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.blocks.ShrubberyBushBlock;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.stream.Collectors;

public class ShrubberyGeneratorBlockStates extends BlockStateProvider {

    public ShrubberyGeneratorBlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Shrubbery.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        axisBlock(ShrubberyBlocks.AZALEA_HEDGE.get(), modLoc("block/azalea_hedge"), mcLoc("block/azalea_top"));
        axisBlock(ShrubberyBlocks.FLOWERING_AZALEA_HEDGE.get(), modLoc("block/flowering_azalea_hedge"), mcLoc("block/flowering_azalea_top"));
        axisBlock(ShrubberyBlocks.BERRY_HEDGE.get(), modLoc("block/berry_hedge"), modLoc("block/berry_plant_top"));
        axisBlock(ShrubberyBlocks.FLOWERING_BERRY_HEDGE.get(), modLoc("block/flowering_berry_hedge"), modLoc("block/flowering_berry_plant_top"));

        simpleBlock(ShrubberyBlocks.BERRY_BUSH.get(), models().cross(ShrubberyBlocks.BERRY_BUSH.getId().getPath(), mcLoc("block/sweet_berry_bush_stage1" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.FLOWERING_BERRY_BUSH.get(), models().cross(ShrubberyBlocks.FLOWERING_BERRY_BUSH.getId().getPath(), mcLoc("block/sweet_berry_bush_stage3" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.BERRY_PLANT.get(), models().withExistingParent(ShrubberyBlocks.BERRY_PLANT.getId().getPath(), mcLoc("block/template_azalea")).texture("top", modLoc("block/berry_plant_top")).texture("side",  modLoc("block/berry_plant")).texture("plant", modLoc("block/berry_plant_inside")).texture("particle", "block/berry_plant").renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get(), models().withExistingParent(ShrubberyBlocks.FLOWERING_BERRY_PLANT.getId().getPath(), mcLoc("block/template_azalea")).texture("top", modLoc("block/flowering_berry_plant_top")).texture("side",  modLoc("block/flowering_berry_plant")).texture("plant", modLoc("block/flowering_berry_plant_inside" )).texture("particle", "block/flowering_berry_plant").renderType(RenderType.cutout().name));

        simpleBlock(ShrubberyBlocks.AZALEA_BUSH.get(), models().cross(ShrubberyBlocks.AZALEA_BUSH.getId().getPath(), modLoc("block/azalea_bush" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.FLOWERING_AZALEA_BUSH.get(), models().cross(ShrubberyBlocks.FLOWERING_AZALEA_BUSH.getId().getPath(), modLoc("block/flowering_azalea_bush" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.AZALEA_FLOWER.get(), models().cross(ShrubberyBlocks.AZALEA_FLOWER.getId().getPath(), modLoc("block/azalea_flower" )).renderType(RenderType.cutout().name));

    }

}
