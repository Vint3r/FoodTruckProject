package com.skilldistillery.foodtruckproject;

public class FoodTruck {
	private String truckName;
	private String foodMade;
	private double truckRating;
	private int truckId = 0;
	private static int nextTruckId = 1;

	public FoodTruck(String truckName, String foodMade, double truckRating) {
		this.truckName = truckName;
		this.foodMade = foodMade;
		this.truckRating = truckRating;
		this.truckId = nextTruckId;
		nextTruckId++;
		
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
	
	public String getFood() {
		return this.foodMade;
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
		System.out.println("The average rating of all trucks is " + (theRating / counter));
	}
	
	public void getHighLow(FoodTruck[] foodTruck) {
		double highRating = 0;
		double lowRating = 10;
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
	
	public void getHighTruckInfo(FoodTruck[] foodTruck) {
		double highRating = 0;
		int counter = 0;
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				break;
			} 
			else if (foodTruck[i].getRating() > highRating) {
				highRating = foodTruck[i].getRating();
				counter = i;
			} else { 
				continue;
			}
			System.out.println(foodTruck[counter].toString());
		}
	}
	
	public void getTruckByFood(FoodTruck[] foodTruck, String userFood) {
		FoodTruck[] userWants;
		int counter = 0;
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				break;
			}
			else if (userFood.equalsIgnoreCase(foodTruck[i].getFood())) {
				counter++;
			}
		}
		userWants = new FoodTruck[counter]; 
		
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				break;
			}
			else if (userFood.equalsIgnoreCase(foodTruck[i].getFood())) {
				userWants[i] = foodTruck[i];
			}
		}
		System.out.println("The info of the trucks that sell " + userFood + " are as follows:");
		
		for (int i = 0; i < userWants.length; i++) {
			System.out.println(userWants[i].toString());
		}
	}

}

