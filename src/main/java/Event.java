import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event{
  private int mBaseCost;
  private int mNumPeople;
  private String mTypeFood;
  private String mTypeDrink;
  private String mTypeEntertainment;

  public Event(int people) {
    mBaseCost = 100;
    mNumPeople = people;
  }

  public int getCost() {
    int pricePerPerson = 5;
    return mBaseCost+(mNumPeople*5);
  }

}
