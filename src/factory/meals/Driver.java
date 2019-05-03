package factory.meals;

import factory.meals.german.GermanMealFactory;
import factory.meals.american.AmericanMealFactory;

public class Driver {

    public static void main(String[] args) {
        //GermanMealFactory mealFactory = new GermanMealFactory();
        AmericanMealFactory mealFactory = new AmericanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
