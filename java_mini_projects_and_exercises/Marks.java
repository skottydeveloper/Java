/* 
-  For this task you will manipulate multiple arrays, of different types using loops.
-  The program will build a small database of student names and marks, then print the average mark, the student with the highest mark, and the student with the lowest mark.

-  In order:
   -  The program will ask the user "How many students are there? ", then read in a positive integer n (you don't have to deal with bad input).
   -  The program will then read in nn student names with prompts "Enter name of student i: " and "Enter mark i: ", where i is replaced by a number from 1 to n, in order.
   -  The program will then print "The average mark is: " and print the average mark.
   -  The program will then print "The best student is " and print the student's name.
   -  The program will then print "The worst student is " and print the student's name.
   -  The best and worst student are determined by the highest and lowest mark respectively. The best and worst mark will be unique. */

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		// Reads user input, via scanner. 
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students are there? ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] marks = new int[n];
		String[] names = new String[n];

		// This code prompts the user to input the name and mark of each student for a chosen (n) number of times.
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of student " + (i + 1) + ": ");
			names[i] = sc.nextLine();

			System.out.print("Enter mark " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
			sc.nextLine();
		}

		// This code prints the average, highest and lowest mark of the class.
		float total_grade = 0; 

		for (int num: marks) {
			total_grade = total_grade + num;
		}

		float average_grade = total_grade / n;
		int highest_grade_index = 0;
		int lowest_grade_index = 0;
	
		for (int i = 0; i < n; i++) {
			if (marks[highest_grade_index] < marks[i]) {
				highest_grade_index = i;
			}
		}

		for (int i = 0; i < n; i++) {
			if (marks[lowest_grade_index] > marks[i]) {
				lowest_grade_index = i;
			}
		}

		String best_student = names[highest_grade_index];
		String worst_student = names[lowest_grade_index];

		System.out.println("The average mark is: " + average_grade);
   		System.out.println("The best student is " + best_student);
   		System.out.println("The worst student is " + worst_student);
	}
}