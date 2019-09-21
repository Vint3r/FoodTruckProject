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
	
	public double getAverage(FoodTruck[] foodTruck) {
		FoodTruck trucks = new FoodTruck();
		for (int i = 0; i < foodTruck.length; i++) {
			trucks = foodTruck[i];
		}
	}

}

