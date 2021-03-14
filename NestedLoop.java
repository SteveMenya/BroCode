package Intro;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		
		//Enter number of rows
		System.out.println("Enter number of rows: ");
		rows = sc.nextInt();
		
		//Enter number of colums
		System.out.println("Enter number of colums: ");
		columns =sc.nextInt();
		
		//Symbol to use
		System.out.println("Enter symbol to use: ");
		symbol = sc.next();
		sc.close();
		//nested loop
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
				
			}
 		}

		
		
		
	}

}
