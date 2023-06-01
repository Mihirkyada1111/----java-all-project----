import java.util.Scanner;

public class ClassInterface implements  Interface
{
    public void addition(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b,c,total,choice;
        System.out.println("press 1 for Addition");
        System.out.println("press 2 for Substraction");
        System.out.println("press 3 for Multiplaction");
        System.out.println("press 4 for division");
        choice = scan.nextInt();
        switch(choice)
        {
            case 1:
            {
                    System.out.println("your answer is:-"+c);
                break;
            }
            case 2:
            {
                c=a-b;
                System.out.println("your answer is:-"+c);
                break;
            }
            case 3:
            {
            
                c=a*b;
                System.out.println("your answer is:-"+c);
                break;
            }
            case 4:
            {
                c=a/b;
                System.out.println("your answer is:-"+c);
                break;
            }
            default:
            {
                System.out.println("Invalid choice1");
            }

        }

        ClassInterface a = new ClassInterface();
        a.addition(10,20);
    }
}
