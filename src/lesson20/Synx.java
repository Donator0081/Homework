package lesson20;

/**
 * Created by Student on 28.02.2018.
 */
public class Synx extends Thread {
    private StringBuilder stringBuilder;

    public Synx(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }
}
