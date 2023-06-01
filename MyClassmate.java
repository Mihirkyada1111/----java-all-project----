public class MyClassmate
{
    int rollno;
    String name;
    String collagename="rw";
    MyClassmate(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public void display()
    {
        System.out.println( rollno + " " + name + " " + collagename);
    }
    public static void main(String[] args)
    {
        MyClassmate m=new MyClassmate(1,"mihir");
        m.display();
    }
}