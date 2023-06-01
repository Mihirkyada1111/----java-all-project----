import java.util.Scanner;

public class ScannerFour {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your a value ");
        a = scan.nextInt();
        System.out.println("enter your b value ");
        b = scan.nextInt();
        System.out.println("enter your c value ");
        c = scan.nextInt();

        if (a < b && a < c) {
            System.out.println("A is smaller");
        } else if (b < a && b < c) {
            System.out.println("B is smaller");
        } else {
            System.out.println("C is smaller");
        }
    }
}
