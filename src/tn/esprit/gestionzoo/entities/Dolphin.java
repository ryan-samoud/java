package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;
    public Dolphin(){}
    public Dolphin(float swimmingSpeed){
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim()
    {
        System.out.println("This dolphin animal is swimming.");
    }
    public String toString() {
        return super.toString() + "swimmingSpeed=" + swimmingSpeed;
    }
}