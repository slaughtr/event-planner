import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newParty_hasBaseCost() {
    Event testEvent = new Event(0, "", "", "");
    assertEquals(100, testEvent.getCost());
  }

  @Test
  public void newParty_hasMoreCostWithMorePeople() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", "");
    assertEquals(150, testEvent.getCost());
  }

  @Test
  public void newParty_hasMoreCostWithFood() {
    String typeFood = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, typeFood, "", "");
    assertEquals(200, testEvent.getCost());
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentFood() {
    String snacks = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, snacks, "", "");
    assertEquals(200, testEvent.getCost());
    String fancySnacks = "fancy snacks";
    Event secondTestEvent = new Event(tenPeople, fancySnacks, "", "");
    assertEquals(250, secondTestEvent.getCost());
    String simpleMeal = "simple meal";
    Event thirdTestEvent = new Event(tenPeople, simpleMeal, "", "");
    assertEquals(350, thirdTestEvent.getCost());
    String fullMeal = "full meal";
    Event fourthTestEvent = new Event(tenPeople, fullMeal, "", "");
    assertEquals(550, fourthTestEvent.getCost());
  }

  @Test
  public void newParty_hasSameCostWithWater() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "water", "");
    assertEquals(150, testEvent.getCost());
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentDrinks() {
    String water = "water";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", water, "");
    assertEquals(150, testEvent.getCost());
    String coffeeAndTea = "coffee and tea";
    Event secondTestEvent = new Event(tenPeople, "", coffeeAndTea, "");
    assertEquals(175, secondTestEvent.getCost());
    String smoothies = "smoothies";
    Event thirdTestEvent = new Event(tenPeople, "", smoothies, "");
    assertEquals(250, thirdTestEvent.getCost());
    String alcohol = "alcohol";
    Event fourthTestEvent = new Event(tenPeople, "", alcohol, "");
    assertEquals(400, fourthTestEvent.getCost());
  }

  @Test
  public void newParty_hasIncreasedCostWithEntertainment() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", "clown");
    assertEquals(250, testEvent.getCost());
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentEntertainment() {
    String clown = "clown";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", clown);
    assertEquals(250, testEvent.getCost());
    String performanceArt = "performance art";
    Event secondTestEvent = new Event(tenPeople, "", "", performanceArt);
    assertEquals(400, secondTestEvent.getCost());
    String dj = "dj";
    Event thirdTestEvent = new Event(tenPeople, "", "", dj);
    assertEquals(450, thirdTestEvent.getCost());
    String diplo = "diplo";
    Event fourthTestEvent = new Event(tenPeople, "", "", diplo);
    assertEquals(100150, fourthTestEvent.getCost());
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentCombinationsOfFoodDrinkAndEntertainment() {
    String water = "water";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", water, "");
    assertEquals(150, testEvent.getCost());
    String coffeeAndTea = "coffee and tea";
    Event secondTestEvent = new Event(tenPeople, "", coffeeAndTea, "");
    assertEquals(175, secondTestEvent.getCost());
    String smoothies = "smoothies";
    Event thirdTestEvent = new Event(tenPeople, "", smoothies, "");
    assertEquals(250, thirdTestEvent.getCost());
    String alcohol = "alcohol";
    Event fourthTestEvent = new Event(tenPeople, "", alcohol, "");
    assertEquals(400, fourthTestEvent.getCost());
  }

}
