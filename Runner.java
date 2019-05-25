import by.gsu.pmslab.Blouse;
import by.gsu.pmslab.Jacket;
import by.gsu.pmslab.Shoes;

public class Runner {
    public static void main(String[] args) {
        Blouse blouse = new Blouse("Kalinka", 1000, "sport", "long", 10);
        Jacket jacket = new Jacket("H&M", 5000, "casual", "winter", true);
        Shoes shoes = new Shoes("Nike", "adventure", 44);
        System.out.println();
        System.out.println(blouse.write());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println(jacket.write());
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println(shoes.write());
        System.out.println("--------------------------------------------------------------------------");
    }
}
