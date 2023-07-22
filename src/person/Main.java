package person;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("János", 30, Gender.MALE);
        Person person2 = new Person("Zsuzsanna", 28, Gender.FEMALE);
        Person person3 = new Person("Béla", 25, Gender.MALE);
        Person person4 = new Person("Viola", 20, Gender.FEMALE);

        person1.addFriend(person2);
        person2.addFriend(person3);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println("Population count: " + Person.getPopulationCount());

    }
}