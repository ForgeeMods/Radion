package com.github.ImagineForge.Radion.registry.features;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.registry.blocks.RegisterBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class RegisterConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Constants.MOD_ID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_REPLACEMENT =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                            RegisterBlocks.URANIUM_ORE.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                            RegisterBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> URANIUM_ORE =
            CONFIGURED_FEATURES.register("uranium_ore",
                    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_REPLACEMENT.get(), 9)));

    public static void register(IEventBus eventBus) { CONFIGURED_FEATURES.register(eventBus); }
}
