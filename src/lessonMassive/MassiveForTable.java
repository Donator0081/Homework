package lessonMassive;

        import java.util.Arrays;

public class MassiveForTable {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 0};
        int i, j, tmp;
        for (i = 0; i < numbers.length; i++) {
            for (j = numbers.length - 1; j > i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}

