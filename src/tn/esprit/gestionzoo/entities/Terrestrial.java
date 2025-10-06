package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;
    public Terrestrial(){}
    public Terrestrial(int nbrLegs){
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public String toString() {
        return super.toString() + "nbrLegs=" + nbrLegs;
    }
}
