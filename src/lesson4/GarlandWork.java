package lesson4;

import java.util.Scanner;

public class GarlandWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Включено лампочек - " + random());
        System.out.println("Выберите функцию:");
        System.out.println("1.Мигание лампочек");
        System.out.println("2.Бегущая строка");
        System.out.println("3.Проверка первой позиции");
        System.out.println("4.Проверка включена гирлянда или выключена");
        switch (goScan(sc)) {
            case 1:
                flashing(sc);
                break;
            case 2:
                runString(sc);
                break;
            case 3:
                firstPosition(sc);
                break;
            case 4:
                state();
                break;
        }
    }

    public static void flashing(Scanner sc) {
        System.out.println("Введите номер лампочки,которая должна мигать:");
        int d = goScan(sc);
        System.out.println("Введите количество миганий лампочки");
        int c = goScan(sc);
        for (int b = 0; c > b; b++) {
            d = ~d;
            System.out.println(Integer.toBinaryString(d));
        }
    }

    public static void runString(Scanner sc) {
        System.out.println("Введите номер лампочки,которая должна убежать:");
        int i = 0;
        int b = goScan(sc);
        System.out.println("Введите количество шагов для побега");
        int c = goScan(sc);
        for (int d = 0; c > d; d++) {
            b = b << 1;
            i++;
            System.out.println(Integer.toBinaryString(b << 1));
        }
    }

    public static void firstPosition(Scanner sc) {
        System.out.println("Введите номер лампочки для проверки первой позиции:");
        int b;
        int i = goScan(sc);
        int maska = 1;
        b = i & maska;
        System.out.println("Первая позиция " + b);
    }

    public static void state() {
        int i = random();
        if (i > 0) {
            System.out.println("Гирлянда включена");
        } else {
            System.out.println("Гирлянда выключена");
        }
    }

    public static int random() {
        return (int) (Math.random() * 33);
    }

    public static int goScan(Scanner sc) {
        int i = 0;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        return i;
    }
}
