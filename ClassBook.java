public class ClassBook {
    int book_id;
    String title;
    String author;
    int a;
    String b, c;

    ClassBook() {
        System.out.println("defualt constructor call");
    }

    ClassBook(int a, String b, String c) {
        System.out.println("Parameterized constructor call");
        book_id = a;
        title = b;
        author = c;

        System.out.println("book_id:-" + a + "\ntitle:-" + b + "\nauthor:-" + c);

    }

    public static void main(String[] args) {
        ClassBook cb = new ClassBook();
        ClassBook c = new ClassBook(1111, "java", "James Gosling");

    }
}