import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newParty_hasBaseCost() {
    Event testEvent = new Event();
    int baseCost = 100;
    assertEquals(baseCost, testEvent.getCost());
  }

}
