package zoo;

public class Cat extends Mammal implements Viviparous {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meooooowwww");
    }
}
