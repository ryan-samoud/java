package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){}
    public Aquatic(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void swim()
    {
        System.out.println("This aquatic animal is swimming.");
    }
    public String toString() {
        return super.toString() + "habitat=" + habitat;
    }
}
