package com.github.ImagineForge.Radion.content.armor;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HazmatSuitRenderer extends GeoArmorRenderer<HazmatSuitItem> {
    public HazmatSuitRenderer() {
        super(new HazmatSuitModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }

}
