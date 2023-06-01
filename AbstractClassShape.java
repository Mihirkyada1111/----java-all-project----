import java.util.Scanner;
abstract class AbstractClassShape 
{
       Scanner scan = new Scanner(System.in);
       abstract void read();
       abstract  void show();
}

class Rectangle extends AbstractClassShape
{
     void read()
    {
        int area,length,width;
        
        System.out.println("enter the length of rectangle");
        length = scan.nextInt();
        
        System.out.println("enter the width of rectangle");
        width = scan.nextInt();
        
        area = length * width;
        System.out.println(area);
    } 
    void show()
    {
        System.out.println("rectangle show function is called");
    }

}
class Cirle extends AbstractClassShape
{
    void read()
    {
        final double pi = 3.14;
        System.out.println(pi);
    }
    public void show()
    {
        System.out.println("circle show function is called");
    }
    public static void main(String[] args) 
    {
       
        Rectangle a= new Rectangle();
        a.read();
        a.show();

        Cirle c = new Cirle();
        c.read();
        c.show();
    }
}
    