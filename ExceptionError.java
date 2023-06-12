public class ExceptionError 
{
    public static void main(String[] args)
    {
        int a=50;
        int b=0;
        int c;
        String s=null;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Excpetion error");
        }

        System.out.println("Hello");
    }    
}
