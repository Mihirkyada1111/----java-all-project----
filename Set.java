public class Set {
    int a, b, c;

    void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void getData() {
        c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Set s = new Set();
        s.setData(100, 200);
        s.getData();
    }
}
