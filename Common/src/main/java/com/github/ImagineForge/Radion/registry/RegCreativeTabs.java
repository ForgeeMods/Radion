package com.github.ImagineForge.Radion.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class RegCreativeTabs {
    public static final CreativeModeTab RADION_TAB = new CreativeModeTab(1, "radion_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegItems.URANIUM_INGOT.get().getDefaultInstance().getItem());
        }
    };
}
