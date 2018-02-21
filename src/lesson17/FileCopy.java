package lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Student on 21.02.2018.
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt");) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
    }
}
