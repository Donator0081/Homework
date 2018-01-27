package lesson7;

import java.util.Objects;

public class Carnations extends Flower {
    private String color;


    public Carnations(String state, int time, double price, String color) {
        super(state, time, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnations{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carnations that = (Carnations) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }
}
