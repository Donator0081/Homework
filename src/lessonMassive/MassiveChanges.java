package lessonMassive;

import java.util.Arrays;

public class MassiveChanges {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 0, 4};
        int i, j, tmp;
        boolean b1 = true;
        for (i = 0; i < numbers.length; i++) {
            for (j = numbers.length - 1; j > i; j--) {
                if (numbers[j - 1] < numbers[j]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                    b1 = false;
                }
                System.out.println(Arrays.toString(numbers));
                if (!b1) {
                    break;
                }
            }
        }
    }
}
