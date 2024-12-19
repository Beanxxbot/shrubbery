package com.beanbot.shrubbery.common.items;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.blocks.ShrubberyBushBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShrubberyItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Shrubbery.MODID);

    public static final DeferredHolder<Item, BlockItem> AZALEA_HEDGE = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.AZALEA_HEDGE);

    public static final DeferredHolder<Item, BlockItem> BERRY_BUSH = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.BERRY_BUSH);
    public static final DeferredHolder<Item, BlockItem> FLOWERING_BERRY_BUSH = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.FLOWERING_BERRY_BUSH);
    public static final DeferredHolder<Item, BlockItem> BERRY_PLANT = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.BERRY_PLANT);
    public static final DeferredHolder<Item, BlockItem> FLOWERING_BERRY_PLANT = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.FLOWERING_BERRY_PLANT);

    public static final DeferredHolder<Item, BlockItem> AZALEA_BUSH = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.AZALEA_BUSH);
    public static final DeferredHolder<Item, BlockItem> FLOWERING_AZALEA_BUSH = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.FLOWERING_AZALEA_BUSH);

    public static final DeferredHolder<Item, PrunerItem> PRUNER = ITEMS.register("pruner", PrunerItem::new);
    public static final DeferredHolder<Item, HedgeTrimmerItem> HEDGE_TRIMMER = ITEMS.register("hedge_trimmer", HedgeTrimmerItem::new);


}
