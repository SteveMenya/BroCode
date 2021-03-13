package Intro;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input what day it is ");
		String day = sc.nextLine();
		
			//String day  = "Friday";
			
			switch(day) {
			case  "Sunday": System.out.println("It is sunday");
			break;
			
			case "Monday": System.out.println("It is monday");
			break;
			
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			
			case "Wednesday": System.out.println("It is Wednesday");
			break;
			
			case "Thursday" : System.out.println("It is Thursday");
			break;
			
			case "Friday": System.out.println("It  is Friday");
			break;
			
			case "Saturday":  System.out.println("It is saturday");
			break;
			
			default: System.out.println("That is not a valid day");
			}

	}

}
