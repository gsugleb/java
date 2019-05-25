package by.gsu.pmslab;

public class Jacket extends Clothes {

    private String seasonality;
    private boolean hood;

    public Jacket(String manufacture, int cost, String style, String seasonality, boolean hood) {
        super(manufacture, cost, style);
        this.seasonality = seasonality;
        this.hood = hood;
    }

    @Override
    public String toString() {
        return super.toString() + "Hood: " + hood + "; " + "Seasonality: " + seasonality + "; ";
    }


    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    public boolean isHood() {
        return hood;
    }

    public void setHood(boolean hood) {
        this.hood = hood;
    }

    @Override
    public String write() {
        return toString() + brand();
    }

}
