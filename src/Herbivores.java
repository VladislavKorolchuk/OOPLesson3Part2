import java.util.Objects;

// Травоядные
public final class Herbivores extends Mammals {
    private String typeOfFood; // тип пищи

    public Herbivores(String animalNickname, int animalAge, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(animalNickname, animalAge, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return super.equals(o) && Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
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
    void eat() {
        System.out.println("Кушать");
    }
    @Override
    void moveAround() {
        System.out.println("Перемещаться");
    }

    void pasty() {
        System.out.println("Пасти");
    }

}
