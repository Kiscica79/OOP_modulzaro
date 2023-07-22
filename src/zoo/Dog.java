package zoo;

public class Dog extends Mammal implements Viviparous {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
