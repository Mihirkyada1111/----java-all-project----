public class StudentConstructor {
    int m1, m2, total;

    StudentConstructor() {
        System.out.println("empty constructor is call");
    }

    StudentConstructor(int x, int y) {
        m1 = x;
        m2 = y;
    }

    void display() {
        total = m1 + m2;
        System.out.println(total);
    }

    public static void main(String[] args) {
        System.out.print("The sum of a and b is->");
        StudentConstructor s1 = new StudentConstructor(10, 90);
        System.out.print("The sum of a and b is->");
        StudentConstructor s = new StudentConstructor(250, 250);

        s1.display();
        s.display();
    }
}