package ProcessorExercise;

/* 
-  Now we will combine what we've learnt about I/O into something approximating a real use-case:
    -  The scaffold contains a class Processor with a method mapData(String inputFilename, String outputFilename, Function<Integer, O> map).  
    -  The input file specified by the String inputFilename contains a sequence of integers, one per line. 
    -  The method should read each integer in (making sure to turn it into an int, apply the apply(Integer) method given by the parameter map, and write the result out to the file specified by outputFilename. 
    -  The catch is that the input file may have mistakes in it! 
    -  You should catch the generated exceptions (the type of the exception will depend on how your have decided to read in the data), then continue processing, skipping the bad input. */

import java.util.function.Function;
import java.util.*;
import java.io.*;

public class Processor {
    public static <O> void mapData(String inputFilename, String outputFilename, Function<Integer, O> map) {
        try (Scanner scanner = new Scanner(new File(inputFilename)); PrintWriter writer = new PrintWriter(outputFilename);) {
            while (scanner.hasNextLine()) {
                try {
                    int i = Integer.parseInt(scanner.nextLine());
                    O o = map.apply(i);
                    writer.println(o);
                }
                catch (NumberFormatException e) {
                    System.err.print("Float found.");
                }
            }
            scanner.close();
            writer.close();
        }

        catch (FileNotFoundException e) {
            System.err.println("The file doesn't exist.");
        }
    }

    public static void main(String[] args) {
         mapData("inputTest.txt", "outputTest.txt", Function.<Integer>identity());
    }
}