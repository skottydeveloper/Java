/* 
Specification：
-  Read sentences from the user until * is entered. 
-  Show the number of words in each sentence that contain a stretch of non-z characters with exactly 2 vowels. 
-  A stretch starts from the start of the word or after a 'z'. 
-  A stretch terminates just before another 'z' or at the end of the word.

Examples:
-  Matching words: zoo, azozooza, GONZALEZ
-  Non-matching words: ozo, azoooza

Note:
-  The sentences contain no punctuation, the words are separated by one or more spaces, and the characters may be upper or lower case. 
-  Keep reading sentences until the user enters "*". */

package StretchWith2VowelsExercise;

public class StretchWith2Vowels {
    public static void main(String[] args) {
        String input = In.nextLine();

        while (!(input.equals("*"))) {
            System.out.println("Sentence: Matching words = " + matchCount(input));
            input = In.nextLine();
        }
        System.out.println("Sentence: Done");   
    }
    
    public static int matchCount(String sentence) {
        String[] words = sentence.split(" +");
        int count = 0;

        for (String input : words) {
            if (matches(input))
            count++;
        }
        return count;
    }

    public static boolean matches(String word) {
        word = word.toLowerCase();
        String[] match_word = word.split("z|Z");
        boolean matches = false;

        for (String input : match_word) {
            if (vowelCount(input) == 2)
                matches = true;
        }
        return matches;
    }

    public static int vowelCount(String segment) {
        int count = 0;

        for (int i = 0; i < segment.length(); i++) {
            if (isVowel(segment.charAt(i)))
                count++;
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return "aeiou".contains("" + c);
    }
}