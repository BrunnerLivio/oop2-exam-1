package aufgabe1.food;

import java.util.Objects;

public abstract class Food {
    public abstract int getEnergyContent();

    /**
     * Gibt Name der Klasse als String zurück.
     * z. B.:
     * Nut nut = new Nut();
     * nut.getType(); // gibt "Nut" zurück
     * <p>
     * Seed seed = new Seed();
     * seed.getType(); // gibt "Seed" zurück
     */
    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getType();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Food)) {
            return false;
        }
        Food food = (Food) other;
        return getType().equals(food.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

}
