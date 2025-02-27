package com.github.ImagineForge.Radion;

import com.github.ImagineForge.Radion.content.block.UraniumBlock;
import com.github.ImagineForge.Radion.content.item.items;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluidTypes;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluids;
import com.github.ImagineForge.Radion.registry.item.RegisterItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryForge {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    public static final RegistryObject<LiquidBlock> URANIUM_LIQUID_BLOCK = BLOCKS.register("uranium_liquid_block",
            () -> new LiquidBlock(RegisterFluids.URANIUM_FLUID_SOURCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public RegistryForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegisterFluids.register(modEventBus);
        RegisterFluidTypes.register(modEventBus);


        // Register Items
        ITEMS.register("uranium_ingot", items.URANIUM_INGOT);
        ITEMS.register("uranium_block_item", items.URANIUM_BLOCK_ITEM);
        ITEMS.register(modEventBus);
        RegisterItems.register(modEventBus);

        // Register Blocks


        BLOCKS.register("uranium_block", UraniumBlock.URANIUM_BLOCK);
        BLOCKS.register(modEventBus);
    }
}
