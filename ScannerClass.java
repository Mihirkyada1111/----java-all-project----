import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, i2, i3;
        float f, f2, f3;
        double d, d2, d3;
        long l, l2, l3;
        String s, s2, s3;

        System.out.println("enter the value of i,i2 and i3");

        i = scan.nextInt();
        i2 = scan.nextInt();
        i3 = scan.nextInt();
        System.out.println(i + i2 + i3);

        System.out.println("enter the value of f,f2 and f3 in float");
        f = scan.nextFloat();
        f2 = scan.nextFloat();
        f3 = scan.nextFloat();
        System.out.println(f + f2 + f3);

        System.out.println("enter the value of d ,d2 and d3 in point");
        d = scan.nextDouble();
        d2 = scan.nextDouble();
        d3 = scan.nextDouble();
        System.out.println(d + d2 + d3);

        System.out.println("enter the value of l,l2 and l3 in long ");
        l = scan.nextLong();
        l2 = scan.nextLong();
        l3 = scan.nextLong();
        System.out.println(l + l2 + l3);

        System.out.println("enter the value of s ,s2 and s3");
        s = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();
        System.out.println(s + s2 + s3);

    }
}
