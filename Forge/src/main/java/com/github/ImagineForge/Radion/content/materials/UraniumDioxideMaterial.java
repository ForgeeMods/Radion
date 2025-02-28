package com.github.ImagineForge.Radion.content.materials;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class UraniumDioxideMaterial {
    private final Material material;
    private final int radiationLevel;

    public UraniumDioxideMaterial(MaterialColor color, int radiationLevel) {
        this.material = new Material.Builder(color).build();
        this.radiationLevel = radiationLevel;
    }

    public Material getMaterial() {
        return material;
    }

    public int getRadiationLevel() {
        return radiationLevel;
    }
}
