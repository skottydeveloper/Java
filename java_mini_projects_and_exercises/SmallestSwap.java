/* 
-  This exercise will require the searching and manipulation of an array using loops.
-  The program will read in a positive integer n from input. 

-  You should then add code to:
   -  Create an array of that size.
   -  Read in that many numbers from the user (they will all be unique).
   -  Find the smallest number.
   -  Swap the smallest number with whatever is in the first cell of the array.
   -  Print out the numbers in the array in order each on a new line. */

import java.util.Scanner;

public class SmallestSwap {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int minPos = -1;
		
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if (a[i] <= min) {
				min = a[i];
				minPos = i;
			}
		}
		
		if (minPos != -1) {
			int temp = a[0];
			a[0] = a[minPos];
			a[minPos] = temp;
		}
		
		for (int k : a) {
			System.out.println(k);
		}
	}
}