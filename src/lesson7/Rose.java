package lesson7;

import java.util.Objects;

public class Rose extends Flower {
    private double height;

    public Rose(String state, int time, double price, double height) {
        super(state, time, price);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "height=" + height +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return Double.compare(rose.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(height);
    }
}
