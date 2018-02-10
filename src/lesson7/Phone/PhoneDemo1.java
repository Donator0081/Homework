package lesson7.Phone;

/**
 * Created by student on 12/27/2017.
 */
public class PhoneDemo1 {
    public static void main(String[] args) {
        Phone1 myPhone1 = new Phone1();
        myPhone1.setNumber(066123131);
        myPhone1.setModule("Nokia");
        myPhone1.setWeight(121.5);
        Phone1 myPhone2 = new Phone1(066113122, "Acer", 123.5);
        Phone1 myPhone3 = new Phone1(066144123, "Asus");

        myPhone1.info();
        myPhone2.info();
        myPhone3.info();

        myPhone1.receiveCall("Karl");
        myPhone2.receiveCall("Karl");
        myPhone3.receiveCall("Karl");

        myPhone1.receiveCall("OldBoy ", 066412255);
        myPhone2.receiveCall("OldBoy ", 066412255);
        myPhone3.receiveCall("OldBoy ", 066412255);

        myPhone1.sendMassage("066123131");
        myPhone2.sendMassage("066113122", "066123131");
        myPhone3.sendMassage("066412255", "066123131", "066113122");
        System.out.println(Phone1.getCount());
        System.gc();
    }
}
