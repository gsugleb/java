package by.gsu.pmslab;

public class Trousers extends Clothes {
    private boolean flare;

    public Trousers(String monofactory, int cost, String style, boolean flare) {
        super(monofactory, cost, style);
        this.flare = flare;
    }

    @Override
    public String toString() {
        return super.toString() + flare + " ";
    }


    public boolean isFlare() {
        return flare;
    }

    public void setFlare(boolean flare) {
        this.flare = flare;
    }

    @Override
    public String write() {
        return toString() + brand();
    }
}
