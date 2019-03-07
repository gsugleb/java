import by.gsu.pmslab.BusinessTrip;
import by.gsu.pmslab.CoinConverter;

public class Runner {
    public static void main(String[] args) {
        System.out.println(CoinConverter.convert(700, 100, 4));
        BusinessTrip trips[] = {
                new BusinessTrip("Nikita","Kravt", 20000,5),
                new BusinessTrip("Nyx","Assasin", 30000,7),
                null,
                new BusinessTrip("Artem","Korol", 1000,6),
                new BusinessTrip("Nikita","Petrov", 2000,4),
                new BusinessTrip("Lex","Luter", 2000,4),
                new BusinessTrip()
        };
        for(BusinessTrip trip:trips){
            if(trip!=null){
                trip.show();
            }
        }
        trips[trips.length-1].setTransportExpenses(15000);
        System.out.println("Duration= "+trips[0].getDays());
        System.out.println("Duration= "+trips[1].getDays());
        for (BusinessTrip trip:trips){
            System.out.println(trip);
        }
        int totalSum=0;
        for (BusinessTrip trip:trips){
            if(trip!=null){
                totalSum+=trip.getTotal();
            }
        }
        System.out.println("TOTAL SUM    "+totalSum);
        BusinessTrip maxTransportExpenses= new BusinessTrip();
        for (BusinessTrip trip:trips){
            if((trip!=null)&&(trip.getTransportExpenses()>maxTransportExpenses.getTransportExpenses())){
                maxTransportExpenses=trip;
            }
        }
        System.out.println("Max total expenses:");
        maxTransportExpenses.show();
    }

}