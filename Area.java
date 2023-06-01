import java.util.Scanner;
public class Area 
{
    Scanner scan=new Scanner(System.in);
    float length;
    float width;
    float area;

    public void getData()
    {
        System.out.println("enter your width");
        width = scan.nextFloat();
        System.out.println("enter your length");
        length = scan.nextFloat();
        area = width * length;
    }
    public void display()
    {
        System.out.println("your rectangle is:-"+area);
    }
    public static void main(String[] args)
    {
        Area a=new Area();
        a.getData();
        a.display();
    }
}
