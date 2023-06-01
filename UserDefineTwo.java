import java.util.Scanner;

//with argument without return type
public class UserDefineTwo {

    public static void main(String args[]) {
        int a;
        int b, sum;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your 1 value");
        a = scn.nextInt();
        System.out.println("enter your 2 value");
        b = scn.nextInt();
        sum(a, b);
    }

    public void sum(int x, int y) {
        int ans;
        ans = x + y;

        System.out.print("Sum of two numbers is :" + ans);
    }
}
