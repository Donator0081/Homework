package lesson4;

import java.util.Scanner;

public class GarlandWork {
    public static void main(String[] args) {
        System.out.println("Включено лампочек - " + random());
        System.out.println("Выберите функцию:");
        System.out.println("1.Мигание лампочек");
        System.out.println("2.Бегущая строка");
        System.out.println("3.Проверка первой позиции");
        System.out.println("4.Проверка включена гирлянда или выключена");
        switch (Scanner()) {
            case 1:
                flashing();
                break;
            case 2:
                runString();
                break;
            case 3:
                firstPosition();
                break;
            case 4:
                state();
                break;
        }
    }

    public static void flashing() {
        System.out.println("Введите номер лампочки,которая должна мигать:");
        int i3 = Scanner();
        System.out.println("Введите количество миганий лампочки");
        int i2 = Scanner();
        for (int i1 = 0; i2 > i1; i1++) {
            i3 = ~i3;
            System.out.println(Integer.toBinaryString(i3));
        }
    }

    public static void runString() {
        System.out.println("Введите номер лампочки,которая должна убежать:");
        int i = 0;
        int i1 = Scanner();
        System.out.println("Введите количество шагов для побега");
        int i2 = Scanner();
        for (int i3 = 0; i2 > i3; i3++) {
            i1 = i1 << 1;
            i++;
            System.out.println(Integer.toBinaryString(i1 << 1));
        }
    }

    public static void firstPosition() {
        System.out.println("Введите номер лампочки для проверки первой позиции:");
        int b;
        int i = Scanner();
        int maska = 1;
        b = i & maska;
        System.out.println("Первая позиция " + b);
    }

    public static void state() {
        int i = random();
        if (i > 0 && i < 33) {
            System.out.println("Гирлянда включена");
        } else {
            System.out.println("Гирлянда выключена");
        }
    }

    public static int random() {
        return (int) (Math.random() * 33);
    }

    public static int Scanner() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        return i;
    }
}
