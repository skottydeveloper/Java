/* 
Specification: 
-  Read in integers until the user enters -1. 
-  If there were at least 3 values, show the average excluding the biggest and smallest number. 
-  If there are less than 3 values, print nothing. */

package MiddleAverageExercise;

public class MiddleAverage {
	public static void main(String[] args) {
		System.out.print("Value: ");
		
		int number = In.nextInt();
		int count = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (number != -1) {
			if (number < min) min = number;
			if (number > max) max = number;
			sum += number;
			count++;
			System.out.print("Value: ");
			number = In.nextInt();
		}

		if (count >= 3) {
			System.out.println("Middle average = " + (double)(sum-min-max)/(count-2));
		}
	}
}