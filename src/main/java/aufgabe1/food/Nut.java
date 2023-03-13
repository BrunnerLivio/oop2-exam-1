package aufgabe1.food;

public class Nut extends Food {
    @Override
    public int getEnergyContent() {
        return 3;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Nut)) {
            return false;
        }
        Food food = (Food) other;
        return getType().equals(food.getType());
    }
}
