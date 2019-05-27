package by.gsu.pmslab;

import java.util.Scanner;

public class PricePurchase extends Purchase {
    private Byn discount;

    public PricePurchase(String name, Byn price, int units, Byn discount) {
        super(name, price, units);
        this.discount = discount;
    }

    public PricePurchase(Scanner sc) {
        super(sc.next(), new Byn(sc.nextInt()), sc.nextInt());
        this.discount = new Byn(sc.nextInt());
    }

    public PricePurchase(String[] csvSplit) {
        super(csvSplit[0], new Byn(Integer.parseInt(csvSplit[1])), Integer.parseInt(csvSplit[2]));
        this.discount = new Byn(Integer.parseInt(csvSplit[3]));
    }

    public Byn getDiscount() {
        return discount;
    }

    @Override
    public Byn getCost() {
        return new Byn(getPrice()).sub(discount).mul(getUnits());
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" + getCost();
    }

}
