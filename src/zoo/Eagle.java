package zoo;

public class Eagle extends Birds implements Oviparous, Flyable {


    public Eagle(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Scrrreeeetch!!!");
    }


}
