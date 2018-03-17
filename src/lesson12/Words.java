package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        String str = "Da 611 nope 41f2df same бой-";
        System.out.println(countOfLatinWords(str));
    }

    public static int countOfLatinWords(String str) {
        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
