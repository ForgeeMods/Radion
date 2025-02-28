package com.github.ImagineForge.Radion.registry.capabilities;

import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.Tag;
import net.minecraftforge.common.util.INBTSerializable;

public class RadionEnergyStorage implements IRadionEnergyStorage, INBTSerializable<Tag> { // Inspiration: EnergyStorage

    private int energy;
    private final int capacity;
    private final int maxReceive;
    private final int maxExtract;

    public RadionEnergyStorage(int energy, int capacity, int maxReceive, int maxExtract) {
        this.energy = energy;
        this.capacity = capacity;
        this.maxReceive = maxReceive;
        this.maxExtract = maxExtract;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        if (!canReceive()) return 0;

        int received = Math.min(this.energy, Math.min(maxReceive, this.maxReceive));
        if (!simulate) this.energy -= received;
        return received;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        if (!canExtract()) return 0;

        int extracted = Math.min(this.energy, Math.min(maxExtract, this.maxExtract));
        if (!simulate) this.energy -= extracted;
        return extracted;
    }

    @Override
    public int getEnergyStored() {
        return this.energy;
    }

    @Override
    public int getMaxEnergyStored() {
        return this.capacity;
    }

    @Override
    public boolean canExtract() {
        return this.maxExtract > 0;
    }

    @Override
    public boolean canReceive() {
        return this.maxReceive > 0;
    }

    public Tag serializeNBT() {
        return IntTag.valueOf(this.getEnergyStored());
    }

    public void deserializeNBT(Tag nbt) {
        if (nbt instanceof IntTag intNbt) {
            this.energy = intNbt.getAsInt();
        } else {
            throw new IllegalArgumentException("Cannot deserialize to an instance that isn't the default implementation");
        }
    }
}
