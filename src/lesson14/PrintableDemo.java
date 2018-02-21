package lesson14;

import lesson10.printableBook.Printable;

/**
 * Created by student on 2/4/2018.
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Расширил");
            }
        };
        printable.print();
    }
}
