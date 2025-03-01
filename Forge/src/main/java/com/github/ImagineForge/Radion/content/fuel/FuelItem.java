package com.github.ImagineForge.Radion.content.fuel;

import net.minecraft.world.item.Item;

public abstract class FuelItem extends Item {
    protected int fuelTime;

    public FuelItem(Properties properties, int fuelTime) {
        super(properties);
        this.fuelTime = fuelTime;
    }

    public int getFuelTime() {
        return fuelTime;
    }
}
