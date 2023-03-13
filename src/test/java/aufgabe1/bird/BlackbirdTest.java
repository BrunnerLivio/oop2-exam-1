package aufgabe1.bird;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import aufgabe1.food.Food;
import aufgabe1.food.Nut;
import aufgabe1.food.Seed;
import aufgabe1.food.Worm;

class BlackbirdTest {

  @Test
  void testEatsPreferredFood() {
    // given
    Blackbird blackbird = new Blackbird();

    // when
    boolean eatenSeed = blackbird.eat(new Seed());
    boolean eatenWorm = blackbird.eat(new Worm());

    // then
    assertTrue(eatenSeed);
    assertTrue(eatenWorm);
  }

  @Test
  void testDoesntEatNotPreferredFood() {
     // given
     Blackbird blackbird = new Blackbird();

     // when
     boolean eatenNut = blackbird.eat(new Nut());
 
     // then
     assertFalse(eatenNut);
  }
}
