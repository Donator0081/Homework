package lesson5;

public class SwitchTask3 {
    public static void main(String[] args) {
        for (String str : args) {
            String day = new String();
            switch (str) {
                case "1":
                    day = "понедельник";
                    break;
                case "2":
                    day = "вторник";
                    break;
                case "3":
                    day = "среда";
                    break;
                case "4":
                    day = "четверг";
                    break;
                case "5":
                    day = "пятница";
                    break;
                case "6":
                case "7":
                    day = "выходной";
                    break;
            }
            System.out.println("Сегодня " + day);
        }
    }
}
