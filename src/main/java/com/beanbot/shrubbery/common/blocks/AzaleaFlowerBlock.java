package com.beanbot.shrubbery.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AzaleaFlowerBlock extends FlowerBlock {

    public AzaleaFlowerBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
        super(effect, seconds, properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        VoxelShape voxelshape = this.getShape(state, level, pos, CollisionContext.empty());
        Vec3 vec3 = voxelshape.bounds().getCenter();
        double d0 = (double)pos.getX() + vec3.x;
        double d1 = (double)pos.getZ() + vec3.z;

        for (int i = 0; i < 1; i++) {
            if (random.nextInt(1, 5) == 1) {
                level.addParticle(
                        ParticleTypes.SPORE_BLOSSOM_AIR,
                        d0 + random.nextDouble() / 5.0,
                        (double)pos.getY() + (1.5 - random.nextDouble()),
                        d1 + random.nextDouble() / 5.0,
                        0.0,
                        0.0,
                        0.0
                );
            }
        }
    }

}
