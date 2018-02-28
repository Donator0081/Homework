package lesson18;

/**
 * Created by Student on 28.02.2018.
 */
public class SynxDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");

        Synx thread1 = new Synx(stringBuilder);
        Synx thread2 = new Synx(stringBuilder);
        Synx thread3 = new Synx(stringBuilder);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
