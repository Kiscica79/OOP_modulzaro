package zoo;

public class Penguin extends Birds implements Oviparous {

    public Penguin(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Honk! Honk! Honk!");
    }
}
