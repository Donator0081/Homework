package lesson9;

import java.util.Objects;

public class Circle extends Shape {
    private int x, y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Shape[] massive = new Shape[2];
        massive[0] = new Circle("Синий", 3, 5);
        massive[1] = new Rectangle("Фиолетовый", 5, 8);
        for (Shape shape : massive) {
            shape.draw();
        }
    }
}
