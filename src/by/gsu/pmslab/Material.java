package by.gsu.pmslab;

public enum Material {
    STEEL("Steel",7850.0), COPPER("Copper",8500.0);
    private final String name;
    private final double density;

    Material(){
        this(null,0.0);
    }
    Material(String name, double density){
        this.name = name;
        this.density = density;
    }

    public String getName(){
        return name;
    }

    public double getDensity(){
        return density;
    }

    @Override
    public String toString(){
        return name + "; " + density + "; ";
    }
}
