package zoo;

public class Snake extends Reptile implements Oviparous {
    public Snake(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("SSSssszzzzzzzz");
    }
}
