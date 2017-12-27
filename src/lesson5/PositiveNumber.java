package lesson5;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i >= 0 && i <= 10) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное или меньше 10");
            }
        }
    }
}