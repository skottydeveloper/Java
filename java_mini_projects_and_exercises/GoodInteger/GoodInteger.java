/* 
We define an integer x as a “good integer" if x is divisible by 7 but not divisible by 5. 
For example, 14 and 21 are good integers, but 5 and 35 are not.
Given an integer n, please find the minimum “good integer” m such that m >= n.

Input:
-  Each test case has only one line containing an integer n (1 <= n <= 1000).

Output:
-  For each test case output one line containing one integer, indicating the value of m. */ 

package GoodInteger;

public class GoodInteger {
	public static void main(String[] args) {
		int number = In.nextInt();

		if (number >= 0 && number <= 7) {
			number = 7;
			System.out.println(number);
		}

		else if (number > 7 && number <= 14) {
			number = 14;
			System.out.println(number);
		}

		else if (number > 14 && number <= 21) {
			number = 21;
			System.out.println(number);
		}

		else if (number > 21 && number <= 28) {
			number = 28;
			System.out.println(number);
		}

		else if (number > 21 && number <= 42) {
			number = 42;
			System.out.println(number);
		}

		else if (number > 42 && number <= 56) {
			number = 56;
			System.out.println(number);
		}

		else if (number > 56 && number <= 63) {
			number = 63;
			System.out.println(number);
		}

		else if (number > 63 && number <= 77) {
			number = 77;
			System.out.println(number);
		}

		else if (number > 77 && number <= 84) {
			number = 84;
			System.out.println(number);
		}

		else if (number > 84 && number <= 91) {
			number = 91;
			System.out.println(number);
		}
	}
}