package lesson6;

public class Person {
    private String fullName = "Big Bob";
    private int age = 21;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
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

    public Person() {
    }

    public void move() {
        System.out.println(fullName + " " + age + " лет - идет");
    }

    public void talk() {
        System.out.println(fullName + " " + age + " лет - говорит");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
