package lesson12;

public class AverageString {
    public static void main(String[] args) {
        String[] str = {"toy", "clouds", "horny"};

        for (String string : str) {
            System.out.println(findAverString(string));
        }
    }

    public static String findAverString(String str) {
        int length = str.length();
        return str.substring(length / 2 - 1, length / 2 + 1);
    }
}
