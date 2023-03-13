package aufgabe2;

import aufgabe1.bird.Bird;
import aufgabe1.food.Food;
import aufgabe1.food.Water;

import java.util.HashMap;
import java.util.Map;

public class Birdhouse<B extends Bird, F extends Food> {

    Map<F, Integer> foodToAmountMap = new HashMap<>();

    public void addFood(F food, int amount) {
        foodToAmountMap.put(food, amount);
    }

    public void feed(B bird, F food) {
        bird.getEaten().add(food);
    }

    public static <B extends Bird> void feedWater(B bird) {
        bird.getEaten().add(new Water());
    }

    public Map<F, Integer> getFoodToAmountMap() {
        return foodToAmountMap;
    }
}
