package com.github.ImagineForge.Radion.registry.blocks;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.content.materials.UraniumMaterial;
import com.github.ImagineForge.Radion.registry.CreativeTabs;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluids;
import com.github.ImagineForge.Radion.registry.item.RegisterItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegisterBlocks {
    public static final UraniumMaterial URANIUM_MATERIAL_DATA = new UraniumMaterial(MaterialColor.STONE, 100);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    public static final RegistryObject<LiquidBlock> URANIUM_LIQUID_BLOCK = BLOCKS.register("uranium_liquid_block",
            () -> new LiquidBlock(RegisterFluids.URANIUM_FLUID_SOURCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
        () -> new Block(BlockBehaviour.Properties.of(URANIUM_MATERIAL_DATA.getMaterial())),
        CreativeTabs.RADION_TAB);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> supplier, CreativeModeTab tab) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        RegisterItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        return block;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
