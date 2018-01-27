package lesson7;

import java.util.Objects;

public class Tulips extends Flower {
    private double age;


    public Tulips(String state, int time, double price, double age) {
        super(state, time, price);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "age=" + age +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulips tulips = (Tulips) o;
        return Double.compare(tulips.age, age) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), age);
    }
}
