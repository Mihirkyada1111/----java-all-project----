public class UserDefineFunctionFour {
    int sum() {
        int c;
        int a = 20, b = 20;
        c = a + b;
        return c;
    }

    int multiplaction() {
        int c;
        int a = 10, b = 10;
        c = a * b;
        return c;
    }

    public static void main(String[] args) {

        int result;
        UserDefineFunctionFour u = new UserDefineFunctionFour();

        result = u.sum();
        System.out.println(result);

        result = u.multiplaction();
        System.out.println(result);
        u.multiplaction();
    }
}
