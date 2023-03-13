package aufgabe1.bird;

import aufgabe1.food.Food;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Bird {

    private final List<Food> eaten          = new ArrayList<>();
    private final Set<Food>  preferredFoods = new HashSet<>();

    private int flownDistance = 0;
    private int energy        = 0;

    /**
     * Gibt Name der Klasse als String zurück.
     * z. B.:
     * Bird bird = new Bird();
     * bird.getSpecies(); // gibt "Bird" zurück
     * <p>
     * Blackbird blackbird = new Blackbird();
     * blackbird.getSpecies(); // gibt "Blackbird" zurück
     */
    public String getSpecies() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) other;
        return flownDistance == bird.flownDistance && energy == bird.energy && getSpecies().equals(bird.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(flownDistance, energy, getSpecies());
    }

    @Override
    public String toString() {
        return "Bird (" + getSpecies() + ")";
    }

    public List<Food> getEaten() {
        return eaten;
    }

    public Set<Food> getPreferredFoods() {
        return preferredFoods;
    }

    public int getFlownDistance() {
        return flownDistance;
    }

    private void setFlownDistance(int flownDistance) {
        this.flownDistance = flownDistance;
    }

    public int getEnergy() {
        return energy;
    }

    /**
     * In produktivem Code wäre diese Methode `private`, und man würde im Test statt `setEnergy` die `eat` Methode verwenden
     * (da diese bereits separat getestet wurde). Um jedoch zu vermeiden, dass wenn jemand `eat` nicht implementiert hat
     * nicht Abzug bei der Implementierung von `fly` bekommt, wird diese Methode in den Tests verwendet.
     */
    void setEnergy(int energy) {
        this.energy = energy;
    }
}
