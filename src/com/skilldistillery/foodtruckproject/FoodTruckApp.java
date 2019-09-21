package com.skilldistillery.foodtruckproject;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodTruck[] ftArr;
		String foodTruckName, typeOfFood;
		double truckRating; 
		int counter = 0;
		FoodTruck foodTruck;

		System.out.println("Welcome to the food truck app!");
		System.out.println("How many trucks would you like to rate today?");
		int truckAmount = input.nextInt();

		ftArr = new FoodTruck[truckAmount];

		while (counter < truckAmount) {
			System.out.println("Please enter a truck name or type quit.");
			foodTruckName = input.next();

			if (foodTruckName.equalsIgnoreCase("quit")) {
				System.out.println("Quiting the rating system, please wait...");
				counter = truckAmount;
				break;
			} else {
				System.out.println("Please enter the type of food the truck makes. (tacos, sandwiches etc.)");
				typeOfFood = input.next();

				System.out.println("Please enter the rating you wish to give the truck (1-10)");
				truckRating = input.nextDouble();

				foodTruck = new FoodTruck(foodTruckName, typeOfFood, truckRating);
				ftArr[counter] = foodTruck;
				counter++;
			}
		}
		foodTruck = new FoodTruck();
		boolean choice = true;
		
		do {
			System.out.println("+=======================================+");
			System.out.println("|1.) Display all trucks on screen*******|");
			System.out.println("|2.) Get average rating of all trucks***|");
			System.out.println("|3.) Get highest rated and lowest rated*|");
			System.out.println("|4.) ***************Quit****************|");
			System.out.println("+=======================================+");
			System.out.println();
			int userIn = input.nextInt();
			
			switch (userIn) {
			case 1:
				foodTruck.getAllTruckInfo(ftArr);
				break;
			case 2:
				foodTruck.getAverage(ftArr);
				break;
			case 3:
				foodTruck.getHighLow(ftArr);
				continue;
			case 4:
				choice = false;
				System.out.println("Thank you for using the Food Tuck App!!");
				System.out.println("We hope to see you again soon!");
				break;
			default:
				System.out.println("That is not a valid input... Please try again");
				break;
			}
		} while (choice);
	}

}
