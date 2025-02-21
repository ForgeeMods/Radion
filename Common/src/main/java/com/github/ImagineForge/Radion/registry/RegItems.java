package com.github.ImagineForge.Radion.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class RegItems {
    private static Item uraniumIngotInstance;
    public static final Supplier<Item> URANIUM_INGOT = () -> {
        if (uraniumIngotInstance == null) {
            uraniumIngotInstance = new Item(new Item.Properties());
        }
        return uraniumIngotInstance;
    };

    private static Item uraniumBlockItemInstance;
    public static final Supplier<Item> URANIUM_BLOCK_ITEM = () -> {
        if (uraniumBlockItemInstance == null) {
            uraniumBlockItemInstance = new BlockItem(RegBlocks.URANIUM_BLOCK.get(), new Item.Properties().tab(RegCreativeTabs.RADION_TAB));
        }
        return uraniumBlockItemInstance;
    };
}
