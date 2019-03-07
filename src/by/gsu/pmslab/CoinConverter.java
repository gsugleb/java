package by.gsu.pmslab;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class CoinConverter {
    public static final int BYN=100;
    public static String convert(int coins,int div,int intenegrity){
        BigDecimal initial = new BigDecimal(coins);
        BigDecimal rubs=initial.divide(new BigDecimal(div));
        BigDecimal result=rubs.setScale(intenegrity, RoundingMode.CEILING);
        return result.toString();
    }
    public static String convert(int coins){
        return convert(coins,BYN,2);
    }
}