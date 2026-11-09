package DatabaseFunctions;

import StudentObject.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static App.Main.studentsArrayList;

public class ArrayListToDatabase {

    public static void updateRepo() {

        System.out.println("Creating Database repository");
        System.out.println("============================");

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(
                    new FileWriter(DatabaseToArrayList.file_Path)
            );

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Student student : studentsArrayList) {

            try {
                writer.write(
                        student.getStudent_id() + "," +
                                student.getStudent_name() + "," +
                                student.getStudent_age() + "," +
                                student.getCourse()
                );

                writer.newLine();

            } catch (IOException e) {
                System.out.println(e);
            }
        }

        try {
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
