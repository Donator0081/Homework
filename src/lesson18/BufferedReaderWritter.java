package lesson18;

import java.io.*;

/**
 * Created by student on 2/25/2018.
 */
public class BufferedReaderWritter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\lesson18\\text"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson18\\newFile.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
