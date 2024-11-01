package studentDatabaseApp;

import java.util.Scanner;

public class Input {
    //Input variable of type scanner
    private Scanner in;

    //Constructor to initialize scanner for user input
    public Input(){
        this.in = new Scanner(System.in);
    }

    //Getter method for number of new students
    public int getNumberOfStudents(){
        System.out.print("Enter number of new students to enroll: ");
        return in.nextInt();
    }

    //Gtter method for first name
    public String getFirstName() {
        System.out.print("Enter student's first name: ");
        return in.next();
    }

    //Getter method for last name
    public String getLastName() {
        System.out.print("Enter student's last name: ");
        return in.next();
    }

    //Getter method for grade
    public int getGradeYear() {
        int gradeYear;
        while (true) {
            System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class level: ");
            gradeYear = in.nextInt();
            if (gradeYear >= 1 && gradeYear <= 4) {
                return gradeYear;
            } else {
                System.out.println("Invalid input. Please enter a valid grade level (1-4).");
            }
        }
    }

    //Getter method for course
    public String getCourse() {
        System.out.print("Enter course to enroll (Q to quit): ");
        return in.next();
    }

    //Getter method for payment
    public int getPayment(int tuitionBalance) {
        int payment;
        while (true) {
            System.out.print("Enter your payment: $");
            payment = in.nextInt();
            if (payment > 0 && payment <= tuitionBalance) {
                return payment;
            } else {
                System.out.println("Invalid payment. Please enter a valid amount not exceeding your balance ($" + tuitionBalance + ").");
            }
        }
    }
}
