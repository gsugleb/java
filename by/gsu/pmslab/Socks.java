package by.gsu.pmslab;

public class Socks implements WriteInfo, Things {
    private String monofactory;
    private int size;

    public Socks(String monofactory, int size) {
        this.monofactory = monofactory;
        this.size = size;
    }

    public String getMonofactory() {
        return monofactory;
    }

    public void setMonofactory(String monofactory) {
        this.monofactory = monofactory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Socks:" + monofactory + " " + size + " ";
    }


    @Override
    public String brand() {
        if (monofactory.equals("Belwest") || monofactory.equals("Marko")) {
            return "Belorussian brand";
        } else {
            return "Foreign brand";
        }
    }

    @Override
    public String write() {
        return toString() + brand();
    }
}
