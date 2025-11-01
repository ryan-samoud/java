package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal dog2 = new Animal("Canine", "lll", -2, true);
        Animal cat = new Animal("Cats", "9atous", 3, true);
        Animal cat2 = new Animal("Cats", "feline", 3, true);

        try {
            myZoo.addAnimal(lion);
            System.out.println("Animal ajouté : " + lion.getName());
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());
        try {
            myZoo.addAnimal(dog);
            System.out.println("Animal ajouté : " + dog.getName());
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());
        try {
            myZoo.addAnimal(dog2);
            System.out.println("Animal ajouté : " + dog2.getName());
        } catch (Exception e) {
            System.out.println("Erreur " +dog2.getName()+": " + e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());
        try {
            myZoo.addAnimal(cat);
            System.out.println("Animal ajouté : " + cat.getName());
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());
        try {
            myZoo.addAnimal(cat2);
            System.out.println("Animal ajouté : " + cat2.getName());
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());


        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        Terrestrial tiger =new Terrestrial();
        tiger.setName("Terra");
        tiger.setAge(12);
        tiger.setFamily("Cats");
        tiger.setMammal(true);
        tiger.setNbrLegs(4);
        System.out.println(tiger);
        myZoo.displayAnimals();

        Aquatic aqua=new Aquatic();
        Penguin happy =new Penguin();
        happy.setName("happyfeet");
        happy.setAge(12);
        happy.setFamily("Penguins");
        happy.setMammal(false);
        happy.setHabitat("El shammel, ");
        happy.setSwimmingDepth(69);
        Dolphin sql =new Dolphin();
        sql.setName("sql");
        sql.setAge(6);
        sql.setFamily("dolphin");
        sql.setMammal(true);
        sql.setHabitat("b7ar, ");
        sql.setSwimmingSpeed(45);
        aqua.swim();
        sql.swim();
        happy.swim(); //takes the function of superclass (penguin btw)
        myZoo.addAquaticAnimal(happy);
        myZoo.addAquaticAnimal(sql);
        myZoo.displayAquaticAnimals();
        myZoo.displayNumberOfAquaticByType();
    }

}
