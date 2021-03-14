package Intro;

import java.util.Scanner;

public class BasicSum {

		
	public static void main(String[] args) {
		
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the value of x: ");
		
		int x = sc.nextInt();
		
		System.out.println("Insert the value of y: ");
		int y = sc.nextInt();
		sc.close();
		int sum  = x+y;
		
		System.out.println("The sum of " + x + " and " + y + " = " + sum);

	}

}
