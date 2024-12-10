package com.beanbot.shrubbery;

import com.beanbot.shrubbery.client.creative.ShrubberyCreativeModeTab;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.items.ShrubberyItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Shrubbery.MODID)
public class Shrubbery {

    public static final String MODID = "shrubbery";

    public static final Logger LOGGER = LogManager.getLogger();

    public Shrubbery(IEventBus bus, Dist dist) {

        ShrubberyItems.ITEMS.register(bus);
        ShrubberyBlocks.BLOCKS.register(bus);
        ShrubberyCreativeModeTab.register(bus);

    }

}
