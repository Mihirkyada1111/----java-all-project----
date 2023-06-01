
import java.util.Scanner;

public class resultClass 
{
    Scanner scan = new Scanner(System.in);
    int result,rollNo,gr_id;
    String name,collagename;
    float m1,m2,m3,m4,m5,total,per;

    public void name(String name)
    {
        this.name=name;
        System.out.println("name:-" + name);
    }

    public void rollno(int rollNo)
    {
        this.rollNo=rollNo;
        System.out.println("rollno:-"+rollNo);
    }

    public void collagename(String collagename)
    {
        this.collagename=collagename;
        System.out.println("collage:-"+collagename);
    }

    public void gr_id(int gr_id)
    {
        this.gr_id=gr_id;
        System.out.println("gr_id:-"+gr_id);
    }
    

    public float marks()
    {
        System.out.println("enter your subject 1 marks:-");
        m1 = scan.nextInt();
        System.out.println("enter your subject 2 marks:-");
        m2 = scan.nextInt();
        System.out.println("enter your subject 3 marks:-");
        m3 = scan.nextInt();
        System.out.println("enter your subject 4 marks:-");
        m4 = scan.nextInt();
        System.out.println("enter your subject 5 marks:-");
        m5 = scan.nextInt();
        total = m1+m2+m3+m4+m5;
        System.out.println("total of your marks is:-"+total);
        per = total/5;
        System.out.println("your percetage is:-"+ per + "%");
        return per;
    }

    public void per()
    {   
        if(per <= 100)
        {
            if(per>=35 && per<45)
            {
                System.out.println("your grade is :-E");
            }
            else if(per >45 && per<55)
            {
                System.out.println("your grade is :-D");
            }
            else if(per >55 && per<65)
            {
                System.out.println("your grade is :-C");
            }
            else if(per >65 && per< 75)
            {
                System.out.println("your grade is :-B");
            }
            else if(per >75 && per< 85)
            {
                System.out.println("your grade is :-A");
            }
            else if(per >85 && per< 100)
            {
                System.out.println("your grade is :-A+");
            }
            else
            {
                System.out.println("you are fail");
            }
        }
        else
        {
            System.out.println("put number between 0 to 100");
        }
    }
    
    public static void main(String[] args)
    {
        resultClass r=new resultClass();
        r.name("mihir");
        r.rollno(1111);
        r.collagename("Red & White");
        r.gr_id(1878);
        r.marks();
        r.per();
    }
}
