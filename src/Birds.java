import java.util.Objects;

// Птицы
public abstract class Birds extends Animals {
    private String livingEnvironment; // среда проживания

    public Birds(String animalNickname, int animalAge, String livingEnvironment) {
        super(animalNickname, animalAge);
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return super.equals(o) && Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
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
