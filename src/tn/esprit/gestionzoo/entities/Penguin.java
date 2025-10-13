package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(){}
    public Penguin(float swimmingDepth){
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void swim()
    {
        System.out.println("This penguin animal is swimming.");
    }
    public String toString() {
        return super.toString() + "swimmingDepth=" + swimmingDepth;
    }
}