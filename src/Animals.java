import java.util.Objects;

// Животные
public abstract class Animals {
    private final String animalNickname; // кличка животного
    private final int animalAge; // возраст

    public Animals(String animalNickname, int animalAge) {
        this.animalNickname = animalNickname;
        this.animalAge = animalAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return animalAge == animals.animalAge && Objects.equals(animalNickname, animals.animalNickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalNickname, animalAge);
    }

    public String getAnimalNickname() {
        return animalNickname;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }

    void moveAround() {
        System.out.println("Перемещаться");
    }

}
