package com.github.ImagineForge.Radion.content.item;

import com.github.ImagineForge.Radion.content.fuel.FuelItem;

public class UraniumDioxideDust extends FuelItem {
    public UraniumDioxideDust(Properties properties) {
        super(properties);
        usableFuel = 20 * 60;
    }
}
