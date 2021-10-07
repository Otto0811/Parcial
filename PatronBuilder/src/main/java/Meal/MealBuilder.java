package Meal;

import Burger.ChickenBurguer;
import Burger.VegBurger;
import Drink.Coke;
import Drink.Pepsi;

public class MealBuilder {

	   public Meal prepareVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new VegBurger());
		      meal.addItem(new Coke());
		      return meal;
		   }   

		   public Meal prepareNonVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new ChickenBurguer());
		      meal.addItem(new Pepsi());
		      return meal;
		   }
}
