package aufgabe1.bird;

import aufgabe1.food.Seed;
import aufgabe1.food.Worm;

public class Blackbird extends Bird {
    public Blackbird() {
        getPreferredFoods().add(new Seed());
        getPreferredFoods().add(new Worm());
    }
}
