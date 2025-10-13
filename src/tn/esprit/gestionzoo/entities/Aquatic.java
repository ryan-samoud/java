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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() == Aquatic.class){
            Aquatic aquatic=(Aquatic) obj;
            return this.getAge()==aquatic.getAge() && this.getName().equals(aquatic.getName()) && this.getHabitat().equals(aquatic.getHabitat());
        }
        return false;
    }

    public String toString() {
        return super.toString() + "habitat=" + habitat;
    }
}
