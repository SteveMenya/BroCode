package arrays;

import java.util.ArrayList;

public class TuDArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		//System.out.println(bakeryList.get(1));
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("Zucchinni");
		produceList.add("Peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("Water");
		drinksList.add("Pop");
		drinksList.add("Juice");

		//System.out.println(drinksList);
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		
	//	System.out.print(groceryList + "\n");

		System.out.println(groceryList.get(2).get(0));
	
	}

}
