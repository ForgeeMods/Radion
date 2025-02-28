package com.github.ImagineForge.Radion.registry.fluid;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.RegistryForge;
import com.github.ImagineForge.Radion.content.fluid.types.UraniumFluidType;
import com.github.ImagineForge.Radion.registry.blocks.RegisterBlocks;
import com.github.ImagineForge.Radion.registry.item.RegisterItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegisterFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Constants.MOD_ID);

    public static final RegistryObject<FlowingFluid> URANIUM_FLUID_SOURCE = FLUIDS.register("uranium_fluid_source",
            ()-> new ForgeFlowingFluid.Source(RegisterFluids.URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> URANIUM_FLUID_FLOWING = FLUIDS.register("uranium_fluid_flowing",
            ()-> new ForgeFlowingFluid.Flowing(RegisterFluids.URANIUM_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RegisterFluidTypes.URANIUM_FLUID_TYPE,  URANIUM_FLUID_SOURCE, URANIUM_FLUID_FLOWING).slopeFindDistance(5).levelDecreasePerBlock(5).block(RegisterBlocks.URANIUM_LIQUID_BLOCK).bucket(RegisterItems.URANIUM_LIQUID_BUCKET);


    public static void register(IEventBus eventBus){
        FLUIDS.register(eventBus);
    }
}
