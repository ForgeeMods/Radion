package com.github.ImagineForge.Radion.registry;

import com.github.ImagineForge.Radion.content.item.items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {
    public static final CreativeModeTab RADION_TAB = new CreativeModeTab("radion_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(items.URANIUM_INGOT.get().getDefaultInstance().getItem());
        }
    };
}
