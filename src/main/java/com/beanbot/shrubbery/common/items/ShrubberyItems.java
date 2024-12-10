package com.beanbot.shrubbery.common.items;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShrubberyItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Shrubbery.MODID);

    public static final DeferredHolder<Item, PrunerItem> PRUNER = ITEMS.register("pruner", PrunerItem::new);
    public static final DeferredHolder<Item, BlockItem> AZALEA_HEDGE = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.AZALEA_HEDGE);
    public static final DeferredHolder<Item, BlockItem> BUSH = ITEMS.registerSimpleBlockItem(ShrubberyBlocks.BUSH);

}
