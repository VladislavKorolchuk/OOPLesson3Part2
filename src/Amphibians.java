import java.util.Objects;

// Земноводные
public class Amphibians extends Animals {
    private String livingEnvironment; // среда проживания

    public Amphibians(String animalNickname, int animalAge, String livingEnvironment) {
        super(animalNickname, animalAge);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Кличка " + getAnimalNickname()
                + ", возраст " + getAnimalAge()
                + ", среда проживания " + getLivingEnvironment()
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return super.equals(o) && Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    void eat() {
        System.out.println("Кушать");
    }
    @Override
    void moveAround() {
        System.out.println("Перемещаться");
    }

    void hunt() {
        System.out.println("Охотиться");

    }
}
