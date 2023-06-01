public class StudentDetail 
{
    int rollno;
    String name;
     
    StudentDetail(int rollno,String name)
    {
         this.rollno=rollno;
         this.name=name;
    }
    public void display()
    {
        System.out.println(rollno + " " + name);
    }
    public static void main(String[] args)
    {
        StudentDetail s=new StudentDetail(1111,"mihir");
        s.display();
    }
}
