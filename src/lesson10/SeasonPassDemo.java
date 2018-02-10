package lesson10;

/**
 * Created by student on 1/21/2018.
 */
public class SeasonPassDemo {
    public static void main(String[] args) {
        SeasonPass myFavSeason = SeasonPass.SUMMER;
        System.out.println(myFavSeason);
        switchSeason(myFavSeason);
        printAllValues();
    }

    public static void switchSeason(SeasonPass season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю Зиму, температура " + " " + season.getTemp());
                break;
            case SPRING:
                System.out.println("Я люблю Весну, температура" + " " + season.getTemp());
                break;
            case SUMMER:
                System.out.println("Я люблю Лето, температура" + " " + season.getTemp());
                break;
            case AUTUMN:
                System.out.println("Я люблю Осень, температура" + " " + season.getTemp());
                break;
            default:
                System.out.println("Выбери время года");
        }
    }

    public static void printAllValues() {
        SeasonPass[] seasons = SeasonPass.values();
        for (SeasonPass season : seasons) {
            System.out.println(season + " " + season.getDescription() + " " + season.ordinal() + " " + season.getTemp());
        }
    }
}
