package lessonMassive;

import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 0, 12};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
