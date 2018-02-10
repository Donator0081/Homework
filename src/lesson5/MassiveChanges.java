package lesson5;

import java.util.Arrays;

public class MassiveChanges {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 0, 4};
        int i, j, tmp;
        for (i = 0; i < numbers.length; i++) {
            boolean b1 = true;
            for (j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j + 1] > numbers[j]) {
                    tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                    b1 = false;
                }
                System.out.println(Arrays.toString(numbers));
            }
            if (b1) {
                break;
            }
        }
    }
}
