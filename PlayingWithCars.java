package arrays;

public class PlayingWithCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		cars[0] = "Mustang";
		System.out.println(cars);
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
