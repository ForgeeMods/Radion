package com.github.ImagineForge.Radion.content.fuel;

import net.minecraft.world.item.Item;

public abstract class FuelItem extends Item {
    protected int usableFuel;

    public FuelItem(Properties properties) {
        super(properties);
    }

    public void removeUsableFuel(int amount) {
        usableFuel -= amount;
        if (usableFuel <= 0) {
            usableFuel = 0;
        }
    }

    public boolean isUsable() {
        return usableFuel > 0;
    }
}
