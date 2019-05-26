package by.gsu.pmslab;

import java.io.Serializable;

public class Drugstore implements Serializable {
    private String name;
    private int money;
    private boolean haveLicen;

    public Drugstore(String name, int money, boolean haveLicen) {
        this.name = name;
        this.money = money;
        this.haveLicen = haveLicen;
    }

    public Drugstore(String name, int money) {
        this(name, money, true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isHaveLicen() {
        return haveLicen;
    }

    public void setHaveLicen(boolean haveLicen) {
        this.haveLicen = haveLicen;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; " + "Money: " + Byn.toBYN(money) + "; " + "Licen: " + haveLicen + ";";
    }
}
