import java.util.Scanner;

public class MarkSheetScanner {
    public void calculate(int mark1, int mark2) {
        int total = mark1 + mark2;
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your subject 1 marks");
        int mark1 = s.nextInt();

        System.out.println("enter your subject 2 marks");
        int mark2 = s.nextInt();

        MarkSheetScanner m = new MarkSheetScanner();
        m.calculate(mark1, mark2);
    }
}
