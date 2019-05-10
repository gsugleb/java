package by.gsu.pmslab;

import java.util.Scanner;

public class PurchasesFactory {
    private static enum TypeOfPurchase{
        GENERAL_PURCHASE{
            Purchase getPurchase(Scanner sc){
                return new Purchase(sc);
            }
        },
        DISCOUNT_PURCHASE{
            PriceDiscountPurchase getPurchase(Scanner sc){
                return new PriceDiscountPurchase(sc);
            }
        },
        PERCENT_PURCHASE{
            PercentDiscountPurchase getPurchase(Scanner sc){
                return new PercentDiscountPurchase(sc);
            }
        };
        abstract Purchase getPurchase(Scanner sc);

    }
    public static Purchase getPurchaseFromFactory(Scanner sc) {
        return TypeOfPurchase.valueOf(sc.next()).getPurchase(sc);
    }
}