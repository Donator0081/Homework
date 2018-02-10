package lesson10;

/**
 * Created by student on 1/21/2018.
 */
public enum SeasonPass {
    WINTER(-10), SPRING(9), SUMMER(25) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(7);
    private double temp;

    SeasonPass(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
