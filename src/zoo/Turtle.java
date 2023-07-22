package zoo;

public class Turtle extends Reptile implements Oviparous {

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Grgrgrgrrrrr!");
    }
}
