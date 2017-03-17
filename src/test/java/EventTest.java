import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newParty_hasBaseCost() {
    Event testEvent = new Event(0);
    int baseCost = 100;
    assertEquals(baseCost, testEvent.getCost());
  }

  @Test
  public void newParty_hasMoreCostWithMorePeople() {
    int tenPeople = 10;
    Event testEvent = new Event(tenPeople);
    int costWithTenPeople = 150;
    assertEquals(costWithTenPeople, testEvent.getCost());
  }
}
