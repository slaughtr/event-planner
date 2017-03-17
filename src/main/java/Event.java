public class Event{
  private int mBaseCost;
  private int mNumPeople;
  private String mTypeFood;
  private String mTypeDrink;
  private String mTypeEntertainment;
  private String mCouponCode;

  public Event(int people, String food, String drink, String entertainment, String coupon) {
    mBaseCost = 100;
    mNumPeople = people;
    mTypeFood = food;
    mTypeDrink = drink;
    mTypeEntertainment = entertainment;
    mCouponCode = coupon;
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

  public Double getCouponCode() {
    Double couponDiscount = 0.0;

    if (mCouponCode.equals("get10off")) {
      couponDiscount = 10.0;
    } else if (mCouponCode.equals("privatedinnerfuntime")) {
      //if less than 50 people and they get full meal + alcohol
      couponDiscount = 100.0;
    } else if (mCouponCode.equals("justadanceparty")) {
      //if more than 50 people and no food + alcohol + dj/diplo
      couponDiscount = 200.0;
    } else if (mCouponCode.equals("onepercenter")) {
      //if getting best in every category, offer 1% discount for the richies
      couponDiscount = (mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost())*0.1;
    }
    return couponDiscount;
  }

  public Double getCost() {
    int pricePerPerson = 5;
    return (mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost())-getCouponCode();
  }

}
