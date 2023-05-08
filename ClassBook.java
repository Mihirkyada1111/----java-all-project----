public class ClassBook {
    int book_id;
    String title;
    String author;

    ClassBook() {
        System.out.println("defualt constructor call");
    }

    ClassBook(int a, String b, String c) {
        System.out.println("Parameterized constructor");
        book_id = a;
        title = b;
        author = c;
    }

    void getData() {
        System.out.println("Book_id:-" + a + "title:-" + b + "author:-" + c);
    }

    public static void main(String[] args)
    {
        ClassBook c = new ClassBook(); 
        ClassBook cb = new ClassBook(a:1,b:"java",c:"mihir");
        cb.getData();
    }
}