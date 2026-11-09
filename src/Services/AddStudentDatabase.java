
package Services;

import StudentObject.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddStudentDatabase {

    static String file_Path = "src/students.txt";

    static public void addStudentDetails(Student newStudent) {

        try (
                BufferedWriter write = new BufferedWriter(
                        new FileWriter("src/students.txt", true)
                )
        ) {

//            write.newLine();

            write.write(
                    newStudent.getStudent_id() + "," +
                            newStudent.getStudent_name() + "," +
                            newStudent.getStudent_age() + "," +
                            newStudent.getCourse()
            );

            // write.flush();

            System.out.println("Successfully Added");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
