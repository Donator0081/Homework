package lesson9.fruits;

import java.util.Objects;

public class Apricot extends Fruit {
    private String color;

    public Apricot(double weight, double price, String color) {
        super(weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apricot apricot = (Apricot) o;
        return Objects.equals(color, apricot.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public void fruitsPrice() {
        System.out.println("Абрикос весом " + getWeight() + " грамм" + " стоит: " + getPrice() + " грн");
    }
}
