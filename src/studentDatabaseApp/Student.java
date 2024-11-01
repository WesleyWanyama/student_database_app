package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private StringBuilder courses = new StringBuilder();
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor prompts user to enter student's name and year
	public Student(String firstName, String lastName, int gradeYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;

		setStudentID();
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll(Input input) {
		// Get inside a loop, user hits 0 to quit
		String course;
		do {
			course = input.getCourse();
			if (!course.equals("Q")) {
				courses.append("\n").append(course);
				tuitionBalance += costOfCourse;
			}
		} while (!course.equals("Q")); // Continue until user quits
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition(Input input) {
		viewBalance();
		int payment = input.getPayment(tuitionBalance);
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}

	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
