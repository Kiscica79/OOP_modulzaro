package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private final Gender gender;
    private List<String> hobbies = new ArrayList<>();
    private List<Person> friends = new ArrayList<>();

    private static int populationCount = 0;


    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        populationCount++;
    }

    public void addFriend(Person friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.addFriend(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public static int getPopulationCount() {
        return populationCount;
    }

    public static void setPopulationCount(int populationCount) {
        Person.populationCount = populationCount;
    }


    public String toString() {
        String friendList = friends.isEmpty() ? "Nincs legjobb barátom" : getFriendNames().toString();
        return '{'+
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender.getEnglishName() + "\n" +
                "Hobbies: " + hobbies + "\n" +
                "Friends" + friendList +"\n"+
                '}';
    }


    private List<String> getFriendNames() {
        List<String> friendNames = new ArrayList<>();
        for (Person friend : friends) {
            friendNames.add(friend.getName());
        }
        return friendNames;
    }

}
