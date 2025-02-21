package com.github.ImagineForge.Radion.fluids;

import com.github.ImagineForge.Radion.registry.RegFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

public abstract class UraniumFluid extends FlowingFluid {

    public static class Flowing extends UraniumFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public Item getBucket() {
            return null;
        }

        @Override
        protected boolean canBeReplacedWith(FluidState var1, BlockGetter var2, BlockPos var3, Fluid var4, Direction var5) {
            return false;
        }

        @Override
        public int getTickDelay(LevelReader var1) {
            return 0;
        }

        @Override
        protected float getExplosionResistance() {
            return 0;
        }

        @Override
        protected BlockState createLegacyBlock(FluidState var1) {
            return null;
        }

        @Override
        protected boolean canConvertToSource() {
            return false;
        }

        @Override
        protected void beforeDestroyingBlock(LevelAccessor var1, BlockPos var2, BlockState var3) {

        }

        @Override
        protected int getSlopeFindDistance(LevelReader var1) {
            return 0;
        }

        @Override
        protected int getDropOff(LevelReader var1) {
            return 0;
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Source extends UraniumFluid {
        @Override
        protected boolean canConvertToSource() {
            return false;
        }

        @Override
        protected void beforeDestroyingBlock(LevelAccessor var1, BlockPos var2, BlockState var3) {

        }

        @Override
        protected int getSlopeFindDistance(LevelReader var1) {
            return 0;
        }

        @Override
        protected int getDropOff(LevelReader var1) {
            return 0;
        }

        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public Item getBucket() {
            return null;
        }

        @Override
        protected boolean canBeReplacedWith(FluidState var1, BlockGetter var2, BlockPos var3, Fluid var4, Direction var5) {
            return false;
        }

        @Override
        public int getTickDelay(LevelReader var1) {
            return 0;
        }

        @Override
        protected float getExplosionResistance() {
            return 0;
        }

        @Override
        protected BlockState createLegacyBlock(FluidState var1) {
            return null;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }

    @Override
    public Fluid getFlowing() {
        return RegFluids.URANIUM_FLUID_FLOWING.get();
    }

    @Override
    public Fluid getSource() {
        return RegFluids.URANIUM_FLUID.get();
    }
}
