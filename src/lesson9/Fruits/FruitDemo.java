package lesson9.Fruits;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(300, 5, "Green");
        Fruit apple2 = new Apple(400, 7, "Green");
        Fruit apple3 = new Apple(200, 4, "Green");
        Fruit pear1 = new Pear(200, 4, "Red");
        Fruit pear2 = new Pear(700, 11, "Red");
        Fruit apricot1 = new Apricot(100, 3, "Yellow");
        Fruit apricot2 = new Apricot(900, 17, "Yellow");
        System.out.println("Цена фруктов всего - " + (apple1.getPrice() + apple2.getPrice() + apple3.getPrice()
                + pear1.getPrice() + pear2.getPrice() + apricot1.getPrice() + apricot2.getPrice()));
        System.out.println("Стоимость отдельно проданый яблок - " + (apple1.getPrice()
                + apple2.getPrice() + apple3.getPrice()));
        System.out.println("Стоимость отдельно проданый груш - " + (pear1.getPrice() + pear2.getPrice()));
        System.out.println("Стоимость отдельно проданый абрикос - " + (apricot1.getPrice() + apricot2.getPrice()));
        apple1.fruitsPrice();
        apple1.printManufacturerInfo();
        pear1.fruitsPrice();
        pear1.printManufacturerInfo();
        apricot1.fruitsPrice();
        apricot1.printManufacturerInfo();
    }
}
