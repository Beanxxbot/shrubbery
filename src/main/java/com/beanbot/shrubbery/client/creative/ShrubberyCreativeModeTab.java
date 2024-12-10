package com.beanbot.shrubbery.client.creative;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@EventBusSubscriber(modid = Shrubbery.MODID, bus = EventBusSubscriber.Bus.MOD)

public class ShrubberyCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> SHRUBBERY_CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Shrubbery.MODID);
    public static Supplier<CreativeModeTab> SHRUBBERY_TAB = SHRUBBERY_CREATIVE_TABS.register("shrubbery_tab", () ->
            CreativeModeTab.builder().icon(() ->
                    new ItemStack(ShrubberyItems.PRUNER.get())
            ).title(Component.translatable("shrubbery.creativetab")).build()
    );

    public static void register(IEventBus bus){
        SHRUBBERY_CREATIVE_TABS.register(bus);
    }

    @SubscribeEvent
    public static void populate(BuildCreativeModeTabContentsEvent event){
        if (event.getTab() == SHRUBBERY_TAB.get()){
            for (var item : ShrubberyItems.ITEMS.getEntries()){
                event.accept(item.get());
            }
        }
    }

}
