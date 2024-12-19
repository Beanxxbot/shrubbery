package com.beanbot.shrubbery.common.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShrubberyPlantBlock extends BushBlock {
    public static final MapCodec<ShrubberyPlantBlock> CODEC = simpleCodec(ShrubberyPlantBlock::new);
    private static final VoxelShape SHAPE = Shapes.or(Block.box((double)0.0F, (double)8.0F, (double)0.0F, (double)16.0F, (double)16.0F, (double)16.0F), Block.box((double)6.0F, (double)0.0F, (double)6.0F, (double)10.0F, (double)8.0F, (double)10.0F));

    public MapCodec<ShrubberyPlantBlock> codec() { return CODEC; }

    public ShrubberyPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    //TODO - Potentially make this definable in the constructor?
    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return super.mayPlaceOn(state, level, pos);
    }
}
