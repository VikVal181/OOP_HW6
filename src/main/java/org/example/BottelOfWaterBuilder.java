package org.example;

public class BottelOfWaterBuilder {
    private static BottelOfWaterBuilder instance = null;

    BottleOfWater obj;

    protected BottelOfWaterBuilder(){}

    public static BottelOfWaterBuilder getInstance() {
        if (instance == null) {
            instance = new BottelOfWaterBuilder();
        }
        instance.obj = new BottleOfWater();

        return instance;
    }

    public BottelOfWaterBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public BottelOfWaterBuilder setCost(double cost) {
        obj.setCost(cost);
        return this;
    }

    public BottelOfWaterBuilder setVolume(double volume) {
        obj.setVolume(volume);
        return this;
    }

    public BottleOfWater build() {
        return obj;
    }

}
