package aufgabe1.bird;

import aufgabe1.food.Seed;

public class Pigeon extends Bird {
    public Pigeon() {
        getPreferredFoods().add(new Seed());
    }
}
