package lesson3;

import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целые числа");
        if (sc.hasNextInt()) {
            int i1 = sc.nextInt();
            if (sc.hasNextInt()) {
                int i2 = sc.nextInt();
                System.out.println(i1 + i2);
            }
        } else {
            System.out.println("Вы некорректно ввели число");
        }
    }
}
