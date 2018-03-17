package lesson7.person;

import java.util.Objects;

/**
 * Created by student on 2/11/2018.
 */
public class Person {
    private String fullName = "Big Bob";
    private int age = 21;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("person{" +
                "fullName='%s', age=%d}", fullName, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, age);
    }

    public void move() {
        System.out.println(fullName + " " + age + " лет - идет");
    }

    public void talk() {
        System.out.println(fullName + " " + age + " лет - говорит");
    }
}
