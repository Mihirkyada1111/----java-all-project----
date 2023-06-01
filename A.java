public class A 
{    
    int i = 100;   
}
class B extends A
{
    int i = 20;
    void show(int i)
    {
        System.out.println(i);  //30
        this i = i;
        System.out.println(super.i);
    }
    public static void main(String[] args)
    {
        B m= new B();
        m.show(50);        
    }
}
