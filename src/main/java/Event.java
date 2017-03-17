public class Event{
  private Double mBaseCost;
  private Double mNumPeople;
  private String mTypeFood;
  private String mTypeDrink;
  private String mTypeEntertainment;
  private String mCouponCode;

  public Event(Double people, String food, String drink, String entertainment, String coupon) {
    mBaseCost = 100.0;
    mNumPeople = people;
    mTypeFood = food;
    mTypeDrink = drink;
    mTypeEntertainment = entertainment;
    mCouponCode = coupon;
  }

  public Double getFoodCost() {
    Double foodCost = 0.0;

    if (mTypeFood.equals("snacks")) {
      foodCost = 50.0;
    } else if (mTypeFood.equals("fancy snacks")) {
      foodCost = 100.0;
    } else if (mTypeFood.equals("simple meal")) {
      foodCost = 200.0;
    } else if (mTypeFood.equals("full meal")) {
      foodCost = 400.0;
    }
    return foodCost;
  }

  public Double getDrinkCost() {
    Double drinkCost = 0.0;

    if (mTypeDrink.equals("water")) {
      drinkCost = 0.0;
    } else if (mTypeDrink.equals("coffee and tea")) {
      drinkCost = 25.0;
    } else if (mTypeDrink.equals("smoothies")) {
      drinkCost = 100.0;
    } else if (mTypeDrink.equals("alcohol")) {
      drinkCost = 250.0;
    }
    return drinkCost;
  }

  public Double getEntertainmentCost() {
    Double entertainmentCost = 0.0;

    if (mTypeEntertainment.equals("clown")) {
      entertainmentCost = 100.0;
    } else if (mTypeEntertainment.equals("performance art")) {
      entertainmentCost = 250.0;
    } else if (mTypeEntertainment.equals("dj")) {
      entertainmentCost = 300.0;
    } else if (mTypeEntertainment.equals("diplo")) {
      entertainmentCost = 100000.0;
    }
    return entertainmentCost;
  }

  public Double getCouponCode() {
    //add logic here? or just let them know on front end?
    Double couponDiscount = 0.0;

    if (mCouponCode.equals("get10off")) {
      couponDiscount = 10.0;
    } else if (mCouponCode.equals("privatedinnerfuntime")) {
      //if less than 50 people and they get full meal + alcohol
      couponDiscount = 100.0;
    } else if (mCouponCode.equals("justadanceparty")) {
      //if more than 50 people and no food + alcohol + dj/diplo
      couponDiscount = (mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost())*0.1;
    } else if (mCouponCode.equals("onepercenter")) {
      //if getting best in both food and drink and over 500 people, offer 1% discount for the richies
      couponDiscount = (mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost())*0.01;
    }
    return couponDiscount;
  }

  public Double getCost() {
    Double pricePerPerson = 5.0;
    return (mBaseCost+(mNumPeople*5)+getFoodCost()+getDrinkCost()+getEntertainmentCost())-getCouponCode();
  }

}
