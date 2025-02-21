package com.github.ImagineForge.Radion;

import com.github.ImagineForge.Radion.registry.RegBlocks;
import com.github.ImagineForge.Radion.registry.RegFluids;
import com.github.ImagineForge.Radion.registry.RegItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryForge {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Constants.MOD_ID);

    public RegistryForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // ITEMS
        ITEMS.register("uranium_ingot", RegItems.URANIUM_INGOT);
        ITEMS.register("uranium_block_item", RegItems.URANIUM_BLOCK_ITEM);
        ITEMS.register(modEventBus);

        // BLOCKS
        BLOCKS.register("uranium_block", RegBlocks.URANIUM_BLOCK);
        BLOCKS.register(modEventBus);

        // FLUIDS
        FLUIDS.register("uranium_fluid", RegFluids.URANIUM_FLUID);
        FLUIDS.register("uranium_fluid_flowing", RegFluids.URANIUM_FLUID_FLOWING);
        FLUIDS.register(modEventBus);
    }
}
