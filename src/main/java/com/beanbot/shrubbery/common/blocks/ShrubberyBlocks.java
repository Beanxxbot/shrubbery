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

    public static final DeferredHolder<Block, ShrubberyBushBlock> BERRY_BUSH = BLOCKS.register("berry_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> FLOWERING_BERRY_BUSH = BLOCKS.register("flowering_berry_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> BERRY_PLANT = BLOCKS.register("berry_plant", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> FLOWERING_BERRY_PLANT = BLOCKS.register("flowering_berry_plant", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

    public static final DeferredHolder<Block, ShrubberyBushBlock> AZALEA_BUSH = BLOCKS.register("azalea_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> FLOWERING_AZALEA_BUSH = BLOCKS.register("flowering_azalea_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

}
