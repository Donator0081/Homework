package lesson10.PrintableBook;

public class Magazine implements Printable {
    private String name = "Maggy";

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) {
                Magazine magazine1 = (Magazine) printable1;
                magazine1.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + name);

    }
}
