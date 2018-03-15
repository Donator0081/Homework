package lesson19;

import lesson8.animals.Animal;

import java.io.Serializable;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    private double height;
    private Halter halter;

    public Horse() {
    }

    public Horse(String food, String location, double height) {
        super(food, location);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Double.compare(horse.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "height=" + height +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Ржет" +
                "");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест траву");
    }
}
