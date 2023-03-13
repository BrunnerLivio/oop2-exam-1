package aufgabe1;

import aufgabe1.bird.Bird;
import aufgabe1.food.Food;
import aufgabe1.food.Water;

import java.util.HashMap;
import java.util.Map;

public class Birdhouse {
  Map<Food, Integer> foodToAmountMap = new HashMap<>();

  public void addFood(Food food, int amount) {
    if (foodToAmountMap.keySet().contains(food)) {
      foodToAmountMap.put(food, foodToAmountMap.get(food) + amount);
    } else {
      foodToAmountMap.put(food, amount);
    }
  }

  public Map<Food, Integer> getFoodToAmountMap() {
    return foodToAmountMap;
  }

  private Food removeFood(Food food) {
    int foodAmount = foodToAmountMap.get(food);

    if (foodAmount >= 1) {
      foodToAmountMap.put(food, foodAmount - 1);
      return food;
    }

    return null;
  }

  Food visit(Bird bird) {
    Food eatenPreferredFood = null;

    for (Food preferredFood : bird.getPreferredFoods()) {
      for (Food birdhouseFood : foodToAmountMap.keySet()) {
        if (birdhouseFood.equals(preferredFood) && eatenPreferredFood == null) {
          eatenPreferredFood = removeFood(birdhouseFood);
        }
      }
    }

    if (eatenPreferredFood == null) {
      return new Water();
    }
    return eatenPreferredFood;
  }
}
