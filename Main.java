package oop_intro;

public class Main {

	public static void main(String[] args) {
		
	
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty" ,16, 50);
		
		//human1.eat();
		//human2.drink();
		
		//System.out.println(human1.name);
		//ystem.out.println(human2.name);
		
		
		Car car = new Car();
//		System.out.println(car.make);
//		System.out.println(car.model);
//		System.out.println(car.year);
//		System.out.println(car.color);
//		System.out.println(car.price);
		
		System.out.println(car.toString());
	}

}
