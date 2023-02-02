/*	Builder pattern builds a complex object using simple 
 * 	objects and using a step by step approach. This type of design pattern comes under
 *	creational pattern as this pattern provides one of the best ways to create an object.
 *	
 *	A Builder class builds the final object step by step. This builder is
 *	independent of other objects 
 */
public class Main {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		System.out.println();

		Meal meatMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Meat Meal");
		meatMeal.showItems();
		System.out.println("Total Cost: " + meatMeal.getCost());

	}

}
