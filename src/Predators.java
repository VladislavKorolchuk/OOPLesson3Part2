import java.util.Objects;

// Хищники
public final class Predators extends Mammals {
    private String typeOfFood; // тип пищи

    public Predators(String animalNickname, int animalAge, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(animalNickname, animalAge, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        return "Кличка " + getAnimalNickname()
                + ", возраст " + getAnimalAge()
                + ", среда проживания " + getLivingEnvironment()
                + ", скорость перемещения " + getMovementSpeed()
                + ", тип пищи " + getTypeOfFood()
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return super.equals(o) && Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
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
