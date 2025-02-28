package com.github.ImagineForge.Radion.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class CommonConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> EXAMPLE_VALUE;

    static {
        BUILDER.push("Radion");

        EXAMPLE_VALUE = BUILDER.define("Example value", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    };

}
