package lesson16;

import lesson8.animals.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Student on 07.02.2018.
 */
public class Collection1 {
    public static void main(String[] args) {
        List<Animal> arrayList = new ArrayList<>();
        arrayList.add(new Animal("String1", "String2"));
        arrayList.add(new Animal("String3", "String4"));
        arrayList.add(new Animal());
        Animal animal = new Animal();
        arrayList.add(animal);

        System.out.println("Размер коллекции : " + arrayList.size());
        collectionList(arrayList);

        Animal animal1 = arrayList.get(1);
        animal1.setFood("String5");
        arrayList.set(1, animal1);

        collectionList(arrayList);

        arrayList.remove(arrayList.size() - 1);
        System.out.println("Размер коллекции : " + arrayList.size());

        arrayList.clear();
        System.out.println("Размер коллекции : " + arrayList.size());

        arrayVariant1(arrayList);

        arrayVariant2(arrayList);

        arrayVariant3(arrayList);
    }

    private static void arrayVariant3(List<Animal> arrayList) {
        Animal[] animals2 = arrayList.toArray(new Animal[0]);
        System.out.println(Arrays.toString(animals2));
    }

    private static void arrayVariant2(List<Animal> arrayList) {
        Animal[] animals = new Animal[arrayList.size()];
        arrayList.toArray(animals);
        System.out.println(Arrays.toString(animals));
    }

    private static void arrayVariant1(List<Animal> arrayList) {
        java.lang.Object[] objects = arrayList.toArray();
        for (java.lang.Object object : objects) {
            System.out.println(object);
        }
    }

    private static void collectionList(List<Animal> arrayList) {
        for (Animal anim : arrayList) {
            System.out.println("Элемент: " + anim);

        }
    }
}
