package lesson10.atelle;

/**
 * Created by Student on 24.01.2018.
 */
public class Shirt extends Closes implements MansDress, WomenDress {
    @Override
    public void wearMan() {
        System.out.println("Одеваю штаны");
    }

    @Override
    public void wearWomen() {
        System.out.println("Одеваю штаны");
    }

    public Shirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Shirt{} " + super.toString();
    }
}
