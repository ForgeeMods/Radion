package com.github.ImagineForge.Radion.registry.item;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.content.item.UraniumDioxideDust;
import com.github.ImagineForge.Radion.content.item.UraniumTrioxideDust;
import com.github.ImagineForge.Radion.registry.CreativeTabs;
import com.github.ImagineForge.Radion.registry.blocks.RegisterBlocks;
import com.github.ImagineForge.Radion.registry.fluid.RegisterFluids;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> URANIUM_LIQUID_BUCKET = ITEMS.register("uranium_liquid_bucket",
            () -> new BucketItem(RegisterFluids.URANIUM_FLUID_SOURCE, new Item.Properties().tab(CreativeTabs.RADION_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabs.RADION_TAB)));

    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ITEMS.register("uranium_block",
            () -> new BlockItem(RegisterBlocks.URANIUM_BLOCK.get(), new Item.Properties().tab(CreativeTabs.RADION_TAB)));

    public static final RegistryObject<Item> URANIUM_DIOXIDE_DUST = ITEMS.register("uranium_dioxide_dust",
            () -> new UraniumDioxideDust(new Item.Properties().tab(CreativeTabs.RADION_TAB)));

    public static final RegistryObject<Item> URANIUM_TRIOXIDE_DUST = ITEMS.register("uranium_trioxide_dust",
            () -> new UraniumTrioxideDust(new Item.Properties().tab(CreativeTabs.RADION_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
