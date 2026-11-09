
package DatabaseFunctions;

import App.Main;
import StudentObject.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class DatabaseToArrayList {

    static String file_Path = "src/students.txt";

    public static void syncRepo() {

        Main.studentsArrayList.clear();

        System.out.println("Test");
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(file_Path)
            );

            String line;

            System.out.println(
                    "Sync is in Progress....\nPlease wait...."
            );

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Main.studentsArrayList.add(
                        new Student(
                                parseInt(data[0]),
                                data[1],
                                parseInt(data[2]),
                                data[3]
                        )
                );
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
