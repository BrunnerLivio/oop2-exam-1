package aufgabe1.bird;

import aufgabe1.food.Nut;
import aufgabe1.food.Seed;

public class Woodpecker extends Bird {
    public Woodpecker() {
        getPreferredFoods().add(new Nut());
        getPreferredFoods().add(new Seed());
    }
}
