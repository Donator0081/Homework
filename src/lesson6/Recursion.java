package lesson6;

public class Recursion {
    public static void main(String[] args) {
        rowInt(20, 30);
        System.out.println();
        rowInt(40, 10);
    }

    static void rowInt(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            rowInt(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            rowInt(a - 1, b);
        } else {
            System.out.print(a);
        }
    }
}
