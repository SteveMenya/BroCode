package oop_intro;

public class Car {
	
	String make = "Honda";
	String model = "Accord";
	int year = 2019;
	String color = "purple";
	double price = 27000.0;
	
	public String toString() 
	{
		String myString = make + "\n" + model + "\n" + year + "\n" + color + "\n" + price;
		return myString;
	}
	void drive()
	{
		System.out.println("You are driving now");
	}
	void brake()
	{
		System.out.println("You are breaking");
	}
}
