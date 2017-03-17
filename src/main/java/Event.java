import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event{
  private int mBaseCost;
  private int mNumPeople;
  private String mTypeFood;
  private String mTypeDrink;
  private String mTypeEntertainment;

  public Event(int people, String food) {
    mBaseCost = 100;
    mNumPeople = people;
    mTypeFood = food;
  }

  public int getCost() {
    int pricePerPerson = 5;
    int foodCost = 0;

    if (mTypeFood.equals("snacks")) {
      foodCost = 50;
    }
    return mBaseCost+(mNumPeople*5)+foodCost;
  }

}
