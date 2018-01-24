package lesson11;

/**
 * Created by Student on 24.01.2018.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 23.1;
        Double double2 = 12.12;
        Double double3 = 22.12;
        Double double4 = Double.parseDouble("123.12");
        String double5 = Double.toString(3.14);

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);
        System.out.println(double1.byteValue());
        System.out.println(double1.shortValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.floatValue());
        System.out.println(double1.doubleValue());
    }

}
