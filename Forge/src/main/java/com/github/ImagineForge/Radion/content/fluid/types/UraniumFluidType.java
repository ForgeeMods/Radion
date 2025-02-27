package com.github.ImagineForge.Radion.content.fluid.types;

import com.github.ImagineForge.Radion.registry.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.FluidType;
import com.mojang.math.Vector3f;

public class UraniumFluidType extends BaseFluidType {

    private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("radion:block/uranium_fluid_source");
    private static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("radion:block/uranium_fluid_flowing");
    private static final ResourceLocation OVERLAY_TEXTURE = new ResourceLocation("radion:block/uranium_fluid_overlay");
    private static final int TINT_COLOR = 0xAFFF00;
    private static final Vector3f FOG_COLOR = new Vector3f(0.3F, 0.9F, 0.3F);

    private static final FluidType.Properties PROPERTIES = FluidType.Properties.create()
            .lightLevel(5)
            .density(3000)
            .viscosity(6000)
            .temperature(350)
            .canDrown(true)
            .canSwim(false);

    public UraniumFluidType() {
        super(STILL_TEXTURE, FLOWING_TEXTURE, null, TINT_COLOR, FOG_COLOR, PROPERTIES);
    }
}
