package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ShrubberyGeneratorLanguage extends LanguageProvider {
    public ShrubberyGeneratorLanguage(PackOutput output) {
        super(output, Shrubbery.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {

        addBlock(ShrubberyBlocks.AZALEA_HEDGE, "Azalea Hedge");

        addBlock(ShrubberyBlocks.BERRY_BUSH, "Berry Bush");
        addBlock(ShrubberyBlocks.FLOWERING_BERRY_BUSH, "Flowering Berry Bush");
        addBlock(ShrubberyBlocks.BERRY_PLANT, "Berry Plant");
        addBlock(ShrubberyBlocks.FLOWERING_BERRY_PLANT, "Flowering Berry Plant");

        addBlock(ShrubberyBlocks.AZALEA_BUSH, "Azalea Bush");
        addBlock(ShrubberyBlocks.FLOWERING_AZALEA_BUSH, "Flowering Azalea Bush");

        addItem(ShrubberyItems.PRUNER, "Pruner");
        addItem(ShrubberyItems.HEDGE_TRIMMER, "Hedge Trimmer");


        add(Shrubbery.MODID + ".creativetab","Shrubbery");
    }
}
