package lesson18;

/**
 * Created by student on 2/25/2018.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
