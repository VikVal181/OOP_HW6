package org.example;

public class BeerBuilder {
    private static BeerBuilder instance = null;

    Beer obj;

    protected BeerBuilder(){}

    public static BeerBuilder getInstance() {
        if (instance == null) {
            instance = new BeerBuilder();
        }
        instance.obj = new Beer();

        return instance;
    }

    public BeerBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public BeerBuilder setCost(double cost) {
        obj.setCost(cost);
        return this;
    }

    public BeerBuilder setVolume(double volume) {
        obj.setVolume(volume);
        return this;
    }

    public Beer build() {
        return obj;
    }

}
