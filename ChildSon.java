public class ChildSon extends ChildClass 
{
    public void displayChildSon()
    {
        System.out.println("son class is called => C");
    }    
    public void display()
    {
        System.out.println("enter your name");
    }

    public static void main(String[] args)
    {
        ChildSon c= new ChildSon();
        c.display();                                                      
        c.displayChild();
        c.displayChildSon();
    }
}
