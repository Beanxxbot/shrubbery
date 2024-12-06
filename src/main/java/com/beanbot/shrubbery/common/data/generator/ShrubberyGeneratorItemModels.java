package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
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
        singleTexture(ShrubberyItems.PRUNER.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pruner"));
    }
}
