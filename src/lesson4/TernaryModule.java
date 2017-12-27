package lesson4;

import java.util.Scanner;

public class TernaryModule {
    public static void main(String[] args) {
        int i1, i2, i3, b1, b2, b3;
        System.out.println("Введите целые числа");
        Scanner sc = new Scanner(System.in);
        sc.hasNextInt();
        i1 = sc.nextInt();
        i2 = sc.nextInt();
        i3 = sc.nextInt();
        b1 = i1 < 0 ? -i1 : i1;
        b2 = i2 < 0 ? -i2 : i2;
        b3 = i3 < 0 ? -i3 : i3;
        if (b1 < b2 && b1 < b3) {
            System.out.println(b1);
            System.out.println("Имеет найменьший модуль");
        } else if (b2 < b1 && b2 < b3) {
            System.out.println(b2);
            System.out.println("Имеет найменьший модуль");
        } else {
            System.out.println(b3);
            System.out.println("Имеет найменьший модуль");
        }


    }
}
