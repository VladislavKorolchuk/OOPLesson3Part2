public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 2, "наземно-воздушная", 114, "растительная");
        Herbivores gazelle1 = new Herbivores("Газель", 2, "наземно-воздушная", 114, "растительная");
        Herbivores giraffe = new Herbivores("Жираф", 8, "наземно-воздушная", 8, "растительная");
        Herbivores horse = new Herbivores("Лошадь", 6, "наземно-воздушная", 50, "растительная");
        System.out.println(gazelle.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());
        System.out.println("Сравнение объектов gazelle и gazelle1 - "+ (gazelle.equals(gazelle1)? "Равны": "Не равны"));
        System.out.println();

        Predators hyena = new Predators("Гиена", 5, "наземно-воздушная", 40, "мясной");
        Predators hyena1 = new Predators("Гиена", 5, "наземно-воздушная", 44, "мясной");
        Predators tiger = new Predators("Тигр", 15, "наземно-воздушная", 48, "мясной");
        Predators bear = new Predators("Медведь", 20, "наземно-воздушная", 8, "мясной");
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());
        System.out.println("Сравнение объектов hyena и hyena1 - "+ (hyena.equals(hyena1)? "Равны": "Не равны"));
        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 2, "наземно-водная");
        Amphibians frog1 = new Amphibians("Лягушка", 2, "наземно-водная");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 2, "наземно-воздушная");
        System.out.println(frog.toString());
        System.out.println(alreadyFreshwater.toString());
        System.out.println("Сравнение объектов frog и frog1 - "+ (frog.equals(frog1)? "Равны": "Не равны"));
        System.out.println();

        NotFlying peacock = new NotFlying("Павлин", 6, "наземная", "лапы");
        NotFlying peacock1 = new NotFlying("Павлин", 7, "наземная", "лапы");
        NotFlying penguin = new NotFlying("Пингвин", 9, "наземная", "лапы");
        NotFlying dodo = new NotFlying("Птица додо", 3, "наземная", "лапы");
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(dodo.toString());
        System.out.println("Сравнение объектов peacock и peacock1 - "+ (peacock.equals(peacock1)? "Равны": "Не равны"));
        System.out.println();

        Flying seagull = new Flying("Чайка", 1, "наземно-водо-воздушная", "крылья-лапы");
        Flying seagull1 = new Flying("Чайка", 1, "наземно-водо-воздушная", "крылья-лапы");
        Flying аlbatross = new Flying("Альбатрос", 6, "наземно-водо-воздушная", "крылья-лапы");
        Flying falcon = new Flying("Сокол", 5, "наземно-водо-воздушная", "крылья-лапы");
        Flying falcon1 = new Flying("Сокол", 5, "наземно-водо-воздушная", "крылья-лапы");
        System.out.println(seagull.toString());
        System.out.println(аlbatross.toString());
        System.out.println(falcon.toString());
        System.out.println("Сравнение объектов seagull и seagull1 - "+ (seagull.equals(seagull1)? "Равны": "Не равны"));

    }
}