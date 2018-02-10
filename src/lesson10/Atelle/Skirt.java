package lesson10.Atelle;

/**
 * Created by Student on 24.01.2018.
 */
public class Skirt extends Closes implements WomenDress {

    @Override
    public void wearWomen() {
        System.out.println("Одеваю юбку");
    }

    public Skirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
