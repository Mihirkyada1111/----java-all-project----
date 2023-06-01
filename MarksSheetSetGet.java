import java.util.Scanner;

public class MarksSheetSetGet {
    Scanner scan = new Scanner(System.in);
    int marks1, marks2, marks3, total, grade;

    public void SetData() 
    {
        System.out.println("enter your subject 1 marks");
        marks1 = scan.nextInt(); 
        System.out.println("enter your subject 2 marks");
        marks2 = scan.nextInt();
    }
}
