package by.gsu.pmslab;

public abstract class Clothes implements Things, WriteInfo {
    private String manufacture;
    private int cost;
    private String style;


    public Clothes(String manufacture, int cost, String style) {
        this.manufacture = manufacture;
        this.cost = cost;
        this.style = style;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Clothes: " + "Manufacture: " + manufacture + "; " + "Cost: " + Byn.toByn(cost) + "; " + "Style: " + style + "; ";
    }

    @Override
    public String brand() {
        if (getManufacture().equals("Svitanak") || getManufacture().equals("Kalinka")) {
            return "Brand: Belorussian brand;";
        } else {
            return "Brand: Foreign brand;";
        }
    }

}
