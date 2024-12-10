package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Shrubbery.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ShrubberyGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ShrubberyGeneratorLanguage(packOutput));

        generator.addProvider(event.includeClient(), new ShrubberyGeneratorBlockStates(packOutput, event.getExistingFileHelper()));

        generator.addProvider(event.includeClient(), new ShrubberyGeneratorItemModels(packOutput, event.getExistingFileHelper()));

        generator.addProvider(event.includeClient(), new ShrubberyGeneratorRecipes(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new ShrubberyGeneratorLootTables(packOutput, lookupProvider));
    }
}
