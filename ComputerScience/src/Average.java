/*
 * Create a Sum application that Asks for the Asked Number of Values and Finds The Average
 */

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter how many to average: ");
	int numOfValues = input.nextInt();
	double sum = 0;
	
	double[] numbers = new double[numOfValues];
	
	for (int x = 0; x <=(numOfValues-1); x++ ) {
		System.out.println("\tEnter Value: ");
		double value = input.nextDouble();
		sum += value;
		numbers[x] = value;
	
	}
	double average = sum/numOfValues;
	System.out.println("\nAverage = " + average);
	
	
	
	
	}

}
