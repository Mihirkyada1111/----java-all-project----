public class InnerClass2 {
    public void display() {
        System.out.println("display function iis called");
    }

    public static void main(String[] args) {
        MarksInnerClass.innerClass in = new MarksInnerClass().new innerClass();
        in.display();

        in.total();
    }
}
