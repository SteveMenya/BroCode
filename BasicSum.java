package Intro;

import java.util.Scanner;

public class BasicSum {

		
	public static void main(String[] args) {
		
		//int x;
		//int y;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the value of x: ");
		int x = sc.nextInt();
		
		System.out.println("Insert the value of y: ");
		int y = sc.nextInt();
		
		int sum  = x+y;
		
		System.out.println("The sum of " + x + " and " + y + " = " + sum);

	}

}
