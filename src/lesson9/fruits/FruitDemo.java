package lesson9.fruits;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = {new Apple(100, "Зеленый", "Честь", 1),
                new Pear(90, "Желтый", "Лучшая", 2),
                new Apricot(15, "Бычий", 3)};
        System.out.println("Цена фруктов всего - " + Fruit.getCostOfAllFrts());
        for (Fruit f : fruits) {
            System.out.println("Стоимость отдельно проданых " + f.getFrstName() + " = " + f.getCostOfFrts());
        }
    }
}
