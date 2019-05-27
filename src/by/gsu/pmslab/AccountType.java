package by.gsu.pmslab;

public enum AccountType {
    COOL,SMART,SUPER,SUPERCRAZY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}