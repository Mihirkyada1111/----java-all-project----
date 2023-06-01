import java.util.Scanner;

public class ScannerTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("enter your a value");
        a = scan.nextInt();
        System.out.println("enter your b value");
        b = scan.nextInt();
        if (a < b) {
            if (a > b) {
                System.out.println("the value is smaller" + a);
            } else {
                System.out.println("the valaue is biger" + b);
            }
        } else {
            if (b < a) {
                System.out.println("the value is bigger" + a);
            } else {
                System.out.println("the value is smaller" + b);
            }
        }
    }
}
