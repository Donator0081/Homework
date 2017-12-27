package lesson5;

public class From1To100 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i++ * 5);
        }
        while (i > 0 && i * 5 < 101);
    }
}
