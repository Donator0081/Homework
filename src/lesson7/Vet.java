package lesson7;

public class Vet {

    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("кость", "в России", 7);
        animals[1] = new Cat("корм", "в Украине", 6.2);
        animals[2] = new Horse("траву", "в Ирландии", 2.3);
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
            animal.sleep();
        }
    }

    void treatAnimal(Animal animal) {
        System.out.println("Животное ест " + animal.getFood());
        System.out.println("Животное живет " + animal.getLocation());
    }
}
