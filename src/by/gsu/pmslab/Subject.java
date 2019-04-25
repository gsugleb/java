package by.gsu.pmslab;

public class Subject {
    private String subjName;
    private Material material;
    private double volume;

    public Subject(){

    }

    public Subject(String subjName, Material material, double volume){
        this.subjName = subjName;
        this.material = material;
        this.volume = volume;
    }

    public String getSubjName(){
        return subjName;
    }

    public void setSubjName(String subjName){
        this.subjName =subjName;
    }

    public Material getMaterial(){
        return material;
    }

    public void setMaterial(Material material){
        this.material = material;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }
    public double getMass(){
        return material.getDensity() * volume;
    }

    @Override
    public String toString(){
        return subjName + "; " + material + volume + "; " + getMass();
    }
}
