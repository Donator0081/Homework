package lesson4;

public class OddNumber {
    public static void main(String[] args) {
        String str = args[0];
        int i = Integer.parseInt(str);
        if (i % 2 != 1) {
        } else {
            System.out.println(i + " - число нечетное");
        }
    }
}
