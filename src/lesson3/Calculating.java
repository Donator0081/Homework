package lesson3;

import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        int s1 = Scanner();
        int s2 = Scanner();
        System.out.println(s1 + s2);
    }

    public static int Scanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы некорректно ввели число");
            return 0;
        }
    }
}
