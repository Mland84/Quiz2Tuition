package Tuition;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the initial tuition Rate?");
		double initialtuition = scan.nextDouble();
		System.out.println("What is your interest rate?");
		double interest =scan.nextDouble();
		
		double tuition = (initialtuition);
		double sum = 0.0;
		int year = 0;
		for (int i = 1; i <= 4; i++)
		{
			tuition = ((tuition * Math.pow(1+interest/100.0, year)));
			sum+=tuition;
			year+=1;
			
		}
		System.out.printf ("The total price of tuition for a four year degree is %.2f", sum);
		}
	}


