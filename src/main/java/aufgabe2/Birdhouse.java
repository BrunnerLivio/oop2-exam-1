package aufgabe2;

import aufgabe1.bird.Bird;
import aufgabe1.food.Food;
import aufgabe1.food.Water;

import java.util.HashMap;
import java.util.Map;

// TODO Klasse, Variablen und alle Methoden generisch machen, sodass Objekt wie folgt instanziiert werden kann: Birdhouse<Woodpecker, Nut> birdhouse = new Birdhouse<>();
public class Birdhouse {

    Map<Food, Integer> foodToAmountMap = new HashMap<>();

    public void addFood(Food food, int amount) {
        foodToAmountMap.put(food, amount);
    }

    public void feed(Bird bird, Food food) {
        bird.getEaten().add(food);
    }

    public static void feedWater(Bird bird) {
        bird.getEaten().add(new Water());
    }

    public Map<Food, Integer> getFoodToAmountMap() {
        return foodToAmountMap;
    }
}
