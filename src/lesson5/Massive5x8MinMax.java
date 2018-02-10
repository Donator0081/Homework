package lesson5;

import java.util.Arrays;

public class Massive5x8MinMax {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 1, 14, 15, 16},
                {17, 18, 19, 20, 3, 22, 23, 24},
                {25, 26, 27, 28, 4, 30, 31, 32},
                {33, 34, 35, 36, 5, 38, 39, 40}};
        System.out.println("Первый массив: ");
        sysout(arr);
        System.out.println("Второй массив: ");
        minMax(arr);
    }

    public static void minMax(int[][] arr) {
        int[][] minMax = new int[arr.length][2];
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            minMax[i][0] = min;
            minMax[i][1] = max;
            min = max = arr[i][0];
        }
        sysout(minMax);
    }


    public static void sysout(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}