import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newParty_hasBaseCost() {
    Event testEvent = new Event(0, "");
    assertEquals(100, testEvent.getCost());
  }

  @Test
  public void newParty_hasMoreCostWithMorePeople() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "");
    assertEquals(150, testEvent.getCost());
  }

  @Test
  public void newParty_hasMoreCostWithFood() {
    String typeFood = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, typeFood);
    assertEquals(200, testEvent.getCost());
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentFood() {
    String snacks = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, snacks);
    assertEquals(200, testEvent.getCost());
    String fancySnacks = "fancy snacks";
    Event secondTestEvent = new Event(tenPeople, fancySnacks);
    assertEquals(250, secondTestEvent.getCost());
    String simpleMeal = "simple meal";
    Event thirdTestEvent = new Event(tenPeople, simpleMeal);
    assertEquals(350, thirdTestEvent.getCost());
    String fullMeal = "full meal";
    Event fourthTestEvent = new Event(tenPeople, fullMeal);
    assertEquals(550, fourthTestEvent.getCost());
  }
}
