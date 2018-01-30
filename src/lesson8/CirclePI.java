package lesson8;

import java.util.Objects;

public class CirclePI {
    private int radius;
    private static final double PI = 3.14;

    public CirclePI(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CirclePI circlePI = (CirclePI) o;
        return radius == circlePI.radius;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "CirclePI{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        CirclePI circle1 = new CirclePI(5);
        CirclePI circle2 = new CirclePI(10);
        CirclePI circle3 = new CirclePI(15);
        circle1.square();
        circle2.square();
        circle3.square();
        circle1.length();
        circle2.length();
        circle3.length();
    }


    public void square() {
        System.out.println("Площадь окружности равна  = " + ((radius * radius) * PI));
    }

    public void length() {
        System.out.println("Длина окружности равна = " + (2 * PI * radius));
    }
}
