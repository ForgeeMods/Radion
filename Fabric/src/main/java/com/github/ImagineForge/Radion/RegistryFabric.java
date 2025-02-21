package com.github.ImagineForge.Radion;

import com.github.ImagineForge.Radion.registry.RegBlocks;
import com.github.ImagineForge.Radion.registry.RegFluids;
import com.github.ImagineForge.Radion.registry.RegItems;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class RegistryFabric {
    public RegistryFabric() {

        // BLOCKS
        Registry.register(Registry.BLOCK, new ResourceLocation(Constants.MOD_ID, "uranium_block"), RegBlocks.URANIUM_BLOCK.get());

        // ITEMS
        Registry.register(Registry.ITEM, new ResourceLocation(Constants.MOD_ID, "uranium_ingot"), RegItems.URANIUM_INGOT.get());
        Registry.register(Registry.ITEM, new ResourceLocation(Constants.MOD_ID, "uranium_block_item"), RegItems.URANIUM_BLOCK_ITEM.get());

        // FLUIDS
        Registry.register(Registry.FLUID, new ResourceLocation(Constants.MOD_ID, "uranium_fluid"), RegFluids.URANIUM_FLUID.get());
        Registry.register(Registry.FLUID, new ResourceLocation(Constants.MOD_ID, "uranium_fluid_flowing"), RegFluids.URANIUM_FLUID_FLOWING.get());

    }
}
