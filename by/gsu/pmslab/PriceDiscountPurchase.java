package by.gsu.pmslab;

import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {
    private Byn discount;

    public PriceDiscountPurchase(String name, Byn price, int units, Byn discount){
        super(name, price, units);
        this.discount = discount;
    }
    public PriceDiscountPurchase(Scanner sc){
        super(sc.next(),new Byn(sc.nextInt()),sc.nextInt());
        this.discount =new Byn(sc.nextInt()) ;
    }
    public Byn getDiscount() {
        return discount;
    }

    @Override
    public Byn getCost(){
        return new Byn(getPrice()).sub(discount).mul(getUnits());
    }
    protected String fieldsToString() {
        return  super.fieldsToString() + ";" + discount;
    }

    @Override
    public String toString(){
        return fieldsToString()+";"+getCost();
    }

}