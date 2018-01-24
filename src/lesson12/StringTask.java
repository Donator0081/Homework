package lesson12;

/**
 * Created by Student on 24.01.2018.
 */
public class StringTask {
    public static void main(String[] args) {
        doString("I like Java!!!");
        doString("I like something Java");
    }

    public static void doString(String s1){
        System.out.println(s1.endsWith("!!!"));
        System.out.println(s1.startsWith("I like"));
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println("IndexOf(Java) = " + s1.indexOf("Java"));
        System.out.println("LastIndexOf(Java) = " + s1.lastIndexOf("Java"));
        System.out.println(s1.replaceAll("a","o"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(9));
    }
}
