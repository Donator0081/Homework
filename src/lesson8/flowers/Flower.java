package lesson8.flowers;

import java.util.Objects;

public class Flower {
    private String state;
    private int time;
    private double price;
    private static int count = 0;

    public Flower(String state, int time, double price) {
        this.state = state;
        this.time = time;
        this.price = price;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return time == flower.time &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(state, flower.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(state, time, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "state='" + state + '\'' +
                ", time=" + time +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[2];
        bouquet1[0] = new Carnations("Ukraine", 12, 4.50, "Blue");
        bouquet1[1] = new Rose("Russia", 14, 5.50, 1.5);
        Flower[] bouquet2 = new Flower[3];
        bouquet2[0] = new Carnations("Ukraine", 12, 4.50, "Blue");
        bouquet2[1] = new Rose("Russia", 14, 5.50, 1.5);
        bouquet2[2] = new Tulips("India", 16, 6.50, 2.5);
        Flower[] bouquet3 = new Flower[4];
        bouquet3[0] = new Carnations("Ukraine", 12, 4.50, "Blue");
        bouquet3[1] = new Rose("Russia", 14, 5.50, 1.5);
        bouquet3[2] = new Tulips("India", 16, 6.50, 2.5);
        bouquet3[3] = new Daffodils("China", 18, 7.50, 0.5);
        Flower.bouquetPrice(bouquet1);
        Flower.bouquetPrice(bouquet2);
        Flower.bouquetPrice(bouquet3);
        Flower.setCount(bouquet1.length + bouquet2.length + bouquet3.length);
        System.out.println("Всего продано цветов = " + Flower.getCount());
    }


    public static void bouquetPrice(Flower[] bouquets) {
        double priceOfBouquet = 0.0;
        for (int i = 0; i < bouquets.length; i++) {
            priceOfBouquet += bouquets[i].getPrice();
        }
        System.out.println("Цена букета составляет : " + priceOfBouquet);
    }
}
