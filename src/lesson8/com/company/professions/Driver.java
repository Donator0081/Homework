package lesson8.com.company.professions;

import lesson7.personDem.Person;

public class Driver extends Person {
    private double experience = 3.5;

    public Driver(String fullName, int age, double experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public Driver() {
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}