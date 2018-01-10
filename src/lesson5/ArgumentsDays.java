package lesson5;

public class ArgumentsDays {
    public static void main(String[] args) {
        for (String str : args) {
            String day = new String();
            if ("1".equals(str)) {
                day = "понедельник";
            } else if ("2".equals(str)) {
                day = "вторник";
            } else if ("3".equals(str)) {
                day = "среда";
            } else if ("4".equals(str)) {
                day = "четверг";
            } else if ("5".equals(str)) {
                day = "пятница";
            } else if ("6".equals(str) || "7".equals(str)) {
                day = "выходной";
            }
            System.out.println("Сегодня " + day);
        }
    }
}
