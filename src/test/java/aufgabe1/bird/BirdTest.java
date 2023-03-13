package aufgabe1.bird;

import aufgabe1.food.Nut;
import aufgabe1.food.Peanut;
import aufgabe1.food.Seed;
import aufgabe1.food.Water;
import aufgabe1.food.Worm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Änderungen an diesem Test (abgesehen vom Entfernen von // ) sind NICHT erlaubt!
class BirdTest {

    // TODO Tests auskommentieren und so viele wie möglich zum passen bringen
    @Test
    void testGetSpecies() {
        // given
        Bird   bird   = new Bird();
        Pigeon pigeon = new Pigeon();

        // when
        String birdSpecies      = bird.getSpecies();
        String blackbirdSpecies = pigeon.getSpecies();

        // then
        assertEquals("Bird", birdSpecies);
        assertEquals("Pigeon", blackbirdSpecies);
    }

//    @Test
//    void testAddPreferredFood() {
//        // given
//        Bird bird = new Bird();
//        Nut  food = new Nut();
//        assertEquals(0, bird.getPreferredFoods().size()); // initial leer
//
//        // when
//        boolean firstAdd  = bird.addPreferredFood(food);
//        boolean secondAdd = bird.addPreferredFood(food);
//
//        // then
//        assertEquals(1, bird.getPreferredFoods().size());
//        assertTrue(bird.getPreferredFoods().contains(food));
//        assertTrue(firstAdd);
//        assertFalse(secondAdd);
//    }
//
//    @Test
//    void testEatPreferredEaten() {
//        // given
//        Bird bird = new Woodpecker();
//        Nut  nut  = new Nut();
//        Seed seed = new Seed();
//
//        // when
//        bird.eat(nut);
//        bird.eat(nut);
//        bird.eat(seed);
//
//        // then
//        assertEquals(3, bird.getEaten().size());
//        assertSame(nut, bird.getEaten().get(0));
//        assertSame(nut, bird.getEaten().get(1));
//        assertSame(seed, bird.getEaten().get(2));
//    }
//
//    @Test
//    void testEatPreferredReturn() {
//        // given
//        Bird bird = new Woodpecker();
//        Nut  nut  = new Nut();
//        Seed seed = new Seed();
//
//        // when
//        boolean ateNut       = bird.eat(nut);
//        boolean ateSecondNut = bird.eat(nut);
//        boolean ateSeed      = bird.eat(seed);
//
//        // then
//        assertTrue(ateNut);
//        assertTrue(ateSecondNut);
//        assertTrue(ateSeed);
//    }
//
//    @Test
//    void testEatPreferredEnergy() {
//        // given
//        Bird bird = new Woodpecker();
//        Nut  nut  = new Nut();
//        Seed seed = new Seed();
//
//        // when
//        bird.eat(nut);
//        bird.eat(nut);
//        bird.eat(seed);
//
//        // then
//        int expectedEnergy = nut.getEnergyContent() +
//                nut.getEnergyContent() +
//                seed.getEnergyContent();
//        assertEquals(expectedEnergy, bird.getEnergy());
//    }
//
//    @Test
//    void testEatPreferredWithInheritance() {
//        // given
//        Bird   bird   = new Woodpecker();
//        Nut    nut    = new Nut();
//        Peanut peanut = new Peanut(); // Hinweis: Woodpecker hat als preferredFoods nur `Nut`, nicht `Peanut`, aber `Peanut` erbt von `Nut` und ist daher auch essbar
//
//        // when
//        boolean ateNut    = bird.eat(nut);
//        boolean atePeanut = bird.eat(peanut);
//
//        // then
//        int expectedEnergy = nut.getEnergyContent() + peanut.getEnergyContent();
//        assertEquals(expectedEnergy, bird.getEnergy());
//
//        assertTrue(ateNut);
//        assertTrue(atePeanut);
//
//        assertEquals(2, bird.getEaten().size());
//        assertTrue(bird.getEaten().contains(nut));
//        assertTrue(bird.getEaten().contains(peanut));
//    }
//
//    @Test
//    void testEatNonPreferred() {
//        // given
//        Bird bird = new Woodpecker();
//        Worm worm = new Worm();
//
//        // when
//        boolean ateWorm = bird.eat(worm);
//
//        // then
//        assertFalse(ateWorm);
//        assertEquals(0, bird.getEnergy());
//        assertEquals(0, bird.getEaten().size());
//    }
//
//    @Test
//    void testDrinkWater() {
//        // given
//        Bird  bird  = new Woodpecker();
//        Water water = new Water();
//
//        // when
//        boolean drankWater = bird.eat(water);
//
//        // then
//        assertTrue(drankWater);
//        assertEquals(water.getEnergyContent(), bird.getEnergy());
//        assertEquals(1, bird.getEaten().size());
//        assertSame(water, bird.getEaten().get(0));
//    }
//
//    @Test
//    void testFlyWithoutEnergy() {
//        // given
//        Bird bird = new Woodpecker();
//        assertEquals(0, bird.getFlownDistance());
//        assertEquals(0, bird.getEnergy());
//
//        // when
//        bird.fly();
//
//        // then
//        assertEquals(0, bird.getFlownDistance());
//        assertEquals(0, bird.getEnergy());
//    }
//
//    @Test
//    void testFly() {
//        // given
//        Bird bird = new Woodpecker();
//        bird.setEnergy(1);
//
//        // when
//        boolean flown1 = bird.fly();
//        boolean flown2 = bird.fly();
//        boolean flown3 = bird.fly();
//
//        // then
//        assertEquals(1, bird.getFlownDistance());
//        assertEquals(0, bird.getEnergy());
//        assertTrue(flown1);
//        assertFalse(flown2);
//        assertFalse(flown3);
//
//        // given
//        bird.setEnergy(2);
//
//        // when
//        boolean flown4 = bird.fly();
//
//        // then
//        assertEquals(2, bird.getFlownDistance());
//        assertEquals(1, bird.getEnergy());
//        assertTrue(flown4);
//
//        // when
//        boolean flown5 = bird.fly();
//        boolean flown6 = bird.fly();
//
//        // then
//        assertEquals(3, bird.getFlownDistance());
//        assertEquals(0, bird.getEnergy());
//        assertTrue(flown5);
//        assertFalse(flown6);
//    }

}
