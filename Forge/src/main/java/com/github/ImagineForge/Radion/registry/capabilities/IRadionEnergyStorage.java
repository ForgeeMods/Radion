package com.github.ImagineForge.Radion.registry.capabilities;

import net.minecraftforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public interface IRadionEnergyStorage {
    int receiveEnergy(int energy, boolean simulate);
    int extractEnergy(int energy, boolean simulate);
    int getEnergyStored();
    int getMaxEnergyStored();
    boolean canExtract();
    boolean canReceive();
}