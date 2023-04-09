package org.example;

public class Beer extends Product{
    private double volume;


    public Beer() {}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + super.getName() + '\'' +
                "volume='" + this.volume + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Beer)) {
            return false;
        }

        Beer that = (Beer) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }
}
