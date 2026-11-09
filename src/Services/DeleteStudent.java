
package Services;

import StudentObject.Student;
import java.util.Iterator;

import static App.Main.studentsArrayList;
import static DatabaseFunctions.ArrayListToDatabase.updateRepo;
import static Services.NewStudentsDetails.input;

public class DeleteStudent {

    public static boolean deleteStudentId() {

        System.out.println("Please enter student id:");

        int id = input.nextInt();

        Boolean isUpdated = false;

        Iterator<Student> students = studentsArrayList.iterator();

        while (students.hasNext()) {

            Student person = students.next();

            if (id == person.getStudent_id()) {

                System.out.println(
                        "ID : " + person.getStudent_id() +
                                "\nName : " + person.getStudent_name() +
                                "\nAge : " + person.getStudent_age() +
                                "\nCourse : " + person.getCourse()
                );

                System.out.println(
                        "\nPlease confirm above mentioned details are right"
                );

                System.out.println("1. Confirm to Delete");
                System.out.println("2. Cancel Delete");

                if (input.nextInt() == 1) {

                    System.out.println("Deleting in Progress");

                    students.remove();

                    isUpdated = true;

                } else {

                    System.out.println("Deletion progress Canceled");

                    isUpdated = false;
                }
            }
        }

        return isUpdated;
    }
}
