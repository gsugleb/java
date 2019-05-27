package by.gsu.pmslab;

public class Byn {
    private int kopeck;

    public Byn(int value) {
        this.kopeck = value;
    }

    public Byn(int rubs, int coins) {
        this(rubs * 100 + coins);
    }

    public Byn(Byn ob) {
        this(ob.kopeck);
    }

    public int getRubs() {
        return kopeck / 100;
    }

    public int getCoins() {
        return kopeck % 100;
    }

    @Override
    public String toString() {
        return kopeck / 100 + "." + kopeck / 10 % 10 + kopeck % 10;
    }

    public Byn sub(Byn ob) {
        kopeck -= ob.kopeck;
        return this;
    }

    public Byn sub(int k) {
        kopeck -= k;
        return this;
    }

    public Byn mul(int k) {
        kopeck *= k;
        return this;
    }

    public Byn mul(double k) {
        kopeck *= k;
        return this;
    }

    public int compareTo(Byn byn) {
        return kopeck - byn.kopeck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byn byn1 = (Byn) o;
        return kopeck == byn1.kopeck;
    }
}