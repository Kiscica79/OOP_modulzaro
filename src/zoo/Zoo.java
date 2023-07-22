package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void displayAllAnimals() {
        System.out.println("All animals in the zoo:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
        System.out.println();
    }

    public void listMammals() {
        System.out.println("Mammals in the zoo:");
        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                System.out.println(animal.getName());
            }
        }
        System.out.println();
    }

    public void listBirds() {
        System.out.println("Birds in the zoo:");
        for (Animal animal : animals) {
            if (animal instanceof Birds) {
                System.out.println(animal.getName());
            }
        }
        System.out.println();
    }
    public void listReptiles() {
        System.out.println("Reptiles in the zoo:");
        for (Animal animal : animals) {
            if (animal instanceof Reptile) {
                System.out.println(animal.getName());
            }
        }
        System.out.println();
    }



}


