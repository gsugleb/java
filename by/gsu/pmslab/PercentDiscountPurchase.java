package by.gsu.pmslab;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase{
    private static final int DISCOUNT_LINE = 14;
    private final double percent;

    public PercentDiscountPurchase(String name, Byn price, int units, double percent){
        super(name, price, units);
        this.percent = percent;
    }
    public PercentDiscountPurchase(Scanner sc){
        super(sc.next(),new Byn(sc.nextInt()),sc.nextInt());
        this.percent = sc.nextDouble();
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public Byn getCost(){
        Byn cost = super.getCost();
        if (getUnits() > DISCOUNT_LINE){
            return cost.mul(1- percent /100);
        }else{
            return cost;
        }

    }
    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + percent;
    }

    @Override
    public String toString(){
        return fieldsToString()+";"+getCost();
    }
}