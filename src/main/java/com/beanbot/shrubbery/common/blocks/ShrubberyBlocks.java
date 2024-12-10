package com.beanbot.shrubbery.common.blocks;

import com.beanbot.shrubbery.Shrubbery;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShrubberyBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Shrubbery.MODID);
    public static final DeferredHolder<Block, Block> AZALEA_HEDGE = BLOCKS.register("azalea_hedge", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> BUSH = BLOCKS.register("bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

}
