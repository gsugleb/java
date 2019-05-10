package by.gsu.pmslab;

public class Drugstore {
    private String name;
    private Boolean licen;
    private Float money;

    public Drugstore(String name, boolean licen, Float money){
        this.name = name;
        this.licen = licen;
        this.money = money;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getLisen(){
        return licen;
    }
    public void setLicen(boolean licen){
        this.licen = licen;
    }
    public Float getMoney(){
        return money;
    }
    public void setMoney(Float money){
        this.money = money;
    }

    @Override
    public String toString(){
        return "Магазин: "+name+" " +"Наличие лицензии: "+ licen+" " +"Месячная прибыль: "+ money+";";
    }
}
