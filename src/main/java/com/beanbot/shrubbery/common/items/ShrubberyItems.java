package com.beanbot.shrubbery.common.items;

import com.beanbot.shrubbery.Shrubbery;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShrubberyItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Shrubbery.MODID);

    public static final DeferredHolder<Item, Item> PRUNER = ITEMS.register("pruner", () -> new Item(new Item.Properties().stacksTo(1)));
}
