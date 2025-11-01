package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 3;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;
    private Aquatic[] aquaticAnimals;

    public Zoo() {
    }


    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[10];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return  aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {this.aquaticAnimals = aquaticAnimals;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }


    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }
    public class ZooFullException extends Exception {
        public ZooFullException() {
            super();
        }
        public ZooFullException(String message) {
            super(message);
        }
    }
    public class AnimalExistsException extends Exception {
        public AnimalExistsException() {
            super();
        }
        public AnimalExistsException(String message) {
            super(message);
        }
    }
    public class InvalidAgeException extends Exception {
        public InvalidAgeException() {
            super();
        }
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    public void addAnimal(Animal animal) throws ZooFullException , AnimalExistsException , InvalidAgeException{
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }
        if (searchAnimal(animal) != -1) {
            throw new AnimalExistsException("Animal " + animal.getName() + " already exists");
        }
        if (isZooFull()) {
            throw new ZooFullException(animal.getName() + " because zoo is full");
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < 10) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        }
        else{
            System.out.println("the table is full");
        }
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public void displayAquaticAnimals() {
        System.out.println("List of aquatic animals of " + name + ":");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
            aquaticAnimals[i].swim();
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public float maxPenguinSwimmingDepth() {
        return 100;
    }

    public void displayNumberOfAquaticByType() {
        int dolphin=0;
        int penguin=0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                penguin++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                dolphin++;
            }
        }
        System.out.println("The number of penguins is " + penguin);
        System.out.println("The number of dolphins is " + dolphin);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
