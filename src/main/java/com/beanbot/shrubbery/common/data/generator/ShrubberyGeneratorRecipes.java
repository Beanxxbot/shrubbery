package com.beanbot.shrubbery.common.data.generator;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ShrubberyGeneratorRecipes extends RecipeProvider {

    public ShrubberyGeneratorRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ShrubberyItems.PRUNER.get())
                .pattern("SI")
                .pattern(" S")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('I', Items.IRON_INGOT)
                .group(Shrubbery.MODID)
                .unlockedBy("has_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,ShrubberyItems.HEDGE_TRIMMER.get())
                .pattern("  I")
                .pattern("SI ")
                .pattern(" S ")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('I', Items.IRON_INGOT)
                .group(Shrubbery.MODID)
                .unlockedBy("has_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .save(output);

    }
}
