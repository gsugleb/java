package by.gsu.pmslab;

public class Blouse extends Clothes {
    private String sleeveLength;
    private int wool;

    public Blouse(String manufacture, int cost, String style, String sleeveLength, int wool) {
        super(manufacture, cost, style);
        this.sleeveLength = sleeveLength;
        this.wool = wool;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public int getWool() {
        return wool;
    }

    public void setWool(int wool) {
        this.wool = wool;
    }

    @Override
    public String toString() {
        return super.toString() + "Sleeve Length: " + sleeveLength + "; " + "Wool: " + wool + "%; ";
    }

    @Override
    public String write() {
        return toString() + brand();
    }

}
