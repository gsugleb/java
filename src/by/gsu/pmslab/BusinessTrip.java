package by.gsu.pmslab;

public class BusinessTrip {
    public static final int COINS_PER_DAY= 600;
    private String name;
    private String lastName;
    private int transportExpenses;
    private int days;
    public BusinessTrip() {
        super();
    }
    public BusinessTrip(String name, String lastName, int transportExpences, int days) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.transportExpenses = transportExpences;
        this.days = days;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getTransportExpenses() {
        return transportExpenses;
    }
    public void setTransportExpenses(int transportExpences) {
        this.transportExpenses = transportExpences;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public static int getCoinsPerDay() {
        return COINS_PER_DAY;
    }
    public int getTotal(){
        return transportExpenses+(days*COINS_PER_DAY);
    }
    public void show(){
        System.out.println("rate = "+COINS_PER_DAY);
        System.out.println("account = "+name+" "+lastName);
        System.out.println("transport = "+transportExpenses);
        System.out.println("days = "+days);
        System.out.println("total = "+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2));
    }

    public String toString(){
        return COINS_PER_DAY+";"+name+" "+lastName+";"+transportExpenses+";"+days+";"+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2);
    }
}