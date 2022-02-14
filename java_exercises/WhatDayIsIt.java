/*
-  Your task is to write a program that reads in a number from the user as an int, then prints out the day that matches that number. 
-  If the number is 1, print "Monday", if 2, print "Tuesday", ..., if 7, print "Sunday". If any other number is entered, print "That's not a day!". */

import java.util.Scanner;

public class WhatDayIsIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default: 
				System.out.println("That's not a day!");
				break;
		}	
	}
}