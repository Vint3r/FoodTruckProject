package com.skilldistillery.foodtruckproject;

import java.util.Scanner;

public class FoodTruck {
	private String truckName;
	private String foodMade;
	private static int truckId = 0;
	private double truckRating;

	public FoodTruck(String truckName, String foodMade, double truckRating) {
		this.truckName = truckName;
		this.foodMade = foodMade;
		this.truckRating = truckRating;
		this.truckId = truckId;
		truckId++;
	}
	
	public FoodTruck() {
		
	}
	
	public void getAllTruckInfo(FoodTruck[] foodTruck) {
		FoodTruck[] ftReturn = new FoodTruck[foodTruck.length];
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				continue;
			} else {
				ftReturn[i] = foodTruck[i];
			}
			System.out.println(ftReturn[i].toString());
		}
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck name: ");
		builder.append(truckName);
		builder.append(", food truck makes: ");
		builder.append(foodMade);
		builder.append(", trucks rating: ");
		builder.append(truckRating);
		builder.append(", trucks id number: ");
		builder.append(truckId);
		return builder.toString();
	}
	
	public double getRating() {
		return this.truckRating;
	}
	
	public String getName() {
		return this.truckName;
	}
	
	public void getAverage(FoodTruck[] foodTruck) {
		double theRating = 0;
		int counter = 0;
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] != null) {
				theRating = theRating + foodTruck[i].getRating();
				counter++;
			} else {
				break;
			}
		}
		System.out.println(theRating / counter);
	}
	
	public void getHighLow(FoodTruck[] foodTruck) {
		double highRating = foodTruck[0].getRating();
		double lowRating = foodTruck[0].getRating();
		String highName = "";
		String lowName = "";
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				break;
		} else if(foodTruck[i].getRating() > highRating) {
				highRating = foodTruck[i].getRating();
				highName = foodTruck[i].getName();
			} 
			else if (foodTruck[i].getRating() < lowRating) {
				lowRating = foodTruck[i].getRating();
				lowName = foodTruck[i].getName();
			}
		}
		System.out.println("The highest rated truck is: " + highName + ", with a rating of: " + highRating);
		System.out.println("The lowest rated truck is: " + lowName + ", with a rating of: " + lowRating);
	}

}

