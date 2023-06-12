import java.util.Scanner;

import javax.print.attribute.TextSyntax;
public class Mix 
{
    Scanner scan= new Scanner(System.in);
    double pi;
    String name = "mihir";
    double ans;
    double length,heigth;
    
    public double circle(double pi)
    {
        this.pi=pi;
        return pi;
    }
    
    public double tringle(double length,double height)
    {
        this.length=length;
        this.heigth=heigth;
        ans= length*heigth;
        return ans;
    }
    
    public double total()
    {
        double amount;
        System.out.println("enter your amount");
        amount=scan.nextDouble();
        double total = amount * 15 / 100;
        return total;
    }
    
    public void marksheet()
    {
        int m1,m2,m3,m4,per,grade,total;
        System.out.println("enter your m1 marks:-");
        m1=scan.nextInt();
        System.out.println("enter your m2 marks:-");
        m2=scan.nextInt();
        System.out.println("enter your m3 marks:-");
        m3=scan.nextInt();
        System.out.println("enter your m4 marks:-");
        m4=scan.nextInt();
        total = m1+m2+m3+m4;
        System.out.println(total);
        System.out.println("enter your tatal marks:-");
        total =scan.nextInt();
        per= total/4;
        System.out.println("your percentade is"+per+"%");
        System.out.println("enter your total percentage:-");
        per=scan.nextInt();
        if(per >35 && per <50)
        {
            System.out.println("E grade");
        }
        else if(per >50 && per <60)
        {
            System.out.println("D grade");
        }
        else if(per >60 && per <75)
        {
            System.out.println("C grade");
        }
        else if(per >75 && per <85)
        {
            System.out.println("B grade");
        }
        else if(per >85 && per <100)
        {
            System.out.println("A grade");
        }
        else 
        {
            System.out.println("fail");
        }
    }
    
    public void test(String name)
    {
        // test()
        // {
            
            System.out.println(name);
        //}
           
    }
    
    public static void main(String[] args)
    {
        Mix m=new Mix();
        double a =(m.circle(3.14));
        double b =(m.tringle(5.5, 50.5));
        double c =(m.total());
        m.marksheet();
        m.test("mihir");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }

}
