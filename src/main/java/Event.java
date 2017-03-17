import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event{
  private int mBaseCost;
  private int mNumPeople;
  private String mTypeFood;
  private String mTypeDrink;
  private String mTypeEntertainment;

  public Event(int people, String food, String drink, String entertainment) {
    mBaseCost = 100;
    mNumPeople = people;
    mTypeFood = food;
    mTypeDrink = drink;
    mTypeEntertainment = entertainment;
  }

  public int getFoodCost() {
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
    return foodCost;
  }

  public int getDrinkCost() {
    int drinkCost = 0;

    if (mTypeDrink.equals("water")) {
      drinkCost = 0;
    } else if (mTypeDrink.equals("coffee and tea")) {
      drinkCost = 25;
    } else if (mTypeDrink.equals("smoothies")) {
      drinkCost = 100;
    } else if (mTypeDrink.equals("alcohol")) {
      drinkCost = 250;
    }
    return drinkCost;
  }

  public int getEntertainmentCost() {
    int entertainmentCost = 0;

    if (mTypeEntertainment.equals("clown")) {
      entertainmentCost = 100;
    } else if (mTypeEntertainment.equals("performance art")) {
      entertainmentCost = 250;
    } else if (mTypeEntertainment.equals("dj")) {
      entertainmentCost = 300;
    } else if (mTypeEntertainment.equals("diplo")) {
      entertainmentCost = 100000;
    }
    return entertainmentCost;
  }

  public int getCost() {
    int pricePerPerson = 5;
    return mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost();
  }

}
