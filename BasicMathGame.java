package Intro;

import java.util.Random;
import java.util.Scanner;

public class BasicMathGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the addition and subtraction Game. All you have to do is add");
		
		System.out.println("Would you like to add or subtract?");
		Scanner sc = new Scanner(System.in);
		String responce = sc.next();
		
		switch (responce) {
		case "Add": 
		
		Random random = new Random();
		int x = random.nextInt(1) +5;
		int y = random.nextInt(5) +10;
		int sum = x+y;
		

		System.out.println("What is the sum of " + x + " and " + y +" ?:");
		//Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		if(sum == answer) {
			System.out.println("You got it!");
		}
		else {
			System.out.println("Better Luck next time");
		}
		case "Subtract":	
			Random random1 = new Random();
			int x1 = random1.nextInt(50) +5;
			int y1 = random1.nextInt(5) +10;
			int sum1 = x1-y1;
			

			System.out.println("What is " + x1 + " - " + y1 +" ?:");
			//Scanner sc = new Scanner(System.in);
			int answer1 = sc.nextInt();
			
			if(sum1 == answer1) {
				System.out.println("You got it!");
			}
			else {
				System.out.println("Better Luck next time");
			}
		}
	}

}
