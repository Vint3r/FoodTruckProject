package com.skilldistillery.foodtruckproject;

import java.util.Scanner;
// just for a push
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
		input.nextLine();

		ftArr = new FoodTruck[truckAmount];

		while (counter < truckAmount) {
			System.out.println("Please enter a truck name or type quit.");
			foodTruckName = input.nextLine();

			if (foodTruckName.equalsIgnoreCase("quit")) {
				System.out.println("Quiting the rating system, please wait...");
				counter = truckAmount;
				break;
			} else {
				System.out.println("Please enter the type of food the truck makes. (tacos, sandwiches etc.)");
				typeOfFood = input.nextLine();

				System.out.println("Please enter the rating you wish to give the truck (1-10)");
				truckRating = input.nextDouble();
				input.nextLine();
				if (truckRating > 10) {
					System.out.println("That is not a valid input please only pick a number between 1 and 10");
					truckRating = input.nextDouble();
					input.nextLine();
				} 
				else if (truckRating < 1) {
					System.out.println("That is not a valid input please only pick a number between 1 and 10");
					truckRating = input.nextDouble();
					input.nextLine();
				}

				foodTruck = new FoodTruck(foodTruckName, typeOfFood, truckRating);
				ftArr[counter] = foodTruck;
				counter++;
			}
		}
		foodTruck = new FoodTruck();
		boolean choice = true;
		
		do {
			System.out.println();
			System.out.println("+========================================+");
			System.out.println("|1.) ****Display all trucks on screen****|");
			System.out.println("|2.) **Get average rating of all trucks**|");
			System.out.println("|3.) *Get highest rated and lowest rated*|");
			System.out.println("|4.) ******Highest rated truck info******|");
			System.out.println("|5.) *Find a truck for the food you want*|");
			System.out.println("|6.) ****************Quit****************|");
			System.out.println("+========================================+");
			System.out.println();
			String userIn = input.nextLine();
			
			switch (userIn.toLowerCase()) {
			case "1":
			case "one":
			case "display all trucks on screen":
			case "display all":
			case "display all trucks":
				foodTruck.getAllTruckInfo(ftArr);
				break;
			case "2":
			case "two":
			case "get average rating of all trucks":
			case "get average":
				foodTruck.getAverage(ftArr);
				break;
			case "3":
			case "three":
			case "get highest rated and lowest rated":
				foodTruck.getHighLow(ftArr);
				break;
			case "4":
			case "four":
			case "highest rated truck info":
			case "highest rated":
				foodTruck.getHighTruckInfo(ftArr);
				break;
			case "6":
			case "six":
			case "quit":
			case "exit":
				choice = false;
				System.out.println("Thank you for using the Food Tuck App!!");
				System.out.println("We hope to see you again soon!");
				break;
			case "5":
			case "five":
			case "sort by food":
			case "food":
			case "find a truck for the food you want":
			case "food by truck":
				System.out.println("What food are you looking for?");
				String userFood = input.nextLine();
				foodTruck.getTruckByFood(ftArr, userFood);
				break;
			default:
				System.out.println("That is not a valid input... Please try again");
				break;
			}
		} while (choice);
		
		input.close();
	}

}
