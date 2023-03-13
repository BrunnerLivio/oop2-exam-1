package aufgabe1.food;

public class Peanut extends Nut {
    @Override
    public int getEnergyContent() {
        return 4;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Nut)) {
            return false;
        }
        Food food = (Food) other;
        return getType().equals(food.getType()) || getType().equals(super.getType());
    }
}
