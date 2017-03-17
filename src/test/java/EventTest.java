import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newParty_hasBaseCost() {
    Event testEvent = new Event(0, "", "", "", "");
    assertEquals(100.0, testEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasMoreCostWithMorePeople() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", "", "");
    assertEquals(150.0, testEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasMoreCostWithFood() {
    String typeFood = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, typeFood, "", "", "");
    assertEquals(200.0, testEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentFood() {
    String snacks = "snacks";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, snacks, "", "", "");
    assertEquals(200.0, testEvent.getCost(), 0.01);
    String fancySnacks = "fancy snacks";
    Event secondTestEvent = new Event(tenPeople, fancySnacks, "", "", "");
    assertEquals(250.0, secondTestEvent.getCost(), 0.01);
    String simpleMeal = "simple meal";
    Event thirdTestEvent = new Event(tenPeople, simpleMeal, "", "", "");
    assertEquals(350.0, thirdTestEvent.getCost(), 0.01);
    String fullMeal = "full meal";
    Event fourthTestEvent = new Event(tenPeople, fullMeal, "", "", "");
    assertEquals(550.0, fourthTestEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasSameCostWithWater() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "water", "", "");
    assertEquals(150.0, testEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentDrinks() {
    String water = "water";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", water, "", "");
    assertEquals(150.0, testEvent.getCost(), 0.01);
    String coffeeAndTea = "coffee and tea";
    Event secondTestEvent = new Event(tenPeople, "", coffeeAndTea, "", "");
    assertEquals(175.0, secondTestEvent.getCost(), 0.01);
    String smoothies = "smoothies";
    Event thirdTestEvent = new Event(tenPeople, "", smoothies, "", "");
    assertEquals(250.0, thirdTestEvent.getCost(), 0.01);
    String alcohol = "alcohol";
    Event fourthTestEvent = new Event(tenPeople, "", alcohol, "", "");
    assertEquals(400.0, fourthTestEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasIncreasedCostWithEntertainment() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", "clown", "");
    assertEquals(250.0, testEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentEntertainment() {
    String clown = "clown";
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople, "", "", clown, "");
    assertEquals(250.0, testEvent.getCost(), 0.01);
    String performanceArt = "performance art";
    Event secondTestEvent = new Event(tenPeople, "", "", performanceArt, "");
    assertEquals(400.0, secondTestEvent.getCost(), 0.01);
    String dj = "dj";
    Event thirdTestEvent = new Event(tenPeople, "", "", dj, "");
    assertEquals(450.0, thirdTestEvent.getCost(), 0.01);
    String diplo = "diplo";
    Event fourthTestEvent = new Event(tenPeople, "", "", diplo, "");
    assertEquals(100150.0, fourthTestEvent.getCost(), 0.01);
  }

  @Test
  public void newParty_hasDifferentCostWithDifferentCombinationsOfFoodDrinkAndEntertainment() {
    //10 people, water, no food, no entertainment
    Event testEvent = new Event(10, "", "water", "", "");
    assertEquals(150.0, testEvent.getCost(), 0.01);
    //100 people, coffee, snacks, clown
    Event secondTestEvent = new Event(100, "snacks", "coffee and tea", "clown", "");
    assertEquals(775.0, secondTestEvent.getCost(), 0.01);
    //111 people, alcohol, snacks, dj
    Event thirdTestEvent = new Event(111, "snacks", "alcohol", "dj", "");
    assertEquals(1255.0, thirdTestEvent.getCost(), 0.01);
    //it's a festival! 100000 people, full meals, alcohol, diplo. They seem to be underpaying....
    Event fourthTestEvent = new Event(100000, "full meal", "alcohol", "diplo", "");
    assertEquals(600750.0, fourthTestEvent.getCost(), 0.01);
  }

}
