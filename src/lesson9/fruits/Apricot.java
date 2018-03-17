package lesson9.fruits;

public class Apricot extends Fruit {
    private static int cstOfAllAprcts = 0;
    private static int apricotCntr = 0;
    private String variety;
    private int apricotCost;

    public Apricot(int weight, String variety, int apricotCost) {
        super(weight, apricotCost);
        this.variety = variety;
        this.apricotCost = apricotCost;
        apricotCntr++;
        cstOfAllAprcts += apricotCost;
    }

    public static int getApricotCntr() {
        return apricotCntr;
    }

    public static int getCstOfAllAprcts() {
        return cstOfAllAprcts;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getApricotCost() {
        return apricotCost;
    }

    public void setApricotCost(int apricotCost) {
        this.apricotCost = apricotCost;
    }

    @Override
    public int getCostOfFrts() {
        return cstOfAllAprcts;
    }

    @Override
    public String getFrstName() {
        return "абрикос";
    }

    @Override
    public void cost() {

    }
}