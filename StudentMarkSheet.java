import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your 5 subject marks");
        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        int marks4 = scanner.nextInt();
        int marks5 = scanner.nextInt();

        double average = (marks1 + marks2 + marks3 + marks4 + marks5) / 5.0;

        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B+";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 40) {
            grade = "D";
        } else if (average >= 35) {
            grade = "E";
        } else {
            grade = "fail";
        }

        System.out.println("average marks" + average);
        System.out.println("grade" + grade);
    }
}
