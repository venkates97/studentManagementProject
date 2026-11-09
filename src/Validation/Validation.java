package Validation;

import App.Main;

import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Validation {

    static Scanner input = new Scanner(System.in);

    public static String validateNumber() {

        String num = input.next();
        System.out.println("Validating Age");

        try {
            if ((parseInt(num) + 1) > 0) {
                System.out.println("Number validation Completed");
                return num;
            } else {
                System.out.println("Please enter correct num from else");
                return validateNumber();
            }
        } catch (Exception e) {
            System.out.println("Please enter correct age from exception");
            return validateNumber();
        }
    }

    public static String validateCourseNo() {
        int count = 1;

        for (String course : Main.availableCourses) {
            System.out.println(count++ + ". " + course);
        }

        int select = input.nextInt();

        if (select <= Main.availableCourses.length && select > 0) {
            return Main.availableCourses[select - 1];
        } else {
            System.out.println("Please enter right course no");
            return validateCourseNo();
        }
    }

    public static String validateName() {
        String name = input.nextLine();
        return name;
    }
}