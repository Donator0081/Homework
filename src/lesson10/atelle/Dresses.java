package lesson10.atelle;

/**
 * Created by Student on 24.01.2018.
 */
public enum Dresses {
    XXS(10) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(11), S(12), M(13), L(14);
    private int euroSize;

    Dresses(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
