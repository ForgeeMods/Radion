package com.github.ImagineForge.Radion.registry;

import com.github.ImagineForge.Radion.fluids.UraniumFluid;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class RegFluids {
    public static final Supplier<FlowingFluid> URANIUM_FLUID = UraniumFluid.Source::new;
    public static final Supplier<FlowingFluid> URANIUM_FLUID_FLOWING = UraniumFluid.Flowing::new;
}
