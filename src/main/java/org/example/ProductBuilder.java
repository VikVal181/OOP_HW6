package org.example;

public class ProductBuilder {
    private static ProductBuilder instance = null;

    private ProductBuilder(){}

    public static BottelOfWaterBuilder getInstanceWater() {
        return new BottelOfWaterBuilder();
    }
    public static ChipsBuilder getInstanceChips() {
        return new ChipsBuilder();
    }
    public static BeerBuilder getInstanceBeer() {
        return new BeerBuilder();
    }
}
