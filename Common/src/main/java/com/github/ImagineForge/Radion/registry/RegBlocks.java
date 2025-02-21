package com.github.ImagineForge.Radion.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

public class RegBlocks {
    private static Block uraniumBlock;

    public static final Supplier<Block> URANIUM_BLOCK = () -> {
        if (uraniumBlock == null) {
            uraniumBlock = new Block(BlockBehaviour.Properties.of(Material.STONE));
        }
        return uraniumBlock;
    };
}
