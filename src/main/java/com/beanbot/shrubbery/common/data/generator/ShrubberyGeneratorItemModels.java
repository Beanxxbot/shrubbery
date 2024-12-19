package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ShrubberyGeneratorItemModels extends ItemModelProvider {
    public ShrubberyGeneratorItemModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Shrubbery.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleBlockItem(ShrubberyBlocks.AZALEA_HEDGE.get());

        simpleBlockItem(ShrubberyBlocks.BERRY_PLANT.get());
        simpleBlockItem(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get());
        singleTexture(ShrubberyItems.BERRY_BUSH.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("block/sweet_berry_bush_stage1"));
        singleTexture(ShrubberyItems.FLOWERING_BERRY_BUSH.getId().getPath(), mcLoc("item/generated"), "layer0", mcLoc("block/sweet_berry_bush_stage3"));
        //singleTexture(ShrubberyItems.BERRY_PLANT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/berry_plant"));
        //singleTexture(ShrubberyItems.FLOWERING_BERRY_PLANT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/flowering_berry_plant"));

        singleTexture(ShrubberyItems.AZALEA_BUSH.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/azalea_bush"));
        singleTexture(ShrubberyItems.FLOWERING_AZALEA_BUSH.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("block/flowering_azalea_bush"));

        singleTexture(ShrubberyItems.PRUNER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pruner"));
        singleTexture(ShrubberyItems.HEDGE_TRIMMER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/hedge_trimmer"));

    }
}
