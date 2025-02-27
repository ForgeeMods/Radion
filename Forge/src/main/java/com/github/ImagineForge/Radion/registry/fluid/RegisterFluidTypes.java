package com.github.ImagineForge.Radion.registry.fluid;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.content.fluid.types.UraniumFluidType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Constants.MOD_ID);

    public static final RegistryObject<FluidType> URANIUM_FLUID_TYPE = FLUID_TYPES.register("uranium_fluid", UraniumFluidType::new);

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }



}
