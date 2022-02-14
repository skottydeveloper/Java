/* 
-  Read in numbers between 0-999 until the user enters -1. 
-  Print out the number in words. 
-  When -1 is entered, print "Done". */

package NumberToWordsExercise;

public class NumberToWords {
	public static void main(String[] args) {
		String one_to_nineteen[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String above_nineteen[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		System.out.print("Number: ");
		int value = In.nextInt();

		while (value != -1) {
                if (value == 0) {
					System.out.println("zero");
				} else if (value > 99 && (value % 100) > 0 && (value % 100) <= 19) {
					System.out.println(one_to_nineteen[value / 100] + " hundred " + "and " + one_to_nineteen[value % 100]);
				} else if (value > 99 && (value % 100) >= 20) {
					System.out.println(one_to_nineteen[value / 100] + " hundred " + "and " + above_nineteen[(value % 100) / 10] + " " + one_to_nineteen[value % 10]);
				} else if (value > 99) {
					System.out.println(one_to_nineteen[value / 100] + " hundred");
				} else {
					if (value > 19 && value % 10 != 0) {
        				System.out.println(above_nineteen[(value % 100) / 10] + " " + one_to_nineteen[value % 10]);
					} else if (value > 19 && value % 10 == 0) {
						System.out.println(above_nineteen[(value % 100) / 10]);
    				} else {
        				System.out.println(one_to_nineteen[value]);
    				}
				}
			System.out.print("Number: ");
			value = In.nextInt();
		}
			System.out.println("Done");
	}
}