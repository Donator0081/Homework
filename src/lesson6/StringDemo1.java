package lesson6;

import java.util.Arrays;

/**
 * Created by student on 12/27/2017.
 */
public class StringDemo1 {
    public static void main(String[] args) {
        StringDemo1[][][] str = new StringDemo1[3][5][6];
        method(new int[][]{{1, 2}, {3, 5}});
    }

    public static void float1(StringDemo1[] args) {
        float[][] float2 = {
                {1.1f, 2.1f, 3.1f},
                {4.5f, 5.5f, 6.5f},
        };
    }

    public static void method(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }
}
