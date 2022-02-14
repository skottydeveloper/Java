package StudentDatabaseExercise;

public class Student {
	private String name;
	private int mark;
	
	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String PublicName() {
		return this.name;
	}

	public int currentMark() {
		return this.mark;
	}
}