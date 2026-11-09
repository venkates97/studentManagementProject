
package Services;

import StudentObject.Student;
import java.util.Iterator;
import java.util.List;

import static App.Main.studentsArrayList;
import static Services.NewStudentsDetails.input;
import static Validation.Validation.validateCourseNo;
import static Validation.Validation.validateNumber;
import static java.lang.Integer.parseInt;

public class updateDetails {

    public static void updateStudent(List<Student> students) {

        System.out.println("Please Enter Student Id no:");

        int id = input.nextInt();

        Iterator<Student> members = studentsArrayList.iterator();

        while (members.hasNext()) {

            Student student = members.next();

            if (id == student.getStudent_id()) {

                // Update the Name
                System.out.println("Do you want to edit the name?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                if (input.nextInt() == 1) {

                    System.out.println(
                            "Current Name: " + student.getStudent_name()
                    );

                    System.out.println("Updated Name: ");

                    student.setStudent_name(input.next());

                } else {

                    System.out.println("Name is not Updated");
                }

                // Update the Age
                System.out.println("Do you want to edit the Age?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                if (input.nextInt() == 1) {

                    System.out.println(
                            "Current Age: " + student.getStudent_age()
                    );

                    System.out.println("Updated Age: ");

                    student.setStudent_age(
                            parseInt(validateNumber())
                    );

                } else {

                    System.out.println("Age is not Updated");
                }

                // Update the Course
                System.out.println("Do you want to edit the Course?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                if (input.nextInt() == 1) {

                    System.out.println(
                            "Current Course: " + student.getCourse()
                    );

                    System.out.println("Updated Course: ");

                    student.setCourse(validateCourseNo());

                } else {

                    System.out.println("Course is not Updated");
                }

            }
        }
    }
}
