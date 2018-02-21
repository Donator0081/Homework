package lesson10.atelle;

/**
 * Created by Student on 24.01.2018.
 */
public class Atelle {
    public static void main(String[] args) {
        Closes[] dresses = new Closes[4];
        dresses[0] = new TShirt(Dresses.XXS, 50.22, "Blue");
        dresses[1] = new Shirt(Dresses.XS, 42.11, "Red");
        dresses[2] = new Skirt(Dresses.S, 55.11, "Yellow");
        dresses[3] = new Tie(Dresses.M, 11.22, "Green");
        wearMan(dresses);
        wearWoman(dresses);
    }

    public static void wearMan(Closes dresses[]) {
        for (Closes dress : dresses) {
            if (dress instanceof MansDress) {
                ((MansDress) dress).wearMan();
            }
        }
    }

    public static void wearWoman(Closes dresses[]) {
        for (Closes dress : dresses) {
            if (dress instanceof WomenDress) {
                ((WomenDress) dress).wearWomen();
            }
        }
    }
}
