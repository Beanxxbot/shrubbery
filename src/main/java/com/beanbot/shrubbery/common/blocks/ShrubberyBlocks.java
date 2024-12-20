package com.beanbot.shrubbery.common.blocks;

import com.beanbot.shrubbery.Shrubbery;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShrubberyBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Shrubbery.MODID);

    public static final DeferredHolder<Block, RotatedPillarBlock> AZALEA_HEDGE = BLOCKS.register("azalea_hedge", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));
    public static final DeferredHolder<Block, RotatedPillarBlock> FLOWERING_AZALEA_HEDGE = BLOCKS.register("flowering_azalea_hedge", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredHolder<Block, RotatedPillarBlock> BERRY_HEDGE = BLOCKS.register("berry_hedge", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));
    public static final DeferredHolder<Block, RotatedPillarBlock> FLOWERING_BERRY_HEDGE = BLOCKS.register("flowering_berry_hedge", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK)));

    public static final DeferredHolder<Block, ShrubberyBushBlock> BERRY_BUSH = BLOCKS.register("berry_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> FLOWERING_BERRY_BUSH = BLOCKS.register("flowering_berry_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyPlantBlock> BERRY_PLANT = BLOCKS.register("berry_plant", () -> new ShrubberyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AZALEA)));
    public static final DeferredHolder<Block, ShrubberyPlantBlock> FLOWERING_BERRY_PLANT = BLOCKS.register("flowering_berry_plant", () -> new ShrubberyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AZALEA)));

    public static final DeferredHolder<Block, ShrubberyBushBlock> AZALEA_BUSH = BLOCKS.register("azalea_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, ShrubberyBushBlock> FLOWERING_AZALEA_BUSH = BLOCKS.register("flowering_azalea_bush", () -> new ShrubberyBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));
    public static final DeferredHolder<Block, AzaleaFlowerBlock> AZALEA_FLOWER = BLOCKS.register("azalea_flower", () -> new AzaleaFlowerBlock(MobEffects.GLOWING, 2, BlockBehaviour.Properties.ofFullCopy(Blocks.WITHER_ROSE)));
}
