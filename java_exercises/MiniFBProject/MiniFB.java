package MiniFBProject;

import java.io.*;
import java.util.*;

public class MiniFB {
	private static int nextIntLine(Scanner scanner) {
		int returnValue = scanner.nextInt();
		scanner.nextLine();
		return returnValue;
	}

	private static String readName(Scanner scanner) {
		return scanner.nextLine();
	}

	private static Student createStudent(Scanner scanner) {
		String name = readName(scanner);
		String degree = scanner.nextLine();
		int year = nextIntLine(scanner);
		return new Student(name, degree, year); 
	}
	
	private static Academic createAcademic(Scanner scanner) {
		String name = readName(scanner);
		String subject = scanner.nextLine();
		return new Academic(name, subject);
	}

	private static Programmer createProgrammer(Scanner scanner) {
		String name = readName(scanner);
		String language = scanner.nextLine();
		return new Programmer(name, language);
	}

	public static List<Person> readInData(String filename) {
		List<Person> people = new LinkedList<Person>();
		try {
			Scanner scanner = new Scanner(new File(filename));

			while (scanner.hasNextLine()) {
				String type = scanner.nextLine();

				switch (type) {
					case "Student": 
						people.add(createStudent(scanner));
						break;
					case "Academic": 
						people.add(createAcademic(scanner));
						break;
					case "Programmer": 
						people.add(createProgrammer(scanner));
						break;
				}
			}
		}
		catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
		return people;
    }

    public static void main(String[] args) {
        List<Person> people = readInData("testFile.txt");
    }
}