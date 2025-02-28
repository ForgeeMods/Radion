package com.github.ImagineForge.Radion.content.item;
import com.github.ImagineForge.Radion.content.block.UraniumBlock;
import com.github.ImagineForge.Radion.registry.CreativeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class Items {
    private static Item uraniumIngotInstance;
    public static final Supplier<Item> URANIUM_INGOT = () -> {
        if (uraniumIngotInstance == null) {
            uraniumIngotInstance = new Item(new Item.Properties().tab(CreativeTabs.RADION_TAB));
        }
        return uraniumIngotInstance;
    };

    private static Item uraniumBlockItemInstance;
    public static final Supplier<Item> URANIUM_BLOCK_ITEM = () -> {
        if (uraniumBlockItemInstance == null) {
            uraniumBlockItemInstance = new BlockItem(UraniumBlock.URANIUM_BLOCK.get(), new Item.Properties().tab(CreativeTabs.RADION_TAB));
        }
        return uraniumBlockItemInstance;
    };
}
