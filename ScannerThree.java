import java.util.Scanner;

public class ScannerThree {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your a value:-");
        a = scan.nextInt();
        System.out.println("enter your b value:-");
        b = scan.nextInt();
        if (a > b) {
            if (a > b) {
                System.out.println("a is positive " + a);
            } else {
                System.out.println("b is negative " + b);
            }
        } else {
            if (b < a) {
                System.out.println("b is negative " + a);
            } else {
                System.out.println("a is positive " + b);
            }
        }
    }
}
