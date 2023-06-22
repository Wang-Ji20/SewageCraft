package cdi.sewagecraft.capabilities.metabolism;

import cdi.sewagecraft.capabilities.metabolism.model.Carbohydrates;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.DoubleTag;

import java.util.Objects;

public class Metabolism implements IMetabolism {
    private final Carbohydrates carbohydrates = new Carbohydrates();

    @Override
    public CompoundTag serializeNBT() {
        var metabolismTag = new CompoundTag();
        metabolismTag.put(carbohydrates.getNutritionName(), carbohydrates.serializeNBT());
        return metabolismTag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        carbohydrates.deserializeNBT((DoubleTag) Objects.requireNonNull(nbt.get(carbohydrates.getNutritionName())));
    }

    @Override
    public Carbohydrates getCarbohydrates() {
        return carbohydrates;
    }
}
