import java.util.Scanner;

// without argument with return type
public class UserDefineThree {
    public static int add() {
        int sum = 10 + 20;
        return sum;
    }

    public static void main(String[] args) {

        UserDefineThree u = new UserDefineThree();

        int sum = u.add();
        System.out.println(sum);
    }

}
