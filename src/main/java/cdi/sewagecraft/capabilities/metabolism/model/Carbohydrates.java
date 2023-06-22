package cdi.sewagecraft.capabilities.metabolism.model;

public class Carbohydrates extends Nutrition {
    public static final double CARBOHYDRATES_MAX = 100.0;
    public static final double CARBOHYDRATES_MIN = 0.0;
    public static final double CARBOHYDRATES_DEFAULT = 60.0;
    public static final String CARBOHYDRATES_NAME = "carbohydrates";
    public Carbohydrates() {
        this(CARBOHYDRATES_DEFAULT);
    }
    public Carbohydrates(double value) {
        this.value = value;
    }
    @Override
    public double getMaxValue() {
        return CARBOHYDRATES_MAX;
    }

    @Override
    public double getMinValue() {
        return CARBOHYDRATES_MIN;
    }

    @Override
    public String getNutritionName() {
        return CARBOHYDRATES_NAME;
    }

}
