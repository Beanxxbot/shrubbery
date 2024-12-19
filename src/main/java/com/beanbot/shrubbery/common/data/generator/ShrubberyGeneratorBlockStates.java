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

        simpleBlock(ShrubberyBlocks.AZALEA_HEDGE.get());

        simpleBlock(ShrubberyBlocks.BUSH.get(), models().cross(ShrubberyBlocks.BUSH.getId().getPath(), mcLoc("block/sweet_berry_bush_stage1" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.BERRY_BUSH.get(), models().cross(ShrubberyBlocks.BERRY_BUSH.getId().getPath(), mcLoc("block/sweet_berry_bush_stage3" )).renderType(RenderType.cutout().name));
        //simpleBlock(ShrubberyBlocks.BERRY_PLANT.get(), models().cross(ShrubberyBlocks.BERRY_PLANT.getId().getPath(), modLoc("block/berry_plant" )).renderType(RenderType.cutout().name));
        //simpleBlock(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get(), models().cross(ShrubberyBlocks.FLOWERING_BERRY_PLANT.getId().getPath(), modLoc("block/flowering_berry_plant" )).renderType(RenderType.cutout().name));
        simpleBlock(ShrubberyBlocks.BERRY_PLANT.get(), models().cubeTop(ShrubberyBlocks.BERRY_PLANT.getId().getPath(), modLoc("block/berry_plant" ), modLoc("block/berry_plant_top")));
        simpleBlock(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get(), models().cubeTop(ShrubberyBlocks.FLOWERING_BERRY_PLANT.getId().getPath(), modLoc("block/flowering_berry_plant" ), modLoc("block/flowering_berry_plant_top")));

        simpleBlock(ShrubberyBlocks.AZALEA_BUSH.get());
        simpleBlock(ShrubberyBlocks.FLOWERING_AZALEA_BUSH.get());

    }

}
