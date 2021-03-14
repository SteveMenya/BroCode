package Intro;

import java.util.Random;
import java.util.Scanner;

public class BasicGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the addition Game. All you have to do is add");
		Random random = new Random();
		int x = random.nextInt(1) +5;
		int y = random.nextInt(5) +10;
		int sum = x+y;
		
	
		System.out.println("What is the sum of " + x + " and " + y +" ?:");
		Scanner sc = new Scanner(System.in);
		int responce = sc.nextInt();
		
		if(sum == responce) {
			System.out.println("You got it!");
		}
		else {
			System.out.println("Better Luck next time");
		}
	}

}
