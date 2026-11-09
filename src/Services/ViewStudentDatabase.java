
package Services;

import StudentObject.Student;

import java.util.List;

import static java.lang.Integer.parseInt;

public class ViewStudentDatabase {

    // View Student detail
    public static void viewData(List<Student> studentsArrayList) {

        // Print all Records from the array list data
        for (Student student : studentsArrayList) {

            System.out.println(student.toString());

        }

        System.out.println(
                "\nTotal Count of students Records is: "
                        + studentsArrayList.size()
        );
    }
}
