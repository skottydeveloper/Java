package StudentDatabaseExercise;

public class MarksReport {
	public static void main(String[] args) {	
		StudentDatabase database = new StudentDatabase(StudentDatabase.readStudentsFromFile(args[0]));
        
		System.out.println("There are " + database.PrintNoOfStudents() + " students.");
		System.out.println("The average mark is " + database.AverageMark() + ".");
		System.out.println("The best student is " + database.BestStudent().PublicName() + " with a mark of " + database.BestStudent().currentMark() + ".");
		System.out.println("The worst student is " + database.WorstStudent().PublicName() + " with a mark of " + database.WorstStudent().currentMark() + ".");
	}
}