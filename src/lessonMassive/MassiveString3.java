package lessonMassive;

public class MassiveString3 {
    public static void main(String[] args) {
        String[][] numbers = new String[3][6];
        char a = 'a';
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                numbers[i][j] = a + "" + (j + 1);
                System.out.print(numbers[i][j] + "");
            }
            a++;
            System.out.println();
        }
    }
}
