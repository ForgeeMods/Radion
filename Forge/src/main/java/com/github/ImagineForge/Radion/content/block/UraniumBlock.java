package com.github.ImagineForge.Radion.content.block;

import com.github.ImagineForge.Radion.content.materials.UraniumMaterial;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

public class UraniumBlock {
    public static final UraniumMaterial URANIUM_MATERIAL_DATA = new UraniumMaterial(MaterialColor.STONE, 100);

    private static Block uraniumBlock;

    public static final Supplier<Block> URANIUM_BLOCK = () -> {
        if (uraniumBlock == null) {
            uraniumBlock = new Block(BlockBehaviour.Properties.of(URANIUM_MATERIAL_DATA.getMaterial()));
        }
        return uraniumBlock;
    };
}
