package by.gsu.pmslab;


public class Byn {
    private int cent;

    public Byn(int value){
        this.cent = value;
    }
    public Byn(int rubs, int coins){
        this(rubs*100+coins);
    }
    public Byn(Byn ob){
        this(ob.cent);
    }
    public int getRubs(){
        return cent /100;
    }
    public int getCoins(){
        return  cent %100;
    }
    @Override
    public String toString(){
        return cent / 100 + "." + cent / 10 % 10 + cent % 10;
    }
    public Byn sub(Byn ob){
        cent -= ob.cent;
        return this;
    }
    public Byn sub(int k){
        cent -= k;
        return this;
    }
    public Byn mul(int k){
        cent *= k;
        return this;
    }
    public Byn mul(double k){
        cent *= k;
        return this;
    }
    public int compareTo(Byn byn){
        return cent - byn.cent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byn byn1 = (Byn) o;
        return cent == byn1.cent;
    }
}