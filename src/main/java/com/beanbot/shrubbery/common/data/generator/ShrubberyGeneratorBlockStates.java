package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ShrubberyGeneratorBlockStates extends BlockStateProvider {

    public ShrubberyGeneratorBlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Shrubbery.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(ShrubberyBlocks.AZALEA_HEDGE.get());
        simpleBlock(ShrubberyBlocks.BUSH.get(), models().cross(ShrubberyBlocks.BUSH.getId().getPath(), modLoc("block/bush")).renderType(RenderType.cutout().name));

    }

}
