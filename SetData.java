
public class SetData {
    int a, b, c;

    public void setA(int a) {
        this.a = a;
        System.out.println(a);
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
        System.out.println(b);
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
        System.out.println(c);
    }

    public int getC() {
        return c;
    }

    public void setTotal() {
        c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        SetData s = new SetData();
        s.setA(10);
        s.getA();
        s.setB(20);
        s.getA();
        s.setC(30);
        s.getC();

    }
}
