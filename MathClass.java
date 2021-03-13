package Intro;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;		
//		double z = Math.max(x, y);
//		System.out.println(z);
//		
		double x;
		double y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = sc.nextDouble();
		System.out.println("Enter side y: ");
		y = sc.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		sc.close();
		
		

	}

}
