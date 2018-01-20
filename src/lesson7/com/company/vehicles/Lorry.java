package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;


    public Lorry(String marka, String carClass, double weight, Driver driver, Engine engine) {
        super(marka, carClass, weight, driver, engine);
        this.carrying = carrying;
    }
}
