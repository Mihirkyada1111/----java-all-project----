import java.util.Scanner;

public class MarksInnerClass {
    Scanner scan = new Scanner(System.in);

    public class innerClass {
        public void display() {
            int marks1, marks2, marks3, total;
            System.out.println("enter your 1 subject marks");
            marks1 = scan.nextInt();

            System.out.println("enter your 2 subject marks");
            marks2 = scan.nextInt();

            System.out.println("enter your 3 subject marks");
            marks3 = scan.nextInt();
            total = marks1 + marks2 + marks3;
            System.out.println(total);
        }

        public void total() {
            float per;
            System.out.println("enter your total marks:-\n");
            int total = scan.nextInt();
            per = total / 3;
            System.out.println(per + "% ");
            if (per > 35 && per < 50) {
                System.out.println("\nD");
            } else if (per > 50 && per < 70) {
                System.out.println("\nC");
            } else if (per > 70 && per < 85) {
                System.out.println("\nB");
            } else if (per > 85 && per < 100) {
                System.out.println("\nA");
            } else {
                System.out.println("\nfail");
            }
        }
    }

    public static void main(String[] args) {
        MarksInnerClass m = new MarksInnerClass();
        MarksInnerClass.innerClass in = new MarksInnerClass().new innerClass();
        in.display();
        in.total();

    }

}
