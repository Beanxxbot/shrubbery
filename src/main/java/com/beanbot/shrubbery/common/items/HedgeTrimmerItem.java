package com.beanbot.shrubbery.common.items;

import com.beanbot.shrubbery.common.blocks.ShrubberyBlocks;
import com.beanbot.shrubbery.common.blocks.ShrubberyBushBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredHolder;

public class HedgeTrimmerItem extends Item{

        public HedgeTrimmerItem() {
            super(new Item.Properties().stacksTo(1).durability(162));
        }

        @Override
        public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {

            Level level = context.getLevel();
            BlockPos blockPos = context.getClickedPos();
            BlockState blockState = level.getBlockState(blockPos);

            if (blockState != null) {

                Block bushBlock = null;

                if (blockState.getBlock() instanceof SweetBerryBushBlock) {

                    bushBlock = switch (blockState.getValue(SweetBerryBushBlock.AGE)) {
                        case 1 -> ShrubberyBlocks.BERRY_PLANT.get();
                        case 3 -> ShrubberyBlocks.FLOWERING_BERRY_PLANT.get();
                        default -> null;
                    };

                }else if(blockState.is(ShrubberyBlocks.AZALEA_BUSH.get())){
                    bushBlock = Blocks.AZALEA;

                }else if(blockState.is(ShrubberyBlocks.FLOWERING_AZALEA_BUSH.get())){
                    bushBlock = Blocks.FLOWERING_AZALEA;
                }

                if (bushBlock != null){

                    level.setBlockAndUpdate(blockPos, bushBlock.defaultBlockState());

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
