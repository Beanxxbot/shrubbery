package com.beanbot.shrubbery.common.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PrunerItem extends Item {

    public PrunerItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = level.getBlockState(blockPos);
        if (blockState != null) {
            if (blockState.getBlock() instanceof GrassBlock) {
                level.setBlockAndUpdate(blockPos, Blocks.DIRT.defaultBlockState());
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return InteractionResult.PASS;
    }
}
