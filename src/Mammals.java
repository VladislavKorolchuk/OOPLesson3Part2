import java.util.Objects;

// Млекопитающие
public abstract class Mammals extends Animals {
    private String livingEnvironment; // среда проживания
    private int movementSpeed; // скорость перемещения

    public Mammals(String animalNickname, int animalAge, String livingEnvironment, int movementSpeed) {
        super(animalNickname, animalAge);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return super.equals(o) && movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    void eat() {
        System.out.println("Кушать");
    }
    @Override
    void moveAround() {
        System.out.println("Перемещаться");
    }

    void walk() {
         System.out.println("Гулять");
     }

}
