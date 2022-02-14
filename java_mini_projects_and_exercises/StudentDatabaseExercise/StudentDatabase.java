package StudentDatabaseExercise;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.List;

public class StudentDatabase {
	private Student[] students;
	
	public StudentDatabase(Student[] students) {
		this.students = students;
	}
	
	public static Student[] readStudentsFromFile(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			List<String> rawData = reader.lines().collect(Collectors.toList());
			Student[] students = new Student[rawData.size()];
			
			for (int i = 0; i < students.length; ++i) {
				String[] splitData = rawData.get(i).split(" ");
				students[i] = new Student(splitData[0].trim(), Integer.parseInt(splitData[1]));
			}
			return students;
		}
		catch (FileNotFoundException e) {
			System.err.println("The input file does not exist.");
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println("Something went wrong trying to read the file.");
			System.err.println(e.getMessage());
		}
		return null;
	}

	public int PrintNoOfStudents() {
		return students.length;
	}

	public float AverageMark() {
		float total_students = 0;
		
		for (Student student : students) {
			total_students += student.currentMark();
		}	
		return total_students / PrintNoOfStudents();	
	}

	public Student BestStudent() {
		Student best = students[0];

		for (Student student : students) {
			if (student.currentMark() > best.currentMark())
				best = student;
		}
		return best;
	}

	public Student WorstStudent() {
		Student worst = students[0];

		for (Student student : students) {
			if (student.currentMark() < worst.currentMark())
				worst = student;
		}
		return worst;	
	} 
}