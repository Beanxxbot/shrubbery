package com.beanbot.shrubbery.common.items;

import com.beanbot.shrubbery.Shrubbery;
import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.blocks.ShrubberyBushBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class PrunerItem extends Item {

    public PrunerItem() {
        super(new Item.Properties().stacksTo(1).durability(162));
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {

        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = level.getBlockState(blockPos);

        if (blockState != null) {

            BlockState nBlock = null;

            if (blockState.getBlock() instanceof GrassBlock) {
                nBlock = Blocks.DIRT.defaultBlockState();

            }else if (blockState.getBlock() instanceof SweetBerryBushBlock) {
                if (blockState.getValue(SweetBerryBushBlock.AGE) >= 1){
                    nBlock = ShrubberyBlocks.BUSH.get().defaultBlockState();

                }

            }else if (blockState.is(Blocks.AZALEA)) {
                nBlock = ShrubberyBlocks.AZALEA_BUSH.get().defaultBlockState();

            }else if (blockState.is(Blocks.FLOWERING_AZALEA)){
                nBlock = ShrubberyBlocks.FLOWERING_AZALEA_BUSH.get().defaultBlockState();

            }else if (blockState.is(ShrubberyBlocks.BERRY_PLANT.get())){
                nBlock = ShrubberyBlocks.BERRY_BUSH.get().defaultBlockState();

            }else if (blockState.is(ShrubberyBlocks.FLOWERING_BERRY_PLANT.get())){
                nBlock = Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE,3);

            }

            if (nBlock != null){

                level.setBlockAndUpdate(blockPos, nBlock);

                if (!level.isClientSide){
                    Player player = context.getPlayer();
                    player.getItemInHand(context.getHand()).hurtAndBreak(1, player, LivingEntity.getSlotForHand(context.getHand()));
                }

                return InteractionResult.sidedSuccess(level.isClientSide);

            }
        }
        return InteractionResult.PASS;
    }
}
