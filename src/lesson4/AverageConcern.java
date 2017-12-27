package lesson4;

public class AverageConcern {
    public static void main(String[] args) {
        double d1, d2 = 0;
        int d3 = 0;
        for (String str : args) {
            d1 = Double.parseDouble(str);
            d2 += d1;
            d3++;
        }
        System.out.println("Среднее арифметическое " + d2/d3);
    }
}
