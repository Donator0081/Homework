package lesson3;

import java.util.Scanner;

public class VerifyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите целое число:");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println((i & 1) == 0 ? "Число четное"
                   : "Число нечетное");
        }
        else {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
