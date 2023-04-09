package org.example;

public class ChipsBuilder {
    private static ChipsBuilder instance = null;

    Chips obj;

    protected ChipsBuilder(){}

    public static ChipsBuilder getInstance() {
        if (instance == null) {
            instance = new ChipsBuilder();
        }
        instance.obj = new Chips();

        return instance;
    }

    public ChipsBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public ChipsBuilder setCost(double cost) {
        obj.setCost(cost);
        return this;
    }

    public ChipsBuilder setFlavor(String flavor) {
        obj.setFlavor(flavor);
        return this;
    }

    public ChipsBuilder setWeight(int weight) {
        obj.setWeight(weight);
        return this;
    }
    public Chips build() {
        return obj;
    }

}
