package com.github.ImagineForge.Radion.registry.features;

import com.github.ImagineForge.Radion.Constants;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class RegisterPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(
            Registry.PLACED_FEATURE_REGISTRY, Constants.MOD_ID);

    public static final RegistryObject<PlacedFeature> URANIUM_ORE = PLACED_FEATURES.register("uranium_ore",
            () -> new PlacedFeature(RegisterConfiguredFeatures.URANIUM_ORE.getHolder().get(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(30)
                    ))));

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    public static void register(IEventBus eventBus) { PLACED_FEATURES.register(eventBus); }
}