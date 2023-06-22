package cdi.sewagecraft.capabilities.metabolism;

import cdi.sewagecraft.capabilities.metabolism.model.Carbohydrates;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.minecraftforge.common.util.INBTSerializable;

@AutoRegisterCapability
public interface IMetabolism extends INBTSerializable<CompoundTag> {
    Carbohydrates getCarbohydrates();
}
