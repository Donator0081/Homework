package lesson6;

import java.util.Arrays;

public class Matrix {
    private double[][] array;
    private int lines;
    private int columns;

    public static void main(String[] args) {
        double[][] arrayBasic = {
                {3, 8, 4},
                {4, 12, 2}
        };

        double[][] array2 = {
                {15, 14, 19},
                {13, 11, 22}
        };
        Matrix mat = new Matrix(arrayBasic);

        mat.sum(mat);
        mat.multNumb(4);
        mat.mult(array2);
    }

    public Matrix(double[][] array) {
        this.array = array;
    }

    void sum(Matrix object) {
        lines = this.array.length;
        double[][] arraySum = new double[2][3];
        if (lines == array.length) {
            for (int i = 0; i < lines; i++) {
                columns = this.array[i].length;
                if (columns == array[i].length) {
                    for (int j = 0; j < columns; j++) {
                        arraySum[i][j] = this.array[i][j] + array[i][j];
                    }
                } else {
                    System.out.println("Columns have to be equal (2 x 2)!");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Lines have to be equal (3 x 3)!");
            System.exit(0);
        }
    }

    void multNumb(int number) {
        double[][] arrayNumbMult = new double[2][3];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                arrayNumbMult[i][j] = this.array[i][j] * number;
            }
        }
        System.out.println(Arrays.deepToString(arrayNumbMult) + "\n");
    }

    void mult(double[][] array) {
        lines = this.array.length;
        double[][] arrayMult = new double[2][3];
        if (lines == array.length) {
            for (int i = 0; i < lines; i++) {
                columns = this.array[i].length;
                if (columns == array[i].length) {
                    for (int j = 0; j < columns; j++) {
                        arrayMult[i][j] = this.array[i][j] * array[i][j];
                    }
                } else {
                    System.out.println("Columns have to be equal (2 x 2)!");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Lines have to be equal (3 x 3)!");
            System.exit(0);
        }
        System.out.println(Arrays.deepToString(arrayMult) + "\n");
    }
}