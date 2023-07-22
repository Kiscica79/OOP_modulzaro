package zoo;

public class ZooManager {

    public static void main(String[] args) {


        Zoo zoo = new Zoo();

        zoo.addAnimal(new Dog("Cézár", 3));
        zoo.addAnimal(new Cat("Cirmi", 5));
        zoo.addAnimal(new Eagle("Thunder", 10));
        zoo.addAnimal(new Penguin("Csőri", 2));
        zoo.addAnimal(new Snake("Foltos", 4));
        zoo.addAnimal(new Turtle("TiniNindzsaHarciTeknős", 77));

        zoo.displayAllAnimals();
        zoo.listMammals();
        zoo.listBirds();
        zoo.listReptiles();
    }

}

