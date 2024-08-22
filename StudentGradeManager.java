import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] grades = new double[numSubjects];
        double totalGrades = 0;

        // Input grades for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            totalGrades += grades[i];
        }

       
        double averageGrade = totalGrades / numSubjects;
        String letterGrade;

       
        if (averageGrade >= 90) {
            letterGrade = "A";
        } else if (averageGrade >= 80) {
            letterGrade = "B";
        } else if (averageGrade >= 70) {
            letterGrade = "C";
        } else if (averageGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
 
        System.out.printf("Average Grade: %.2f\n", averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
  

        scanner.close();
    }
}
