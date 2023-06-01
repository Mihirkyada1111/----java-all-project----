public class SetGet {
    int a;

    public void setData(int a) {
        this.a = a;
        System.out.println(a);
    }

    public int SetData() {
        return a;
    }

    public static void main(String[] args) {
        SetGet s = new SetGet();
        s.setData(10);
        s.SetData();
    }
}
