public class ConstructorExample {
    public static void ConstructorExample(int c, int d, int e) {
        int a = 10, b = 20, ans;
        ans = a + b;
        System.out.println("sum of a and b is:-" + ans);
    }

    public static void ConstructorExample(int f, int g) {
        int a = 10, b = 20, ans;
        ans = a + b;
        System.out.println("sum of a and b is:-" + ans);
    }

    public static void ConstructorExample(int h) {
        int a = 10, b = 20, ans;
        ans = a + b;
        System.out.println("sum of a and b is:-" + ans);
    }

    public static void ConstructorExample(int h, int t, int m, int s) {
        int a = 10, b = 20, ans;
        ans = a + b;
        System.out.println("sum of a and b is:-" + ans);
    }

    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample();
        c.ConstructorExample(10, 20, 30);
        c.ConstructorExample(20, 30);
        c.ConstructorExample(10);
        c.ConstructorExample(10, 20, 30, 40);
    }
}
