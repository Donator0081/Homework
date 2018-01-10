package lesson5;

public class Factorial {
    public static void main(String[] args) {
        int d = 1;
        int n = random();
        for (int i = 1; i <= n; i++) {
            d = d * i;
        }
        System.out.println("Факториал случайного числа n = " + d);
    }

    public static int random() {
        return (int) (Math.random() * 6);
    }
}
