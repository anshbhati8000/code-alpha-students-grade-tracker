import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");

        // Input grades
        while (true) {
            System.out.print("Enter a student's grade (or type '-1' to stop): ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            } else if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered. Exiting program.");
            
        }

        // Compute average, highest, and lowest scores
        double total = 0, highest = grades.get(0), lowest = grades.get(0);

        for (double grade : grades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = total / grades.size();

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("All Grades: " + grades);
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}
