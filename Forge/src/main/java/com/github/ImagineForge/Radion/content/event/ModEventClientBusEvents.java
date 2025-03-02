package com.github.ImagineForge.Radion.content.event;

import com.github.ImagineForge.Radion.Constants;
import com.github.ImagineForge.Radion.content.armor.HazmatSuitItem;
import com.github.ImagineForge.Radion.content.armor.HazmatSuitRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(HazmatSuitItem.class, HazmatSuitRenderer::new);
    }
}
