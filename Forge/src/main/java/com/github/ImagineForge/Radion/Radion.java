package com.github.ImagineForge.Radion;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Radion {
    
    public Radion() {

        CommonClass.init();

        new RegistryForge();
        MinecraftForge.EVENT_BUS.register(this);
        
    }

}