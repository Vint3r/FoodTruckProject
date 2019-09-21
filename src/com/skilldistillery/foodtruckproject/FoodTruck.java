package com.skilldistillery.foodtruckproject;

public class FoodTruck {
	private String truckName;
	private String foodMade;
	private static int truckId = 1;
	private int truckRating;

	public FoodTruck(String truckName, String foodMade, int truckRating) {
		this.truckName = truckName;
		this.foodMade = foodMade;
		this.truckRating = truckRating;
		this.truckId = truckId;
		truckId++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [truckName=");
		builder.append(truckName);
		builder.append(", foodMade=");
		builder.append(foodMade);
		builder.append(", truckRating=");
		builder.append(truckRating);
		builder.append(", truck Id=");
		builder.append(truckId);
		builder.append("]");
		return builder.toString();
	}

	public String[] getAllTruckInfo(foodTruck[]) {
		FoodTruck[] ftReturn = new FoodTruck[];
		for (int i = 0; i < foodTruck.length; i++) {
			if (foodTruck[i] == null) {
				continue;
			} else {
				ftReturn[i] = foodTruck[i];
		}
		}
		return ftReturn[];
	}
}
