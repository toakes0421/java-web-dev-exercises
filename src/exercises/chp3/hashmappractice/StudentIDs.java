package exercises.chp3.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIDs {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID #s: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID #: " + student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
