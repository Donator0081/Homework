package lesson10.atelle;

/**
 * Created by Student on 24.01.2018.
 */
public class TShirt extends Closes implements MansDress, WomenDress {
    @Override
    public void wearMan() {
        System.out.println("Одеваю футболку");
    }

    @Override
    public void wearWomen() {
        System.out.println("Одеваю футболку");
    }

    public TShirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "TShirt{} " + super.toString();
    }
}
