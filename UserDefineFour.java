import java.util.Scanner;

//with argument with return type
public class UserDefineFour {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int result = add(10, 20);
        System.out.println("sum:-" + result);
    }

    public static int add(int f, int s) {
        int sum = f + s;
        return sum;
    }
}
