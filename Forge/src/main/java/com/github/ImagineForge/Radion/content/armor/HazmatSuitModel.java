package com.github.ImagineForge.Radion.content.armor;

import com.github.ImagineForge.Radion.Constants;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HazmatSuitModel extends AnimatedGeoModel<HazmatSuitItem> {
    @Override
    public ResourceLocation getModelResource(HazmatSuitItem hazmatSuitItem) {
        return new ResourceLocation(Constants.MOD_ID, "geo/hazmat_suit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HazmatSuitItem hazmatSuitItem) {
        return new ResourceLocation(Constants.MOD_ID, "textures/armor/hazmat_suit.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HazmatSuitItem hazmatSuitItem) {
        return new ResourceLocation(Constants.MOD_ID, "animations/armor/hazmat_suit.json");
    }
}
