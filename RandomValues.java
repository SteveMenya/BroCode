package Intro;

import java.util.Random;




public class RandomValues {

	public static void main(String[] args) {
		Random random = new Random();
		
		int x = random.nextInt(6)+90;
		double y = random.nextDouble();
		
		int s = (int) Math.random()  +1 - 9 ;
		
		System.out.println(s);
		System.out.println(x);
		System.out.println(y);

	}

}

