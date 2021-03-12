import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//name 
		Scanner scanner = new Scanner(System.in);
		
		//name
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		
		//age
		System.out.println("How old are you? " + name);
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
	

		
		System.out.println("Hello " + name );
		System.out.println("You are " + age + "years old");
		System.out.println(food + "Is you favourite food");
	}

}
