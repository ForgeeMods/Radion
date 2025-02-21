package com.github.ImagineForge.Radion;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;

public class Radion implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
        new RegistryFabric();
    }
}
