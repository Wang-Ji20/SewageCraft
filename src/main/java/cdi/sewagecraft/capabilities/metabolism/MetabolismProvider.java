package cdi.sewagecraft.capabilities.metabolism;

import cdi.sewagecraft.SewageCraft;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetabolismProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static final ResourceLocation NAME = new ResourceLocation(SewageCraft.MODID, "metabolism");

    private final Metabolism value = new Metabolism();
    private final LazyOptional<Metabolism> valueOptional = LazyOptional.of(() -> value);
    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return MetabolismCapability.INSTANCE.orEmpty(cap, valueOptional);
    }

    @Override
    public CompoundTag serializeNBT() {
        return value.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        value.deserializeNBT(nbt);
    }
}
