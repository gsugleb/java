package by.gsu.pmslab;

public class Shoes implements Things, WriteInfo {
    private String manufacture;
    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private int size;

    public Shoes(String monofactory, String style, int size) {
        this.manufacture = monofactory;
        this.style = style;
        this.size = size;
    }

    public String getMonofactory() {
        return manufacture;
    }

    public void setMonofactory(String monofactory) {
        this.manufacture = monofactory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes: " +"Manufacture: "+ manufacture + "; " +"Size: "+ size + "; " +"Style: " + style + "; ";
    }

    @Override
    public String brand() {
        if (manufacture.equals("Belwest") || manufacture.equals("Marko")) {
            return "Brand: Belorussian brand;";
        } else {
            return "Brand: Foreign brand;";
        }
    }

    @Override
    public String write() {
        return toString() + brand();
    }
}
