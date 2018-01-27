package lesson7;

import java.util.Objects;

public class Daffodils extends Flower {
    private double weight;

    public Daffodils(String state, int time, double price, double weight) {
        super(state, time, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Daffodils{" +
                "weight=" + weight +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Daffodils daffodils = (Daffodils) o;
        return Double.compare(daffodils.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), weight);
    }
}
