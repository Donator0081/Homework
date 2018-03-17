package lesson9.fruits;

import java.util.Objects;

public abstract class Fruit {
    private double weight;
    private static int costOfAllFrts = 0;
    private static int cntr = 0;


    public Fruit(double weight,int costOfAllFrts) {
        this.weight = weight;
        Fruit.costOfAllFrts += costOfAllFrts;
        cntr++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCostOfAllFrts() {
        return costOfAllFrts;
    }

    public static int getCntr() {
        return cntr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", price=" +
                '}';
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract void cost();

    public abstract String getFrstName();

    public abstract int getCostOfFrts();
}
