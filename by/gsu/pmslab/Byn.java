package by.gsu.pmslab;

public class Byn {
    public static String toByn(int kopek) {
        return kopek / 100 + "." + kopek / 10 % 10 + kopek % 10 + " Byn";
    }
}
