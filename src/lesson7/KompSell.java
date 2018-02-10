package lesson7;

/**
 * Created by student on 12/27/2017.
 */
public class KompSell {
    public static void main(String[] args) {
        ObjectKomp komp1 = new ObjectKomp();
        ObjectKomp komp2 = new ObjectKomp();
        ObjectKomp komp3 = new ObjectKomp();
        komp1.weight = 3.15;
        komp1.shirina = 3.5;
        komp1.dlina = 1.5;
        komp2.weight = 2.15;
        komp2.shirina = 4.5;
        komp2.dlina = 5.5;
        komp3.weight = 6.15;
        komp3.shirina = 7.5;
        komp3.dlina = 8.5;
        komp1.info();
        komp2.info();
        komp3.info();
        komp1.squar();
        komp2.squar();
        komp3.squar();
    }
}
