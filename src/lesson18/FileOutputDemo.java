package lesson18;

import java.io.*;

/**
 * Created by Student on 21.02.2018.
 */
public class FileOutputDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src/lesson18/a.txt");
             InputStream input = new FileInputStream("src/lesson18/a.txt")) {
            char[] c = {'a', 'b', 'c'};

            for (char symbol : c) {
                output.write(symbol);
            }
            output.close();

            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
