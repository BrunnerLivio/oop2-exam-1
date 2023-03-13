package augabe2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aufgabe1.bird.Woodpecker;
import aufgabe1.food.Nut;
import aufgabe2.Birdhouse;

public class Birdhouse2Test {

  @Test
  void testBirdHouse2AddFood() {
    // given
    Birdhouse<Woodpecker, Nut> birdhouse = new Birdhouse<>();
    Nut nut = new Nut();

    // when
    birdhouse.addFood(nut, 1);

    // then
    assertEquals(birdhouse.getFoodToAmountMap().get(nut), 1);
  }
}
