package aufgabe1;

import aufgabe1.bird.Bird;
import aufgabe1.bird.Pigeon;
import aufgabe1.bird.Woodpecker;
import aufgabe1.food.Food;
import aufgabe1.food.Nut;
import aufgabe1.food.Peanut;
import aufgabe1.food.Seed;
import aufgabe1.food.Water;
import aufgabe1.food.Worm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Änderungen an diesem Test (abgesehen vom Entfernen von // ) sind NICHT erlaubt!
class BirdhouseTest {

    private static final int AMOUNT = 25;

    // TODO Tests auskommentieren und so viele wie möglich zum passen bringen
    @Test
    void testAddFoodBasic() {
        // given
        Birdhouse birdhouse = new Birdhouse();
        assertEquals(0, birdhouse.getFoodToAmountMap().size());
        Seed seed          = new Seed();
        int  amountOfSeeds = 50;

        // when
        birdhouse.addFood(seed, amountOfSeeds);

        // then
        assertEquals(1, birdhouse.getFoodToAmountMap().size());
        assertEquals(amountOfSeeds, birdhouse.getFoodToAmountMap().get(seed));

        // given
        Nut nut          = new Nut();
        int amountOfNuts = 75;

        // when
        birdhouse.addFood(nut, amountOfNuts);

        // then
        assertEquals(2, birdhouse.getFoodToAmountMap().size());
        assertEquals(amountOfNuts, birdhouse.getFoodToAmountMap().get(nut));
    }

    @Test
    void testAddFoodSameMultipleTimes() {
        // given
        Birdhouse birdhouse = new Birdhouse();
        assertEquals(0, birdhouse.getFoodToAmountMap().size());
        Seed seed          = new Seed();
        int  amountOfSeeds = 50;

        // when
        birdhouse.addFood(seed, amountOfSeeds);
        birdhouse.addFood(seed, amountOfSeeds);

        // then
        assertEquals(1, birdhouse.getFoodToAmountMap().size());
        assertEquals(amountOfSeeds * 2, birdhouse.getFoodToAmountMap().get(seed));

        // given
        Seed seed2 = new Seed();

        // when
        birdhouse.addFood(seed2, amountOfSeeds);

        // then
        assertEquals(1, birdhouse.getFoodToAmountMap().size());
        assertEquals(amountOfSeeds * 3, birdhouse.getFoodToAmountMap().get(seed));
    }

//    @Test
//    void testVisitWithoutFood() {
//        // given
//        Birdhouse birdhouse = new Birdhouse();
//        Bird      bird      = new Pigeon();
//
//        // when
//        Food food = birdhouse.visit(bird);
//
//        // then
//        assertEquals(0, birdhouse.getFoodToAmountMap().size());
//        assertTrue(food instanceof Water);
//    }
//
//    @Test
//    void testVisitOnlyNonPreferredFoods() {
//        // given
//        Birdhouse birdhouse = new Birdhouse();
//        Bird      bird      = new Pigeon();
//        birdhouse.addFood(new Worm(), AMOUNT);
//
//        // when
//        boolean gotWorm = false;
//        for (int i = 0; i < 100; i++) {
//            Food food = birdhouse.visit(bird);
//            if (food instanceof Worm) {
//                gotWorm = true;
//            }
//        }
//
//        // then
//        assertFalse(gotWorm);
//    }
//
//    @Test
//    void testVisitPreferredFoods() {
//        // given
//        Birdhouse birdhouse = new Birdhouse();
//        Bird      bird      = new Woodpecker();
//        birdhouse.addFood(new Seed(), AMOUNT);
//        birdhouse.addFood(new Nut(), AMOUNT);
//
//        // when
//        int amountOfSeed = 0;
//        int amountOfNut  = 0;
//        for (int i = 0; i < AMOUNT * 2; i++) {
//            Food food = birdhouse.visit(bird);
//            if (food instanceof Seed) {
//                amountOfSeed++;
//            }
//            if (food instanceof Nut) {
//                amountOfNut++;
//            }
//        }
//        Food foodAfterPreferredFoodsRanOut = birdhouse.visit(bird);
//
//        // then
//        assertEquals(AMOUNT, amountOfSeed);
//        assertEquals(AMOUNT, amountOfNut);
//        assertFalse(foodAfterPreferredFoodsRanOut instanceof Seed, "sobald es keine Samen mehr gibt, sollte Vogel keine Samen mehr bekommen");
//        assertFalse(foodAfterPreferredFoodsRanOut instanceof Nut, "sobald es keine Nüsse mehr gibt, sollte Vogel keine Nüsse mehr bekommen");
//        assertFalse(birdhouse.getFoodToAmountMap().containsKey(foodAfterPreferredFoodsRanOut), "wenn ganze Nahrung im Vogelhaus aufgebraucht ist, sollte keine Nahrung vom Vogelhaus zurückgegeben werden!");
//    }
//
//    @Test
//    void testVisitMultiplePreferredFoodsWithInheritance() {
//        // given
//        Birdhouse birdhouse = new Birdhouse();
//        Bird      bird      = new Woodpecker();
//        birdhouse.addFood(new Seed(), AMOUNT);
//        birdhouse.addFood(new Peanut(), AMOUNT); // Hinweis: Woodpecker hat als preferredFoods nur `Nut`, nicht `Peanut`, aber `Peanut` erbt von `Nut`
//
//        // when
//        int amountOfSeed = 0;
//        int amountOfPeanut  = 0;
//        for (int i = 0; i < AMOUNT * 2; i++) {
//            Food food = birdhouse.visit(bird);
//            if (food instanceof Seed) {
//                amountOfSeed++;
//            }
//            if (food instanceof Peanut) {
//                amountOfPeanut++;
//            }
//        }
//        Food foodAfterPreferredFoodsRanOut = birdhouse.visit(bird);
//
//        // then
//        assertEquals(AMOUNT, amountOfSeed);
//        assertEquals(AMOUNT, amountOfPeanut);
//        assertFalse(foodAfterPreferredFoodsRanOut instanceof Seed, "sobald es keine Samen mehr gibt, sollte Vogel keine Samen mehr bekommen");
//        assertFalse(foodAfterPreferredFoodsRanOut instanceof Peanut, "sobald es keine Erdnüsse mehr gibt, sollte Vogel keine Erdnüsse mehr bekommen");
//        assertFalse(birdhouse.getFoodToAmountMap().containsKey(foodAfterPreferredFoodsRanOut), "wenn ganze Nahrung im Vogelhaus aufgebraucht ist, sollte keine Nahrung vom Vogelhaus zurückgegeben werden!");
//    }

}
