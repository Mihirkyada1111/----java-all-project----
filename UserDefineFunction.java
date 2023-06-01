import java.util.Scanner;
//without argument without returntype

public class UserDefineFunction {
    public static void main(String[] args) {
        UserDefineFunction u = new UserDefineFunction();
        u.sum();
    }

    void sum() {
        int a, b, ans;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your 1 value:-");
        a = scn.nextInt();
        System.out.println("Enter your 2 value:-");
        b = scn.nextInt();
        ans = a + b;
        System.out.println(ans);
    }
}
