package studentDatabaseApp;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		Input input = new Input(); // Create an instance of Input class

		// Ask how many new users we want to add
		int numOfStudents = input.getNumberOfStudents();
		Student[] students = new Student[numOfStudents];

		// Create n number of new students
		for (int n = 0; n < numOfStudents; n++) {
			String firstName = input.getFirstName();
			String lastName = input.getLastName();
			int gradeYear = input.getGradeYear();

			// Create a new student with the collected details
			students[n] = new Student(firstName, lastName, gradeYear);
			students[n].enroll(input);
			students[n].payTuition(input);
		}

		// Display all students' information
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
