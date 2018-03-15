package lesson16;

import lesson8.animals.Animal;

import java.util.Deque;

/**
 * Created by student on 2/11/2018.
 */
public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Animal> animals = new java.util.ArrayDeque<>();
        animals.offer(new Animal("S", "B"));
        animals.offer(new Animal("F", "B"));
        animals.offer(new Animal("J", "B"));
        animals.offer(new Animal("D", "B"));

       while (animals.size()!=0){
           System.out.println(animals.poll());
       }
    }
}
