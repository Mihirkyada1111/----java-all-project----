public class ChildClass extends SingleLevel
{
    public void displayChild()
    {
        System.out.println("child class is  called => B");
    }
    
    public static void main(String[] args)
    {
        ChildClass c = new ChildClass();
        
        c.display();
        c.displayChild();
    }
}
