
package Services;

import App.Main;
import StudentObject.Student;
import java.util.Scanner;

import static Validation.Validation.*;

import static java.lang.Integer.parseInt;

public class NewStudentsDetails {

    static Scanner input = new Scanner(System.in);

    public static void getNewStudent() {

        String Name, Age, Course;

        System.out.println("Please Enter Student Name : ");
        Name = validateName();

        System.out.println("Please Enter Student Age : ");
        Age = validateNumber();

        System.out.println("Please Enter Student Course : ");
        Course = validateCourseNo();

        System.out.println();

        System.out.println("Thanks for providing inputs ....\nPlease Wait....");

        Student newStudent = new Student(
                Main.studentsArrayList.get(
                        Main.studentsArrayList.size() - 1
                ).getStudent_id() + 1,
                Name,
                parseInt(Age),
                Course
        );

        Main.studentsArrayList.add(newStudent);

        AddStudentDatabase.addStudentDetails(newStudent);

        System.out.println(Main.studentsArrayList.size());
    }
}
