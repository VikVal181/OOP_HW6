package org.example;

public class Chips extends Product{
    private int weight;
    private String flavor;


    public Chips() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + super.getName() + '\'' +
                "weight='" + this.weight + '\'' +
                "flavor='" + this.flavor + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Chips)) {
            return false;
        }

        Chips that = (Chips) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getWeight() == that.getWeight()
                && getFlavor() == that.getFlavor();
    }
}
