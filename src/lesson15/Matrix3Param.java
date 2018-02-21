package lesson15;

import lesson8.animals.Animal;

import java.io.Serializable;

/**
 * Created by Student on 07.02.2018.
 */
public class Matrix3Param<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    Matrix3Param(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());

        System.out.println("Type of K is "
                + ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3() {
        return ob3;
    }

    public static void main(String[] args) {
        Matrix3Param<String, Animal, Double> object1 = new Matrix3Param<>("String", new Animal(), 5.6);
        object1.showTypes();
    }
}
