package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ShrubberyGeneratorLanguage extends LanguageProvider {
    public ShrubberyGeneratorLanguage(PackOutput output) {
        super(output, Shrubbery.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ShrubberyItems.PRUNER, "Pruner");
    }
}
