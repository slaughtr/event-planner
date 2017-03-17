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
    } else if (mTypeFood.equals("fancy snacks")) {
      foodCost = 100;
    } else if (mTypeFood.equals("simple meal")) {
      foodCost = 200;
    } else if (mTypeFood.equals("full meal")) {
      foodCost = 400;
    }
    return mBaseCost+(mNumPeople*5)+foodCost;
  }

}
