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
    String typeFood = "";
    int tenPeople = 10;
    typeFood = "snacks";
    Event testEvent = new Event(tenPeople, typeFood);
    assertEquals(200, testEvent.getCost());
    typeFood = "fancy snacks";
    assertEquals(250, testEvent.getCost());
    typeFood = "simple meal";
    assertEquals(350, testEvent.getCost());
    typeFood = "full meal";
    assertEquals(550, testEvent.getCost());
  }
}
