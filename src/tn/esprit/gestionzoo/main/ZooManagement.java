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


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


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
        Aquatic aqua=new Aquatic();
        Penguin happy =new Penguin();
        happy.setName("happyfeet");
        happy.setAge(12);
        happy.setFamily("Penguins");
        happy.setMammal(false);
        happy.setHabitat("El shammel, ");
        happy.setSwimmingDepth(69);
        System.out.println(happy);
        Dolphin sql =new Dolphin();
        sql.setName("sql");
        sql.setAge(6);
        sql.setFamily("sql");
        sql.setMammal(true);
        sql.setHabitat("b7ar, ");
        sql.setSwimmingSpeed(45);
        System.out.println(sql);
        aqua.swim();
        sql.swim();
        happy.swim(); //takes the function of superclass (penguin btw)
    }

}
