package aufgabe1;

import aufgabe1.food.Food;

import java.util.HashMap;
import java.util.Map;

public class Birdhouse {
    Map<Food, Integer> foodToAmountMap = new HashMap<>();

    public void addFood(Food food, int amount) {
        foodToAmountMap.put(food, amount);
    }

    public Map<Food, Integer> getFoodToAmountMap() {
        return foodToAmountMap;
    }
}
