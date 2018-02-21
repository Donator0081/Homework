package lesson8.animals;

import java.util.Objects;

public class Cat extends Animal {
    private double mustache;

    public Cat(String food, String location, double mustache) {
        super(food, location);
        this.mustache = mustache;
    }

    public double getMustache() {
        return mustache;
    }

    public void setMustache(double mustache) {
        this.mustache = mustache;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Double.compare(cat.mustache, mustache) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), mustache);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "mustache=" + mustache +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяукает");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест корм");
    }
}
