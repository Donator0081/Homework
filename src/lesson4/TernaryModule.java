package lesson4;

import java.util.Scanner;

public class TernaryModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1, i2, i3, b1, b2, b3;
        System.out.println("Введите целые числа");
        i1 = goScan(sc);
        i2 = goScan(sc);
        i3 = goScan(sc);
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
    public static int goScan(Scanner sc) {
        int i = 0;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        return i;
    }
}
