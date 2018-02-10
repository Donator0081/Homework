package lesson10.Atelle;

/**
 * Created by Student on 24.01.2018.
 */
public class Tie extends Closes implements MansDress {
    @Override
    public void wearMan() {
        System.out.println("Одеваю галстук");
    }

    public Tie(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
