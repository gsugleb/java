import by.gsu.pmslab.Purchase;
import by.gsu.pmslab.PurchasesFactory;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) {

        File file = new File("src/in.txt");
        Scanner sc = null;
        boolean areEqual = true;
        final int PURCHASES_NUMBER = 6;
        Purchase[] purchases = new Purchase[PURCHASES_NUMBER];

        try {

            Purchase max = new Purchase();
            sc = new Scanner(file);

            for (int i=0 ; i < purchases.length; i++){

                purchases[i] = PurchasesFactory.getPurchaseFromFactory(sc);
                System.out.println(purchases[i]);

                if (purchases[i].getCost().compareTo(max.getCost()) > 0){
                    max = purchases[i];
                }
                if (areEqual){
                    areEqual=purchases[i].equals(purchases[0]);
                }

            }

            System.out.println("\nPurchase with maximum cost - "+max);

            if (areEqual){
                System.out.println("All purchases are equal");
            }else{
                System.out.println("All purchases are'nt equal");
            }
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
        }finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}