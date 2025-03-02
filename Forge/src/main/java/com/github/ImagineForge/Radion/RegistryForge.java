package com.github.ImagineForge.Radion;

import com.github.ImagineForge.Radion.registry.blocks.RegisterBlocks;
import com.github.ImagineForge.Radion.registry.features.RegisterConfiguredFeatures;
import com.github.ImagineForge.Radion.registry.features.RegisterPlacedFeatures;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluidTypes;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluids;
import com.github.ImagineForge.Radion.registry.item.RegisterItems;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryForge {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);


    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegisterFluids.register(modEventBus);
        RegisterFluidTypes.register(modEventBus);

        RegisterItems.register(modEventBus);

        RegisterBlocks.register(modEventBus);

        RegisterConfiguredFeatures.register(modEventBus);
        RegisterPlacedFeatures.register(modEventBus);
    }
}
