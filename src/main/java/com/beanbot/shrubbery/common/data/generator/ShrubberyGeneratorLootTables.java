package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.blocks.ShrubberyBushBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ShrubberyGeneratorLootTables extends LootTableProvider {

    public ShrubberyGeneratorLootTables(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(GeneratorBlockLootTables::new, LootContextParamSets.BLOCK)
        ), registries);
    }

    private static class GeneratorBlockLootTables extends BlockLootSubProvider {
        protected GeneratorBlockLootTables(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {

            dropSelf(ShrubberyBlocks.AZALEA_HEDGE.get());

            dropSelf(ShrubberyBlocks.BERRY_BUSH.get());
            dropSelf(ShrubberyBlocks.FLOWERING_BERRY_BUSH.get());
            dropSelf(ShrubberyBlocks.BERRY_PLANT.get());
            dropSelf(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get());

            dropSelf(ShrubberyBlocks.AZALEA_BUSH.get());
            dropSelf(ShrubberyBlocks.FLOWERING_AZALEA_BUSH.get());

        }

        @Override
        protected Iterable<Block> getKnownBlocks(){
            return new ArrayList<>(ShrubberyBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).toList());
        }
    }

}
