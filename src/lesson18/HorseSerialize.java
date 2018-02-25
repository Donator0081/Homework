package lesson18;

import java.io.*;

/**
 * Created by student on 2/25/2018.
 */
public class HorseSerialize {
    public static final String TEST_HORSE_SER = "testHorse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse();
        serialize(horse);
        Horse deserHorse = deserialize();
        System.out.println(horse.equals(deserHorse));
    }

    public static void serialize(Horse horse) {
        try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(TEST_HORSE_SER))) {
            oo.writeObject(horse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserialize() {
        Horse horse = null;
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(TEST_HORSE_SER))) {
            horse = (Horse) oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return horse;
    }
}
