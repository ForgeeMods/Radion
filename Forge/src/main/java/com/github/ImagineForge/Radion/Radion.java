package com.github.ImagineForge.Radion;

import com.github.ImagineForge.Radion.registry.fluid.RegisterFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(Constants.MOD_ID)
public class Radion {
    
    public Radion() {
        new RegistryForge();
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(RegisterFluids.URANIUM_FLUID_SOURCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(RegisterFluids.URANIUM_FLUID_FLOWING.get(), RenderType.translucent());
        }
    }

}