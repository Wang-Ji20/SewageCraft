package cdi.sewagecraft.capabilities.metabolism.model;

import net.minecraft.nbt.DoubleTag;
import net.minecraftforge.common.util.INBTSerializable;

abstract class Nutrition implements INBTSerializable<DoubleTag> {
    protected double value;
    public abstract double getMaxValue();
    public abstract double getMinValue();
    public abstract String getNutritionName();
    public double getValue() {
        assert getMinValue() <= value && value <= getMaxValue();
        return value;
    }
    @Override
    public DoubleTag serializeNBT() {
        assert getMinValue() <= value && value <= getMaxValue();
        return DoubleTag.valueOf(value);
    }

    @Override
    public void deserializeNBT(DoubleTag nbt) {
        value = nbt.getAsDouble();
        assert getMinValue() <= value && value <= getMaxValue();
    }
}
