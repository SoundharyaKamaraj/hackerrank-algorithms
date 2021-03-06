/**
 * 
 */
package com.learn.algorithms.hackerrank;

import java.util.Scanner;

/**
 * @author Soundharya
 *
 */
public class OperatorsSolution {

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tipValue = 0;
		double taxValue = 0;
		if (tip_percent != 0 && tax_percent != 0) {
			tipValue = ((double) (tip_percent) / 100);
			taxValue = ((double) (tax_percent) / 100);
		}
		double value = Math.round(meal_cost + (meal_cost * tipValue) + (meal_cost * taxValue));
		int totalCost = (int) (value);
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();
	}
}
