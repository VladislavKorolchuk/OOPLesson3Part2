import java.util.Objects;

// Летающие
public final class Flying extends Birds {
    private String typeOfMovement; // тип передвижения

    public Flying(String animalNickname, int animalAge, String livingEnvironment, String typeOfMovement) {
        super(animalNickname, animalAge, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    @Override
    public String toString() {
        return "Кличка " + getAnimalNickname()
                + ", возраст " + getAnimalAge()
                + ", среда проживания " + getLivingEnvironment()
                + ", тип передвижения " + getTypeOfMovement()
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return super.equals(o) && Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    void eat() {
        System.out.println("Кушать");
    }
    @Override
    void moveAround() {
        System.out.println("Перемещаться");
    }

    void toFly() {
        System.out.println("Летать");
    }

}
