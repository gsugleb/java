package by.gsu.pmslab;

import java.util.Objects;
import java.util.Scanner;

public class Purchase implements Comparable<Purchase> {

    private String name;
    private Byn price;
    private final int units;

    public Purchase() {
        this(null, new Byn(0), 0);
    }

    public Purchase(String name, Byn price, int units) {
        this.name = name;
        this.price = price;
        this.units = units;
    }

    public Purchase(Scanner sc) {
        this(sc.next(), new Byn(sc.nextInt()), sc.nextInt());
    }

    public Purchase(String[] csvSplit) {
        this(csvSplit[0], new Byn(Integer.parseInt(csvSplit[1])), Integer.parseInt(csvSplit[2]));
    }

    public String getName() {
        return name;
    }

    public Byn getPrice() {
        return price;
    }

    public int getUnits() {
        return units;
    }

    public Byn getCost() {
        return new Byn(price).mul(units);
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" + getCost();
    }

    protected String fieldsToString() {
        return name + ";" + price + ";" + units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return units == purchase.units &&
                name.equals(purchase.name) &&
                price.equals(purchase.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, units);
    }

    @Override
    public int compareTo(Purchase o) {
        return this.getCost().compareTo(o.getCost());
    }
}