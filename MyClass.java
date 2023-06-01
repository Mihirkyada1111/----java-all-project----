public class MyClass
{
    int rollno;
    String name;
    String collagename="Red & White";
    MyClass(int rollno,String name)
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
        MyClass m=new MyClass(1,"mihir");
        m.display();
    } 
}
