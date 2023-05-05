import javax.lang.model.util.ElementScanner14;

public class RelationalOpLarger {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("A is greter");
        } else if (b > a && b > c) {
            System.out.println("B is greter");
        } else {
            System.out.println("C is greter");
        }
    }
}
