package lesson12;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 1/28/2018.
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        String regex = "Java\\s*\\d";
        String str = "Versions: Java 5, Java 6 Java 7, Java 8";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
