package person;

public enum Gender {
    MALE("Male", "Férfi"),
    FEMALE("Female", "Nő"),
    OTHER("Other", "Egyéb");

    private final String englishName;
    private final String hungarianName;

    Gender(String englishName, String hungarianName) {
        this.englishName = englishName;
        this.hungarianName = hungarianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getHungarianName() {
        return hungarianName;
    }
}
