import by.gsu.pmslab.Byn;
import by.gsu.pmslab.PricePurchase;
import by.gsu.pmslab.Purchase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        final String FILE_PATH = "src/in.csv";
        List<Purchase> purchases = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                switch (line.length) {
                    case 3:
                        purchases.add(new Purchase(line));
                        break;
                    case 4:
                        purchases.add(new PricePurchase(line));
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("\tScanned data:");
        show(purchases);

        System.out.println("\tPurchase with index 6 -> " + purchases.get(6));

        purchases.removeIf((Purchase purch) -> purch.getPrice().compareTo(new Byn(10000)) < 0);
        Collections.sort(purchases);

        show(purchases);

        int indexSerach = Collections.binarySearch(purchases, new Purchase(null, new Byn(35000), 1));

        if (indexSerach < purchases.size() && indexSerach >= 0) {
            System.out.println("\tResult of search -> " + purchases.get(indexSerach));
        } else {
            System.out.println("\tItem was not found.");
        }

    }

    private static void show(List<Purchase> list) {
        for (Purchase item : list) {
            System.out.println(item);
        }
    }
}