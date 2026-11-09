
package App;

import DatabaseFunctions.DatabaseToArrayList;
import Services.ViewStudentDatabase;
import Services.*;
import StudentObject.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static DatabaseFunctions.ArrayListToDatabase.updateRepo;
import static DatabaseFunctions.DatabaseToArrayList.syncRepo;
import static Services.DeleteStudent.deleteStudentId;
import static Services.NewStudentsDetails.getNewStudent;
import static Services.updateDetails.updateStudent;

public class Main {

    static String file_Path = "src/students.txt";

    public static List<Student> studentsArrayList = new ArrayList<>();

    public static String[] availableCourses = {
            "Python", "Java", "Full Stack", "Data Analyst"
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int getInput = 0;
        syncRepo();

        // Sync the current DB file to ArrayList
        updateRepo();

        do {

            // Application Front Page with Menu options
            System.out.println("Welcome to Student Management System");
            System.out.println("====================================");
            System.out.println("1. View Student Details");
            System.out.println("2. Add Student Details");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student Details");
            System.out.println("5. Sync Repo");
            System.out.println("6. Exit");

            System.out.print("Please enter your Choice: ");

//            if (!input.hasNextInt()) {
//                System.out.println(
//                        "Error: Invalid input! Please enter an integer between 1 and 6."
//                );
//                input.next(); // Consume invalid input
//                continue;   // Display menu again
//            }

            getInput = input.nextInt();

            switch (getInput) {

                case 1:
                    System.out.println("View Student Details");
                    System.out.println("====================");
                    ViewStudentDatabase.viewData(studentsArrayList);
                    System.out.println("View Operation Completed");
                    break;

                case 2:
                    System.out.println("New Student Details");
                    System.out.println("===================");
                    // Verify this method name against your original file
                    getNewStudent();
                    System.out.println("Add Operation Completed");
                    break;

                case 3:
                    System.out.println("Update Student Details");
                    System.out.println("======================");
                    updateStudent(studentsArrayList);
                    updateRepo();
                    System.out.println("Update Operation Completed");
                    break;

                case 4:
                    System.out.println("Delete Student Details");
                    System.out.println("======================");

                    if (deleteStudentId()) {
                        updateRepo();
                    }

                    System.out.println("Delete Operation Completed");
                    break;

                case 5:
                    System.out.println("Sync Repo");
                    updateRepo();
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println(
                            "Please enter right menu number"
                    );
            }

        } while (getInput != 6);

        input.close();
    }
}
